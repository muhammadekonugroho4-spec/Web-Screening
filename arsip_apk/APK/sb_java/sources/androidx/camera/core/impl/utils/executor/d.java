package androidx.camera.core.impl.utils.executor;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Executor f5541b;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5542a;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f5543a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f5544b;

        public a(d r2) {
            this.f5544b = r2;
            this.f5543a = new AtomicInteger(0);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r4) {
            Thread r02 = new Thread(r4);
            r02.setName(String.format(Locale.US, "CameraX-camerax_io_%d", new Object[]{Integer.valueOf(this.f5543a.getAndIncrement())}));
            return r02;
        }
    }

    public d() {
        this.f5542a = Executors.newFixedThreadPool(2, new a(this));
    }

    public static Executor a() {
        if (f5541b == null) goto L7;
        return f5541b;
    L7:
        monitor-enter(d.class);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (f5541b != null) goto L13;
        f5541b = new d();     // Catch: Throwable -> L11
    L13:
        monitor-exit(d.class);     // Catch: Throwable -> L11
        return f5541b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r2) {
        this.f5542a.execute(r2);
    }
}
