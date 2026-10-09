package com.stockbit.referral.ui.spinningwheel;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 d2\u00020\u0001:\u0001dB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010:\u001a\u00020;H\u0002J\u0014\u0010<\u001a\u00020;2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908J\u000e\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020\u000bJ\u000e\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020\u000bJ\u0010\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u00020CH\u0014J\u001a\u0010D\u001a\u00020;2\b\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010>\u001a\u00020\u000bH\u0002J\u0018\u0010E\u001a\u00020;2\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000bH\u0014J \u0010H\u001a\u00020;2\u0006\u0010B\u001a\u00020C2\u0006\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u000bH\u0002J\u000e\u0010N\u001a\u00020;2\u0006\u0010O\u001a\u00020\u000bJ\u000e\u0010P\u001a\u00020;2\u0006\u0010M\u001a\u00020\u000bJ\u001e\u0010P\u001a\u00020;2\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\u0019J\u000e\u0010X\u001a\u00020;2\u0006\u0010Y\u001a\u00020\u0019J\u0010\u0010Z\u001a\u00020\u00192\u0006\u0010[\u001a\u00020\\H\u0016J \u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020#2\u0006\u0010`\u001a\u00020#H\u0002J\b\u0010a\u001a\u00020\u000bH\u0002J\u0010\u0010b\u001a\u00020\u00192\u0006\u0010c\u001a\u00020#H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001a\u00101\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020908X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010S\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006e"}, d2 = {"Lcom/stockbit/referral/ui/spinningwheel/SpinningWheelView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mRange", "Landroid/graphics/RectF;", "mRadius", "", "mArcPaint", "Landroid/graphics/Paint;", "mBackgroundPaint", "mTextPaint", "Landroid/text/TextPaint;", "mStartAngle", "", "mCenter", "mPadding", "mTopTextPadding", "mSecondaryTextSize", "mRoundOfNumber", "isRunning", "", "defaultBackgroundColor", "textColor", "predeterminedNumber", "viewRotation", "getViewRotation", "()F", "setViewRotation", "(F)V", "fingerRotation", "", "getFingerRotation", "()D", "setFingerRotation", "(D)V", "downPressTime", "", "getDownPressTime", "()J", "setDownPressTime", "(J)V", "upPressTime", "getUpPressTime", "setUpPressTime", "newRotationStore", "", "getNewRotationStore", "()[D", "setNewRotationStore", "([D)V", "spinningWheelItems", "", "Lcom/stockbit/referral/ui/spinningwheel/SpinningWheelItemView;", "init", "", "setData", "setPieBackgroundColor", Constants.KEY_COLOR, "setTextSize", "size", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawBackgroundColor", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "drawSecondaryText", "tmpAngle", "message", "", "getAngleOfIndexTarget", FirebaseAnalytics.Param.INDEX, "setRound", "numberOfRound", "rotateTo", "rotation", "startSlow", "touchSpinEnabled", "getTouchSpinEnabled", "()Z", "setTouchSpinEnabled", "(Z)V", "setTouchEnabled", "touchEnabled", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "newRotationValue", "originalWheenRotation", "originalFingerRotation", "newFingerRotation", "getFallBackRandomIndex", "isRotationConsistent", "newRotValue", "Companion", "referral_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SpinningWheelView extends View {

    /* renamed from: w, reason: collision with root package name */
    public static final a f129056w = null;

    /* renamed from: a, reason: collision with root package name */
    public RectF f129057a;

    /* renamed from: b, reason: collision with root package name */
    public int f129058b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f129059c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f129060e;

    /* renamed from: f, reason: collision with root package name */
    public final float f129061f;

    /* renamed from: g, reason: collision with root package name */
    public int f129062g;

    /* renamed from: h, reason: collision with root package name */
    public int f129063h;

    /* renamed from: i, reason: collision with root package name */
    public final int f129064i;

    /* renamed from: j, reason: collision with root package name */
    public int f129065j;

    /* renamed from: k, reason: collision with root package name */
    public int f129066k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f129067l;

    /* renamed from: m, reason: collision with root package name */
    public int f129068m;

    /* renamed from: n, reason: collision with root package name */
    public final int f129069n;

    /* renamed from: o, reason: collision with root package name */
    public final int f129070o;

    /* renamed from: p, reason: collision with root package name */
    public float f129071p;

    /* renamed from: q, reason: collision with root package name */
    public double f129072q;

    /* renamed from: r, reason: collision with root package name */
    public long f129073r;

    /* renamed from: s, reason: collision with root package name */
    public long f129074s;

    /* renamed from: t, reason: collision with root package name */
    public double[] f129075t;

    /* renamed from: u, reason: collision with root package name */
    public List f129076u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f129077v;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SpinningWheelView f129078a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f129079b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f129080c;

        public b(SpinningWheelView r1, int r2, int r3) {
            this.f129078a = r1;
            this.f129079b = r2;
            this.f129080c = r3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator r2) {
            p.l(r2, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator r4) {
            p.l(r4, "animation");
            SpinningWheelView.a(this.f129078a, false);
            this.f129078a.setRotation(0.0f);
            this.f129078a.i(this.f129079b, this.f129080c, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator r2) {
            p.l(r2, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator r2) {
            p.l(r2, "animation");
            SpinningWheelView.a(this.f129078a, true);
        }
    }

    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SpinningWheelView f129081a;

        public c(SpinningWheelView r1) {
            this.f129081a = r1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator r2) {
            p.l(r2, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator r3) {
            p.l(r3, "animation");
            SpinningWheelView.a(this.f129081a, false);
            SpinningWheelView r32 = this.f129081a;
            r32.setRotation(r32.getRotation() % 360.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator r2) {
            p.l(r2, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator r2) {
            p.l(r2, "animation");
            SpinningWheelView.a(this.f129081a, true);
        }
    }

    static {
        f129056w = new a(null);
    }

    public SpinningWheelView(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.f129057a = new RectF();
        this.f129066k = 4;
        this.f129070o = -1;
        this.f129075t = new double[3];
        this.f129076u = new ArrayList();
        this.f129077v = true;
    }

    public static final /* synthetic */ void a(SpinningWheelView r02, boolean r1) {
        r02.f129067l = r1;
    }

    private final int getFallBackRandomIndex() {
        return new SecureRandom().nextInt(this.f129076u.size() - 1);
    }

    public final void b(Canvas r5, int r6) {
        if (r6 == 0) goto L7;
        if (r5 == null) goto L8;
        Paint r02 = new Paint();
        r02.setColor(r6);
        int r62 = this.f129062g;
        r5.drawCircle(r62, r62, r62 - 5.0f, r02);
        this.d = r02;
        return;
    L8:
        return;
    }

    public final void c(Canvas r13, float r14, String r15) {
        r13.save();
        int r02 = this.f129076u.size();
        Typeface r1 = Typeface.create(Typeface.SANS_SERIF, 1);
        TextPaint r2 = this.f129060e;
        p.i(r2);
        r2.setColor(-1);
        r2.setTypeface(r1);
        r2.setTextSize(this.f129065j);
        r2.setTextAlign(Paint.Align.RIGHT);
        TextPaint r12 = this.f129060e;
        p.i(r12);
        float r16 = r12.measureText(r15);
        float r03 = r02;
        float r142 = r14 + ((360.0f / r03) / 2);
        double r8 = (float) ((r142 * 3.141592653589793d) / SubsamplingScaleImageView.ORIENTATION_180);
        int r22 = (int) (this.f129062g + (((this.f129058b / 2) / 2) * Math.cos(r8)));
        float r23 = r22;
        float r3 = (int) (this.f129062g + (((this.f129058b / 2) / 2) * Math.sin(r8)));
        RectF r4 = new RectF((r23 + r16) + 150, r3, r23 - r16, r3);
        Path r82 = new Path();
        r82.addRect(r4, Path.Direction.CW);
        r82.close();
        r13.rotate(r142 + (r03 / 18.0f), r23, r3);
        TextPaint r143 = this.f129060e;
        p.i(r143);
        float r10 = r143.getTextSize() / 2.75f;
        TextPaint r11 = this.f129060e;
        p.i(r11);
        r13.drawTextOnPath(r15, r82, this.f129064i - 5.0f, r10, r11);
        r13.restore();
    }

    public final float d(int r3) {
        return (360.0f / this.f129076u.size()) * r3;
    }

    public final void e() {
        Paint r02 = new Paint();
        r02.setAntiAlias(true);
        r02.setDither(true);
        this.f129059c = r02;
        TextPaint r03 = new TextPaint();
        r03.setAntiAlias(true);
        this.f129060e = r03;
        if (this.f129069n == 0) goto L5;
        p.i(r03);
        r03.setColor(this.f129069n);
    L5:
        TextPaint r04 = this.f129060e;
        if (r04 == null) goto L8;
        r04.setTextSize(TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
    L8:
        int r1 = this.f129063h;
        int r4 = this.f129058b;
        this.f129057a = new RectF(r1, r1, r1 + r4, r1 + r4);
    }

    public final boolean f(double r11) {
        double[] r02 = this.f129075t;
        if (Double.compare(r02[2], r02[1]) == 0) goto L5;
        double[] r03 = this.f129075t;
        r03[2] = r03[1];
    L5:
        double[] r04 = this.f129075t;
        if (Double.compare(r04[1], r04[0]) == 0) goto L8;
        double[] r05 = this.f129075t;
        r05[1] = r05[0];
    L8:
        double[] r06 = this.f129075t;
        r06[0] = r11;
        if (Double.compare(r06[2], r11) == 0) goto L23;
        double[] r112 = this.f129075t;
        if (Double.compare(r112[1], r112[0]) == 0) goto L23;
        double[] r113 = this.f129075t;
        if (Double.compare(r113[2], r113[1]) == 0) goto L23;
        double[] r114 = this.f129075t;
        double r2 = r114[0];
        double r6 = r114[1];
        if (r2 <= r6) goto L19;
        if (r6 < r114[2]) goto L23;
    L19:
        if (r2 < r6) goto L21;
    L22:
        return true;
    L21:
        if (r6 <= r114[2]) goto L22;
    L23:
        return false;
    }

    public final float g(float r1, double r2, double r4) {
        return ((r1 + ((float) (r4 - r2))) + 360.0f) % 360.0f;
    }

    public final long getDownPressTime() {
        return this.f129073r;
    }

    public final double getFingerRotation() {
        return this.f129072q;
    }

    public final double[] getNewRotationStore() {
        return this.f129075t;
    }

    public final boolean getTouchSpinEnabled() {
        return this.f129077v;
    }

    public final long getUpPressTime() {
        return this.f129074s;
    }

    public final float getViewRotation() {
        return this.f129071p;
    }

    public final void h(int r3) {
        i(r3, (new SecureRandom().nextInt() * 3) % 2, true);
    }

    public final void i(int r7, int r8, boolean r9) {
        if (this.f129067l == false) goto L6;
        return;
    L6:
        if (r8 > 0) goto L8;
        int r1 = 1;
    L10:
        if (getRotation() != 0.0f) goto L15;
        if (r1 >= 0) goto L13;
        this.f129066k++;
    L13:
        animate().setInterpolator(new DecelerateInterpolator()).setDuration((this.f129066k * 1000) + 900).setListener(new c(this)).rotation(((((this.f129066k * 360.0f) * r1) + 270.0f) - d(r7)) - ((360.0f / this.f129076u.size()) / 2)).start();
        return;
    L15:
        setRotation(getRotation() % 360.0f);
        if (r9 == false) goto L18;
        TimeInterpolator r92 = new AccelerateInterpolator();
    L20:
        if (getRotation() <= 200.0f) goto L22;
        float r02 = 2.0f;
    L23:
        animate().setInterpolator(r92).setDuration(500).setListener(new b(this, r7, r8)).rotation((r02 * 360.0f) * r1).start();
        return;
    L22:
        r02 = 1.0f;
        goto L23
    L18:
        r92 = new LinearInterpolator();
        goto L20
    L8:
        r1 = -1;
        goto L10
    }

    @Override // android.view.View
    public void onDraw(Canvas r10) {
        p.l(r10, "canvas");
        super.onDraw(r10);
        if (this.f129076u.size() == 0) goto L18;
        b(r10, this.f129068m);
        e();
        float r02 = this.f129061f;
        float r6 = 360.0f / this.f129076u.size();
        Iterator r1 = this.f129076u.iterator();
        float r5 = r02;
    L7:
        if (r1.hasNext() == false) goto L22;
        com.stockbit.referral.ui.spinningwheel.a r03 = (com.stockbit.referral.ui.spinningwheel.a) r1.next();
        if (r03.a() == 0) goto L13;
        Paint r8 = this.f129059c;
        if (r8 == null) goto L13;
        r8.setStyle(Paint.Style.FILL);
        r8.setColor(r03.a());
        Canvas r3 = r10;
        r3.drawArc(this.f129057a, r5, r6, true, r8);
    L15:
        if (TextUtils.isEmpty(r03.b()) == true) goto L17;
        c(r3, r5, r03.b());
    L17:
        r5 = r5 + r6;
        r10 = r3;
    L13:
        r3 = r10;
        goto L15
    L22:
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        int r12 = Math.min(getMeasuredWidth(), getMeasuredHeight());
        if (getPaddingLeft() != 0) goto L5;
        int r22 = 50;
    L6:
        this.f129063h = r22;
        this.f129058b = r12 - (r22 * 2);
        this.f129062g = r12 / 2;
        setMeasuredDimension(r12, r12);
        return;
    L5:
        r22 = getPaddingLeft();
        goto L6
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent r19) {
        p.l(r19, NotificationCompat.CATEGORY_EVENT);
        if (this.f129067l == false) goto L5;
    L64:
        return false;
    L5:
        if (this.f129077v == false) goto L64;
        float r1 = r19.getX();
        float r2 = r19.getY();
        float r3 = getWidth() / 2.0f;
        float r5 = getHeight() / 2.0f;
        int r4 = r19.getAction();
        if (r4 == 0) goto L62;
        if (r4 != 1) goto L11;
        double r42 = Math.toDegrees(Math.atan2(r1 - r3, r5 - r2));
        float r12 = g(this.f129071p, this.f129072q, r42);
        this.f129072q = r42;
        long r22 = r19.getEventTime();
        this.f129074s = r22;
        long r43 = this.f129073r;
        if ((r22 - r43) <= 700) goto L22;
        return true;
    L22:
        if (r12 > (-250.0f)) goto L25;
        r12 = r12 + 360.0f;
    L27:
        double r10 = r12;
        float r13 = this.f129071p;
        double r122 = r10 - r13;
        if (r122 >= 200.0d) goto L32;
        if (r122 <= (-200.0d)) goto L32;
    L37:
        double r102 = r10 - this.f129071p;
        if (r102 > (-60.0d)) goto L40;
    L45:
        int r14 = this.f129070o;
        if (r14 <= (-1)) goto L48;
        i(r14, 1, false);
    L50:
        if (r102 < 60.0d) goto L52;
    L57:
        int r15 = this.f129070o;
        if (r15 <= (-1)) goto L60;
        i(r15, 0, false);
    L61:
        return true;
    L60:
        i(getFallBackRandomIndex(), 0, false);
        goto L61
    L52:
        if (r102 <= 0.0d) goto L61;
        if (r102 > 59.0d) goto L61;
        if ((this.f129074s - this.f129073r) > 200) goto L61;
    L48:
        i(getFallBackRandomIndex(), 1, false);
        goto L50
    L40:
        if (r102 >= 0.0d) goto L50;
        if (r102 < (-59.0d)) goto L50;
        if ((r22 - r43) > 200) goto L50;
    L32:
        if (r13 > (-50.0f)) goto L35;
        this.f129071p = r13 + 360.0f;
        goto L37
    L35:
        if (r13 < 50.0f) goto L37;
        this.f129071p = r13 - 360.0f;
        goto L37
    L25:
        if (r12 < 250.0f) goto L27;
        r12 = r12 - 360.0f;
        goto L27
    L11:
        if (r4 != 2) goto L13;
        double r44 = Math.toDegrees(Math.atan2(r1 - r3, r5 - r2));
        if (f(r44) == false) goto L17;
        setRotation(g(this.f129071p, this.f129072q, r44));
    L17:
        return true;
    L13:
        return super.onTouchEvent(r19);
    L62:
        this.f129071p = (getRotation() + 360.0f) % 360.0f;
        this.f129072q = Math.toDegrees(Math.atan2(r1 - r3, r5 - r2));
        this.f129073r = r19.getEventTime();
        return true;
    }

    public final void setData(List<com.stockbit.referral.ui.spinningwheel.a> r2) {
        p.l(r2, "spinningWheelItems");
        this.f129076u = r2;
        invalidate();
    }

    public final void setDownPressTime(long r1) {
        this.f129073r = r1;
    }

    public final void setFingerRotation(double r1) {
        this.f129072q = r1;
    }

    public final void setNewRotationStore(double[] r2) {
        p.l(r2, "<set-?>");
        this.f129075t = r2;
    }

    public final void setPieBackgroundColor(int r1) {
        this.f129068m = r1;
        invalidate();
    }

    public final void setRound(int r1) {
        this.f129066k = r1;
    }

    public final void setTextSize(int r1) {
        this.f129065j = r1;
        invalidate();
    }

    public final void setTouchEnabled(boolean r1) {
        this.f129077v = r1;
    }

    public final void setTouchSpinEnabled(boolean r1) {
        this.f129077v = r1;
    }

    public final void setUpPressTime(long r1) {
        this.f129074s = r1;
    }

    public final void setViewRotation(float r1) {
        this.f129071p = r1;
    }
}
