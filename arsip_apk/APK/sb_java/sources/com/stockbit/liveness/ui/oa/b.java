package com.stockbit.liveness.ui.oa;

/* loaded from: classes10.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f121227a;

        static {
        }

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f121227a = r2;
        }

        public final String a() {
            return this.f121227a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f121227a, ((a) r4).f121227a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f121227a.hashCode();
        }

        public String toString() {
            return "ErrorData(message=" + this.f121227a + ')';
        }
    }

    /* renamed from: com.stockbit.liveness.ui.oa.b$b, reason: collision with other inner class name */
    public static final class C1058b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1058b f121228a = null;

        static {
            f121228a = new C1058b();
        }

        public C1058b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1058b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -66736979;
        }

        public String toString() {
            return "ErrorFaceVerification";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final long f121229a;

        static {
        }

        public c(long r2) {
            super(null);
            this.f121229a = r2;
        }

        public final long a() {
            return this.f121229a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f121229a == ((c) r8).f121229a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f121229a);
        }

        public String toString() {
            return "ErrorSuspended(remainingTimeStamp=" + this.f121229a + ')';
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f121230a;

        static {
        }

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "license");
            super(null);
            this.f121230a = r2;
        }

        public final String a() {
            return this.f121230a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f121230a, ((d) r4).f121230a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f121230a.hashCode();
        }

        public String toString() {
            return "OpenLiveness(license=" + this.f121230a + ')';
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f121231a = null;

        static {
            f121231a = new e();
        }

        public e() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -666110573;
        }

        public String toString() {
            return "SuccessLiveness";
        }
    }

    static {
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
