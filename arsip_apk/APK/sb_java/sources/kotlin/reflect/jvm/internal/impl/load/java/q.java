package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes3.dex */
public final class q {
    public static final a d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final q f178666e = null;

    /* renamed from: a, reason: collision with root package name */
    public final ReportLevel f178667a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.h f178668b;

    /* renamed from: c, reason: collision with root package name */
    public final ReportLevel f178669c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final q a() {
            return q.a();
        }

        public a() {
        }
    }

    static {
        d = new a(null);
        kotlin.h r4 = null;
        ReportLevel r5 = null;
        f178666e = new q(ReportLevel.STRICT, r4, r5, 6, null);
    }

    public q(ReportLevel r2, kotlin.h r3, ReportLevel r4) {
        kotlin.jvm.internal.p.l(r2, "reportLevelBefore");
        kotlin.jvm.internal.p.l(r4, "reportLevelAfter");
        this.f178667a = r2;
        this.f178668b = r3;
        this.f178669c = r4;
    }

    public static final /* synthetic */ q a() {
        return f178666e;
    }

    public final ReportLevel b() {
        return this.f178669c;
    }

    public final ReportLevel c() {
        return this.f178667a;
    }

    public final kotlin.h d() {
        return this.f178668b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (this.f178667a == r52.f178667a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f178668b, r52.f178668b) == true) goto L15;
        return false;
    L15:
        if (this.f178669c == r52.f178669c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f178667a.hashCode() * 31;
        kotlin.h r1 = this.f178668b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f178669c.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f178667a + ", sinceVersion=" + this.f178668b + ", reportLevelAfter=" + this.f178669c + ')';
    }

    public /* synthetic */ q(ReportLevel r2, kotlin.h r3, ReportLevel r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = new kotlin.h(1, 0);
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = r2;
    L8:
        this(r2, r3, r4);
    }
}
