package com.stockbit.feature.notificationdiagnostic.compose.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class b {

    public static abstract class a extends b {

        /* renamed from: com.stockbit.feature.notificationdiagnostic.compose.model.b$a$a, reason: collision with other inner class name */
        public static final class C0922a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f100588a;

            static {
            }

            public C0922a(String r2) {
                super(null);
                this.f100588a = r2;
            }

            public final String a() {
                return this.f100588a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0922a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f100588a, ((C0922a) r4).f100588a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                String r02 = this.f100588a;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "General(message=" + this.f100588a + ')';
            }

            public /* synthetic */ C0922a(String r1, int r2, i r3) {
                if ((r2 & 1) == 0) goto L5;
                r1 = null;
            L5:
                this(r1);
            }
        }

        /* renamed from: com.stockbit.feature.notificationdiagnostic.compose.model.b$a$b, reason: collision with other inner class name */
        public static final class C0923b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0923b f100589a = null;

            static {
                f100589a = new C0923b();
            }

            public C0923b() {
                super(null);
            }

            public boolean equals(Object r2) {
                if (this != r2) goto L6;
                return true;
            L6:
                if ((r2 instanceof C0923b) == true) goto L9;
                return false;
            L9:
                return true;
            }

            public int hashCode() {
                return 2050582884;
            }

            public String toString() {
                return "Permission";
            }
        }

        static {
        }

        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.feature.notificationdiagnostic.compose.model.b$b, reason: collision with other inner class name */
    public static final class C0924b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0924b f100590a = null;

        static {
            f100590a = new C0924b();
        }

        public C0924b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0924b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -556565363;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f100591a = null;

        static {
            f100591a = new c();
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
            return 1534581588;
        }

        public String toString() {
            return "Success";
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
