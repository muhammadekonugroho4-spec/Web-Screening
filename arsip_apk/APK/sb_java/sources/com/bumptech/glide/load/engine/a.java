package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.n;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32658a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f32659b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f32660c;
    public final ReferenceQueue d;

    /* renamed from: e, reason: collision with root package name */
    public n.a f32661e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f32662f;

    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0320a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC0321a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f32663a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreadFactoryC0320a f32664b;

            public RunnableC0321a(ThreadFactoryC0320a r1, Runnable r2) {
                this.f32664b = r1;
                this.f32663a = r2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f32663a.run();
            }
        }

        public ThreadFactoryC0320a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r3) {
            return new Thread(new RunnableC0321a(this, r3), "glide-active-resources");
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f32665a;

        public b(a r1) {
            this.f32665a = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32665a.b();
        }
    }

    public static final class c extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.c f32666a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f32667b;

        /* renamed from: c, reason: collision with root package name */
        public s f32668c;

        public c(com.bumptech.glide.load.c r1, n r2, ReferenceQueue r3, boolean r4) {
            super(r2, r3);
            this.f32666a = (com.bumptech.glide.load.c) com.bumptech.glide.util.k.d(r1);
            if (r2.d() == false) goto L6;
            if (r4 == false) goto L6;
            s r12 = (s) com.bumptech.glide.util.k.d(r2.c());
        L7:
            this.f32668c = r12;
            this.f32667b = r2.d();
            return;
        L6:
            r12 = null;
            goto L7
        }

        public void a() {
            this.f32668c = null;
            clear();
        }
    }

    public a(boolean r2) {
        this(r2, Executors.newSingleThreadExecutor(new ThreadFactoryC0320a()));
    }

    public synchronized void a(com.bumptech.glide.load.c r4, n r5) {
        monitor-enter(this);
        c r02 = new c(r4, r5, this.d, this.f32658a);     // Catch: Throwable -> L7
        c r42 = (c) this.f32660c.put(r4, r02);     // Catch: Throwable -> L7
        if (r42 == null) goto L9;
        r42.a();     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void b() {
    L3:
        if (this.f32662f == true) goto L7;
        c((c) this.d.remove());     // Catch: InterruptedException -> L6
    L6:
        Thread.currentThread().interrupt();
        goto L3
    }

    public void c(c r8) {
        monitor-enter(this);
        this.f32660c.remove(r8.f32666a);     // Catch: Throwable -> L11
        if (r8.f32667b == false) goto L13;
        s r2 = r8.f32668c;     // Catch: Throwable -> L11
        if (r2 == null) goto L13;
        monitor-exit(this);     // Catch: Throwable -> L11
        n r1 = new n(r2, true, false, r8.f32666a, this.f32661e);
        this.f32661e.c(r8.f32666a, r1);
        return;
    L13:
        monitor-exit(this);     // Catch: Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public synchronized void d(com.bumptech.glide.load.c r2) {
        monitor-enter(this);
        c r22 = (c) this.f32660c.remove(r2);     // Catch: Throwable -> L7
        if (r22 == null) goto L9;
        r22.a();     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized n e(com.bumptech.glide.load.c r2) {
        monitor-enter(this);
        c r22 = (c) this.f32660c.get(r2);     // Catch: Throwable -> L12
        if (r22 != null) goto L8;
        monitor-exit(this);
        return null;
    L8:
        n r02 = (n) r22.get();     // Catch: Throwable -> L12
        if (r02 != null) goto L14;
        c(r22);     // Catch: Throwable -> L12
    L14:
        monitor-exit(this);
        return r02;
    L12:
        th = move-exception;
        throw th;
    }

    public void f(n.a r2) {
        monitor-enter(r2);
        monitor-enter(this);     // Catch: Throwable -> L8
        this.f32661e = r2;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        monitor-exit(r2);     // Catch: Throwable -> L8
        return;
    L10:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public a(boolean r2, Executor r3) {
        this.f32660c = new HashMap();
        this.d = new ReferenceQueue();
        this.f32658a = r2;
        this.f32659b = r3;
        r3.execute(new b(this));
    }
}
