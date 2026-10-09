package androidx.core.view.insets;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: l, reason: collision with root package name */
    public static final Interpolator f23266l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final Interpolator f23267m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final Interpolator f23268n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final Interpolator f23269o = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f23270a;

    /* renamed from: b, reason: collision with root package name */
    public final a f23271b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.core.graphics.e f23272c;
    public androidx.core.graphics.e d;

    /* renamed from: e, reason: collision with root package name */
    public float f23273e;

    /* renamed from: f, reason: collision with root package name */
    public float f23274f;

    /* renamed from: g, reason: collision with root package name */
    public float f23275g;

    /* renamed from: h, reason: collision with root package name */
    public float f23276h;

    /* renamed from: i, reason: collision with root package name */
    public Object f23277i;

    /* renamed from: j, reason: collision with root package name */
    public ValueAnimator f23278j;

    /* renamed from: k, reason: collision with root package name */
    public ValueAnimator f23279k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f23280a;

        /* renamed from: b, reason: collision with root package name */
        public int f23281b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.core.graphics.e f23282c;
        public boolean d;

        /* renamed from: e, reason: collision with root package name */
        public Drawable f23283e;

        /* renamed from: f, reason: collision with root package name */
        public float f23284f;

        /* renamed from: g, reason: collision with root package name */
        public float f23285g;

        /* renamed from: h, reason: collision with root package name */
        public float f23286h;

        /* renamed from: i, reason: collision with root package name */
        public InterfaceC0176a f23287i;

        /* renamed from: androidx.core.view.insets.b$a$a, reason: collision with other inner class name */
        public interface InterfaceC0176a {
            void a(int r1);

            void b(Drawable r1);

            void c(boolean r1);

            void d(androidx.core.graphics.e r1);

            void e(float r1);

            void f(int r1);

            void g(float r1);

            void h(float r1);
        }

        public a() {
            this.f23280a = -1;
            this.f23281b = -1;
            this.f23282c = androidx.core.graphics.e.f22877e;
            this.d = false;
            this.f23283e = null;
            this.f23284f = 0.0f;
            this.f23285g = 0.0f;
            this.f23286h = 1.0f;
        }

        public static /* synthetic */ void a(a r02, androidx.core.graphics.e r1) {
            r02.w(r1);
        }

        public static /* synthetic */ void b(a r02, int r1) {
            r02.A(r1);
        }

        public static /* synthetic */ void c(a r02, int r1) {
            r02.v(r1);
        }

        public static /* synthetic */ void d(a r02, boolean r1) {
            r02.z(r1);
        }

        public static /* synthetic */ void e(a r02, float r1) {
            r02.s(r1);
        }

        public static /* synthetic */ int f(a r02) {
            return r02.f23280a;
        }

        public static /* synthetic */ void g(a r02, float r1) {
            r02.x(r1);
        }

        public static /* synthetic */ int h(a r02) {
            return r02.f23281b;
        }

        public static /* synthetic */ void i(a r02, float r1) {
            r02.y(r1);
        }

        public static /* synthetic */ void j(a r02, Drawable r1) {
            r02.u(r1);
        }

        public final void A(int r2) {
            if (this.f23280a == r2) goto L8;
            this.f23280a = r2;
            InterfaceC0176a r02 = this.f23287i;
            if (r02 == null) goto L9;
            r02.f(r2);
            return;
        L9:
            return;
        }

        public float k() {
            return this.f23286h;
        }

        public Drawable l() {
            return this.f23283e;
        }

        public int m() {
            return this.f23281b;
        }

        public androidx.core.graphics.e n() {
            return this.f23282c;
        }

        public float o() {
            return this.f23284f;
        }

        public float p() {
            return this.f23285g;
        }

        public int q() {
            return this.f23280a;
        }

        public boolean r() {
            return this.d;
        }

        public final void s(float r2) {
            if (this.f23286h == r2) goto L8;
            this.f23286h = r2;
            InterfaceC0176a r02 = this.f23287i;
            if (r02 == null) goto L9;
            r02.e(r2);
            return;
        L9:
            return;
        }

        public void t(InterfaceC0176a r2) {
            if (this.f23287i == null) goto L8;
            if (r2 == null) goto L8;
            throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
        L8:
            this.f23287i = r2;
        }

        public final void u(Drawable r2) {
            this.f23283e = r2;
            InterfaceC0176a r02 = this.f23287i;
            if (r02 == null) goto L6;
            r02.b(r2);
            return;
        }

        public final void v(int r2) {
            if (this.f23281b == r2) goto L8;
            this.f23281b = r2;
            InterfaceC0176a r02 = this.f23287i;
            if (r02 == null) goto L9;
            r02.a(r2);
            return;
        L9:
            return;
        }

        public final void w(androidx.core.graphics.e r2) {
            if (this.f23282c.equals(r2) == true) goto L8;
            this.f23282c = r2;
            InterfaceC0176a r02 = this.f23287i;
            if (r02 == null) goto L9;
            r02.d(r2);
            return;
        L9:
            return;
        }

        public final void x(float r2) {
            if (this.f23284f == r2) goto L8;
            this.f23284f = r2;
            InterfaceC0176a r02 = this.f23287i;
            if (r02 == null) goto L9;
            r02.g(r2);
            return;
        L9:
            return;
        }

        public final void y(float r2) {
            if (this.f23285g == r2) goto L8;
            this.f23285g = r2;
            InterfaceC0176a r02 = this.f23287i;
            if (r02 == null) goto L9;
            r02.h(r2);
            return;
        L9:
            return;
        }

        public final void z(boolean r2) {
            if (this.d == r2) goto L8;
            this.d = r2;
            InterfaceC0176a r02 = this.f23287i;
            if (r02 == null) goto L9;
            r02.c(r2);
            return;
        L9:
            return;
        }
    }

    static {
        f23266l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        f23267m = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        f23268n = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        f23269o = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public b(int r4) {
        this.f23271b = new a();
        androidx.core.graphics.e r02 = androidx.core.graphics.e.f22877e;
        this.f23272c = r02;
        this.d = r02;
        this.f23273e = 1.0f;
        this.f23274f = 1.0f;
        this.f23275g = 1.0f;
        this.f23276h = 1.0f;
        this.f23277i = null;
        this.f23278j = null;
        this.f23279k = null;
        if (r4 != 1) goto L5;
    L13:
        this.f23270a = r4;
        return;
    L5:
        if (r4 == 2) goto L13;
        if (r4 == 4) goto L13;
        if (r4 == 8) goto L13;
        throw new IllegalArgumentException("Unexpected side: " + r4);
    }

    public abstract void a(int r1);

    public androidx.core.graphics.e b(androidx.core.graphics.e r1, androidx.core.graphics.e r2, androidx.core.graphics.e r3) {
        this.f23272c = r1;
        this.d = r2;
        a.a(this.f23271b, r3);
        return o();
    }

    public a c() {
        return this.f23271b;
    }

    public Object d() {
        return this.f23277i;
    }

    public int e() {
        return this.f23270a;
    }

    public int f(int r1) {
        return r1;
    }

    public abstract boolean g();

    public void h(Object r1) {
        this.f23277i = r1;
    }

    public void i(Drawable r2) {
        a.j(this.f23271b, r2);
    }

    public void j(float r1) {
        this.f23273e = r1;
        m();
    }

    public void k(float r1) {
        this.f23275g = r1;
        n();
    }

    public void l(boolean r2) {
        a.d(this.f23271b, r2);
    }

    public final void m() {
        a.e(this.f23271b, this.f23273e * this.f23274f);
    }

    public final void n() {
        float r02 = this.f23276h * this.f23275g;
        int r1 = this.f23270a;
        if (r1 != 1) goto L5;
        a.g(this.f23271b, (-(1.0f - r02)) * a.f(r1));
        return;
    L5:
        if (r1 != 2) goto L7;
        a.i(this.f23271b, (-(1.0f - r02)) * a.h(r1));
        return;
    L7:
        if (r1 != 4) goto L9;
        a.g(this.f23271b, (1.0f - r02) * a.f(r1));
        return;
    L9:
        if (r1 == 8) goto L11;
        return;
    L11:
        a.i(this.f23271b, (1.0f - r02) * a.h(r1));
    }

    public androidx.core.graphics.e o() {
        androidx.core.graphics.e r02 = androidx.core.graphics.e.f22877e;
        int r1 = this.f23270a;
        boolean r2 = true;
        if (r1 != 1) goto L5;
        int r12 = this.f23272c.f22878a;
        a.b(this.f23271b, f(this.d.f22878a));
        if (g() == false) goto L23;
        r02 = androidx.core.graphics.e.c(f(r12), 0, 0, 0);
    L23:
        if (r12 > 0) goto L26;
        r2 = false;
    L26:
        l(r2);
        float r22 = 0.0f;
        if (r12 <= 0) goto L29;
        float r4 = 1.0f;
    L30:
        j(r4);
        if (r12 <= 0) goto L33;
        r22 = 1.0f;
    L33:
        k(r22);
        return r02;
    L29:
        r4 = 0.0f;
        goto L30
    L5:
        if (r1 != 2) goto L7;
        r12 = this.f23272c.f22879b;
        a.c(this.f23271b, f(this.d.f22879b));
        if (g() == false) goto L23;
        r02 = androidx.core.graphics.e.c(0, f(r12), 0, 0);
        goto L23
    L7:
        if (r1 != 4) goto L9;
        r12 = this.f23272c.f22880c;
        a.b(this.f23271b, f(this.d.f22880c));
        if (g() == false) goto L23;
        r02 = androidx.core.graphics.e.c(0, 0, f(r12), 0);
        goto L23
    L9:
        if (r1 == 8) goto L11;
        r12 = 0;
        goto L23
    L11:
        r12 = this.f23272c.d;
        a.c(this.f23271b, f(this.d.d));
        if (g() == false) goto L23;
        r02 = androidx.core.graphics.e.c(0, 0, 0, f(r12));
        goto L23
    }
}
