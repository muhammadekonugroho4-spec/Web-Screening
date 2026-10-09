package com.stockbit.usecase.personalamend.resource.changedata;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public interface a extends b {

        /* renamed from: com.stockbit.usecase.personalamend.resource.changedata.b$a$a, reason: collision with other inner class name */
        public static final class C1554a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159105a;

            public C1554a(String r1) {
                this.f159105a = r1;
            }

            public final String a() {
                return this.f159105a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1554a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159105a, ((C1554a) r4).f159105a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f159105a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "General(errorMessage=" + this.f159105a + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.personalamend.resource.changedata.b$a$b, reason: collision with other inner class name */
        public static final class C1555b implements a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159106a;

            public C1555b(String r2) {
                p.l(r2, "errorMessage");
                this.f159106a = r2;
            }

            public final String a() {
                return this.f159106a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1555b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159106a, ((C1555b) r4).f159106a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159106a.hashCode();
            }

            public String toString() {
                return "InvalidMfaSession(errorMessage=" + this.f159106a + ")";
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159107a;

            public c(String r2) {
                p.l(r2, "errorMessage");
                this.f159107a = r2;
            }

            public final String a() {
                return this.f159107a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159107a, ((c) r4).f159107a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159107a.hashCode();
            }

            public String toString() {
                return "InvalidParameter(errorMessage=" + this.f159107a + ")";
            }
        }

        public static final class d implements a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159108a;

            public d(String r2) {
                p.l(r2, "errorMessage");
                this.f159108a = r2;
            }

            public final String a() {
                return this.f159108a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof d) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159108a, ((d) r4).f159108a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159108a.hashCode();
            }

            public String toString() {
                return "OtpLimitExceeded(errorMessage=" + this.f159108a + ")";
            }
        }

        public static final class e implements a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159109a;

            public e(String r1) {
                this.f159109a = r1;
            }

            public final String a() {
                return this.f159109a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof e) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159109a, ((e) r4).f159109a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f159109a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "System(errorMessage=" + this.f159109a + ")";
            }
        }
    }

    /* renamed from: com.stockbit.usecase.personalamend.resource.changedata.b$b, reason: collision with other inner class name */
    public static final class C1556b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1556b f159110a = null;

        static {
            f159110a = new C1556b();
        }

        public C1556b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1556b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1982280574;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f159111a = null;

        static {
            f159111a = new c();
        }

        public c() {
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
            return 108866377;
        }

        public String toString() {
            return "Success";
        }
    }
}
