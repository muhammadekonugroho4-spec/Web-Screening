package com.stockbit.usecase.trusteddevice.resource.login;

/* loaded from: classes2.dex */
public interface r {

    public static final class a implements r {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164345a = null;

        static {
            f164345a = new a();
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
            return 1815143454;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements r {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164346a = null;

        static {
            f164346a = new b();
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
            return -388676891;
        }

        public String toString() {
            return "Success";
        }
    }
}
