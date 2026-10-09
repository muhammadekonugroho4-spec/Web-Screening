package com.clevertap.android.sdk.db;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/clevertap/android/sdk/db/Table;", "", "tableName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTableName", "()Ljava/lang/String;", "EVENTS", "PROFILE_EVENTS", "USER_PROFILES", "INBOX_MESSAGES", "PUSH_NOTIFICATIONS", "UNINSTALL_TS", "PUSH_NOTIFICATION_VIEWED", "USER_EVENT_LOGS_TABLE", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum Table extends Enum<Table> {
    public static final Table EVENTS = null;
    public static final Table INBOX_MESSAGES = null;
    public static final Table PROFILE_EVENTS = null;
    public static final Table PUSH_NOTIFICATIONS = null;
    public static final Table PUSH_NOTIFICATION_VIEWED = null;
    public static final Table UNINSTALL_TS = null;
    public static final Table USER_EVENT_LOGS_TABLE = null;
    public static final Table USER_PROFILES = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Table[] f33784a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f33785b = null;
    private final String tableName;

    static {
        EVENTS = new Table("EVENTS", 0, "events");
        PROFILE_EVENTS = new Table("PROFILE_EVENTS", 1, "profileEvents");
        USER_PROFILES = new Table("USER_PROFILES", 2, "userProfiles");
        INBOX_MESSAGES = new Table("INBOX_MESSAGES", 3, "inboxMessages");
        PUSH_NOTIFICATIONS = new Table("PUSH_NOTIFICATIONS", 4, "pushNotifications");
        UNINSTALL_TS = new Table("UNINSTALL_TS", 5, "uninstallTimestamp");
        PUSH_NOTIFICATION_VIEWED = new Table("PUSH_NOTIFICATION_VIEWED", 6, "notificationViewed");
        USER_EVENT_LOGS_TABLE = new Table("USER_EVENT_LOGS_TABLE", 7, "userEventLogs");
        Table[] r02 = a();
        f33784a = r02;
        f33785b = kotlin.enums.b.a(r02);
    }

    Table(String r1, int r2, String r3) {
        this.tableName = r3;
    }

    public static final /* synthetic */ Table[] a() {
        return new Table[]{EVENTS, PROFILE_EVENTS, USER_PROFILES, INBOX_MESSAGES, PUSH_NOTIFICATIONS, UNINSTALL_TS, PUSH_NOTIFICATION_VIEWED, USER_EVENT_LOGS_TABLE};
    }

    public static kotlin.enums.a getEntries() {
        return f33785b;
    }

    public static Table valueOf(String r1) {
        return (Table) Enum.valueOf(Table.class, r1);
    }

    public static Table[] values() {
        return (Table[]) f33784a.clone();
    }

    public final String getTableName() {
        return this.tableName;
    }
}
