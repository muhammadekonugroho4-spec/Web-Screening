package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.activity.T;
import androidx.camera.core.impl.utils.futures.n;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static ThreadLocal f5530b;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5531a;

    public class a extends ThreadLocal {
        public a() {
        }

        public ScheduledExecutorService a() {
            if (Looper.myLooper() != Looper.getMainLooper()) goto L7;
            return androidx.camera.core.impl.utils.executor.a.c();
        L7:
            if (Looper.myLooper() != null) goto L9;
            return null;
        L9:
            return new c(new Handler(Looper.myLooper()));
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Object initialValue() {
            return a();
        }
    }

    public class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f5532a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f5533b;

        public b(c r1, Runnable r2) {
            this.f5533b = r1;
            this.f5532a = r2;
        }

        public Void a() {
            this.f5532a.run();
            return null;
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.executor.c$c, reason: collision with other inner class name */
    public static class RunnableScheduledFutureC0052c implements RunnableScheduledFuture {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference f5534a;

        /* renamed from: b, reason: collision with root package name */
        public final long f5535b;

        /* renamed from: c, reason: collision with root package name */
        public final Callable f5536c;
        public final ListenableFuture d;

        /* renamed from: androidx.camera.core.impl.utils.executor.c$c$a */
        public class a implements CallbackToFutureAdapter.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Handler f5537a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Callable f5538b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RunnableScheduledFutureC0052c f5539c;

            /* renamed from: androidx.camera.core.impl.utils.executor.c$c$a$a, reason: collision with other inner class name */
            public class RunnableC0053a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ a f5540a;

                public RunnableC0053a(a r1) {
                    this.f5540a = r1;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.f5540a.f5539c.f5534a.getAndSet(null) == null) goto L6;
                    a r02 = this.f5540a;
                    r02.f5537a.removeCallbacks(r02.f5539c);
                    return;
                }
            }

            public a(RunnableScheduledFutureC0052c r1, Handler r2, Callable r3) {
                this.f5539c = r1;
                this.f5537a = r2;
                this.f5538b = r3;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public Object a(CallbackToFutureAdapter.a r3) {
                r3.a(new RunnableC0053a(this), androidx.camera.core.impl.utils.executor.a.a());
                this.f5539c.f5534a.set(r3);
                return "HandlerScheduledFuture-" + this.f5538b.toString();
            }
        }

        public RunnableScheduledFutureC0052c(Handler r3, long r4, Callable r6) {
            this.f5534a = new AtomicReference(null);
            this.f5535b = r4;
            this.f5536c = r6;
            this.d = CallbackToFutureAdapter.a(new a(this, r3, r6));
        }

        public int a(Delayed r6) {
            TimeUnit r02 = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(r02), r6.getDelay(r02));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean r2) {
            return this.d.cancel(r2);
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Delayed r1) {
            return a(r1);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit r5) {
            return r5.convert(this.f5535b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            CallbackToFutureAdapter.a r02 = (CallbackToFutureAdapter.a) this.f5534a.getAndSet(null);
            if (r02 == null) goto L11;
            r02.c(this.f5536c.call());     // Catch: Exception -> L6
            return;
        L6:
            e = move-exception;
            r02.f(e);
            return;
        }

        @Override // java.util.concurrent.Future
        public Object get(long r2, TimeUnit r4) {
            return this.d.get(r2, r4);
        }
    }

    static {
        f5530b = new a();
    }

    public c(Handler r1) {
        this.f5531a = r1;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r1, TimeUnit r3) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public final RejectedExecutionException c() {
        return new RejectedExecutionException(this.f5531a + " is shutting down");
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        T.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r2) {
        if (this.f5531a.post(r2) == false) goto L6;
        return;
    L6:
        throw c();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable r2, long r3, TimeUnit r5) {
        return schedule(new b(this, r2), r3, r5);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable r1, long r2, long r4, TimeUnit r6) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable r1, long r2, long r4, TimeUnit r6) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable r4, long r5, TimeUnit r7) {
        long r02 = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(r5, r7);
        RunnableScheduledFutureC0052c r52 = new RunnableScheduledFutureC0052c(this.f5531a, r02, r4);
        if (this.f5531a.postAtTime(r52, r02) == false) goto L6;
        return r52;
    L6:
        return n.o(c());
    }
}
