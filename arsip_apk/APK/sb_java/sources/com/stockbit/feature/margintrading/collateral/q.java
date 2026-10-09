package com.stockbit.feature.margintrading.collateral;

/* loaded from: classes9.dex */
public interface q {

    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f99231a = null;

        static {
            f99231a = new a();
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
            return 762401098;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public final int f99232a;

        static {
        }

        public b(int r1) {
            this.f99232a = r1;
        }

        public final int a() {
            return this.f99232a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f99232a == ((b) r4).f99232a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f99232a);
        }

        public String toString() {
            return "ShowCollateralInsufficientDialog(stringResource=" + this.f99232a + ')';
        }
    }
}
