package io.reactivex.internal.functions;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final io.reactivex.functions.b f174484a = null;

    public static final class a implements io.reactivex.functions.b {
        public a() {
        }

        @Override // io.reactivex.functions.b
        public boolean a(Object r1, Object r2) {
            return b.c(r1, r2);
        }
    }

    static {
        f174484a = new a();
    }

    public static int a(int r02, int r1) {
        if (r02 >= r1) goto L5;
        return -1;
    L5:
        if (r02 <= r1) goto L8;
        return 1;
    L8:
        return 0;
    }

    public static int b(long r02, long r2) {
        if (r02 >= r2) goto L6;
        return -1;
    L6:
        if (r02 <= r2) goto L9;
        return 1;
    L9:
        return 0;
    }

    public static boolean c(Object r02, Object r1) {
        if (r02 == r1) goto L9;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }

    public static Object d(Object r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }

    public static int e(int r2, String r3) {
        if (r2 <= 0) goto L5;
        return r2;
    L5:
        throw new IllegalArgumentException(r3 + " > 0 required but it was " + r2);
    }
}
