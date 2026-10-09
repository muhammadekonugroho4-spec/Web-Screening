package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class u {
    public static /* synthetic */ void a(Runnable r02, CountDownLatch r1) {
        r02.run();     // Catch: Throwable -> L5
        r1.countDown();
        return;
    L5:
        th = move-exception;
        r1.countDown();
        throw th;
    }

    public static void b() {
        androidx.core.util.h.j(d(), "Not in application's main thread");
    }

    public static Handler c() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean d() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L6;
        return true;
    L6:
        return false;
    }

    public static void e(Runnable r1) {
        if (d() == false) goto L6;
        r1.run();
        return;
    L6:
        androidx.core.util.h.j(c().post(r1), "Unable to post to main thread");
    }

    public static void f(final Runnable r3) {
        if (d() == false) goto L6;
        r3.run();
        return;
    L6:
        final CountDownLatch r02 = new CountDownLatch(1);
        androidx.core.util.h.j(c().post(new t(r3, r02)), "Unable to post to main thread");
    L12:
        e = move-exception;
        throw new InterruptedRuntimeException(e);
    L8:
        if (r02.await(30000, TimeUnit.MILLISECONDS) == false) goto L11;
        return;
    L11:
        throw new IllegalStateException("Timeout to wait main thread execution");     // Catch: InterruptedException -> L12
    }
}
