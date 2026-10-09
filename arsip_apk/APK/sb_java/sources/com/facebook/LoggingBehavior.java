package com.facebook;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/LoggingBehavior;", "", "(Ljava/lang/String;I)V", "REQUESTS", "INCLUDE_ACCESS_TOKENS", "INCLUDE_RAW_RESPONSES", "CACHE", "APP_EVENTS", "DEVELOPER_ERRORS", "GRAPH_API_DEBUG_WARNING", "GRAPH_API_DEBUG_INFO", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum LoggingBehavior extends Enum<LoggingBehavior> {
    public static final LoggingBehavior APP_EVENTS = null;
    public static final LoggingBehavior CACHE = null;
    public static final LoggingBehavior DEVELOPER_ERRORS = null;
    public static final LoggingBehavior GRAPH_API_DEBUG_INFO = null;
    public static final LoggingBehavior GRAPH_API_DEBUG_WARNING = null;
    public static final LoggingBehavior INCLUDE_ACCESS_TOKENS = null;
    public static final LoggingBehavior INCLUDE_RAW_RESPONSES = null;
    public static final LoggingBehavior REQUESTS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LoggingBehavior[] f35702a = null;

    static {
        REQUESTS = new LoggingBehavior("REQUESTS", 0);
        INCLUDE_ACCESS_TOKENS = new LoggingBehavior("INCLUDE_ACCESS_TOKENS", 1);
        INCLUDE_RAW_RESPONSES = new LoggingBehavior("INCLUDE_RAW_RESPONSES", 2);
        CACHE = new LoggingBehavior("CACHE", 3);
        APP_EVENTS = new LoggingBehavior("APP_EVENTS", 4);
        DEVELOPER_ERRORS = new LoggingBehavior("DEVELOPER_ERRORS", 5);
        GRAPH_API_DEBUG_WARNING = new LoggingBehavior("GRAPH_API_DEBUG_WARNING", 6);
        GRAPH_API_DEBUG_INFO = new LoggingBehavior("GRAPH_API_DEBUG_INFO", 7);
        f35702a = a();
    }

    LoggingBehavior(String r1, int r2) {
    }

    public static final /* synthetic */ LoggingBehavior[] a() {
        return new LoggingBehavior[]{REQUESTS, INCLUDE_ACCESS_TOKENS, INCLUDE_RAW_RESPONSES, CACHE, APP_EVENTS, DEVELOPER_ERRORS, GRAPH_API_DEBUG_WARNING, GRAPH_API_DEBUG_INFO};
    }

    public static LoggingBehavior valueOf(String r1) {
        return (LoggingBehavior) Enum.valueOf(LoggingBehavior.class, r1);
    }

    public static LoggingBehavior[] values() {
        return (LoggingBehavior[]) f35702a.clone();
    }
}
