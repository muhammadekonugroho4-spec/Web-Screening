package androidx.navigationevent;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f26547a = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends j {

        /* renamed from: b, reason: collision with root package name */
        public static final b f26548b = null;

        static {
            f26548b = new b();
        }

        public b() {
            super(null);
        }

        public String toString() {
            return "Idle()";
        }
    }

    public static final class c extends j {

        /* renamed from: b, reason: collision with root package name */
        public final androidx.navigationevent.b f26549b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26550c;

        public c(androidx.navigationevent.b r2, int r3) {
            kotlin.jvm.internal.p.l(r2, "latestEvent");
            super(null);
            this.f26549b = r2;
            this.f26550c = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if (r5 != null) goto L8;
        L17:
            return false;
        L8:
            if (c.class != r5.getClass()) goto L17;
            c r52 = (c) r5;
            if (this.f26550c == r52.f26550c) goto L14;
            return false;
        L14:
            if (kotlin.jvm.internal.p.g(this.f26549b, r52.f26549b) == true) goto L16;
            return false;
        L16:
            return true;
        }

        public int hashCode() {
            return (this.f26550c * 31) + this.f26549b.hashCode();
        }

        public String toString() {
            return "InProgress(latestEvent=" + this.f26549b + ", direction=" + this.f26550c + ')';
        }
    }

    static {
        f26547a = new a(null);
    }

    public /* synthetic */ j(kotlin.jvm.internal.i r1) {
        this();
    }

    public j() {
    }
}
