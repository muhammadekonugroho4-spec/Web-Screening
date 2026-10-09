package dagger.hilt.android.internal;

import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Thread f173942a;

    public static void a() {
        if (b() == false) goto L6;
        return;
    L6:
        throw new IllegalStateException("Must be called on the Main thread.");
    }

    public static boolean b() {
        if (f173942a != null) goto L6;
        f173942a = Looper.getMainLooper().getThread();
    L6:
        if (Thread.currentThread() != f173942a) goto L9;
        return true;
    L9:
        return false;
    }
}
