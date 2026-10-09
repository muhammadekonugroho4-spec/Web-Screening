package com.stockbit.usecase.personalamend.resource.changedata;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class f {

    public static abstract class a extends f {

        /* renamed from: com.stockbit.usecase.personalamend.resource.changedata.f$a$a, reason: collision with other inner class name */
        public static final class C1562a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159128a;

            public C1562a(String r2) {
                super(null);
                this.f159128a = r2;
            }

            public final String a() {
                return this.f159128a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1562a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159128a, ((C1562a) r4).f159128a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f159128a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "General(errorMessage=" + this.f159128a + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159129a;

            public b(String r2) {
                super(null);
                this.f159129a = r2;
            }

            public final String a() {
                return this.f159129a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159129a, ((b) r4).f159129a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f159129a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "InvalidMfaSession(errorMessage=" + this.f159129a + ")";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159130a;

            public c(String r2) {
                super(null);
                this.f159130a = r2;
            }

            public final String a() {
                return this.f159130a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159130a, ((c) r4).f159130a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f159130a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "InvalidParameter(errorMessage=" + this.f159130a + ")";
            }
        }

        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159131a;

            public d(String r2) {
                super(null);
                this.f159131a = r2;
            }

            public final String a() {
                return this.f159131a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof d) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159131a, ((d) r4).f159131a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f159131a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "OtpLimitExceeded(errorMessage=" + this.f159131a + ")";
            }
        }

        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159132a;

            public e(String r2) {
                super(null);
                this.f159132a = r2;
            }

            public final String a() {
                return this.f159132a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof e) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159132a, ((e) r4).f159132a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f159132a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "System(errorMessage=" + this.f159132a + ")";
            }
        }

        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159133a = null;

        static {
            f159133a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1289588736;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f159134a = null;

        static {
            f159134a = new c();
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
            return 801558215;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ f(i r1) {
        this();
    }

    public f() {
    }
}
