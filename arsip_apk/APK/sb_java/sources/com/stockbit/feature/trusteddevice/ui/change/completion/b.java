package com.stockbit.feature.trusteddevice.ui.change.completion;

/* loaded from: classes9.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final long f117958a;

        static {
        }

        public a(long r1) {
            this.f117958a = r1;
        }

        public final long a() {
            return this.f117958a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f117958a == ((a) r8).f117958a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f117958a);
        }

        public String toString() {
            return "ErrorWithTimer(retryTimeLeft=" + this.f117958a + ')';
        }
    }

    /* renamed from: com.stockbit.feature.trusteddevice.ui.change.completion.b$b, reason: collision with other inner class name */
    public static final class C1019b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1019b f117959a = null;

        static {
            f117959a = new C1019b();
        }

        public C1019b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1019b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1249932826;
        }

        public String toString() {
            return "ErrorWithoutTimer";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f117960a = null;

        static {
            f117960a = new c();
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
            return -273435500;
        }

        public String toString() {
            return "MaxAttemptError";
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f117961a = null;

        static {
            f117961a = new d();
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
            return -868034979;
        }

        public String toString() {
            return "OpenSuccessPage";
        }
    }
}
