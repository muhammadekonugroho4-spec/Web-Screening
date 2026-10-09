package com.stockbit.personalamend.ui.otp.event;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: com.stockbit.personalamend.ui.otp.event.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1134a extends a {

        /* renamed from: com.stockbit.personalamend.ui.otp.event.a$a$a, reason: collision with other inner class name */
        public static final class C1135a extends AbstractC1134a {

            /* renamed from: a, reason: collision with root package name */
            public final String f126367a;

            static {
            }

            public C1135a(String r2) {
                super(r2, null);
                this.f126367a = r2;
            }

            public final String a() {
                return this.f126367a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1135a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f126367a, ((C1135a) r4).f126367a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f126367a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "BackStep(errorMessage=" + this.f126367a + ')';
            }
        }

        /* renamed from: com.stockbit.personalamend.ui.otp.event.a$a$b */
        public static final class b extends AbstractC1134a {

            /* renamed from: a, reason: collision with root package name */
            public final String f126368a;

            static {
            }

            public b(String r2) {
                super(r2, null);
                this.f126368a = r2;
            }

            public final String a() {
                return this.f126368a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f126368a, ((b) r4).f126368a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f126368a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "ShowBottomSheet(errorMessage=" + this.f126368a + ')';
            }
        }

        /* renamed from: com.stockbit.personalamend.ui.otp.event.a$a$c */
        public static final class c extends AbstractC1134a {

            /* renamed from: a, reason: collision with root package name */
            public final String f126369a;

            static {
            }

            public c(String r2) {
                super(r2, null);
                this.f126369a = r2;
            }

            public final String a() {
                return this.f126369a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f126369a, ((c) r4).f126369a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f126369a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "ShowToast(errorMessage=" + this.f126369a + ')';
            }
        }

        static {
        }

        public /* synthetic */ AbstractC1134a(String r1, i r2) {
            this(r1);
        }

        public AbstractC1134a(String r1) {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f126370a = null;

        static {
            f126370a = new b();
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
            return -1681467644;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final long f126371a;

        static {
        }

        public c(long r2) {
            super(null);
            this.f126371a = r2;
        }

        public final long a() {
            return this.f126371a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f126371a == ((c) r8).f126371a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f126371a);
        }

        public String toString() {
            return "Success(nextAttemptTimeInMillis=" + this.f126371a + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
