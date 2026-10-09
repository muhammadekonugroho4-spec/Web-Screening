package com.stockbit.feature.trusteddevice.ui.setup.otp;

/* loaded from: classes9.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f118742a;

        static {
        }

        public a(boolean r2) {
            super(null);
            this.f118742a = r2;
        }

        public final boolean a() {
            return this.f118742a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f118742a == ((a) r4).f118742a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f118742a);
        }

        public String toString() {
            return "Loading(isLoading=" + this.f118742a + ')';
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f118743a;

        static {
        }

        public b(String r2) {
            super(null);
            this.f118743a = r2;
        }

        public final String a() {
            return this.f118743a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f118743a, ((b) r4).f118743a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f118743a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ShowLimitDialog(title=" + this.f118743a + ')';
        }
    }

    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        public final long f118744a;

        static {
        }

        public c(long r2) {
            super(null);
            this.f118744a = r2;
        }

        public final long a() {
            return this.f118744a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f118744a == ((c) r8).f118744a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f118744a);
        }

        public String toString() {
            return "StartCountDownTimer(duration=" + this.f118744a + ')';
        }
    }

    static {
    }

    public /* synthetic */ h(kotlin.jvm.internal.i r1) {
        this();
    }

    public h() {
    }
}
