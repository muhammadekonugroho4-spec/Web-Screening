package com.stockbit.personalamend.ui.phonenumber.change;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: com.stockbit.personalamend.ui.phonenumber.change.a$a, reason: collision with other inner class name */
    public static final class C1141a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1141a f126415a = null;

        static {
            f126415a = new C1141a();
        }

        public C1141a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1141a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1353061193;
        }

        public String toString() {
            return "CountryCodeClicked";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f126416a;

        /* renamed from: b, reason: collision with root package name */
        public final String f126417b;

        static {
        }

        public b(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "phoneNumber");
            kotlin.jvm.internal.p.l(r3, "token");
            this.f126416a = r2;
            this.f126417b = r3;
        }

        public final String a() {
            return this.f126416a;
        }

        public final String b() {
            return this.f126417b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f126416a, r52.f126416a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f126417b, r52.f126417b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f126416a.hashCode() * 31) + this.f126417b.hashCode();
        }

        public String toString() {
            return "VerifyPhoneNumber(phoneNumber=" + this.f126416a + ", token=" + this.f126417b + ')';
        }
    }
}
