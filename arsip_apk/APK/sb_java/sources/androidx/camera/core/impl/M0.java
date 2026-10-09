package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC2294x0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class M0 implements InterfaceC2294x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5235a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f5236b;

    /* renamed from: c, reason: collision with root package name */
    public int f5237c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f5238e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f5239f;

    public static abstract class a {
        public a() {
        }

        public static a b(Throwable r1) {
            return new C2270l(r1);
        }

        public abstract Throwable a();
    }

    public static final class b implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f5240h = null;

        /* renamed from: a, reason: collision with root package name */
        public final Executor f5241a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2294x0.a f5242b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f5243c;
        public final AtomicReference d;

        /* renamed from: e, reason: collision with root package name */
        public Object f5244e;

        /* renamed from: f, reason: collision with root package name */
        public int f5245f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f5246g;

        static {
            f5240h = new Object();
        }

        public b(AtomicReference r3, Executor r4, InterfaceC2294x0.a r5) {
            this.f5243c = new AtomicBoolean(true);
            this.f5244e = f5240h;
            this.f5245f = -1;
            this.f5246g = false;
            this.d = r3;
            this.f5241a = r4;
            this.f5242b = r5;
        }

        public void a() {
            this.f5243c.set(false);
        }

        public void b(int r2) {
            monitor-enter(this);
        L7:
            th = move-exception;
            throw th;
        L4:
            if (this.f5243c.get() == true) goto L10;
            monitor-exit(this);     // Catch: Throwable -> L7
            return;
        L10:
            if (r2 > this.f5245f) goto L13;
            monitor-exit(this);     // Catch: Throwable -> L7
            return;
        L13:
            this.f5245f = r2;     // Catch: Throwable -> L7
            if (this.f5246g == false) goto L17;
            monitor-exit(this);     // Catch: Throwable -> L7
            return;
        L17:
            this.f5246g = true;     // Catch: Throwable -> L7
            monitor-exit(this);     // Catch: Throwable -> L7
            this.f5241a.execute(this);     // Catch: Throwable -> L21
            return;
        L21:
            monitor-enter(this);
            this.f5246g = false;     // Catch: Throwable -> L26
            return;
        L26:
            th = move-exception;
            throw th;
        }

        @Override // java.lang.Runnable
        public void run() {
            monitor-enter(this);
        L8:
            th = move-exception;
            throw th;
        L4:
            if (this.f5243c.get() == true) goto L10;
            this.f5246g = false;     // Catch: Throwable -> L8
            monitor-exit(this);     // Catch: Throwable -> L8
            return;
        L10:
            Object r02 = this.d.get();     // Catch: Throwable -> L8
            int r2 = this.f5245f;     // Catch: Throwable -> L8
            monitor-exit(this);     // Catch: Throwable -> L8
        L13:
            if (Objects.equals(this.f5244e, r02) == true) goto L18;
            this.f5244e = r02;
            if ((r02 instanceof a) == false) goto L17;
            this.f5242b.onError(((a) r02).a());
            goto L18
        L17:
            this.f5242b.a(r02);
        L18:
            monitor-enter(this);
        L27:
            th = move-exception;
            throw th;
        L20:
            if (r2 == this.f5245f) goto L29;
            if (this.f5243c.get() == false) goto L29;
            r02 = this.d.get();     // Catch: Throwable -> L27
            r2 = this.f5245f;     // Catch: Throwable -> L27
            monitor-exit(this);     // Catch: Throwable -> L27
        L29:
            this.f5246g = false;     // Catch: Throwable -> L27
            monitor-exit(this);     // Catch: Throwable -> L27
        }
    }

    public M0(Object r2, boolean r3) {
        this.f5235a = new Object();
        this.f5237c = 0;
        this.d = false;
        this.f5238e = new HashMap();
        this.f5239f = new CopyOnWriteArraySet();
        if (r3 == false) goto L6;
        androidx.core.util.h.b(r2 instanceof Throwable, "Initial errors must be Throwable");
        this.f5236b = new AtomicReference(a.b((Throwable) r2));
        return;
    L6:
        this.f5236b = new AtomicReference(r2);
    }

    @Override // androidx.camera.core.impl.InterfaceC2294x0
    public ListenableFuture a() {
        Object r02 = this.f5236b.get();
        if ((r02 instanceof a) == false) goto L7;
        return androidx.camera.core.impl.utils.futures.n.n(((a) r02).a());
    L7:
        return androidx.camera.core.impl.utils.futures.n.p(r02);
    }

    @Override // androidx.camera.core.impl.InterfaceC2294x0
    public void b(Executor r4, InterfaceC2294x0.a r5) {
        Object r02 = this.f5235a;
        monitor-enter(r02);
        d(r5);     // Catch: Throwable -> L8
        b r1 = new b(this.f5236b, r4, r5);     // Catch: Throwable -> L8
        this.f5238e.put(r5, r1);     // Catch: Throwable -> L8
        this.f5239f.add(r1);     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        r1.b(0);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2294x0
    public void c(InterfaceC2294x0.a r2) {
        Object r02 = this.f5235a;
        monitor-enter(r02);
        d(r2);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void d(InterfaceC2294x0.a r2) {
        b r22 = (b) this.f5238e.remove(r2);
        if (r22 == null) goto L6;
        r22.a();
        this.f5239f.remove(r22);
        return;
    }

    public void e(Object r1) {
        f(r1);
    }

    public final void f(Object r4) {
        Object r02 = this.f5235a;
        monitor-enter(r02);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (Objects.equals(this.f5236b.getAndSet(r4), r4) == false) goto L10;
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L10:
        int r42 = this.f5237c + 1;     // Catch: Throwable -> L8
        this.f5237c = r42;     // Catch: Throwable -> L8
        if (this.d == false) goto L14;
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L14:
        this.d = true;     // Catch: Throwable -> L8
        Iterator r1 = this.f5239f.iterator();     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
    L17:
        if (r1.hasNext() == true) goto L18;
        Object r12 = this.f5235a;
        monitor-enter(r12);
    L26:
        th = move-exception;
        throw th;
    L22:
        if (this.f5237c == r42) goto L23;
        Iterator r43 = this.f5239f.iterator();     // Catch: Throwable -> L26
        int r03 = this.f5237c;     // Catch: Throwable -> L26
        monitor-exit(r12);     // Catch: Throwable -> L26
        r1 = r43;
        r42 = r03;
        goto L17
    L23:
        this.d = false;     // Catch: Throwable -> L26
        monitor-exit(r12);     // Catch: Throwable -> L26
        return;
    L18:
        ((b) r1.next()).b(r42);
        goto L17
    }
}
