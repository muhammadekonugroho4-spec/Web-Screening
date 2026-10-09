package com.stockbit.personalamend.ui.phonenumber.v2.createnewphone;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: com.stockbit.personalamend.ui.phonenumber.v2.createnewphone.a$a, reason: collision with other inner class name */
    public static final class C1145a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1145a f126502a = null;

        static {
            f126502a = new C1145a();
        }

        public C1145a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1145a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1243092841;
        }

        public String toString() {
            return "CountryCodeClicked";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f126503a;

        static {
        }

        public b(boolean r1) {
            this.f126503a = r1;
        }

        public final boolean a() {
            return this.f126503a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f126503a == ((b) r4).f126503a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f126503a);
        }

        public String toString() {
            return "Loading(show=" + this.f126503a + ')';
        }
    }
}
