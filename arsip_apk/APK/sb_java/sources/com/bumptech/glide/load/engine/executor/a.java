package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.T;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static final long f32748b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f32749c;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f32750a;

    /* renamed from: com.bumptech.glide.load.engine.executor.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0323a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f32751a;

        /* renamed from: b, reason: collision with root package name */
        public int f32752b;

        /* renamed from: c, reason: collision with root package name */
        public int f32753c;
        public final ThreadFactory d;

        /* renamed from: e, reason: collision with root package name */
        public e f32754e;

        /* renamed from: f, reason: collision with root package name */
        public String f32755f;

        /* renamed from: g, reason: collision with root package name */
        public long f32756g;

        public b(boolean r3) {
            this.d = new c(null);
            this.f32754e = e.d;
            this.f32751a = r3;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f32755f) == true) goto L10;
            ThreadPoolExecutor r1 = new ThreadPoolExecutor(this.f32752b, this.f32753c, this.f32756g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.d, this.f32755f, this.f32754e, this.f32751a));
            if (this.f32756g == 0) goto L8;
            r1.allowCoreThreadTimeOut(true);
        L8:
            return new a(r1);
        L10:
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f32755f);
        }

        public b b(String r1) {
            this.f32755f = r1;
            return this;
        }

        public b c(int r1) {
            this.f32752b = r1;
            this.f32753c = r1;
            return this;
        }
    }

    public static final class c implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$a, reason: collision with other inner class name */
        public class C0324a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f32757a;

            public C0324a(c r1, Runnable r2) {
                this.f32757a = r1;
                super(r2);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r2) {
            return new C0324a(this, r2);
        }

        public /* synthetic */ c(C0323a r1) {
            this();
        }
    }

    public static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadFactory f32758a;

        /* renamed from: b, reason: collision with root package name */
        public final String f32759b;

        /* renamed from: c, reason: collision with root package name */
        public final e f32760c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f32761e;

        /* renamed from: com.bumptech.glide.load.engine.executor.a$d$a, reason: collision with other inner class name */
        public class RunnableC0325a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f32762a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f32763b;

            public RunnableC0325a(d r1, Runnable r2) {
                this.f32763b = r1;
                this.f32762a = r2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f32763b.d == false) goto L10;
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
            L10:
                this.f32762a.run();     // Catch: Throwable -> L7
                return;
            L7:
                th = move-exception;
                this.f32763b.f32760c.a(th);
            }
        }

        public d(ThreadFactory r2, String r3, e r4, boolean r5) {
            this.f32761e = new AtomicInteger();
            this.f32758a = r2;
            this.f32759b = r3;
            this.f32760c = r4;
            this.d = r5;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r3) {
            Thread r32 = this.f32758a.newThread(new RunnableC0325a(this, r3));
            r32.setName("glide-" + this.f32759b + "-thread-" + this.f32761e.getAndIncrement());
            return r32;
        }
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f32764a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final e f32765b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final e f32766c = null;
        public static final e d = null;

        /* renamed from: com.bumptech.glide.load.engine.executor.a$e$a, reason: collision with other inner class name */
        public class C0326a implements e {
            public C0326a() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.e
            public void a(Throwable r1) {
            }
        }

        public class b implements e {
            public b() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.e
            public void a(Throwable r3) {
                if (r3 != null) goto L4;
                return;
            L4:
                if (Log.isLoggable("GlideExecutor", 6) == false) goto L8;
                Log.e("GlideExecutor", "Request threw uncaught throwable", r3);
                return;
            }
        }

        public class c implements e {
            public c() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.e
            public void a(Throwable r3) {
                if (r3 != null) goto L5;
                return;
            L5:
                throw new RuntimeException("Request threw uncaught throwable", r3);
            }
        }

        static {
            f32764a = new C0326a();
            b r02 = new b();
            f32765b = r02;
            f32766c = new c();
            d = r02;
        }

        void a(Throwable r1);
    }

    static {
        f32748b = TimeUnit.SECONDS.toMillis(10);
    }

    public a(ExecutorService r1) {
        this.f32750a = r1;
    }

    public static a B() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f32748b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(null), "source-unlimited", e.d, false)));
    }

    public static int c() {
        if (f() < 4) goto L6;
        return 2;
    L6:
        return 1;
    }

    public static int f() {
        if (f32749c != 0) goto L6;
        f32749c = Math.min(4, com.bumptech.glide.load.engine.executor.b.a());
    L6:
        return f32749c;
    }

    public static b i() {
        int r02 = c();
        return new b(true).c(r02).b("animation");
    }

    public static a k() {
        return i().a();
    }

    public static b l() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a n() {
        return l().a();
    }

    public static b u() {
        return new b(false).c(f()).b("source");
    }

    public static a x() {
        return u().a();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, TimeUnit r4) {
        return this.f32750a.awaitTermination(r2, r4);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        T.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r2) {
        this.f32750a.execute(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection r2) {
        return this.f32750a.invokeAll(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection r2) {
        return this.f32750a.invokeAny(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f32750a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f32750a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f32750a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f32750a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable r2) {
        return this.f32750a.submit(r2);
    }

    public String toString() {
        return this.f32750a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection r2, long r3, TimeUnit r5) {
        return this.f32750a.invokeAll(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection r2, long r3, TimeUnit r5) {
        return this.f32750a.invokeAny(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable r2, Object r3) {
        return this.f32750a.submit(r2, r3);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable r2) {
        return this.f32750a.submit(r2);
    }
}
