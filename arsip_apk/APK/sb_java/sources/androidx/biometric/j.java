package androidx.biometric;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class j {
    public static boolean a(Context r2, String r3) {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return false;
    L7:
        return b(r2, r3, o.f3819a);
    }

    public static boolean b(Context r3, String r4, int r5) {
        if (r4 != null) goto L5;
        return false;
    L5:
        String[] r32 = r3.getResources().getStringArray(r5);
        int r52 = r32.length;
        int r1 = 0;
    L6:
        if (r1 >= r52) goto L12;
        if (r4.equals(r32[r1]) == true) goto L9;
        r1 = r1 + 1;
        goto L6
    L9:
        return true;
    L12:
        return false;
    }

    public static boolean c(Context r3, String r4, int r5) {
        if (r4 != null) goto L5;
        return false;
    L5:
        String[] r32 = r3.getResources().getStringArray(r5);
        int r52 = r32.length;
        int r1 = 0;
    L6:
        if (r1 >= r52) goto L12;
        if (r4.startsWith(r32[r1]) == true) goto L9;
        r1 = r1 + 1;
        goto L6
    L9:
        return true;
    L12:
        return false;
    }

    public static boolean d(Context r3, String r4, int r5) {
        if (r4 != null) goto L5;
        return false;
    L5:
        String[] r32 = r3.getResources().getStringArray(r5);
        int r52 = r32.length;
        int r1 = 0;
    L6:
        if (r1 >= r52) goto L12;
        if (r4.equalsIgnoreCase(r32[r1]) == true) goto L9;
        r1 = r1 + 1;
        goto L6
    L9:
        return true;
    L12:
        return false;
    }

    public static boolean e(Context r2, String r3) {
        if (Build.VERSION.SDK_INT == 29) goto L7;
        return false;
    L7:
        return b(r2, r3, o.d);
    }

    public static boolean f(Context r2, String r3) {
        if (Build.VERSION.SDK_INT == 28) goto L7;
        return false;
    L7:
        return c(r2, r3, o.f3822e);
    }

    public static boolean g(Context r3, String r4, String r5) {
        if (Build.VERSION.SDK_INT == 28) goto L6;
        return false;
    L6:
        if (d(r3, r4, o.f3821c) == false) goto L8;
        return true;
    L8:
        if (c(r3, r5, o.f3820b) == true) goto L13;
        return false;
    L13:
        return true;
    }
}
