package com.huawei.hms.hatool;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class p0 {

    /* renamed from: b, reason: collision with root package name */
    private static p0 f39402b;

    /* renamed from: c, reason: collision with root package name */
    private static p0 f39403c;
    private static p0 d;

    /* renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f39404a;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f39405a;

        public a(Runnable r1) {
            this.f39405a = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable r02 = this.f39405a;
            if (r02 == null) goto L10;
            r02.run();     // Catch: Exception -> L6
            return;
        L6:
            z.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
            return;
        }
    }

    public static class b implements ThreadFactory {
        private static final AtomicInteger d = null;

        /* renamed from: a, reason: collision with root package name */
        private final ThreadGroup f39406a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f39407b;

        /* renamed from: c, reason: collision with root package name */
        private final String f39408c;

        static {
            d = new AtomicInteger(1);
        }

        public b() {
            this.f39407b = new AtomicInteger(1);
            SecurityManager r02 = System.getSecurityManager();
            if (r02 == null) goto L5;
            ThreadGroup r03 = r02.getThreadGroup();
        L6:
            this.f39406a = r03;
            this.f39408c = "FormalHASDK-base-" + d.getAndIncrement();
            return;
        L5:
            r03 = Thread.currentThread().getThreadGroup();
            goto L6
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r7) {
            return new Thread(this.f39406a, r7, this.f39408c + this.f39407b.getAndIncrement(), 0);
        }
    }

    static {
        new p0();
        new p0();
        f39402b = new p0();
        f39403c = new p0();
        d = new p0();
    }

    private p0() {
        LinkedBlockingQueue r6 = new LinkedBlockingQueue(5000);
        this.f39404a = new ThreadPoolExecutor(0, 1, Constants.ONE_MIN_IN_MILLIS, TimeUnit.MILLISECONDS, r6, new b());
    }

    public static p0 a() {
        return d;
    }

    public static p0 b() {
        return f39403c;
    }

    public static p0 c() {
        return f39402b;
    }

    public void a(o0 r3) {
        this.f39404a.execute(new a(r3));     // Catch: RejectedExecutionException -> L4
        return;
    L4:
        z.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
    }
}
