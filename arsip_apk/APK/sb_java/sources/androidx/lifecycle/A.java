package androidx.lifecycle;

import androidx.arch.core.internal.b;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class A {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f25515k = null;

    /* renamed from: a, reason: collision with root package name */
    public final Object f25516a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.arch.core.internal.b f25517b;

    /* renamed from: c, reason: collision with root package name */
    public int f25518c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f25519e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f25520f;

    /* renamed from: g, reason: collision with root package name */
    public int f25521g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25522h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25523i;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f25524j;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f25525a;

        public a(A r1) {
            this.f25525a = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object r02 = this.f25525a.f25516a;
            monitor-enter(r02);
            Object r1 = this.f25525a.f25520f;     // Catch: Throwable -> L8
            A r2 = this.f25525a;     // Catch: Throwable -> L8
            r2.f25520f = A.f25515k;     // Catch: Throwable -> L8
            monitor-exit(r02);     // Catch: Throwable -> L8
            this.f25525a.r(r1);
            return;
        L8:
            th = move-exception;
            throw th;
        }
    }

    public class b extends d {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ A f25526e;

        public b(A r1, F r2) {
            this.f25526e = r1;
            super(r1, r2);
        }

        @Override // androidx.lifecycle.A.d
        public boolean d() {
            return true;
        }
    }

    public class c extends d implements r {

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC4025u f25527e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ A f25528f;

        public c(A r1, InterfaceC4025u r2, F r3) {
            this.f25528f = r1;
            super(r1, r3);
            this.f25527e = r2;
        }

        @Override // androidx.lifecycle.A.d
        public void b() {
            this.f25527e.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.A.d
        public boolean c(InterfaceC4025u r2) {
            if (this.f25527e != r2) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // androidx.lifecycle.A.d
        public boolean d() {
            return this.f25527e.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.r
        public void i(InterfaceC4025u r2, Lifecycle.Event r3) {
            Lifecycle.State r22 = this.f25527e.getLifecycle().b();
            if (r22 != Lifecycle.State.DESTROYED) goto L6;
            this.f25528f.p(this.f25529a);
            return;
        L6:
            Lifecycle.State r32 = null;
        L7:
            if (r32 == r22) goto L9;
            a(d());
            Lifecycle.State r33 = this.f25527e.getLifecycle().b();
            r32 = r22;
            r22 = r33;
            goto L7
        }
    }

    public abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final F f25529a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f25530b;

        /* renamed from: c, reason: collision with root package name */
        public int f25531c;
        public final /* synthetic */ A d;

        public d(A r1, F r2) {
            this.d = r1;
            this.f25531c = -1;
            this.f25529a = r2;
        }

        public void a(boolean r2) {
            if (r2 == this.f25530b) goto L14;
            this.f25530b = r2;
            A r02 = this.d;
            if (r2 == false) goto L8;
            int r22 = 1;
        L9:
            r02.c(r22);
            if (this.f25530b == false) goto L13;
            this.d.e(this);
            return;
        L13:
            return;
        L8:
            r22 = -1;
            goto L9
        }

        public void b() {
        }

        public boolean c(InterfaceC4025u r1) {
            return false;
        }

        public abstract boolean d();
    }

    static {
        f25515k = new Object();
    }

    public A(Object r3) {
        this.f25516a = new Object();
        this.f25517b = new androidx.arch.core.internal.b();
        this.f25518c = 0;
        this.f25520f = f25515k;
        this.f25524j = new a(this);
        this.f25519e = r3;
        this.f25521g = 0;
    }

    public static void b(String r3) {
        if (androidx.arch.core.executor.c.h().c() == false) goto L6;
        return;
    L6:
        throw new IllegalStateException("Cannot invoke " + r3 + " on a background thread");
    }

    public void c(int r5) {
        int r02 = this.f25518c;
        this.f25518c = r5 + r02;
        if (this.d == false) goto L5;
        return;
    L5:
        this.d = true;
    L28:
        int r2 = this.f25518c;     // Catch: Throwable -> L19
        if (r02 == r2) goto L24;
        if (r02 != 0) goto L12;
        if (r2 <= 0) goto L12;
        boolean r3 = true;
    L13:
        if (r02 <= 0) goto L16;
        if (r2 != 0) goto L16;
        boolean r03 = true;
    L17:
        if (r3 == false) goto L21;
        m();     // Catch: Throwable -> L19
    L23:
        r02 = r2;
        goto L28
    L21:
        if (r03 == false) goto L23;
        n();     // Catch: Throwable -> L19
    L16:
        r03 = false;
    L12:
        r3 = false;
        goto L13
    L24:
        this.d = false;
        return;
    L19:
        th = move-exception;
        this.d = false;
        throw th;
    }

    public final void d(d r3) {
        if (r3.f25530b == true) goto L6;
        return;
    L6:
        if (r3.d() == true) goto L9;
        r3.a(false);
        return;
    L9:
        int r02 = r3.f25531c;
        int r1 = this.f25521g;
        if (r02 < r1) goto L12;
        return;
    L12:
        r3.f25531c = r1;
        r3.f25529a.a(this.f25519e);
    }

    public void e(d r4) {
        if (this.f25522h == false) goto L6;
        this.f25523i = true;
        return;
    L6:
        this.f25522h = true;
    L7:
        this.f25523i = false;
        if (r4 == null) goto L10;
        d(r4);
        r4 = null;
    L16:
        if (this.f25523i == true) goto L7;
        this.f25522h = false;
        return;
    L10:
        b.d r1 = this.f25517b.d();
    L12:
        if (r1.hasNext() == false) goto L16;
        d((d) ((Map.Entry) r1.next()).getValue());
        if (this.f25523i == false) goto L12;
        goto L16
    }

    public Object f() {
        Object r02 = this.f25519e;
        if (r02 == f25515k) goto L5;
        return r02;
    L5:
        return null;
    }

    public int g() {
        return this.f25521g;
    }

    public boolean h() {
        if (this.f25518c <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean i() {
        if (this.f25517b.size() <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean j() {
        if (this.f25519e == f25515k) goto L6;
        return true;
    L6:
        return false;
    }

    public void k(InterfaceC4025u r3, F r4) {
        b("observe");
        if (r3.getLifecycle().b() == Lifecycle.State.DESTROYED) goto L16;
        c r02 = new c(this, r3, r4);
        d r42 = (d) this.f25517b.g(r4, r02);
        if (r42 != null) goto L8;
    L12:
        if (r42 == null) goto L14;
        return;
    L14:
        r3.getLifecycle().a(r02);
        return;
    L8:
        if (r42.c(r3) == true) goto L12;
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void l(F r3) {
        b("observeForever");
        b r02 = new b(this, r3);
        d r32 = (d) this.f25517b.g(r3, r02);
        if ((r32 instanceof c) == true) goto L9;
        if (r32 == null) goto L6;
        return;
    L6:
        r02.a(true);
        return;
    L9:
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void m() {
    }

    public void n() {
    }

    public void o(Object r4) {
        Object r02 = this.f25516a;
        monitor-enter(r02);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (this.f25520f != f25515k) goto L7;
        boolean r1 = true;
    L8:
        this.f25520f = r4;     // Catch: Throwable -> L14
        monitor-exit(r02);     // Catch: Throwable -> L14
        if (r1 == true) goto L12;
        return;
    L12:
        androidx.arch.core.executor.c.h().d(this.f25524j);
        return;
    L7:
        r1 = false;
        goto L8
    }

    public void p(F r2) {
        b("removeObserver");
        d r22 = (d) this.f25517b.h(r2);
        if (r22 != null) goto L5;
        return;
    L5:
        r22.b();
        r22.a(false);
    }

    public void q(InterfaceC4025u r4) {
        b("removeObservers");
        Iterator r02 = this.f25517b.iterator();
    L4:
        if (r02.hasNext() == false) goto L8;
        Map.Entry r1 = (Map.Entry) r02.next();
        if (((d) r1.getValue()).c(r4) == false) goto L4;
        p((F) r1.getKey());
        goto L4
    }

    public void r(Object r2) {
        b("setValue");
        this.f25521g++;
        this.f25519e = r2;
        e(null);
    }

    public A() {
        this.f25516a = new Object();
        this.f25517b = new androidx.arch.core.internal.b();
        this.f25518c = 0;
        Object r02 = f25515k;
        this.f25520f = r02;
        this.f25524j = new a(this);
        this.f25519e = r02;
        this.f25521g = -1;
    }
}
