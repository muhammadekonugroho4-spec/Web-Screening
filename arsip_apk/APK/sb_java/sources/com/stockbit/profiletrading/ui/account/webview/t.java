package com.stockbit.profiletrading.ui.account.webview;

/* loaded from: classes10.dex */
public interface t {

    public static final class a implements t {

        /* renamed from: a, reason: collision with root package name */
        public static final a f128535a = null;

        static {
            f128535a = new a();
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
            return -626580367;
        }

        public String toString() {
            return "CloseWebView";
        }
    }

    public static final class b implements t {

        /* renamed from: a, reason: collision with root package name */
        public final int f128536a;

        static {
        }

        public b(int r1) {
            this.f128536a = r1;
        }

        public final int a() {
            return this.f128536a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f128536a == ((b) r4).f128536a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f128536a);
        }

        public String toString() {
            return "Navigate(steps=" + this.f128536a + ')';
        }
    }
}
