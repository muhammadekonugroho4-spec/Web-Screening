package com.stockbit.lib.trackerwrapper.data;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/lib/trackerwrapper/data/SentryBreadcrumbType;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "DEBUG", "ERROR", "trackerwrapper_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum SentryBreadcrumbType extends Enum<SentryBreadcrumbType> {
    public static final SentryBreadcrumbType DEBUG = null;
    public static final SentryBreadcrumbType ERROR = null;
    public static final SentryBreadcrumbType INFO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SentryBreadcrumbType[] f120537a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120538b = null;

    static {
        INFO = new SentryBreadcrumbType("INFO", 0);
        DEBUG = new SentryBreadcrumbType("DEBUG", 1);
        ERROR = new SentryBreadcrumbType("ERROR", 2);
        SentryBreadcrumbType[] r02 = a();
        f120537a = r02;
        f120538b = kotlin.enums.b.a(r02);
    }

    SentryBreadcrumbType(String r1, int r2) {
    }

    public static final /* synthetic */ SentryBreadcrumbType[] a() {
        return new SentryBreadcrumbType[]{INFO, DEBUG, ERROR};
    }

    public static kotlin.enums.a getEntries() {
        return f120538b;
    }

    public static SentryBreadcrumbType valueOf(String r1) {
        return (SentryBreadcrumbType) Enum.valueOf(SentryBreadcrumbType.class, r1);
    }

    public static SentryBreadcrumbType[] values() {
        return (SentryBreadcrumbType[]) f120537a.clone();
    }
}
