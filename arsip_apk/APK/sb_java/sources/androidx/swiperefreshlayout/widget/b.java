package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.h;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes4.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final Interpolator f28197g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final Interpolator f28198h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f28199i = null;

    /* renamed from: a, reason: collision with root package name */
    public final c f28200a;

    /* renamed from: b, reason: collision with root package name */
    public float f28201b;

    /* renamed from: c, reason: collision with root package name */
    public Resources f28202c;
    public Animator d;

    /* renamed from: e, reason: collision with root package name */
    public float f28203e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28204f;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f28205a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f28206b;

        public a(b r1, c r2) {
            this.f28206b = r1;
            this.f28205a = r2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator r4) {
            float r42 = ((Float) r4.getAnimatedValue()).floatValue();
            this.f28206b.o(r42, this.f28205a);
            this.f28206b.b(r42, this.f28205a, false);
            this.f28206b.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    public class C0258b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f28207a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f28208b;

        public C0258b(b r1, c r2) {
            this.f28208b = r1;
            this.f28207a = r2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator r1) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator r1) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator r5) {
            this.f28208b.b(1.0f, this.f28207a, true);
            this.f28207a.A();
            this.f28207a.l();
            b r02 = this.f28208b;
            if (r02.f28204f == false) goto L6;
            r02.f28204f = false;
            r5.cancel();
            r5.setDuration(1332);
            r5.start();
            this.f28207a.x(false);
            return;
        L6:
            r02.f28203e += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator r2) {
            this.f28208b.f28203e = 0.0f;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final RectF f28209a;

        /* renamed from: b, reason: collision with root package name */
        public final Paint f28210b;

        /* renamed from: c, reason: collision with root package name */
        public final Paint f28211c;
        public final Paint d;

        /* renamed from: e, reason: collision with root package name */
        public float f28212e;

        /* renamed from: f, reason: collision with root package name */
        public float f28213f;

        /* renamed from: g, reason: collision with root package name */
        public float f28214g;

        /* renamed from: h, reason: collision with root package name */
        public float f28215h;

        /* renamed from: i, reason: collision with root package name */
        public int[] f28216i;

        /* renamed from: j, reason: collision with root package name */
        public int f28217j;

        /* renamed from: k, reason: collision with root package name */
        public float f28218k;

        /* renamed from: l, reason: collision with root package name */
        public float f28219l;

        /* renamed from: m, reason: collision with root package name */
        public float f28220m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f28221n;

        /* renamed from: o, reason: collision with root package name */
        public Path f28222o;

        /* renamed from: p, reason: collision with root package name */
        public float f28223p;

        /* renamed from: q, reason: collision with root package name */
        public float f28224q;

        /* renamed from: r, reason: collision with root package name */
        public int f28225r;

        /* renamed from: s, reason: collision with root package name */
        public int f28226s;

        /* renamed from: t, reason: collision with root package name */
        public int f28227t;

        /* renamed from: u, reason: collision with root package name */
        public int f28228u;

        public c() {
            this.f28209a = new RectF();
            Paint r02 = new Paint();
            this.f28210b = r02;
            Paint r1 = new Paint();
            this.f28211c = r1;
            Paint r2 = new Paint();
            this.d = r2;
            this.f28212e = 0.0f;
            this.f28213f = 0.0f;
            this.f28214g = 0.0f;
            this.f28215h = 5.0f;
            this.f28223p = 1.0f;
            this.f28227t = Constants.MAX_HOST_LENGTH;
            r02.setStrokeCap(Paint.Cap.SQUARE);
            r02.setAntiAlias(true);
            r02.setStyle(Paint.Style.STROKE);
            r1.setStyle(Paint.Style.FILL);
            r1.setAntiAlias(true);
            r2.setColor(0);
        }

        public void A() {
            this.f28218k = this.f28212e;
            this.f28219l = this.f28213f;
            this.f28220m = this.f28214g;
        }

        public void a(Canvas r8, Rect r9) {
            RectF r1 = this.f28209a;
            float r02 = this.f28224q;
            float r2 = (this.f28215h / 2.0f) + r02;
            if (r02 > 0.0f) goto L5;
            r2 = (Math.min(r9.width(), r9.height()) / 2.0f) - Math.max((this.f28225r * this.f28223p) / 2.0f, this.f28215h / 2.0f);
        L5:
            r1.set(r9.centerX() - r2, r9.centerY() - r2, r9.centerX() + r2, r9.centerY() + r2);
            float r92 = this.f28212e;
            float r03 = this.f28214g;
            float r93 = (r92 + r03) * 360.0f;
            float r4 = ((this.f28213f + r03) * 360.0f) - r93;
            this.f28210b.setColor(this.f28228u);
            this.f28210b.setAlpha(this.f28227t);
            float r04 = this.f28215h / 2.0f;
            r1.inset(r04, r04);
            r8.drawCircle(r1.centerX(), r1.centerY(), r1.width() / 2.0f, this.d);
            float r05 = -r04;
            r1.inset(r05, r05);
            r8.drawArc(r1, r93, r4, false, this.f28210b);
            b(r8, r93, r4, r1);
        }

        public void b(Canvas r8, float r9, float r10, RectF r11) {
            if (this.f28221n == false) goto L10;
            Path r02 = this.f28222o;
            if (r02 != null) goto L7;
            Path r03 = new Path();
            this.f28222o = r03;
            r03.setFillType(Path.FillType.EVEN_ODD);
        L8:
            float r04 = Math.min(r11.width(), r11.height()) / 2.0f;
            float r2 = (this.f28225r * this.f28223p) / 2.0f;
            this.f28222o.moveTo(0.0f, 0.0f);
            this.f28222o.lineTo(this.f28225r * this.f28223p, 0.0f);
            Path r3 = this.f28222o;
            float r4 = this.f28225r;
            float r5 = this.f28223p;
            r3.lineTo((r4 * r5) / 2.0f, this.f28226s * r5);
            this.f28222o.offset((r04 + r11.centerX()) - r2, r11.centerY() + (this.f28215h / 2.0f));
            this.f28222o.close();
            this.f28211c.setColor(this.f28228u);
            this.f28211c.setAlpha(this.f28227t);
            r8.save();
            r8.rotate(r9 + r10, r11.centerX(), r11.centerY());
            r8.drawPath(this.f28222o, this.f28211c);
            r8.restore();
            return;
        L7:
            r02.reset();
            goto L8
        }

        public int c() {
            return this.f28227t;
        }

        public float d() {
            return this.f28213f;
        }

        public int e() {
            return this.f28216i[f()];
        }

        public int f() {
            return (this.f28217j + 1) % this.f28216i.length;
        }

        public float g() {
            return this.f28212e;
        }

        public int h() {
            return this.f28216i[this.f28217j];
        }

        public float i() {
            return this.f28219l;
        }

        public float j() {
            return this.f28220m;
        }

        public float k() {
            return this.f28218k;
        }

        public void l() {
            t(f());
        }

        public void m() {
            this.f28218k = 0.0f;
            this.f28219l = 0.0f;
            this.f28220m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        public void n(int r1) {
            this.f28227t = r1;
        }

        public void o(float r1, float r2) {
            this.f28225r = (int) r1;
            this.f28226s = (int) r2;
        }

        public void p(float r2) {
            if (r2 == this.f28223p) goto L6;
            this.f28223p = r2;
            return;
        }

        public void q(float r1) {
            this.f28224q = r1;
        }

        public void r(int r1) {
            this.f28228u = r1;
        }

        public void s(ColorFilter r2) {
            this.f28210b.setColorFilter(r2);
        }

        public void t(int r2) {
            this.f28217j = r2;
            this.f28228u = this.f28216i[r2];
        }

        public void u(int[] r1) {
            this.f28216i = r1;
            t(0);
        }

        public void v(float r1) {
            this.f28213f = r1;
        }

        public void w(float r1) {
            this.f28214g = r1;
        }

        public void x(boolean r2) {
            if (this.f28221n == r2) goto L6;
            this.f28221n = r2;
            return;
        }

        public void y(float r1) {
            this.f28212e = r1;
        }

        public void z(float r2) {
            this.f28215h = r2;
            this.f28210b.setStrokeWidth(r2);
        }
    }

    static {
        f28197g = new LinearInterpolator();
        f28198h = new androidx.interpolator.view.animation.b();
        f28199i = new int[]{-16777216};
    }

    public b(Context r2) {
        this.f28202c = ((Context) h.g(r2)).getResources();
        c r22 = new c();
        this.f28200a = r22;
        r22.u(f28199i);
        l(2.5f);
        n();
    }

    public final void a(float r5, c r6) {
        o(r5, r6);
        float r02 = (float) (Math.floor(r6.j() / 0.8f) + 1.0d);
        r6.y(r6.k() + (((r6.i() - 0.01f) - r6.k()) * r5));
        r6.v(r6.i());
        r6.w(r6.j() + ((r02 - r6.j()) * r5));
    }

    public void b(float r8, c r9, boolean r10) {
        if (this.f28204f == false) goto L7;
        a(r8, r9);
        return;
    L7:
        if (r8 != 1.0f) goto L11;
        if (r10 == true) goto L11;
        return;
    L11:
        float r102 = r9.j();
        if (r8 >= 0.5f) goto L14;
        float r1 = r9.k();
        Interpolator r2 = f28198h;
        float r02 = ((r2.getInterpolation(r8 / 0.5f) * 0.79f) + 0.01f) + r1;
    L15:
        float r103 = r102 + (0.20999998f * r8);
        float r82 = (r8 + this.f28203e) * 216.0f;
        r9.y(r1);
        r9.v(r02);
        r9.w(r103);
        i(r82);
        return;
    L14:
        float r12 = r9.k() + 0.79f;
        Interpolator r5 = f28198h;
        r1 = r12 - (((1.0f - r5.getInterpolation((r8 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
        r02 = r12;
        goto L15
    }

    public final int c(float r7, int r8, int r9) {
        int r02 = (r8 >> 24) & Constants.MAX_HOST_LENGTH;
        int r1 = (r8 >> 16) & Constants.MAX_HOST_LENGTH;
        int r2 = (r8 >> 8) & Constants.MAX_HOST_LENGTH;
        int r82 = r8 & Constants.MAX_HOST_LENGTH;
        int r3 = (r9 >> 24) & Constants.MAX_HOST_LENGTH;
        int r4 = (r9 >> 16) & Constants.MAX_HOST_LENGTH;
        int r5 = (r9 >> 8) & Constants.MAX_HOST_LENGTH;
        return ((((r02 + ((int) ((r3 - r02) * r7))) << 24) | ((r1 + ((int) ((r4 - r1) * r7))) << 16)) | ((r2 + ((int) ((r5 - r2) * r7))) << 8)) | (r82 + ((int) (r7 * ((r9 & Constants.MAX_HOST_LENGTH) - r82))));
    }

    public void d(boolean r2) {
        this.f28200a.x(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r5) {
        Rect r02 = getBounds();
        r5.save();
        r5.rotate(this.f28201b, r02.exactCenterX(), r02.exactCenterY());
        this.f28200a.a(r5, r02);
        r5.restore();
    }

    public void e(float r2) {
        this.f28200a.p(r2);
        invalidateSelf();
    }

    public void f(float r2) {
        this.f28200a.q(r2);
        invalidateSelf();
    }

    public void g(int... r2) {
        this.f28200a.u(r2);
        this.f28200a.t(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f28200a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(float r2) {
        this.f28200a.w(r2);
        invalidateSelf();
    }

    public final void i(float r1) {
        this.f28201b = r1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.d.isRunning();
    }

    public final void j(float r3, float r4, float r5, float r6) {
        c r02 = this.f28200a;
        float r1 = this.f28202c.getDisplayMetrics().density;
        r02.z(r4 * r1);
        r02.q(r3 * r1);
        r02.t(0);
        r02.o(r5 * r1, r6 * r1);
    }

    public void k(float r2, float r3) {
        this.f28200a.y(r2);
        this.f28200a.v(r3);
        invalidateSelf();
    }

    public void l(float r2) {
        this.f28200a.z(r2);
        invalidateSelf();
    }

    public void m(int r4) {
        if (r4 != 0) goto L4;
        j(11.0f, 3.0f, 12.0f, 6.0f);
    L5:
        invalidateSelf();
        return;
    L4:
        j(7.5f, 2.5f, 10.0f, 5.0f);
        goto L5
    }

    public final void n() {
        c r02 = this.f28200a;
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r1.addUpdateListener(new a(this, r02));
        r1.setRepeatCount(-1);
        r1.setRepeatMode(1);
        r1.setInterpolator(f28197g);
        r1.addListener(new C0258b(this, r02));
        this.d = r1;
    }

    public void o(float r3, c r4) {
        if (r3 <= 0.75f) goto L6;
        r4.r(c((r3 - 0.75f) / 0.25f, r4.h(), r4.e()));
        return;
    L6:
        r4.r(r4.h());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.f28200a.n(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r2) {
        this.f28200a.s(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.d.cancel();
        this.f28200a.A();
        if (this.f28200a.d() == this.f28200a.g()) goto L6;
        this.f28204f = true;
        this.d.setDuration(666);
        this.d.start();
        return;
    L6:
        this.f28200a.t(0);
        this.f28200a.m();
        this.d.setDuration(1332);
        this.d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.d.cancel();
        i(0.0f);
        this.f28200a.x(false);
        this.f28200a.t(0);
        this.f28200a.m();
        invalidateSelf();
    }
}
