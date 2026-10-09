package com.stockbit.usecase.otp.resource;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.otp.resource.a$a, reason: collision with other inner class name */
    public static final class C1543a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f158952a;

        public C1543a(long r1) {
            this.f158952a = r1;
        }

        public final long a() {
            return this.f158952a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C1543a) == true) goto L9;
            return false;
        L9:
            if (this.f158952a == ((C1543a) r8).f158952a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f158952a);
        }

        public String toString() {
            return "Continue(startTimer=" + this.f158952a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158953a = null;

        static {
            f158953a = new b();
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
            return 1952962602;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158954a = null;

        static {
            f158954a = new c();
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
            return 1348074774;
        }

        public String toString() {
            return "Retry";
        }
    }
}
