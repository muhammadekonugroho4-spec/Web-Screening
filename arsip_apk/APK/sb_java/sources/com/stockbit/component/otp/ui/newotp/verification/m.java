package com.stockbit.component.otp.ui.newotp.verification;

/* loaded from: classes7.dex */
public interface m {

    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public static final a f73573a = null;

        static {
            f73573a = new a();
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
            return -900367411;
        }

        public String toString() {
            return "FinishTimer";
        }
    }

    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        public final long f73574a;

        static {
        }

        public b(long r1) {
            this.f73574a = r1;
        }

        public final long a() {
            return this.f73574a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f73574a == ((b) r8).f73574a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f73574a);
        }

        public String toString() {
            return "StartTimer(millisInFuture=" + this.f73574a + ')';
        }
    }
}
