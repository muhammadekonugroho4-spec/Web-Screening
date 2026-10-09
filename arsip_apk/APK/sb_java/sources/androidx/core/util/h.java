package androidx.core.util;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class h {
    public static void a(boolean r02) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    public static void b(boolean r02, Object r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.valueOf(r1));
    }

    public static int c(int r1, int r2, int r3, String r4) {
        if (r1 < r2) goto L8;
        if (r1 > r3) goto L6;
        return r1;
    L6:
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{r4, Integer.valueOf(r2), Integer.valueOf(r3)}));
    L8:
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{r4, Integer.valueOf(r2), Integer.valueOf(r3)}));
    }

    public static int d(int r02) {
        if (r02 < 0) goto L5;
        return r02;
    L5:
        throw new IllegalArgumentException();
    }

    public static int e(int r02, String r1) {
        if (r02 < 0) goto L5;
        return r02;
    L5:
        throw new IllegalArgumentException(r1);
    }

    public static int f(int r3, int r4) {
        if ((r3 & r4) != r3) goto L6;
        return r3;
    L6:
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(r3) + ", but only 0x" + Integer.toHexString(r4) + " are allowed");
    }

    public static Object g(Object r02) {
        r02.getClass();
        return r02;
    }

    public static Object h(Object r02, Object r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(String.valueOf(r1));
    }

    public static void i(boolean r1) {
        j(r1, null);
    }

    public static void j(boolean r02, String r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(r1);
    }

    public static CharSequence k(CharSequence r1, Object r2) {
        if (TextUtils.isEmpty(r1) == true) goto L6;
        return r1;
    L6:
        throw new IllegalArgumentException(String.valueOf(r2));
    }
}
