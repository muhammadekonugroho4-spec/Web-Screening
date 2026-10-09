package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class d {

    public static class a {
        public static Handler a(Looper r02) {
            return c.a(r02);
        }
    }

    public static /* synthetic */ Thread a(String r1, Runnable r2) {
        Thread r02 = new Thread(r2, r1);
        r02.setPriority(10);
        return r02;
    }

    public static Executor b(final Handler r1) {
        Objects.requireNonNull(r1);
        return new androidx.emoji2.text.a(r1);
    }

    public static ThreadPoolExecutor c(final String r8) {
        ThreadFactory r7 = new b(r8);
        ThreadPoolExecutor r02 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), r7);
        r02.allowCoreThreadTimeOut(true);
        return r02;
    }

    public static Handler d() {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return a.a(Looper.getMainLooper());
    L7:
        return new Handler(Looper.getMainLooper());
    }

    public static Executor e() {
        return b(d());
    }
}
