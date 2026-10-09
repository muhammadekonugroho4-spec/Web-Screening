package com.stockbit.usecase.personalamend.resource.changedata;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface c {

    public static abstract class a implements c {

        /* renamed from: com.stockbit.usecase.personalamend.resource.changedata.c$a$a, reason: collision with other inner class name */
        public static final class C1557a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159112a;

            public C1557a(String r2) {
                p.l(r2, "message");
                super(null);
                this.f159112a = r2;
            }

            public final String a() {
                return this.f159112a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1557a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159112a, ((C1557a) r4).f159112a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159112a.hashCode();
            }

            public String toString() {
                return "General(message=" + this.f159112a + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159113a;

            public b(String r2) {
                p.l(r2, "message");
                super(null);
                this.f159113a = r2;
            }

            public final String a() {
                return this.f159113a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159113a, ((b) r4).f159113a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159113a.hashCode();
            }

            public String toString() {
                return "InvalidParameter(message=" + this.f159113a + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.personalamend.resource.changedata.c$a$c, reason: collision with other inner class name */
        public static final class C1558c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159114a;

            public C1558c(String r2) {
                p.l(r2, "message");
                super(null);
                this.f159114a = r2;
            }

            public final String a() {
                return this.f159114a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1558c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159114a, ((C1558c) r4).f159114a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159114a.hashCode();
            }

            public String toString() {
                return "SystemError(message=" + this.f159114a + ")";
            }
        }

        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159115a = null;

        static {
            f159115a = new b();
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
            return 441594626;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.usecase.personalamend.resource.changedata.c$c, reason: collision with other inner class name */
    public static final class C1559c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f159116a;

        public C1559c(String r2) {
            p.l(r2, "token");
            this.f159116a = r2;
        }

        public final String a() {
            return this.f159116a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1559c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159116a, ((C1559c) r4).f159116a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159116a.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f159116a + ")";
        }
    }
}
