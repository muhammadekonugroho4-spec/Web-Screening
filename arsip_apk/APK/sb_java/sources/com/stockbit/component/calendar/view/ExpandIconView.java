package com.stockbit.component.calendar.view;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.stockbit.component.calendar.e;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u0000 K2\u00020\u0001:\u0002JKB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010&\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\u0007J\u0012\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\u0013H\u0007J\u0018\u0010*\u001a\u00020'2\b\b\u0001\u0010\n\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0013J\u0018\u0010+\u001a\u00020'2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0013J\u000e\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020.J\u0010\u0010/\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0014J(\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0014J\u0018\u00107\u001a\u00020'2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0002J\u0010\u00108\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0013H\u0002J\b\u00109\u001a\u00020'H\u0002J\u0010\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020\u000eH\u0002J\b\u0010<\u001a\u00020'H\u0002J\u0010\u0010=\u001a\u00020'2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020.2\u0006\u0010;\u001a\u00020\u000eH\u0002J \u0010A\u001a\u00020'2\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u001bH\u0002J\b\u0010I\u001a\u00020'H\u0002R\u0018\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/stockbit/component/calendar/view/ExpandIconView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", RemoteConfigConstants.ResponseFieldKey.STATE, "getState$annotations", "()V", "alpha", "", "centerTranslation", "fraction", "animationSpeed", "switchColor", "", Constants.KEY_COLOR, "colorMore", "colorLess", "colorIntermediate", "paint", "Landroid/graphics/Paint;", "left", "Landroid/graphics/Point;", "right", "center", "tempLeft", "tempRight", "useDefaultPadding", "padding", "path", "Landroid/graphics/Path;", "arrowAnimator", "Landroid/animation/ValueAnimator;", "setColor", "", "switchState", "animate", "setState", "setFraction", "setAnimationDuration", "animationDuration", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "width", "height", "oldWidth", "oldHeight", "calculateArrowMetrics", "updateArrow", "updateArrowPath", "animateArrow", "toAlpha", "cancelAnimation", "updateColor", "colorEvaluator", "Landroid/animation/ArgbEvaluator;", "calculateAnimationDuration", "rotate", "startPosition", "degrees", "", "target", "finalStateByFraction", "getFinalStateByFraction", "()I", "postInvalidateOnAnimationCompat", "State", "Companion", "calendar_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExpandIconView extends View {

    /* renamed from: u, reason: collision with root package name */
    public static final a f69619u = null;

    /* renamed from: a, reason: collision with root package name */
    public int f69620a;

    /* renamed from: b, reason: collision with root package name */
    public float f69621b;

    /* renamed from: c, reason: collision with root package name */
    public float f69622c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f69623e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f69624f;

    /* renamed from: g, reason: collision with root package name */
    public int f69625g;

    /* renamed from: h, reason: collision with root package name */
    public int f69626h;

    /* renamed from: i, reason: collision with root package name */
    public int f69627i;

    /* renamed from: j, reason: collision with root package name */
    public int f69628j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f69629k;

    /* renamed from: l, reason: collision with root package name */
    public final Point f69630l;

    /* renamed from: m, reason: collision with root package name */
    public final Point f69631m;

    /* renamed from: n, reason: collision with root package name */
    public final Point f69632n;

    /* renamed from: o, reason: collision with root package name */
    public final Point f69633o;

    /* renamed from: p, reason: collision with root package name */
    public final Point f69634p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f69635q;

    /* renamed from: r, reason: collision with root package name */
    public int f69636r;

    /* renamed from: s, reason: collision with root package name */
    public final Path f69637s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f69638t;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final ArgbEvaluator f69639a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExpandIconView f69640b;

        public b(ExpandIconView r1) {
            this.f69640b = r1;
            this.f69639a = new ArgbEvaluator();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator r3) {
            p.l(r3, "valueAnimator");
            ExpandIconView r02 = this.f69640b;
            Object r32 = r3.getAnimatedValue();
            p.j(r32, "null cannot be cast to non-null type kotlin.Float");
            ExpandIconView.c(r02, ((Float) r32).floatValue());
            ExpandIconView.d(this.f69640b);
            if (ExpandIconView.a(this.f69640b) == false) goto L5;
            ExpandIconView.e(this.f69640b, this.f69639a);
        L5:
            ExpandIconView.b(this.f69640b);
        }
    }

    static {
        f69619u = new a(null);
    }

    public ExpandIconView(Context r8) {
        p.l(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static final /* synthetic */ boolean a(ExpandIconView r02) {
        return r02.f69624f;
    }

    public static final /* synthetic */ void b(ExpandIconView r02) {
        r02.j();
    }

    public static final /* synthetic */ void c(ExpandIconView r02, float r1) {
        r02.f69621b = r1;
    }

    public static final /* synthetic */ void d(ExpandIconView r02) {
        r02.m();
    }

    public static final /* synthetic */ void e(ExpandIconView r02, ArgbEvaluator r1) {
        r02.n(r1);
    }

    private final int getFinalStateByFraction() {
        if (this.d > 0.5f) goto L6;
        return 0;
    L6:
        return 1;
    }

    private static /* synthetic */ void getState$annotations() {
    }

    public final void f(float r4) {
        i();
        ValueAnimator r02 = ValueAnimator.ofFloat(new float[]{this.f69621b, r4});
        r02.addUpdateListener(new b(this));
        r02.setInterpolator(new DecelerateInterpolator());
        r02.setDuration(g(r4));
        r02.start();
        this.f69638t = r02;
    }

    public final long g(float r3) {
        return (long) (Math.abs(r3 - this.f69621b) / this.f69623e);
    }

    public final void h(int r4, int r5) {
        if (r5 < r4) goto L4;
        int r02 = r4;
    L6:
        if (this.f69635q == false) goto L8;
        this.f69636r = (int) (r02 * 0.16666667f);
    L8:
        int r03 = r02 - (this.f69636r * 2);
        this.f69629k.setStrokeWidth((int) (r03 * 0.1388889f));
        this.f69632n.set(r4 / 2, r5 / 2);
        Point r42 = this.f69630l;
        Point r52 = this.f69632n;
        int r04 = r03 / 2;
        r42.set(r52.x - r04, r52.y);
        Point r43 = this.f69631m;
        Point r53 = this.f69632n;
        r43.set(r53.x + r04, r53.y);
        return;
    L4:
        r02 = r5;
        goto L6
    }

    public final void i() {
        ValueAnimator r02 = this.f69638t;
        if (r02 == null) goto L8;
        p.i(r02);
        if (r02.isRunning() == false) goto L9;
        ValueAnimator r03 = this.f69638t;
        p.i(r03);
        r03.cancel();
        return;
    L9:
        return;
    }

    public final void j() {
        postInvalidateOnAnimation();
    }

    public final void k(Point r9, double r10, Point r12) {
        double r102 = Math.toRadians(r10);
        int r02 = (int) ((this.f69632n.x + ((r9.x - r0) * Math.cos(r102))) - ((r9.y - this.f69632n.y) * Math.sin(r102)));
        Point r1 = this.f69632n;
        r12.set(r02, (int) ((r1.y + ((r9.x - r1.x) * Math.sin(r102))) + ((r9.y - this.f69632n.y) * Math.cos(r102))));
    }

    public final void l(boolean r3) {
        float r02 = (this.d * 90.0f) - 45.0f;
        if (r3 == false) goto L6;
        f(r02);
        return;
    L6:
        i();
        this.f69621b = r02;
        if (this.f69624f == false) goto L9;
        n(new ArgbEvaluator());
    L9:
        m();
        invalidate();
    }

    public final void m() {
        this.f69637s.reset();
        k(this.f69630l, -this.f69621b, this.f69633o);
        k(this.f69631m, this.f69621b, this.f69634p);
        int r02 = this.f69632n.y;
        int r2 = this.f69633o.y;
        this.f69622c = (r02 - r2) / 2;
        this.f69637s.moveTo(r1.x, r2);
        Path r03 = this.f69637s;
        Point r1 = this.f69632n;
        r03.lineTo(r1.x, r1.y);
        Path r04 = this.f69637s;
        Point r12 = this.f69634p;
        r04.lineTo(r12.x, r12.y);
    }

    public final void n(ArgbEvaluator r7) {
        int r02 = this.f69628j;
        float r2 = 45.0f;
        if (r02 == (-1)) goto L15;
        float r1 = this.f69621b;
        if (r1 > 0.0f) goto L7;
        int r4 = this.f69626h;
    L9:
        if (r1 <= 0.0f) goto L13;
        r02 = this.f69627i;
    L13:
        if (r1 > 0.0f) goto L16;
        float r3 = 1 + (r1 / 45.0f);
    L17:
        Object r72 = r7.evaluate(r3, Integer.valueOf(r4), Integer.valueOf(r02));
        p.j(r72, "null cannot be cast to non-null type kotlin.Int");
        int r73 = ((Integer) r72).intValue();
        this.f69625g = r73;
        this.f69629k.setColor(r73);
        return;
    L16:
        r3 = r1 / r2;
        goto L17
    L7:
        r4 = r02;
        goto L9
    L15:
        r4 = this.f69626h;
        r02 = this.f69627i;
        r1 = this.f69621b + 45.0f;
        r2 = 90.0f;
        goto L16
    }

    @Override // android.view.View
    public void onDraw(Canvas r3) {
        p.l(r3, "canvas");
        super.onDraw(r3);
        r3.translate(0.0f, this.f69622c);
        r3.drawPath(this.f69637s, this.f69629k);
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        h(r1, r2);
        m();
    }

    public final void setAnimationDuration(long r2) {
        this.f69623e = 90.0f / r2;
    }

    public final void setColor(int r1) {
        this.f69627i = r1;
        this.f69626h = r1;
        this.f69628j = r1;
        invalidate();
    }

    public final void setFraction(float r4, boolean r5) {
        if (r4 < 0.0f) goto L19;
        if (r4 > 1.0f) goto L19;
        if (this.d != r4) goto L9;
        return;
    L9:
        this.d = r4;
        if (r4 != 0.0f) goto L13;
        int r42 = 0;
    L16:
        this.f69620a = r42;
        l(r5);
        return;
    L13:
        if (r4 != 1.0f) goto L15;
        r42 = 1;
        goto L16
    L15:
        r42 = 2;
    L19:
        throw new IllegalArgumentException(("Fraction value must be from 0 to 1f, fraction=" + r4).toString());
    }

    public final void setState(int r2, boolean r3) {
        this.f69620a = r2;
        if (r2 != 0) goto L5;
        float r22 = 0.0f;
    L10:
        this.d = r22;
        l(r3);
        return;
    L5:
        if (r2 != 1) goto L8;
        r22 = 1.0f;
        goto L10
    L8:
        throw new IllegalArgumentException("Unknown state, must be one of STATE_MORE = 0,  STATE_LESS = 1");
    }

    public ExpandIconView(Context r8, AttributeSet r9) {
        p.l(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    public ExpandIconView(Context r6, AttributeSet r7, int r8) {
        p.l(r6, "context");
        super(r6, r7, r8);
        this.f69621b = -45.0f;
        this.f69625g = -16777216;
        this.f69630l = new Point();
        this.f69631m = new Point();
        this.f69632n = new Point();
        this.f69633o = new Point();
        this.f69634p = new Point();
        this.f69637s = new Path();
        TypedArray r72 = getContext().getTheme().obtainStyledAttributes(r7, e.f69608z0, 0, 0);
        p.k(r72, "obtainStyledAttributes(...)");
        boolean r82 = r72.getBoolean(e.f69531G0, false);     // Catch: Throwable -> L13
        this.f69624f = r72.getBoolean(e.f69533H0, false);     // Catch: Throwable -> L13
        this.f69625g = r72.getColor(e.f69521B0, -16777216);     // Catch: Throwable -> L13
        this.f69626h = r72.getColor(e.f69527E0, -16777216);     // Catch: Throwable -> L13
        this.f69627i = r72.getColor(e.f69525D0, -16777216);     // Catch: Throwable -> L13
        this.f69628j = r72.getColor(e.f69523C0, -1);     // Catch: Throwable -> L13
        long r2 = r72.getInteger(e.f69519A0, 150);     // Catch: Throwable -> L13
        int r62 = r72.getDimensionPixelSize(e.f69529F0, -1);     // Catch: Throwable -> L13
        this.f69636r = r62;     // Catch: Throwable -> L13
        if (r62 != (-1)) goto L6;
        boolean r63 = true;
    L7:
        this.f69635q = r63;     // Catch: Throwable -> L13
        r72.recycle();
        Paint r64 = new Paint(1);
        this.f69629k = r64;
        r64.setColor(this.f69625g);
        this.f69629k.setStyle(Paint.Style.STROKE);
        this.f69629k.setDither(true);
        if (r82 == false) goto L11;
        this.f69629k.setStrokeJoin(Paint.Join.ROUND);
        this.f69629k.setStrokeCap(Paint.Cap.ROUND);
    L11:
        this.f69623e = 90.0f / r2;
        setState(0, false);
        return;
    L6:
        r63 = false;
    L13:
        th = move-exception;
        r72.recycle();
        throw th;
    }

    public /* synthetic */ ExpandIconView(Context r1, AttributeSet r2, int r3, int r4, i r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
