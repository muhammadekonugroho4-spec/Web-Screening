package com.stockbit.personalamend.ui.otp.event;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class b {

    public static abstract class a extends b {

        /* renamed from: com.stockbit.personalamend.ui.otp.event.b$a$a, reason: collision with other inner class name */
        public static final class C1136a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f126372a;

            static {
            }

            public C1136a(String r2) {
                super(r2, null);
                this.f126372a = r2;
            }

            public final String a() {
                return this.f126372a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1136a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f126372a, ((C1136a) r4).f126372a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f126372a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "BackStep(errorMessage=" + this.f126372a + ')';
            }
        }

        /* renamed from: com.stockbit.personalamend.ui.otp.event.b$a$b, reason: collision with other inner class name */
        public static final class C1137b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f126373a;

            static {
            }

            public C1137b(String r2) {
                super(r2, null);
                this.f126373a = r2;
            }

            public final String a() {
                return this.f126373a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1137b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f126373a, ((C1137b) r4).f126373a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f126373a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "ShowInTextField(errorMessage=" + this.f126373a + ')';
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f126374a;

            static {
            }

            public c(String r2) {
                super(r2, null);
                this.f126374a = r2;
            }

            public final String a() {
                return this.f126374a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f126374a, ((c) r4).f126374a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f126374a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "ShowToast(errorMessage=" + this.f126374a + ')';
            }
        }

        static {
        }

        public /* synthetic */ a(String r1, i r2) {
            this(r1);
        }

        public a(String r1) {
            super(null);
        }
    }

    /* renamed from: com.stockbit.personalamend.ui.otp.event.b$b, reason: collision with other inner class name */
    public static final class C1138b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1138b f126375a = null;

        static {
            f126375a = new C1138b();
        }

        public C1138b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1138b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -21660162;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static abstract class c extends b {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f126376a = null;

            static {
                f126376a = new a();
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
                return 2059185797;
            }

            public String toString() {
                return "ChangeDataDone";
            }
        }

        /* renamed from: com.stockbit.personalamend.ui.otp.event.b$c$b, reason: collision with other inner class name */
        public static final class C1139b extends c {

            /* renamed from: a, reason: collision with root package name */
            public final String f126377a;

            static {
            }

            public C1139b(String r2) {
                p.l(r2, "token");
                super(null);
                this.f126377a = r2;
            }

            public final String a() {
                return this.f126377a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1139b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f126377a, ((C1139b) r4).f126377a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f126377a.hashCode();
            }

            public String toString() {
                return "ChangeDataForm(token=" + this.f126377a + ')';
            }
        }

        /* renamed from: com.stockbit.personalamend.ui.otp.event.b$c$c, reason: collision with other inner class name */
        public static final class C1140c extends c {

            /* renamed from: a, reason: collision with root package name */
            public final String f126378a;

            static {
            }

            public C1140c(String r2) {
                p.l(r2, "token");
                super(null);
                this.f126378a = r2;
            }

            public final String a() {
                return this.f126378a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1140c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f126378a, ((C1140c) r4).f126378a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f126378a.hashCode();
            }

            public String toString() {
                return "VerifyData(token=" + this.f126378a + ')';
            }
        }

        static {
        }

        public /* synthetic */ c(i r1) {
            this();
        }

        public c() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
