package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
final class SchemaManager extends SQLiteOpenHelper {
    private static final String CREATE_CONTEXTS_SQL_V1 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
    private static final String CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
    private static final String CREATE_EVENTS_SQL_V1 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
    private static final String CREATE_EVENT_BACKEND_INDEX_V1 = "CREATE INDEX events_backend_id on events(context_id)";
    private static final String CREATE_EVENT_METADATA_SQL_V1 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
    private static final String CREATE_GLOBAL_LOG_EVENT_STATE_TABLE = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";
    private static final String CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL = null;
    private static final String CREATE_LOG_EVENT_DROPPED_TABLE = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";
    private static final String CREATE_PAYLOADS_TABLE_V4 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
    static final String DB_NAME = "com.google.android.datatransport.events";
    private static final String DROP_CONTEXTS_SQL = "DROP TABLE transport_contexts";
    private static final String DROP_EVENTS_SQL = "DROP TABLE events";
    private static final String DROP_EVENT_METADATA_SQL = "DROP TABLE event_metadata";
    private static final String DROP_GLOBAL_LOG_EVENT_STATE_SQL = "DROP TABLE IF EXISTS global_log_event_state";
    private static final String DROP_LOG_EVENT_DROPPED_SQL = "DROP TABLE IF EXISTS log_event_dropped";
    private static final String DROP_PAYLOADS_SQL = "DROP TABLE IF EXISTS event_payloads";
    private static final List<Migration> INCREMENTAL_MIGRATIONS = null;
    private static final Migration MIGRATE_TO_V1 = null;
    private static final Migration MIGRATE_TO_V2 = null;
    private static final Migration MIGRATE_TO_V3 = null;
    private static final Migration MIGRATE_TO_V4 = null;
    private static final Migration MIGRATE_TO_V6 = null;
    private static final Migration MIGRATE_TO_V7 = null;
    private static final Migration MIGRATION_TO_V5 = null;
    static int SCHEMA_VERSION;
    private boolean configured;
    private final int schemaVersion;

    public interface Migration {
        void upgrade(SQLiteDatabase r1);
    }

    static {
        CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
        SCHEMA_VERSION = 7;
        Migration r1 = new C();
        MIGRATE_TO_V1 = r1;
        Migration r2 = new D();
        MIGRATE_TO_V2 = r2;
        Migration r3 = new E();
        MIGRATE_TO_V3 = r3;
        Migration r4 = new F();
        MIGRATE_TO_V4 = r4;
        Migration r5 = new G();
        MIGRATION_TO_V5 = r5;
        Migration r6 = new H();
        MIGRATE_TO_V6 = r6;
        Migration r7 = new I();
        MIGRATE_TO_V7 = r7;
        INCREMENTAL_MIGRATIONS = Arrays.asList(new Migration[]{r1, r2, r3, r4, r5, r6, r7});
    }

    public SchemaManager(Context r2, String r3, int r4) {
        super(r2, r3, null, r4);
        this.configured = false;
        this.schemaVersion = r4;
    }

    public static /* synthetic */ void c(SQLiteDatabase r1) {
        r1.execSQL(CREATE_EVENTS_SQL_V1);
        r1.execSQL(CREATE_EVENT_METADATA_SQL_V1);
        r1.execSQL(CREATE_CONTEXTS_SQL_V1);
        r1.execSQL(CREATE_EVENT_BACKEND_INDEX_V1);
        r1.execSQL(CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1);
    }

    private void ensureConfigured(SQLiteDatabase r2) {
        if (this.configured == true) goto L6;
        onConfigure(r2);
        return;
    }

    public static /* synthetic */ void f(SQLiteDatabase r1) {
        r1.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        r1.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        r1.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public static /* synthetic */ void i(SQLiteDatabase r1) {
        r1.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }

    public static /* synthetic */ void k(SQLiteDatabase r1) {
        r1.execSQL(DROP_LOG_EVENT_DROPPED_SQL);
        r1.execSQL(DROP_GLOBAL_LOG_EVENT_STATE_SQL);
        r1.execSQL(CREATE_LOG_EVENT_DROPPED_TABLE);
        r1.execSQL(CREATE_GLOBAL_LOG_EVENT_STATE_TABLE);
        r1.execSQL(CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL);
    }

    public static /* synthetic */ void l(SQLiteDatabase r1) {
        r1.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
    }

    public static /* synthetic */ void n(SQLiteDatabase r1) {
        r1.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        r1.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        r1.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void t(SQLiteDatabase r1) {
        r1.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        r1.execSQL(DROP_PAYLOADS_SQL);
        r1.execSQL(CREATE_PAYLOADS_TABLE_V4);
    }

    private void upgrade(SQLiteDatabase r4, int r5, int r6) {
        List<Migration> r02 = INCREMENTAL_MIGRATIONS;
        if (r6 > r02.size()) goto L8;
    L4:
        if (r5 >= r6) goto L6;
        INCREMENTAL_MIGRATIONS.get(r5).upgrade(r4);
        r5 = r5 + 1;
        goto L4
    L6:
        return;
    L8:
        throw new IllegalArgumentException("Migration from " + r5 + " to " + r6 + " was requested, but cannot be performed. Only " + r02.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase r4) {
        this.configured = true;
        r4.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        r4.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase r2) {
        onCreate(r2, this.schemaVersion);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase r1, int r2, int r3) {
        r1.execSQL(DROP_EVENTS_SQL);
        r1.execSQL(DROP_EVENT_METADATA_SQL);
        r1.execSQL(DROP_CONTEXTS_SQL);
        r1.execSQL(DROP_PAYLOADS_SQL);
        r1.execSQL(DROP_LOG_EVENT_DROPPED_SQL);
        r1.execSQL(DROP_GLOBAL_LOG_EVENT_STATE_SQL);
        onCreate(r1, r3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase r1) {
        ensureConfigured(r1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase r1, int r2, int r3) {
        ensureConfigured(r1);
        upgrade(r1, r2, r3);
    }

    private void onCreate(SQLiteDatabase r2, int r3) {
        ensureConfigured(r2);
        upgrade(r2, 0, r3);
    }
}
