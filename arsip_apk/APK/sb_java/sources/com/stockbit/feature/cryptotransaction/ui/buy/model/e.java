package com.stockbit.feature.cryptotransaction.ui.buy.model;

/* loaded from: classes9.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f95749a = null;

        static {
            f95749a = new a();
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
            return 197058223;
        }

        public String toString() {
            return "NavigateToHistory";
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f95750a = null;

        static {
            f95750a = new b();
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
            return -1722928025;
        }

        public String toString() {
            return "NavigateToOrderList";
        }
    }
}
