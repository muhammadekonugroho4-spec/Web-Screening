package androidx.biometric;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class k {
    public static String a(Context r2, int r3) {
        if (r2 != null) goto L6;
        return "";
    L6:
        if (r3 == 1) goto L21;
        if (r3 == 7) goto L19;
        switch(r3) {
            case 9: goto L19;
            case 10: goto L17;
            case 11: goto L15;
            case 12: goto L13;
            default: goto L10;
        };
    L10:
        Log.e("BiometricUtils", "Unknown error code: " + r3);
        return r2.getString(t.f3831b);
    L13:
        return r2.getString(t.f3833e);
    L15:
        return r2.getString(t.f3835g);
    L17:
        return r2.getString(t.f3836h);
    L19:
        return r2.getString(t.f3834f);
    L21:
        return r2.getString(t.d);
    }

    public static boolean b(int r02) {
        switch(r02) {
            case 1: goto L5;
            case 2: goto L5;
            case 3: goto L5;
            case 4: goto L5;
            case 5: goto L5;
            case 6: goto L3;
            case 7: goto L5;
            case 8: goto L5;
            case 9: goto L5;
            case 10: goto L5;
            case 11: goto L5;
            case 12: goto L5;
            case 13: goto L5;
            case 14: goto L5;
            case 15: goto L5;
            default: goto L3;
        };
    L3:
        return false;
    L5:
        return true;
    }

    public static boolean c(int r1) {
        if (r1 != 7) goto L5;
        return true;
    L5:
        if (r1 == 9) goto L11;
        return false;
    L11:
        return true;
    }
}
