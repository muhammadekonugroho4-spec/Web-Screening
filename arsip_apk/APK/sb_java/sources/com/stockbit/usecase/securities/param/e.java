package com.stockbit.usecase.securities.param;

/* loaded from: classes2.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f161957a = null;

        static {
            f161957a = new a();
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
            return -440472823;
        }

        public String toString() {
            return "MainAccount";
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f161958a = null;

        static {
            f161958a = new b();
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
            return -1883444204;
        }

        public String toString() {
            return "TotalAccount";
        }
    }
}
