package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public final class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f37002a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f37003b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f37004c;
    public final Matrix d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f37005e;

    /* renamed from: f, reason: collision with root package name */
    public b f37006f;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f37007a;

        public a(c r1) {
            this.f37007a = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator r1) {
            this.f37007a.invalidateSelf();
        }
    }

    public c() {
        this.f37002a = new a(this);
        Paint r02 = new Paint();
        this.f37003b = r02;
        this.f37004c = new Rect();
        this.d = new Matrix();
        r02.setAntiAlias(true);
    }

    public boolean a() {
        ValueAnimator r02 = this.f37005e;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.isStarted() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public void b() {
        ValueAnimator r02 = this.f37005e;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.isStarted() == true) goto L15;
        b r03 = this.f37006f;
        if (r03 != null) goto L9;
        return;
    L9:
        if (r03.f36995p == true) goto L11;
        return;
    L11:
        if (getCallback() == null) goto L18;
        this.f37005e.start();
        return;
    L18:
        return;
    }

    public final float c(float r1, float r2, float r3) {
        return r1 + ((r2 - r1) * r3);
    }

    public void d(b r3) {
        this.f37006f = r3;
        if (r3 == null) goto L9;
        Paint r32 = this.f37003b;
        if (this.f37006f.f36996q == false) goto L7;
        PorterDuff.Mode r1 = PorterDuff.Mode.DST_IN;
    L8:
        r32.setXfermode(new PorterDuffXfermode(r1));
        goto L9
    L7:
        r1 = PorterDuff.Mode.SRC_IN;
    L9:
        g();
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r9) {
        if (this.f37006f != null) goto L5;
        return;
    L5:
        if (this.f37003b.getShader() == null) goto L25;
        float r02 = (float) Math.tan(Math.toRadians(this.f37006f.f36993n));
        float r1 = this.f37004c.height() + (this.f37004c.width() * r02);
        float r2 = this.f37004c.width() + (r02 * this.f37004c.height());
        ValueAnimator r03 = this.f37005e;
        float r3 = 0.0f;
        if (r03 == null) goto L10;
        float r04 = r03.getAnimatedFraction();
    L11:
        int r4 = this.f37006f.d;
        if (r4 != 1) goto L14;
        float r05 = c(-r1, r1, r04);
    L22:
        this.d.reset();
        this.d.setRotate(this.f37006f.f36993n, this.f37004c.width() / 2.0f, this.f37004c.height() / 2.0f);
        this.d.postTranslate(r3, r05);
        this.f37003b.getShader().setLocalMatrix(this.d);
        r9.drawRect(this.f37004c, this.f37003b);
        return;
    L14:
        if (r4 != 2) goto L16;
        float r06 = c(r2, -r2, r04);
    L18:
        r3 = r06;
        r05 = 0.0f;
        goto L22
    L16:
        if (r4 == 3) goto L19;
        r06 = c(-r2, r2, r04);
        goto L18
    L19:
        r05 = c(r1, -r1, r04);
        goto L22
    L10:
        r04 = 0.0f;
        goto L11
    }

    public void e() {
        if (this.f37005e != null) goto L5;
        return;
    L5:
        if (a() == false) goto L7;
        return;
    L7:
        if (getCallback() == null) goto L12;
        this.f37005e.start();
        return;
    }

    public void f() {
        if (this.f37005e != null) goto L5;
        return;
    L5:
        if (a() == false) goto L9;
        this.f37005e.cancel();
        return;
    }

    public final void g() {
        Rect r02 = getBounds();
        int r1 = r02.width();
        int r03 = r02.height();
        if (r1 == 0) goto L25;
        if (r03 == 0) goto L26;
        b r2 = this.f37006f;
        if (r2 == null) goto L27;
        int r12 = r2.d(r1);
        int r04 = this.f37006f.a(r03);
        b r22 = this.f37006f;
        boolean r4 = true;
        if (r22.f36986g == 1) goto L22;
        int r23 = r22.d;
        if (r23 != 1) goto L13;
    L16:
        if (r4 == false) goto L18;
        r12 = 0;
    L18:
        if (r4 == true) goto L21;
        r04 = 0;
    L21:
        float r6 = r04;
        b r05 = this.f37006f;
        Shader r24 = new LinearGradient(0.0f, 0.0f, r12, r6, r05.f36982b, r05.f36981a, Shader.TileMode.CLAMP);
    L23:
        this.f37003b.setShader(r24);
        return;
    L13:
        if (r23 == 3) goto L16;
        r4 = false;
        goto L16
    L22:
        float r5 = r04 / 2.0f;
        float r62 = (float) (Math.max(r12, r04) / Math.sqrt(2.0d));
        b r06 = this.f37006f;
        r24 = new RadialGradient(r12 / 2.0f, r5, r62, r06.f36982b, r06.f36981a, Shader.TileMode.CLAMP);
        goto L23
    L27:
        return;
    L26:
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        b r02 = this.f37006f;
        if (r02 != null) goto L5;
        return -1;
    L5:
        if (r02.f36994o == false) goto L7;
        return -3;
    L7:
        if (r02.f36996q == false) goto L13;
        return -3;
    L13:
        return -1;
    }

    public final void h() {
        if (this.f37006f == null) goto L14;
        ValueAnimator r1 = this.f37005e;
        if (r1 == null) goto L8;
        boolean r12 = r1.isStarted();
        this.f37005e.cancel();
        this.f37005e.removeAllUpdateListeners();
    L9:
        b r2 = this.f37006f;
        ValueAnimator r02 = ValueAnimator.ofFloat(new float[]{0.0f, (r2.f37000u / r2.f36999t) + 1.0f});
        this.f37005e = r02;
        r02.setRepeatMode(this.f37006f.f36998s);
        this.f37005e.setRepeatCount(this.f37006f.f36997r);
        ValueAnimator r03 = this.f37005e;
        b r22 = this.f37006f;
        r03.setDuration(r22.f36999t + r22.f37000u);
        this.f37005e.addUpdateListener(this.f37002a);
        if (r12 == false) goto L13;
        this.f37005e.start();
        return;
    L13:
        return;
    L8:
        r12 = false;
        goto L9
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect r4) {
        super.onBoundsChange(r4);
        int r02 = r4.width();
        int r42 = r4.height();
        this.f37004c.set(0, 0, r02, r42);
        g();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r1) {
    }
}
