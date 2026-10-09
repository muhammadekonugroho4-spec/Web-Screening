package androidx.camera.core;

import android.os.Process;
import androidx.camera.core.impl.InterfaceC2295y;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC2326q implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadFactory f5986c = null;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5987a;

    /* renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f5988b;

    /* renamed from: androidx.camera.core.q$a */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f5989a;

        public a() {
            this.f5989a = new AtomicInteger(0);
        }

        public static /* synthetic */ void a(Runnable r1) {
            Process.setThreadPriority(-3);
            r1.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable r4) {
            Thread r02 = new Thread(new RunnableC2305p(r4));
            r02.setPriority(7);
            r02.setName(String.format(Locale.US, "CameraX-core_camera_%d", new Object[]{Integer.valueOf(this.f5989a.getAndIncrement())}));
            return r02;
        }
    }

    static {
        f5986c = new a();
    }

    public ExecutorC2326q() {
        this.f5987a = new Object();
        this.f5988b = b();
    }

    public static /* synthetic */ void a(Runnable r02, ThreadPoolExecutor r1) {
        AbstractC2209b0.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }

    public static ThreadPoolExecutor b() {
        ThreadPoolExecutor r02 = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f5986c);
        r02.setRejectedExecutionHandler(new RejectedExecutionHandlerC2304o());
        return r02;
    }

    public void c() {
        Object r02 = this.f5987a;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f5988b.isShutdown() == true) goto L9;
        this.f5988b.shutdown();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
    }

    public void d(InterfaceC2295y r3) {
        androidx.core.util.h.g(r3);
        Object r02 = this.f5987a;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f5988b.isShutdown() == false) goto L9;
        this.f5988b = b();     // Catch: Throwable -> L7
    L9:
        ThreadPoolExecutor r1 = this.f5988b;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        int r32 = Math.max(1, r3.d().size());
        r1.setMaximumPoolSize(r32);
        r1.setCorePoolSize(r32);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r3) {
        androidx.core.util.h.g(r3);
        Object r02 = this.f5987a;
        monitor-enter(r02);
        this.f5988b.execute(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
