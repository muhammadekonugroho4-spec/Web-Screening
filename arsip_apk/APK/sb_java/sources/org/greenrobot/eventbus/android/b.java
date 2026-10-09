package org.greenrobot.eventbus.android;

/* loaded from: classes3.dex */
public abstract class b {
    public static boolean a() {
        int r02 = AndroidComponentsImpl.d;     // Catch: ClassNotFoundException -> L5
        return true;
    L5:
        return false;
    }

    public static a b() {
        int r2 = AndroidComponentsImpl.d;     // Catch: Throwable -> L5
        return (a) AndroidComponentsImpl.class.getConstructor(null).newInstance(null);
    L5:
        return null;
    }

    public static boolean c() {
        if (Class.forName("android.os.Looper").getDeclaredMethod("getMainLooper", null).invoke(null, null) == null) goto L10;
        return true;
    L10:
        return false;
    L11:
        return false;
    }
}
