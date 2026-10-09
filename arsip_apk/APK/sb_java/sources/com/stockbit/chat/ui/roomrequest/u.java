package com.stockbit.chat.ui.roomrequest;

/* loaded from: classes7.dex */
public interface u {

    public static final class a implements u {

        /* renamed from: a, reason: collision with root package name */
        public static final a f59162a = null;

        static {
            f59162a = new a();
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
            return 33683287;
        }

        public String toString() {
            return "Dismiss";
        }
    }

    public static final class b implements u {

        /* renamed from: a, reason: collision with root package name */
        public final int f59163a;

        static {
        }

        public b(int r1) {
            this.f59163a = r1;
        }

        public final int a() {
            return this.f59163a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f59163a == ((b) r4).f59163a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f59163a);
        }

        public String toString() {
            return "Show(labelText=" + this.f59163a + ')';
        }
    }
}
