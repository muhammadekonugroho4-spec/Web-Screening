package com.koushikdutta.async;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public Semaphore f41293a;

    public e() {
        this.f41293a = new Semaphore(0);
    }

    public void a() {
        ThreadQueue r02 = ThreadQueue.b(Thread.currentThread());
        e r1 = r02.waiter;
        r02.waiter = this;
        Semaphore r2 = r02.queueSemaphore;
    L13:
        th = move-exception;
        r02.waiter = r1;
        throw th;
    L4:
        if (this.f41293a.tryAcquire() == false) goto L7;
        r02.waiter = r1;
        return;
    L7:
        Runnable r3 = r02.g();     // Catch: Throwable -> L13
        if (r3 == null) goto L9;
        r3.run();     // Catch: Throwable -> L13
        goto L7
    L9:
        r2.acquire(Math.max(1, r2.availablePermits()));     // Catch: Throwable -> L13
        if (this.f41293a.tryAcquire() == false) goto L7;
        r02.waiter = r1;
    }

    public void b() {
        this.f41293a.release();
        ThreadQueue.e(this);
    }

    public boolean c(long r10, TimeUnit r12) {
        long r102 = TimeUnit.MILLISECONDS.convert(r10, r12);
        ThreadQueue r122 = ThreadQueue.b(Thread.currentThread());
        e r02 = r122.waiter;
        r122.waiter = this;
        Semaphore r1 = r122.queueSemaphore;
    L25:
        th = move-exception;
        r122.waiter = r02;
        throw th;
    L5:
        if (this.f41293a.tryAcquire() == false) goto L8;
        r122.waiter = r02;
        return true;
    L8:
        long r4 = System.currentTimeMillis();     // Catch: Throwable -> L25
    L9:
        Runnable r2 = r122.g();     // Catch: Throwable -> L25
        if (r2 == null) goto L13;
        r2.run();     // Catch: Throwable -> L25
        goto L9
    L13:
        if (r1.tryAcquire(Math.max(1, r1.availablePermits()), r102, TimeUnit.MILLISECONDS) == false) goto L14;
        if (this.f41293a.tryAcquire() == true) goto L18;
        if ((System.currentTimeMillis() - r4) < r102) goto L9;
        r122.waiter = r02;
        return false;
    L18:
        r122.waiter = r02;
        return true;
    L14:
        r122.waiter = r02;
        return false;
    }
}
