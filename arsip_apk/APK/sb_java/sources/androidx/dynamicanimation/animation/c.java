package androidx.dynamicanimation.animation;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.g0;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f23958j = null;

    /* renamed from: a, reason: collision with root package name */
    public final g0 f23959a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23960b;

    /* renamed from: c, reason: collision with root package name */
    public final b f23961c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public k f23962e;

    /* renamed from: f, reason: collision with root package name */
    public long f23963f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23964g;

    /* renamed from: h, reason: collision with root package name */
    public float f23965h;

    /* renamed from: i, reason: collision with root package name */
    public e f23966i;

    public static /* synthetic */ class a {
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f23967a;

        public b(c r1) {
            this.f23967a = r1;
        }

        public void a() {
            c r02 = this.f23967a;
            r02.f23963f = SystemClock.uptimeMillis();
            c r03 = this.f23967a;
            r03.f(r03.f23963f);
            if (this.f23967a.f23960b.size() <= 0) goto L6;
            c.c(this.f23967a).a(c.b(this.f23967a));
            return;
        }

        public /* synthetic */ b(c r1, a r2) {
            this(r1);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.c$c, reason: collision with other inner class name */
    public interface InterfaceC0192c {
        boolean a(long r1);
    }

    public class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public ValueAnimator.DurationScaleChangeListener f23968a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f23969b;

        public d(c r1) {
            this.f23969b = r1;
        }

        public static /* synthetic */ void b(d r02, float r1) {
            r02.f23969b.f23965h = r1;
        }

        @Override // androidx.dynamicanimation.animation.c.e
        public boolean a() {
            if (this.f23968a != null) goto L6;
            ValueAnimator.DurationScaleChangeListener r02 = new androidx.dynamicanimation.animation.f(this);
            this.f23968a = r02;
            return androidx.dynamicanimation.animation.e.a(r02);
        L6:
            return true;
        }

        @Override // androidx.dynamicanimation.animation.c.e
        public boolean unregister() {
            boolean r02 = androidx.dynamicanimation.animation.d.a(this.f23968a);
            this.f23968a = null;
            return r02;
        }
    }

    public interface e {
        boolean a();

        boolean unregister();
    }

    public static final class f implements k {

        /* renamed from: a, reason: collision with root package name */
        public final Choreographer f23970a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f23971b;

        public f() {
            this.f23970a = Choreographer.getInstance();
            this.f23971b = Looper.myLooper();
        }

        public static /* synthetic */ void c(Runnable r02, long r1) {
            r02.run();
        }

        @Override // androidx.dynamicanimation.animation.k
        public void a(final Runnable r3) {
            this.f23970a.postFrameCallback(new g(r3));
        }

        @Override // androidx.dynamicanimation.animation.k
        public boolean b() {
            if (Thread.currentThread() != this.f23971b.getThread()) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        f23958j = new ThreadLocal();
    }

    public c(k r3) {
        this.f23959a = new g0();
        this.f23960b = new ArrayList();
        this.f23961c = new b(this, null);
        this.d = new androidx.dynamicanimation.animation.b(this);
        this.f23963f = 0;
        this.f23964g = false;
        this.f23965h = 1.0f;
        this.f23962e = r3;
    }

    public static /* synthetic */ void a(c r02) {
        r02.f23961c.a();
    }

    public static /* synthetic */ Runnable b(c r02) {
        return r02.d;
    }

    public static /* synthetic */ k c(c r02) {
        return r02.f23962e;
    }

    public static c h() {
        ThreadLocal r02 = f23958j;
        if (r02.get() != null) goto L6;
        r02.set(new c(new f()));
    L6:
        return (c) r02.get();
    }

    public void d(InterfaceC0192c r4, long r5) {
        if (this.f23960b.size() != 0) goto L11;
        this.f23962e.a(this.d);
        if (Build.VERSION.SDK_INT < 33) goto L11;
        this.f23965h = androidx.dynamicanimation.animation.a.a();
        if (this.f23966i != null) goto L9;
        this.f23966i = new d(this);
    L9:
        this.f23966i.a();
    L11:
        if (this.f23960b.contains(r4) == true) goto L14;
        this.f23960b.add(r4);
    L14:
        if (r5 <= 0) goto L17;
        this.f23959a.put(r4, Long.valueOf(SystemClock.uptimeMillis() + r5));
        return;
    }

    public final void e() {
        if (this.f23964g == false) goto L20;
        int r02 = this.f23960b.size() - 1;
    L5:
        if (r02 < 0) goto L11;
        if (this.f23960b.get(r02) != null) goto L9;
        this.f23960b.remove(r02);
    L9:
        r02 = r02 - 1;
        goto L5
    L11:
        if (this.f23960b.size() == 0) goto L13;
    L15:
        this.f23964g = false;
        return;
    L13:
        if (Build.VERSION.SDK_INT < 33) goto L15;
        this.f23966i.unregister();
        goto L15
    }

    public void f(long r6) {
        long r02 = SystemClock.uptimeMillis();
        int r2 = 0;
    L4:
        if (r2 >= this.f23960b.size()) goto L12;
        InterfaceC0192c r3 = (InterfaceC0192c) this.f23960b.get(r2);
        if (r3 == null) goto L11;
        if (i(r3, r02) == false) goto L11;
        r3.a(r6);
    L11:
        r2 = r2 + 1;
        goto L4
    L12:
        e();
    }

    public float g() {
        return this.f23965h;
    }

    public final boolean i(InterfaceC0192c r5, long r6) {
        Long r02 = (Long) this.f23959a.get(r5);
        if (r02 != null) goto L6;
        return true;
    L6:
        if (r02.longValue() >= r6) goto L9;
        this.f23959a.remove(r5);
        return true;
    L9:
        return false;
    }

    public boolean j() {
        return this.f23962e.b();
    }

    public void k(InterfaceC0192c r3) {
        this.f23959a.remove(r3);
        int r32 = this.f23960b.indexOf(r3);
        if (r32 < 0) goto L6;
        this.f23960b.set(r32, null);
        this.f23964g = true;
        return;
    }
}
