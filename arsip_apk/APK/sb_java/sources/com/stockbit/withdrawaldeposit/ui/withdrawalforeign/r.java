package com.stockbit.withdrawaldeposit.ui.withdrawalforeign;

/* loaded from: classes2.dex */
public abstract class r {

    public static final class a extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final a f173478a = null;

        static {
            f173478a = new a();
        }

        public a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1084000053;
        }

        public String toString() {
            return "EligibleToWithDraw";
        }
    }

    public static final class b extends r {

        /* renamed from: a, reason: collision with root package name */
        public final String f173479a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "errorMessage");
            super(null);
            this.f173479a = r2;
        }

        public final String a() {
            return this.f173479a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f173479a, ((b) r4).f173479a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f173479a.hashCode();
        }

        public String toString() {
            return "ErrorToast(errorMessage=" + this.f173479a + ')';
        }
    }

    public static final class c extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final c f173480a = null;

        static {
            f173480a = new c();
        }

        public c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 2021220259;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final d f173481a = null;

        static {
            f173481a = new d();
        }

        public d() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1140337041;
        }

        public String toString() {
            return "OpenBalanceWithdrawInformationDialog";
        }
    }

    public static final class e extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final e f173482a = null;

        static {
            f173482a = new e();
        }

        public e() {
            super(null);
        }
    }

    public static final class f extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final f f173483a = null;

        static {
            f173483a = new f();
        }

        public f() {
            super(null);
        }
    }

    public static final class g extends r {

        /* renamed from: a, reason: collision with root package name */
        public final long f173484a;

        static {
        }

        public g(long r2) {
            super(null);
            this.f173484a = r2;
        }

        public final long a() {
            return this.f173484a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof g) == true) goto L9;
            return false;
        L9:
            if (this.f173484a == ((g) r8).f173484a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f173484a);
        }

        public String toString() {
            return "UneligibleToWithDraw(cooldownTimeInMillis=" + this.f173484a + ')';
        }
    }

    static {
    }

    public /* synthetic */ r(kotlin.jvm.internal.i r1) {
        this();
    }

    public r() {
    }
}
