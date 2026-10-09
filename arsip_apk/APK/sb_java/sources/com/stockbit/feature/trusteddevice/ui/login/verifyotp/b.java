package com.stockbit.feature.trusteddevice.ui.login.verifyotp;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f118455a = null;

        static {
            f118455a = new a();
        }

        public a() {
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
            return -1421102299;
        }

        public String toString() {
            return "HideLoading";
        }
    }

    /* renamed from: com.stockbit.feature.trusteddevice.ui.login.verifyotp.b$b, reason: collision with other inner class name */
    public static final class C1026b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1026b f118456a = null;

        static {
            f118456a = new C1026b();
        }

        public C1026b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1026b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -912532214;
        }

        public String toString() {
            return "ShowLoading";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f118457a;

        static {
        }

        public c(String r2) {
            p.l(r2, "message");
            this.f118457a = r2;
        }

        public final String a() {
            return this.f118457a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f118457a, ((c) r4).f118457a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118457a.hashCode();
        }

        public String toString() {
            return "ShowOTPLimitDialog(message=" + this.f118457a + ')';
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final long f118458a;

        static {
        }

        public d(long r1) {
            this.f118458a = r1;
        }

        public final long a() {
            return this.f118458a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof d) == true) goto L9;
            return false;
        L9:
            if (this.f118458a == ((d) r8).f118458a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f118458a);
        }

        public String toString() {
            return "StartCountDownTimer(timerDuration=" + this.f118458a + ')';
        }
    }

    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f118459a = null;

        static {
            f118459a = new e();
        }

        public e() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 145123315;
        }

        public String toString() {
            return "VerificationSuccess";
        }
    }
}
