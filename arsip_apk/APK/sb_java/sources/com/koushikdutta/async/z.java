package com.koushikdutta.async;

import java.io.Closeable;
import java.nio.channels.Selector;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class z implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public Selector f41705a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f41706b;

    /* renamed from: c, reason: collision with root package name */
    public Semaphore f41707c;

    public z(Selector r3) {
        this.f41706b = new AtomicBoolean(false);
        this.f41707c = new Semaphore(0);
        this.f41705a = r3;
    }

    public Selector c() {
        return this.f41705a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f41705a.close();
    }

    public Set f() {
        return this.f41705a.keys();
    }

    public void i() {
        k(0);
    }

    public boolean isOpen() {
        return this.f41705a.isOpen();
    }

    public void k(long r3) {
        this.f41707c.drainPermits();     // Catch: Throwable -> L6
        this.f41705a.select(r3);     // Catch: Throwable -> L6
        this.f41707c.release(Integer.MAX_VALUE);
        return;
    L6:
        th = move-exception;
        this.f41707c.release(Integer.MAX_VALUE);
        throw th;
    }

    public int l() {
        return this.f41705a.selectNow();
    }

    public Set n() {
        return this.f41705a.selectedKeys();
    }

    public boolean t() {
        int r1 = 0;
    L4:
        if (r1 >= 100) goto L12;
        this.f41707c.tryAcquire(10, TimeUnit.MILLISECONDS);     // Catch: InterruptedException -> L7
        r1 = r1 + 1;
    L7:
        return true;
    L12:
        return false;
    }

    public void u() {
        boolean r02 = this.f41707c.tryAcquire();
        this.f41705a.wakeup();
        if (r02 == true) goto L6;
        return;
    L6:
        if (this.f41706b.getAndSet(true) == false) goto L16;
        this.f41705a.wakeup();
        return;
    L16:
        t();     // Catch: Throwable -> L13
        this.f41705a.wakeup();     // Catch: Throwable -> L13
        this.f41706b.set(false);
        return;
    L13:
        th = move-exception;
        this.f41706b.set(false);
        throw th;
    }
}
