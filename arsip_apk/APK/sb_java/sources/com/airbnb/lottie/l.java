package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f31214e;

    /* renamed from: a, reason: collision with root package name */
    public final Set f31215a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f31216b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f31217c;
    public volatile k d;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f31218a;

        public a(l r1) {
            this.f31218a = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.a(this.f31218a) != null) goto L5;
            return;
        L5:
            k r02 = l.a(this.f31218a);
            if (r02.b() == null) goto L9;
            l.b(this.f31218a, r02.b());
            return;
        L9:
            l.c(this.f31218a, r02.a());
        }
    }

    public class b extends FutureTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f31219a;

        public b(l r1, Callable r2) {
            this.f31219a = r1;
            super(r2);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled() == true) goto L14;
            l.d(this.f31219a, (k) get());     // Catch: ExecutionException -> L7 Throwable -> L9
            return;
        L9:
            e = move-exception;
            l.d(this.f31219a, new k(e));
            return;
        }
    }

    static {
        f31214e = Executors.newCachedThreadPool();
    }

    public l(Callable r2) {
        this(r2, false);
    }

    public static /* synthetic */ k a(l r02) {
        return r02.d;
    }

    public static /* synthetic */ void b(l r02, Object r1) {
        r02.i(r1);
    }

    public static /* synthetic */ void c(l r02, Throwable r1) {
        r02.g(r1);
    }

    public static /* synthetic */ void d(l r02, k r1) {
        r02.l(r1);
    }

    public synchronized l e(h r2) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.d != null) goto L6;
    L10:
        this.f31216b.add(r2);     // Catch: Throwable -> L8
        monitor-exit(this);
        return this;
    L6:
        if (this.d.a() == null) goto L10;
        r2.onResult(this.d.a());     // Catch: Throwable -> L8
        goto L10
    }

    public synchronized l f(h r2) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.d != null) goto L6;
    L10:
        this.f31215a.add(r2);     // Catch: Throwable -> L8
        monitor-exit(this);
        return this;
    L6:
        if (this.d.b() == null) goto L10;
        r2.onResult(this.d.b());     // Catch: Throwable -> L8
        goto L10
    }

    public final synchronized void g(Throwable r3) {
        monitor-enter(this);
        ArrayList r02 = new ArrayList(this.f31216b);     // Catch: Throwable -> L8
        if (r02.isEmpty() == false) goto L10;
        com.airbnb.lottie.utils.d.d("Lottie encountered an error but no failure listener was added:", r3);     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L10:
        Iterator r03 = r02.iterator();     // Catch: Throwable -> L8
    L12:
        if (r03.hasNext() == false) goto L15;
        ((h) r03.next()).onResult(r3);     // Catch: Throwable -> L8
        goto L12
    L15:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void h() {
        this.f31217c.post(new a(this));
    }

    public final synchronized void i(Object r3) {
        monitor-enter(this);
        Iterator r02 = new ArrayList(this.f31215a).iterator();     // Catch: Throwable -> L8
    L4:
        if (r02.hasNext() == false) goto L10;
        ((h) r02.next()).onResult(r3);     // Catch: Throwable -> L8
        goto L4
    L10:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public synchronized l j(h r2) {
        monitor-enter(this);
        this.f31216b.remove(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return this;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized l k(h r2) {
        monitor-enter(this);
        this.f31215a.remove(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return this;
    L6:
        th = move-exception;
        throw th;
    }

    public final void l(k r2) {
        if (this.d != null) goto L7;
        this.d = r2;
        h();
        return;
    L7:
        throw new IllegalStateException("A task may only be set once.");
    }

    public l(Callable r3, boolean r4) {
        this.f31215a = new LinkedHashSet(1);
        this.f31216b = new LinkedHashSet(1);
        this.f31217c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (r4 == true) goto L11;
        f31214e.execute(new b(this, r3));
        return;
    L11:
        l((k) r3.call());     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        l(new k(th));
    }
}
