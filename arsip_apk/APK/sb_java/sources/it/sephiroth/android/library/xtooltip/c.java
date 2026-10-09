package it.sephiroth.android.library.xtooltip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.firebase.perf.util.Constants;
import com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed.ErrorCode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class c extends Drawable {

    /* renamed from: o, reason: collision with root package name */
    public static final C1860c f177079o = null;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f177080a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f177081b;

    /* renamed from: c, reason: collision with root package name */
    public float f177082c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public final AnimatorSet f177083e;

    /* renamed from: f, reason: collision with root package name */
    public final AnimatorSet f177084f;

    /* renamed from: g, reason: collision with root package name */
    public final ValueAnimator f177085g;

    /* renamed from: h, reason: collision with root package name */
    public final ValueAnimator f177086h;

    /* renamed from: i, reason: collision with root package name */
    public int f177087i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f177088j;

    /* renamed from: k, reason: collision with root package name */
    public final int f177089k;

    /* renamed from: l, reason: collision with root package name */
    public final int f177090l;

    /* renamed from: m, reason: collision with root package name */
    public int f177091m;

    /* renamed from: n, reason: collision with root package name */
    public long f177092n;

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f177093a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f177094b;

        public a(c r1) {
            this.f177094b = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator r2) {
            p.m(r2, "animation");
            super.onAnimationCancel(r2);
            this.f177093a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator r2) {
            p.m(r2, "animation");
            if (this.f177093a == false) goto L5;
            return;
        L5:
            if (this.f177094b.isVisible() == false) goto L11;
            c r22 = this.f177094b;
            c.e(r22, c.c(r22) + 1);
            if (c.c(r22) >= c.b(this.f177094b)) goto L12;
            c.a(this.f177094b).start();
            return;
        L12:
            return;
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f177095a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f177096b;

        public b(c r1) {
            this.f177096b = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator r2) {
            p.m(r2, "animation");
            super.onAnimationCancel(r2);
            this.f177095a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator r3) {
            p.m(r3, "animation");
            if (this.f177095a == false) goto L5;
            return;
        L5:
            if (this.f177096b.isVisible() == true) goto L7;
            return;
        L7:
            if (c.c(this.f177096b) >= c.b(this.f177096b)) goto L12;
            c.d(this.f177096b).setStartDelay(0);
            c.d(this.f177096b).start();
            return;
        }
    }

    /* renamed from: it.sephiroth.android.library.xtooltip.c$c, reason: collision with other inner class name */
    public static final class C1860c {
        public C1860c() {
        }

        public /* synthetic */ C1860c(i r1) {
            this();
        }
    }

    static {
        f177079o = new C1860c(null);
    }

    public c(Context r18, int r19) {
        p.m(r18, "context");
        Paint r3 = new Paint(1);
        this.f177080a = r3;
        Paint r6 = new Paint(1);
        this.f177081b = r6;
        this.f177091m = 1;
        this.f177092n = 400;
        Paint.Style r7 = Paint.Style.FILL;
        r3.setStyle(r7);
        r6.setStyle(r7);
        TypedArray r32 = r18.getTheme().obtainStyledAttributes(r19, it.sephiroth.android.library.xtooltip.b.f177045Q);
        p.h(r32, "array");
        int r4 = r32.getIndexCount();
        int r72 = 0;
    L3:
        if (r72 >= r4) goto L17;
        int r8 = r32.getIndex(r72);
        if (r8 != it.sephiroth.android.library.xtooltip.b.f177047S) goto L8;
        int r82 = r32.getColor(r8, 0);
        this.f177080a.setColor(r82);
        this.f177081b.setColor(r82);
    L16:
        r72 = r72 + 1;
        goto L3
    L8:
        if (r8 != it.sephiroth.android.library.xtooltip.b.f177050V) goto L11;
        this.f177091m = r32.getInt(r8, 1);
        goto L16
    L11:
        if (r8 != it.sephiroth.android.library.xtooltip.b.f177048T) goto L14;
        int r83 = (int) (r32.getFloat(r8, this.f177081b.getAlpha() / 255.0f) * Constants.MAX_HOST_LENGTH);
        this.f177081b.setAlpha(r83);
        this.f177080a.setAlpha(r83);
        goto L16
    L14:
        if (r8 != it.sephiroth.android.library.xtooltip.b.f177049U) goto L16;
        this.f177092n = r32.getInt(r8, ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE);
        goto L16
    L17:
        r32.recycle();
        int r33 = g();
        this.f177089k = r33;
        int r42 = f();
        this.f177090l = r42;
        ObjectAnimator r73 = ObjectAnimator.ofInt(this, "outerAlpha", new int[]{0, r33});
        p.h(r73, "ObjectAnimator.ofInt(thi…erAlpha\", 0, mOuterAlpha)");
        r73.setDuration((long) (this.f177092n * 0.3d));
        ObjectAnimator r34 = ObjectAnimator.ofInt(this, "outerAlpha", new int[]{r33, 0, 0});
        p.h(r34, "ObjectAnimator.ofInt(thi…lpha\", mOuterAlpha, 0, 0)");
        r34.setStartDelay((long) (this.f177092n * 0.55d));
        r34.setDuration((long) (this.f177092n * 0.44999999999999996d));
        ObjectAnimator r84 = ObjectAnimator.ofFloat(this, "outerRadius", new float[]{0.0f, 1.0f});
        p.h(r84, "ObjectAnimator.ofFloat(t…s, \"outerRadius\", 0f, 1f)");
        this.f177085g = r84;
        r84.setDuration(this.f177092n);
        AnimatorSet r9 = new AnimatorSet();
        this.f177083e = r9;
        r9.playTogether(new Animator[]{r73, r84, r34});
        r9.setInterpolator(new AccelerateDecelerateInterpolator());
        r9.setDuration(this.f177092n);
        ObjectAnimator r35 = ObjectAnimator.ofInt(this, "innerAlpha", new int[]{0, r42});
        p.h(r35, "ObjectAnimator.ofInt(thi…erAlpha\", 0, mInnerAlpha)");
        r35.setDuration((long) (this.f177092n * 0.3d));
        ObjectAnimator r43 = ObjectAnimator.ofInt(this, "innerAlpha", new int[]{r42, 0, 0});
        p.h(r43, "ObjectAnimator.ofInt(thi…lpha\", mInnerAlpha, 0, 0)");
        r43.setStartDelay((long) (this.f177092n * 0.55d));
        r43.setDuration((long) (this.f177092n * 0.44999999999999996d));
        ObjectAnimator r74 = ObjectAnimator.ofFloat(this, "innerRadius", new float[]{0.0f, 1.0f});
        p.h(r74, "ObjectAnimator.ofFloat(t…s, \"innerRadius\", 0f, 1f)");
        this.f177086h = r74;
        r74.setDuration(this.f177092n);
        AnimatorSet r85 = new AnimatorSet();
        this.f177084f = r85;
        r85.playTogether(new Animator[]{r35, r74, r43});
        r85.setInterpolator(new AccelerateDecelerateInterpolator());
        r85.setStartDelay((long) (this.f177092n * 0.25d));
        r85.setDuration(this.f177092n);
        r9.addListener(new a(this));
        r85.addListener(new b(this));
    }

    public static final /* synthetic */ AnimatorSet a(c r02) {
        return r02.f177083e;
    }

    public static final /* synthetic */ int b(c r02) {
        return r02.f177091m;
    }

    public static final /* synthetic */ int c(c r02) {
        return r02.f177087i;
    }

    public static final /* synthetic */ AnimatorSet d(c r02) {
        return r02.f177084f;
    }

    public static final /* synthetic */ void e(c r02, int r1) {
        r02.f177087i = r1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r5) {
        p.m(r5, "canvas");
        Rect r02 = getBounds();
        float r1 = r02.width() / 2;
        float r03 = r02.height() / 2;
        r5.drawCircle(r1, r03, this.f177082c, this.f177080a);
        r5.drawCircle(r1, r03, this.d, this.f177081b);
    }

    public final int f() {
        return this.f177081b.getAlpha();
    }

    public final int g() {
        return this.f177080a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 96;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 96;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h() {
        this.f177087i = 0;
        this.f177088j = true;
        this.f177083e.start();
        this.f177084f.setStartDelay((long) (this.f177092n * 0.25d));
        this.f177084f.start();
    }

    public final void i() {
        l();
        h();
    }

    public final void j(float r1) {
        this.d = r1;
        invalidateSelf();
    }

    public final void k(float r1) {
        this.f177082c = r1;
        invalidateSelf();
    }

    public final void l() {
        this.f177083e.cancel();
        this.f177084f.cancel();
        this.f177087i = 0;
        this.f177088j = false;
        j(0.0f);
        k(0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect r7) {
        p.m(r7, "bounds");
        timber.log.a.c("onBoundsChange: " + r7, new Object[0]);
        super.onBoundsChange(r7);
        float r72 = (float) (Math.min(r7.width(), r7.height()) / 2);
        this.f177082c = r72;
        this.f177085g.setFloatValues(new float[]{0.0f, r72});
        this.f177086h.setFloatValues(new float[]{0.0f, this.f177082c});
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r1) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
        if (isVisible() == r2) goto L5;
        boolean r02 = true;
    L6:
        if (r2 == false) goto L14;
        if (r3 == false) goto L9;
    L12:
        i();
        return r02;
    L9:
        if (this.f177088j == false) goto L12;
        return r02;
    L14:
        l();
        return r02;
    L5:
        r02 = false;
        goto L6
    }
}
