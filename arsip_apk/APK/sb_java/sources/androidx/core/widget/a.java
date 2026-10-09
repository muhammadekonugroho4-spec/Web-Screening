package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC3869e0;

/* loaded from: classes4.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f23409r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0179a f23410a;

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f23411b;

    /* renamed from: c, reason: collision with root package name */
    public final View f23412c;
    public Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f23413e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f23414f;

    /* renamed from: g, reason: collision with root package name */
    public int f23415g;

    /* renamed from: h, reason: collision with root package name */
    public int f23416h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f23417i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f23418j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f23419k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23420l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23421m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23422n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23423o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23424p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23425q;

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    public static class C0179a {

        /* renamed from: a, reason: collision with root package name */
        public int f23426a;

        /* renamed from: b, reason: collision with root package name */
        public int f23427b;

        /* renamed from: c, reason: collision with root package name */
        public float f23428c;
        public float d;

        /* renamed from: e, reason: collision with root package name */
        public long f23429e;

        /* renamed from: f, reason: collision with root package name */
        public long f23430f;

        /* renamed from: g, reason: collision with root package name */
        public int f23431g;

        /* renamed from: h, reason: collision with root package name */
        public int f23432h;

        /* renamed from: i, reason: collision with root package name */
        public long f23433i;

        /* renamed from: j, reason: collision with root package name */
        public float f23434j;

        /* renamed from: k, reason: collision with root package name */
        public int f23435k;

        public C0179a() {
            this.f23429e = Long.MIN_VALUE;
            this.f23433i = -1;
            this.f23430f = 0;
            this.f23431g = 0;
            this.f23432h = 0;
        }

        public void a() {
            if (this.f23430f == 0) goto L7;
            long r02 = AnimationUtils.currentAnimationTimeMillis();
            float r2 = g(e(r02));
            long r3 = r02 - this.f23430f;
            this.f23430f = r02;
            float r03 = r3 * r2;
            this.f23431g = (int) (this.f23428c * r03);
            this.f23432h = (int) (r03 * this.d);
            return;
        L7:
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f23431g;
        }

        public int c() {
            return this.f23432h;
        }

        public int d() {
            float r02 = this.f23428c;
            return (int) (r02 / Math.abs(r02));
        }

        public final float e(long r9) {
            if (r9 >= this.f23429e) goto L5;
            return 0.0f;
        L5:
            long r4 = this.f23433i;
            if (r4 < 0) goto L13;
            if (r9 < r4) goto L13;
            float r02 = this.f23434j;
            return (1.0f - r02) + (r02 * a.e((r9 - r4) / this.f23435k, 0.0f, 1.0f));
        L13:
            return a.e((r9 - r0) / this.f23426a, 0.0f, 1.0f) * 0.5f;
        }

        public int f() {
            float r02 = this.d;
            return (int) (r02 / Math.abs(r02));
        }

        public final float g(float r3) {
            return (((-4.0f) * r3) * r3) + (r3 * 4.0f);
        }

        public boolean h() {
            if (this.f23433i > 0) goto L5;
            return false;
        L5:
            if (AnimationUtils.currentAnimationTimeMillis() <= (this.f23433i + this.f23435k)) goto L10;
            return true;
        L10:
            return false;
        }

        public void i() {
            long r02 = AnimationUtils.currentAnimationTimeMillis();
            this.f23435k = a.f((int) (r02 - this.f23429e), 0, this.f23427b);
            this.f23434j = e(r02);
            this.f23433i = r02;
        }

        public void j(int r1) {
            this.f23427b = r1;
        }

        public void k(int r1) {
            this.f23426a = r1;
        }

        public void l(float r1, float r2) {
            this.f23428c = r1;
            this.d = r2;
        }

        public void m() {
            long r02 = AnimationUtils.currentAnimationTimeMillis();
            this.f23429e = r02;
            this.f23433i = -1;
            this.f23430f = r02;
            this.f23434j = 0.5f;
            this.f23431g = 0;
            this.f23432h = 0;
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f23436a;

        public b(a r1) {
            this.f23436a = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            a r02 = this.f23436a;
            if (r02.f23423o == true) goto L6;
            return;
        L6:
            if (r02.f23421m == false) goto L8;
            r02.f23421m = false;
            r02.f23410a.m();
        L8:
            C0179a r03 = this.f23436a.f23410a;
            if (r03.h() == false) goto L11;
        L18:
            this.f23436a.f23423o = false;
            return;
        L11:
            if (this.f23436a.u() == false) goto L18;
            a r1 = this.f23436a;
            if (r1.f23422n == false) goto L16;
            r1.f23422n = false;
            r1.c();
        L16:
            r03.a();
            int r12 = r03.b();
            int r04 = r03.c();
            this.f23436a.j(r12, r04);
            AbstractC3869e0.e0(this.f23436a.f23412c, this);
        }
    }

    static {
        f23409r = ViewConfiguration.getTapTimeout();
    }

    public a(View r5) {
        this.f23410a = new C0179a();
        this.f23411b = new AccelerateInterpolator();
        this.f23413e = new float[]{0.0f, 0.0f};
        this.f23414f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f23417i = new float[]{0.0f, 0.0f};
        this.f23418j = new float[]{0.0f, 0.0f};
        this.f23419k = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f23412c = r5;
        float r52 = Resources.getSystem().getDisplayMetrics().density;
        float r02 = (int) ((1575.0f * r52) + 0.5f);
        o(r02, r02);
        float r53 = (int) ((r52 * 315.0f) + 0.5f);
        p(r53, r53);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f23409r);
        r(500);
        q(500);
    }

    public static float e(float r1, float r2, float r3) {
        if (r1 <= r3) goto L6;
        return r3;
    L6:
        if (r1 >= r2) goto L8;
        return r2;
    L8:
        return r1;
    }

    public static int f(int r02, int r1, int r2) {
        if (r02 <= r2) goto L4;
        return r2;
    L4:
        if (r02 >= r1) goto L6;
        return r1;
    L6:
        return r02;
    }

    public abstract boolean a(int r1);

    public abstract boolean b(int r1);

    public void c() {
        long r02 = SystemClock.uptimeMillis();
        MotionEvent r03 = MotionEvent.obtain(r02, r02, 3, 0.0f, 0.0f, 0);
        this.f23412c.onTouchEvent(r03);
        r03.recycle();
    }

    public final float d(int r4, float r5, float r6, float r7) {
        float r52 = h(this.f23413e[r4], r6, this.f23414f[r4], r5);
        if (r52 != 0.0f) goto L5;
        return 0.0f;
    L5:
        float r62 = this.f23417i[r4];
        float r1 = this.f23418j[r4];
        float r42 = this.f23419k[r4];
        float r63 = r62 * r7;
        if (r52 <= 0.0f) goto L10;
        return e(r52 * r63, r1, r42);
    L10:
        return -e((-r52) * r63, r1, r42);
    }

    public final float g(float r6, float r7) {
        if (r7 != 0.0f) goto L5;
        return 0.0f;
    L5:
        int r1 = this.f23415g;
        if (r1 == 0) goto L16;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L12;
    L25:
        return 0.0f;
    L12:
        if (r6 >= 0.0f) goto L25;
        return r6 / (-r7);
    L16:
        if (r6 >= r7) goto L25;
        if (r6 < 0.0f) goto L22;
        return 1.0f - (r6 / r7);
    L22:
        if (this.f23423o == false) goto L25;
        if (r1 != 1) goto L25;
        return 1.0f;
    }

    public final float h(float r2, float r3, float r4, float r5) {
        float r22 = e(r2 * r3, 0.0f, r4);
        float r42 = g(r5, r22);
        float r23 = g(r3 - r5, r22) - r42;
        if (r23 >= 0.0f) goto L6;
        float r24 = -this.f23411b.getInterpolation(-r23);
    L9:
        return e(r24, -1.0f, 1.0f);
    L6:
        if (r23 <= 0.0f) goto L10;
        r24 = this.f23411b.getInterpolation(r23);
        goto L9
    L10:
        return 0.0f;
    }

    public final void i() {
        if (this.f23421m == false) goto L6;
        this.f23423o = false;
        return;
    L6:
        this.f23410a.i();
    }

    public abstract void j(int r1, int r2);

    public a k(int r1) {
        this.f23416h = r1;
        return this;
    }

    public a l(int r1) {
        this.f23415g = r1;
        return this;
    }

    public a m(boolean r2) {
        if (this.f23424p == false) goto L6;
        if (r2 == true) goto L6;
        i();
    L6:
        this.f23424p = r2;
        return this;
    }

    public a n(float r3, float r4) {
        float[] r02 = this.f23414f;
        r02[0] = r3;
        r02[1] = r4;
        return this;
    }

    public a o(float r4, float r5) {
        float[] r02 = this.f23419k;
        r02[0] = r4 / 1000.0f;
        r02[1] = r5 / 1000.0f;
        return this;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View r6, MotionEvent r7) {
        if (this.f23424p == true) goto L5;
        return false;
    L5:
        int r02 = r7.getActionMasked();
        if (r02 == 0) goto L14;
        if (r02 != 1) goto L9;
    L13:
        i();
    L21:
        if (this.f23425q == true) goto L23;
    L25:
        return false;
    L23:
        if (this.f23423o == false) goto L25;
        return true;
    L9:
        if (r02 != 2) goto L11;
    L15:
        this.f23410a.l(d(0, r7.getX(), r6.getWidth(), this.f23412c.getWidth()), d(1, r7.getY(), r6.getHeight(), this.f23412c.getHeight()));
        if (this.f23423o == true) goto L21;
        if (u() == false) goto L21;
        v();
        goto L21
    L11:
        if (r02 == 3) goto L13;
    L14:
        this.f23422n = true;
        this.f23420l = false;
        goto L15
    }

    public a p(float r4, float r5) {
        float[] r02 = this.f23418j;
        r02[0] = r4 / 1000.0f;
        r02[1] = r5 / 1000.0f;
        return this;
    }

    public a q(int r2) {
        this.f23410a.j(r2);
        return this;
    }

    public a r(int r2) {
        this.f23410a.k(r2);
        return this;
    }

    public a s(float r3, float r4) {
        float[] r02 = this.f23413e;
        r02[0] = r3;
        r02[1] = r4;
        return this;
    }

    public a t(float r4, float r5) {
        float[] r02 = this.f23417i;
        r02[0] = r4 / 1000.0f;
        r02[1] = r5 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0179a r02 = this.f23410a;
        int r1 = r02.f();
        int r03 = r02.d();
        if (r1 != 0) goto L5;
    L6:
        if (r03 != 0) goto L8;
        return false;
    L8:
        if (a(r03) == false) goto L14;
        return true;
    L14:
        return false;
    L5:
        if (b(r1) == false) goto L6;
        return true;
    }

    public final void v() {
        if (this.d != null) goto L5;
        this.d = new b(this);
    L5:
        this.f23423o = true;
        this.f23421m = true;
        if (this.f23420l == true) goto L10;
        int r1 = this.f23416h;
        if (r1 <= 0) goto L10;
        AbstractC3869e0.f0(this.f23412c, this.d, r1);
    L11:
        this.f23420l = true;
        return;
    L10:
        this.d.run();
        goto L11
    }
}
