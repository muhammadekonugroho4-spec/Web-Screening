package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3697a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f3698b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f3699c;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f3700a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f3701b;

        public a(d r2) {
            this.f3701b = r2;
            this.f3700a = new AtomicInteger(0);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r3) {
            Thread r02 = new Thread(r3);
            r02.setName("arch_disk_io_" + this.f3700a.getAndIncrement());
            return r02;
        }
    }

    public static class b {
        public static Handler a(Looper r02) {
            return Handler.createAsync(r02);
        }
    }

    public d() {
        this.f3697a = new Object();
        this.f3698b = Executors.newFixedThreadPool(4, new a(this));
    }

    public static Handler e(Looper r4) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{r4, null, Boolean.TRUE});
    L11:
        return new Handler(r4);
    L9:
        return new Handler(r4);
    L5:
        return b.a(r4);
    }

    @Override // androidx.arch.core.executor.e
    public void a(Runnable r2) {
        this.f3698b.execute(r2);
    }

    @Override // androidx.arch.core.executor.e
    public boolean c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // androidx.arch.core.executor.e
    public void d(Runnable r3) {
        if (this.f3699c != null) goto L15;
        Object r02 = this.f3697a;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (this.f3699c != null) goto L11;
        this.f3699c = e(Looper.getMainLooper());     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
    L15:
        this.f3699c.post(r3);
    }
}
