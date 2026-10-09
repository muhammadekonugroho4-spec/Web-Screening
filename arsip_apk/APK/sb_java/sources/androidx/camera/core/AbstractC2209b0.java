package androidx.camera.core;

import android.util.Log;

/* renamed from: androidx.camera.core.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2209b0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f4922a = 3;

    static {
    }

    public static void a(String r1, String r2) {
        String r12 = k(r1);
        if (g(r12, 3) == false) goto L6;
        Log.d(r12, r2);
        return;
    }

    public static void b(String r1, String r2, Throwable r3) {
        String r12 = k(r1);
        if (g(r12, 3) == false) goto L6;
        Log.d(r12, r2, r3);
        return;
    }

    public static void c(String r1, String r2) {
        String r12 = k(r1);
        if (g(r12, 6) == false) goto L6;
        Log.e(r12, r2);
        return;
    }

    public static void d(String r1, String r2, Throwable r3) {
        String r12 = k(r1);
        if (g(r12, 6) == false) goto L6;
        Log.e(r12, r2, r3);
        return;
    }

    public static void e(String r1, String r2) {
        String r12 = k(r1);
        if (g(r12, 4) == false) goto L6;
        Log.i(r12, r2);
        return;
    }

    public static boolean f(String r1) {
        return g(k(r1), 3);
    }

    public static boolean g(String r1, int r2) {
        if (f4922a > r2) goto L5;
        return true;
    L5:
        if (Log.isLoggable(r1, r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public static boolean h(String r1) {
        return g(k(r1), 2);
    }

    public static void i() {
        f4922a = 3;
    }

    public static void j(int r02) {
        f4922a = r02;
    }

    public static String k(String r02) {
        return r02;
    }

    public static void l(String r1, String r2) {
        String r12 = k(r1);
        if (g(r12, 5) == false) goto L6;
        Log.w(r12, r2);
        return;
    }

    public static void m(String r1, String r2, Throwable r3) {
        String r12 = k(r1);
        if (g(r12, 5) == false) goto L6;
        Log.w(r12, r2, r3);
        return;
    }
}
