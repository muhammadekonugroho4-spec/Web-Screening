package com.clevertap.android.sdk.db;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f33786a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String f33787b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f33788c = null;
    public static final String d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f33789e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String f33790f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final String f33791g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final String f33792h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final String f33793i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final String f33794j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final String f33795k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final String f33796l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final String f33797m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final String f33798n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final String f33799o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final String f33800p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final String f33801q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final String f33802r = null;

    /* renamed from: s, reason: collision with root package name */
    public static final String f33803s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final String f33804t = null;

    static {
        StringBuilder r02 = new StringBuilder();
        r02.append("\n    CREATE TABLE ");
        Table r2 = Table.EVENTS;
        r02.append(r2.getTableName());
        r02.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL\n    );\n");
        f33786a = r02.toString();
        f33787b = "\n    CREATE TABLE " + Table.USER_EVENT_LOGS_TABLE.getTableName() + " (\n        deviceID STRING NOT NULL,\n        eventName STRING NOT NULL,\n        normalizedEventName STRING NOT NULL,\n        firstTs INTEGER NOT NULL,\n        lastTs INTEGER NOT NULL,\n        count INTEGER NOT NULL,\n        PRIMARY KEY (deviceID, normalizedEventName)\n    );\n";
        StringBuilder r03 = new StringBuilder();
        r03.append("\n    CREATE TABLE ");
        Table r4 = Table.PROFILE_EVENTS;
        r03.append(r4.getTableName());
        r03.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL\n    );\n");
        f33788c = r03.toString();
        StringBuilder r04 = new StringBuilder();
        r04.append(" \n    CREATE TABLE ");
        Table r5 = Table.INBOX_MESSAGES;
        r04.append(r5.getTableName());
        r04.append(" (\n        _id STRING NOT NULL,\n        data TEXT NOT NULL,\n        wzrkParams TEXT NOT NULL,\n        campaignId STRING NOT NULL,\n        tags TEXT NOT NULL,\n        isRead INTEGER NOT NULL DEFAULT 0,\n        expires INTEGER NOT NULL,\n        created_at INTEGER NOT NULL,\n        messageUser STRING NOT NULL\n    );\n");
        d = r04.toString();
        f33789e = "\n    CREATE UNIQUE INDEX IF NOT EXISTS userid_id_idx ON " + r5.getTableName() + " (\n        messageUser,\n        _id\n    );\n";
        f33790f = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + r2.getTableName() + " (created_at);\n";
        f33791g = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + r4.getTableName() + " ( created_at);\n";
        StringBuilder r05 = new StringBuilder();
        r05.append("\n    CREATE TABLE ");
        Table r42 = Table.PUSH_NOTIFICATIONS;
        r05.append(r42.getTableName());
        r05.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL,\n        isRead INTEGER NOT NULL\n    );\n");
        f33792h = r05.toString();
        f33793i = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + r42.getTableName() + " (created_at);\n";
        StringBuilder r06 = new StringBuilder();
        r06.append("\n    CREATE TABLE ");
        Table r43 = Table.UNINSTALL_TS;
        r06.append(r43.getTableName());
        r06.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        created_at INTEGER NOT NULL\n    );\n");
        f33794j = r06.toString();
        f33795k = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + r43.getTableName() + " (created_at);\n";
        StringBuilder r07 = new StringBuilder();
        r07.append("\n    CREATE TABLE ");
        Table r7 = Table.PUSH_NOTIFICATION_VIEWED;
        r07.append(r7.getTableName());
        r07.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL\n    );\n");
        f33796l = r07.toString();
        f33797m = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + r7.getTableName() + " (created_at);\n";
        StringBuilder r08 = new StringBuilder();
        r08.append("DROP TABLE IF EXISTS ");
        r08.append(r43.getTableName());
        f33798n = r08.toString();
        f33799o = "DROP TABLE IF EXISTS " + r5.getTableName();
        f33800p = "DROP TABLE IF EXISTS " + r7.getTableName();
        StringBuilder r09 = new StringBuilder();
        r09.append("\n    CREATE TABLE ");
        Table r1 = Table.USER_PROFILES;
        r09.append(r1.getTableName());
        r09.append(" (\n        deviceID STRING NOT NULL,\n        _id STRING NOT NULL,\n        data STRING NOT NULL,\n        PRIMARY KEY (_id, deviceID)\n    );\n");
        f33801q = r09.toString();
        f33802r = "\n    CREATE TABLE temp_" + r1.getTableName() + " (\n        _id STRING NOT NULL,\n        deviceID STRING NOT NULL,\n        data STRING NOT NULL,\n        PRIMARY KEY (_id, deviceID)\n    );\n";
        f33803s = "\n    DROP TABLE " + r1.getTableName() + ";\n";
        f33804t = "\n    ALTER TABLE temp_" + r1.getTableName() + " RENAME TO " + r1.getTableName() + ";\n";
    }

    public static final /* synthetic */ String a() {
        return f33786a;
    }

    public static final /* synthetic */ String b() {
        return d;
    }

    public static final /* synthetic */ String c() {
        return f33796l;
    }

    public static final /* synthetic */ String d() {
        return f33788c;
    }

    public static final /* synthetic */ String e() {
        return f33792h;
    }

    public static final /* synthetic */ String f() {
        return f33802r;
    }

    public static final /* synthetic */ String g() {
        return f33794j;
    }

    public static final /* synthetic */ String h() {
        return f33787b;
    }

    public static final /* synthetic */ String i() {
        return f33801q;
    }

    public static final /* synthetic */ String j() {
        return f33799o;
    }

    public static final /* synthetic */ String k() {
        return f33800p;
    }

    public static final /* synthetic */ String l() {
        return f33798n;
    }

    public static final /* synthetic */ String m() {
        return f33803s;
    }

    public static final /* synthetic */ String n() {
        return f33790f;
    }

    public static final /* synthetic */ String o() {
        return f33789e;
    }

    public static final /* synthetic */ String p() {
        return f33797m;
    }

    public static final /* synthetic */ String q() {
        return f33791g;
    }

    public static final /* synthetic */ String r() {
        return f33793i;
    }

    public static final /* synthetic */ String s() {
        return f33804t;
    }

    public static final /* synthetic */ String t() {
        return f33795k;
    }
}
