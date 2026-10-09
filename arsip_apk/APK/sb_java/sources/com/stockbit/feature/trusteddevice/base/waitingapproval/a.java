package com.stockbit.feature.trusteddevice.base.waitingapproval;

/* loaded from: classes9.dex */
public interface a {

    /* renamed from: com.stockbit.feature.trusteddevice.base.waitingapproval.a$a, reason: collision with other inner class name */
    public static final class C1016a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f117700a;

        static {
        }

        public C1016a(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            this.f117700a = r2;
        }

        public final String a() {
            return this.f117700a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1016a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f117700a, ((C1016a) r4).f117700a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f117700a.hashCode();
        }

        public String toString() {
            return "GoBackAndShowError(message=" + this.f117700a + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f117701a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "messageTitle");
            this.f117701a = r2;
        }

        public final String a() {
            return this.f117701a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f117701a, ((b) r4).f117701a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f117701a.hashCode();
        }

        public String toString() {
            return "ShowOTPLimitDialog(messageTitle=" + this.f117701a + ')';
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f117702a;

        static {
        }

        public c(long r1) {
            this.f117702a = r1;
        }

        public final long a() {
            return this.f117702a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f117702a == ((c) r8).f117702a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f117702a);
        }

        public String toString() {
            return "StartTimer(durationInMillis=" + this.f117702a + ')';
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f117703a = null;

        static {
            f117703a = new d();
        }

        public d() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 498210440;
        }

        public String toString() {
            return "StopTimer";
        }
    }
}
