package ai.advance.common.utils;

import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes.dex */
public abstract class g {
    public static boolean a() {
        return ai.advance.common.a.f1662b;
    }

    public static boolean b(String r02) {
        return !TextUtils.isEmpty(r02);
    }

    public static String c() {
        return ai.advance.common.a.f1663c + Constants.AES_PREFIX + Thread.currentThread().getName() + Constants.AES_SUFFIX;
    }

    public static boolean d() {
        return ai.advance.common.a.f1661a;
    }

    public static void e(String r2, String r3) {
        if (a() == true) goto L5;
        return;
    L5:
        if (b(r3) == false) goto L9;
        Log.d(c() + "-debug-" + r2, r3);
        return;
    }

    public static void f(String r2) {
        if (d() == true) goto L5;
        return;
    L5:
        if (b(r2) == false) goto L9;
        Log.d(c() + "-sdk", r2);
        return;
    }

    public static void g(String r2) {
        if (d() == true) goto L5;
        return;
    L5:
        if (b(r2) == false) goto L9;
        Log.e(c() + "-sdk", r2);
        return;
    }

    public static void h(String r2) {
        if (d() == true) goto L5;
        return;
    L5:
        if (b(r2) == false) goto L9;
        Log.i(c() + "-sdk", r2);
        return;
    }

    public static void i(String r2) {
        if (d() == true) goto L5;
        return;
    L5:
        if (b(r2) == false) goto L9;
        Log.w(c() + "-sdk", r2);
        return;
    }
}
