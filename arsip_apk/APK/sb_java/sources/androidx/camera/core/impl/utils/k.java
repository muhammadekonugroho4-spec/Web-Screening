package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Handler f5619a;

    public static Handler a() {
        if (f5619a == null) goto L7;
        return f5619a;
    L7:
        monitor-enter(k.class);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (f5619a != null) goto L13;
        f5619a = androidx.core.os.h.a(Looper.getMainLooper());     // Catch: Throwable -> L11
    L13:
        monitor-exit(k.class);     // Catch: Throwable -> L11
        return f5619a;
    }
}
