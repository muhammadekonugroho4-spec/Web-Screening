package com.stockbit.amendbank.ui.bankaccount;

/* loaded from: classes6.dex */
public interface a {

    /* renamed from: com.stockbit.amendbank.ui.bankaccount.a$a, reason: collision with other inner class name */
    public static final class C0518a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f46195a;

        static {
        }

        public C0518a(int r1) {
            this.f46195a = r1;
        }

        public final int a() {
            return this.f46195a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0518a) == true) goto L9;
            return false;
        L9:
            if (this.f46195a == ((C0518a) r4).f46195a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46195a);
        }

        public String toString() {
            return "Eligible(limitNumber=" + this.f46195a + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f46196a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "errorMessage");
            this.f46196a = r2;
        }

        public final String a() {
            return this.f46196a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f46196a, ((b) r4).f46196a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f46196a.hashCode();
        }

        public String toString() {
            return "ErrorToast(errorMessage=" + this.f46196a + ')';
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f46197a = null;

        static {
            f46197a = new c();
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
            return 314503771;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f46198a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46199b;

        /* renamed from: c, reason: collision with root package name */
        public final String f46200c;

        static {
        }

        public d(int r2, int r3, String r4) {
            kotlin.jvm.internal.p.l(r4, "triggerEvent");
            this.f46198a = r2;
            this.f46199b = r3;
            this.f46200c = r4;
        }

        public final int a() {
            return this.f46198a;
        }

        public final int b() {
            return this.f46199b;
        }

        public final String c() {
            return this.f46200c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (this.f46198a == r52.f46198a) goto L12;
            return false;
        L12:
            if (this.f46199b == r52.f46199b) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f46200c, r52.f46200c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f46198a) * 31) + Integer.hashCode(this.f46199b)) * 31) + this.f46200c.hashCode();
        }

        public String toString() {
            return "Uneligible(hours=" + this.f46198a + ", minutes=" + this.f46199b + ", triggerEvent=" + this.f46200c + ')';
        }
    }
}
