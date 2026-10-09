package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes3.dex */
public enum ReportLevel extends Enum<ReportLevel> {
    public static final a Companion = null;
    public static final ReportLevel IGNORE = null;
    public static final ReportLevel STRICT = null;
    public static final ReportLevel WARN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ReportLevel[] f178418a = null;
    private final String description;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        IGNORE = new ReportLevel("IGNORE", 0, "ignore");
        WARN = new ReportLevel("WARN", 1, "warn");
        STRICT = new ReportLevel("STRICT", 2, "strict");
        f178418a = a();
        Companion = new a(null);
    }

    ReportLevel(String r1, int r2, String r3) {
        this.description = r3;
    }

    public static final /* synthetic */ ReportLevel[] a() {
        return new ReportLevel[]{IGNORE, WARN, STRICT};
    }

    public static ReportLevel valueOf(String r1) {
        return (ReportLevel) Enum.valueOf(ReportLevel.class, r1);
    }

    public static ReportLevel[] values() {
        return (ReportLevel[]) f178418a.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        if (this != IGNORE) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isWarning() {
        if (this != WARN) goto L6;
        return true;
    L6:
        return false;
    }
}
