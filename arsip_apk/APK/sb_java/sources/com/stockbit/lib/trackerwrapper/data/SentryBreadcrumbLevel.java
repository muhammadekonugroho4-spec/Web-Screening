package com.stockbit.lib.trackerwrapper.data;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/stockbit/lib/trackerwrapper/data/SentryBreadcrumbLevel;", "", "<init>", "(Ljava/lang/String;I)V", "DEBUG", "INFO", "WARNING", "ERROR", "FATAL", "Companion", "trackerwrapper_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum SentryBreadcrumbLevel extends Enum<SentryBreadcrumbLevel> {
    public static final a Companion = null;
    public static final SentryBreadcrumbLevel DEBUG = null;
    public static final SentryBreadcrumbLevel ERROR = null;
    public static final SentryBreadcrumbLevel FATAL = null;
    public static final SentryBreadcrumbLevel INFO = null;
    public static final SentryBreadcrumbLevel WARNING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SentryBreadcrumbLevel[] f120535a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120536b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        DEBUG = new SentryBreadcrumbLevel("DEBUG", 0);
        INFO = new SentryBreadcrumbLevel("INFO", 1);
        WARNING = new SentryBreadcrumbLevel("WARNING", 2);
        ERROR = new SentryBreadcrumbLevel("ERROR", 3);
        FATAL = new SentryBreadcrumbLevel("FATAL", 4);
        SentryBreadcrumbLevel[] r02 = a();
        f120535a = r02;
        f120536b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SentryBreadcrumbLevel(String r1, int r2) {
    }

    public static final /* synthetic */ SentryBreadcrumbLevel[] a() {
        return new SentryBreadcrumbLevel[]{DEBUG, INFO, WARNING, ERROR, FATAL};
    }

    public static kotlin.enums.a getEntries() {
        return f120536b;
    }

    public static SentryBreadcrumbLevel valueOf(String r1) {
        return (SentryBreadcrumbLevel) Enum.valueOf(SentryBreadcrumbLevel.class, r1);
    }

    public static SentryBreadcrumbLevel[] values() {
        return (SentryBreadcrumbLevel[]) f120535a.clone();
    }
}
