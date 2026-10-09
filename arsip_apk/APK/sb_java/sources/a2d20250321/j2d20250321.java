package a2d20250321;

import android.content.res.AssetManager;

/* loaded from: classes.dex */
abstract class j2d20250321 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1553a;

    static {
        System.loadLibrary("aailiveness_v2.4.0");     // Catch: UnsatisfiedLinkError -> L4
        f1553a = true;     // Catch: UnsatisfiedLinkError -> L4
        return;
    L4:
        e = move-exception;
        f1553a = false;
        ai.advance.common.utils.g.g("Liveness JNI library load failed:" + e.getMessage());
    }

    public static native String O0OO0oOo(String r02);

    public static native String O0OO0oOo0(String r02);

    public static native String O0o00();

    public static native String O0o0Oo(String r02, String r1, String r2, String r3, int r4, int r5, String r6);

    public static native boolean O0o0o0();

    public static native String O0oO();

    public static native boolean OOOOOOOooO();

    public static native boolean OOOOOOooO();

    public static native boolean OOOooO();

    public static native boolean OOOooO1();

    public static native boolean OOOooOo();

    public static native String OOooO();

    public static native boolean OOoooOO();

    public static native int OOooooO();

    public static native long Oo0Oo(AssetManager r02);

    public static native String Oo0o0(String r02, String r1, String r2, String r3, long r4, long r6);

    public static native void OoO(long r02);

    public static native void OoOOO(String r02);

    public static native String OoOOOo();

    public static native void OoOo0OoO(String r02, String r1, String r2, String r3);

    public static native int a();

    public static native int b();

    public static native int c();

    public static native int d();

    public static native int e();

    public static native int f();

    public static boolean g() {
        return f1553a;
    }

    public static native void o0OoO(String r02);

    public static native String oO0ooO(long r02, byte[] r2, int r3, int r4, int r5);

    public static native void oOOOo0oO(String r02);

    public static native void oOo0Oo(String r02);

    public static native String oOo0oO(String r02, String r1);

    public static native String oOo0oOOOO(String r02, String r1, String r2, boolean r3, String r4, String r5, String r6);

    public static native long oOoOoOo00(String r02, String r1, boolean r2);

    public static native boolean occOpened();

    public static native String oo0OoO();

    public static native int q1();

    public static native int q2();

    public static native int t();
}
