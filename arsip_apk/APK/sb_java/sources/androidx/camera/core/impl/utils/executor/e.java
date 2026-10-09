package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ScheduledExecutorService f5545a;

    public static ScheduledExecutorService a() {
        if (f5545a == null) goto L7;
        return f5545a;
    L7:
        monitor-enter(e.class);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (f5545a != null) goto L13;
        f5545a = new c(new Handler(Looper.getMainLooper()));     // Catch: Throwable -> L11
    L13:
        monitor-exit(e.class);     // Catch: Throwable -> L11
        return f5545a;
    }
}
