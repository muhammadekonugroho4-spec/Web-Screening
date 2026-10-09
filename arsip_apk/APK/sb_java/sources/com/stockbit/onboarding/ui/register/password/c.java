package com.stockbit.onboarding.ui.register.password;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f124071a;

        static {
        }

        public a(String r2) {
            p.l(r2, "message");
            this.f124071a = r2;
        }

        public final String a() {
            return this.f124071a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f124071a, ((a) r4).f124071a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f124071a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f124071a + ')';
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f124072a;

        static {
        }

        public b(boolean r1) {
            this.f124072a = r1;
        }

        public final boolean a() {
            return this.f124072a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f124072a == ((b) r4).f124072a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f124072a);
        }

        public String toString() {
            return "Loading(isLoading=" + this.f124072a + ')';
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.register.password.c$c, reason: collision with other inner class name */
    public static final class C1085c implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1085c f124073a = null;

        static {
            f124073a = new C1085c();
        }

        public C1085c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1085c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -752686280;
        }

        public String toString() {
            return "Success";
        }
    }
}
