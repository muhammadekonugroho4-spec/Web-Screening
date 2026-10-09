package com.stockbit.usecase.personalamend.resource.changedata;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface d {

    public static abstract class a implements d {

        /* renamed from: com.stockbit.usecase.personalamend.resource.changedata.d$a$a, reason: collision with other inner class name */
        public static final class C1560a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159117a;

            public C1560a(String r2) {
                super(null);
                this.f159117a = r2;
            }

            public final String a() {
                return this.f159117a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1560a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159117a, ((C1560a) r4).f159117a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f159117a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "InvalidMfaSession(errorMessage=" + this.f159117a + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159118a;

            public b(String r2) {
                super(null);
                this.f159118a = r2;
            }

            public final String a() {
                return this.f159118a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159118a, ((b) r4).f159118a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f159118a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "OtpLimitExceededRequest(errorMessage=" + this.f159118a + ")";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159119a;

            public c(String r2) {
                super(null);
                this.f159119a = r2;
            }

            public final String a() {
                return this.f159119a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159119a, ((c) r4).f159119a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f159119a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "Unknown(errorMessage=" + this.f159119a + ")";
            }
        }

        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159120a = null;

        static {
            f159120a = new b();
        }

        public b() {
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
            return -419549038;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f159121a = null;

        static {
            f159121a = new c();
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
            return 496018906;
        }

        public String toString() {
            return "NoDataRequest";
        }
    }

    /* renamed from: com.stockbit.usecase.personalamend.resource.changedata.d$d, reason: collision with other inner class name */
    public static final class C1561d implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f159122a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159123b;

        /* renamed from: c, reason: collision with root package name */
        public final String f159124c;

        public C1561d(String r2, String r3, String r4) {
            p.l(r2, "nextAttemptTime");
            this.f159122a = r2;
            this.f159123b = r3;
            this.f159124c = r4;
        }

        public final String a() {
            return this.f159123b;
        }

        public final String b() {
            return this.f159122a;
        }

        public final String c() {
            return this.f159124c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1561d) == true) goto L8;
            return false;
        L8:
            C1561d r52 = (C1561d) r5;
            if (p.g(this.f159122a, r52.f159122a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159123b, r52.f159123b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f159124c, r52.f159124c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = this.f159122a.hashCode() * 31;
            String r1 = this.f159123b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.f159124c;
            if (r13 == null) goto L11;
            r2 = r13.hashCode();
        L11:
            return r03 + r2;
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "Success(nextAttemptTime=" + this.f159122a + ", email=" + this.f159123b + ", phoneNumber=" + this.f159124c + ")";
        }
    }
}
