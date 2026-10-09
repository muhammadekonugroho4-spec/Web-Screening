package com.stockbit.onboarding.ui.forgotpassword.otp;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: com.stockbit.onboarding.ui.forgotpassword.otp.a$a, reason: collision with other inner class name */
    public static final class C1078a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1078a f123617a = null;

        static {
            f123617a = new C1078a();
        }

        public C1078a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1078a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1302953253;
        }

        public String toString() {
            return "HideLoading";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f123618a;

        static {
        }

        public b(String r2) {
            p.l(r2, "token");
            this.f123618a = r2;
        }

        public final String a() {
            return this.f123618a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f123618a, ((b) r4).f123618a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f123618a.hashCode();
        }

        public String toString() {
            return "OpenCreatePassword(token=" + this.f123618a + ')';
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f123619a = null;

        static {
            f123619a = new c();
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
            return -794383168;
        }

        public String toString() {
            return "ShowLoading";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f123620a;

        static {
        }

        public d(String r2) {
            p.l(r2, "message");
            this.f123620a = r2;
        }

        public final String a() {
            return this.f123620a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f123620a, ((d) r4).f123620a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f123620a.hashCode();
        }

        public String toString() {
            return "ShowOTPLimitDialog(message=" + this.f123620a + ')';
        }
    }

    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f123621a;

        static {
        }

        public e(long r1) {
            this.f123621a = r1;
        }

        public final long a() {
            return this.f123621a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof e) == true) goto L9;
            return false;
        L9:
            if (this.f123621a == ((e) r8).f123621a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f123621a);
        }

        public String toString() {
            return "StartCountDownTimer(duration=" + this.f123621a + ')';
        }
    }
}
