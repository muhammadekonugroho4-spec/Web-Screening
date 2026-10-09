package com.stockbit.feature.trusteddevice.ui.change.verifyotp;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface a {

    /* renamed from: com.stockbit.feature.trusteddevice.ui.change.verifyotp.a$a, reason: collision with other inner class name */
    public static final class C1022a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f118094a;

        static {
        }

        public C1022a(String r2) {
            p.l(r2, "message");
            this.f118094a = r2;
        }

        public final String a() {
            return this.f118094a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1022a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f118094a, ((C1022a) r4).f118094a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118094a.hashCode();
        }

        public String toString() {
            return "BackToLinkedDeviceWithError(message=" + this.f118094a + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f118095a = null;

        static {
            f118095a = new b();
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
            return 376391719;
        }

        public String toString() {
            return "HideLoading";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f118096a = null;

        static {
            f118096a = new c();
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
            return 884961804;
        }

        public String toString() {
            return "ShowLoading";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f118097a;

        static {
        }

        public d(String r2) {
            p.l(r2, "message");
            this.f118097a = r2;
        }

        public final String a() {
            return this.f118097a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f118097a, ((d) r4).f118097a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118097a.hashCode();
        }

        public String toString() {
            return "ShowOTPLimitDialog(message=" + this.f118097a + ')';
        }
    }

    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f118098a;

        static {
        }

        public e(long r1) {
            this.f118098a = r1;
        }

        public final long a() {
            return this.f118098a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof e) == true) goto L9;
            return false;
        L9:
            if (this.f118098a == ((e) r8).f118098a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f118098a);
        }

        public String toString() {
            return "StartCountDownTimer(timerDuration=" + this.f118098a + ')';
        }
    }
}
