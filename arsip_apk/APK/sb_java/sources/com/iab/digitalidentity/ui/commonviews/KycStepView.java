package com.iab.digitalidentity.ui.commonviews;

import I0.G;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.iab.digitalidentity.k;
import com.iab.digitalidentity.l;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00014B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0013R*\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0013R*\u0010!\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u0013R*\u0010%\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u0013R*\u0010)\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u0013R$\u0010,\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u0013R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/iab/digitalidentity/ui/commonviews/KycStepView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getLineY", "()I", "getEndLinePosition", "getStartLinePosition", "stepsNumber", "Lkotlin/w;", "setStepsNumber", "(I)V", "value", "a", "I", "getCurrentStep", "setCurrentStep", "currentStep", "b", "getStepPadding", "setStepPadding", "stepPadding", "c", "getStepLineHeight", "setStepLineHeight", "stepLineHeight", Constants.INAPP_DATA_TAG, "getNextStepLineColor", "setNextStepLineColor", "nextStepLineColor", "e", "getDoneStepLineColor", "setDoneStepLineColor", "doneStepLineColor", "getStepsCount", "setStepsCount", "stepsCount", "LI0/G;", "onStepChangeListener", "LI0/G;", "getOnStepChangeListener", "()LI0/G;", "setOnStepChangeListener", "(LI0/G;)V", "I0/j", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycStepView extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f40646a;

    /* renamed from: b, reason: collision with root package name */
    public int f40647b;

    /* renamed from: c, reason: collision with root package name */
    public int f40648c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f40649e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f40650f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f40651g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f40652h;

    /* renamed from: i, reason: collision with root package name */
    public int f40653i;

    public KycStepView(Context r2) {
        p.l(r2, "context");
        super(r2);
        this.f40652h = new Paint(1);
    }

    private final int getEndLinePosition() {
        return getMeasuredWidth() - getPaddingRight();
    }

    private final int getLineY() {
        int r02 = ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
        int r1 = getTop();
        int r03 = r02 / 2;
        return r03 + (getPaddingTop() + r1);
    }

    private final int getStartLinePosition() {
        return getPaddingLeft();
    }

    private final void setCurrentStep(int r1) {
        this.f40646a = r1;
    }

    private final void setStepsNumber(int r1) {
        this.f40653i = r1;
        invalidate();
    }

    public final void a(int r2) {
        if (r2 >= 0) goto L4;
        return;
    L4:
        if (r2 >= this.f40653i) goto L8;
        setCurrentStep(r2);
        invalidate();
        return;
    }

    public final int getCurrentStep() {
        return this.f40646a;
    }

    public final int getDoneStepLineColor() {
        return this.f40649e;
    }

    public final int getNextStepLineColor() {
        return this.d;
    }

    public final G getOnStepChangeListener() {
        return null;
    }

    public final int getStepLineHeight() {
        return this.f40648c;
    }

    public final int getStepPadding() {
        return this.f40647b;
    }

    public final int getStepsCount() {
        return this.f40653i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r13) {
        p.l(r13, "canvas");
        if (getHeight() != 0) goto L6;
        return;
    L6:
        if (this.f40653i <= 0) goto L27;
        int[] r02 = this.f40651g;
        if (r02 != null) goto L10;
        p.D("startLinesX");
        r02 = null;
    L10:
        int r03 = r02.length;
        int r3 = 0;
    L11:
        if (r3 >= r03) goto L33;
        int[] r4 = this.f40651g;
        if (r4 != null) goto L15;
        p.D("startLinesX");
        r4 = null;
    L15:
        int[] r5 = this.f40650f;
        if (r5 != null) goto L18;
        p.D("endLinesX");
        r5 = null;
    L18:
        Paint r11 = this.f40652h;
        if (r13 == null) goto L25;
        int r6 = this.f40646a;
        if (r3 > r6) goto L23;
        r11.setColor(this.f40649e);
        r11.setStrokeWidth(this.f40648c);
        r11.setStrokeCap(Paint.Cap.ROUND);
        Canvas r62 = r13;
        r62.drawLine(r4[r3], getLineY(), r5[r3], getLineY(), r11);
    L26:
        r3 = r3 + 1;
        r13 = r62;
        goto L11
    L23:
        if (r3 <= r6) goto L25;
        r11.setColor(this.d);
        r11.setStrokeWidth(this.f40648c);
        r11.setStrokeCap(Paint.Cap.ROUND);
        r62 = r13;
        r62.drawLine(r4[r3], getLineY(), r5[r3], getLineY(), r11);
    L25:
        r62 = r13;
        goto L26
    L33:
        return;
    }

    @Override // android.view.View
    public final void onMeasure(int r12, int r13) {
        int r122 = View.MeasureSpec.getSize(r12);
        int r02 = this.f40653i;
        if (r02 != 0) goto L6;
        setMeasuredDimension(r122, 0);
        return;
    L6:
        if (r122 != 0) goto L9;
        setMeasuredDimension(r122, 0);
        return;
    L9:
        float[] r2 = new float[r02];
        r2[0] = r122 / r02;
        int r4 = 1;
    L10:
        if (r4 >= r02) goto L12;
        int r6 = r4 + 1;
        r2[r4] = r2[0] * r6;
        r4 = r6;
        goto L10
    L12:
        int r03 = View.MeasureSpec.getSize(r13);
        int r132 = View.MeasureSpec.getMode(r13);
        int r42 = getPaddingBottom() + getPaddingTop();
        if (this.f40653i <= 0) goto L16;
        r42 = r42 + View.MeasureSpec.getSize(this.f40648c);
    L16:
        if (r132 == Integer.MIN_VALUE) goto L22;
        if (r132 != 0) goto L19;
        r03 = r42;
    L23:
        setMeasuredDimension(r122, r03);
        int r123 = this.f40653i;
        int[] r133 = new int[r123];
        this.f40651g = r133;
        this.f40650f = new int[r123];
        int r124 = this.f40647b;
        r133[0] = getStartLinePosition();
        int[] r134 = this.f40650f;
        if (r134 != null) goto L26;
        p.D("endLinesX");
        r134 = null;
    L26:
        r134[this.f40653i - 1] = getEndLinePosition();
        int[] r135 = this.f40650f;
        if (r135 != null) goto L29;
        p.D("endLinesX");
        r135 = null;
    L29:
        int r136 = r135[this.f40653i - 1];
        int[] r43 = this.f40651g;
        if (r43 != null) goto L32;
        p.D("startLinesX");
        r43 = null;
    L32:
        int r137 = r136 - r43[0];
        int r44 = this.f40653i;
        int r138 = (r137 - ((r44 - 1) * r124)) / r44;
        int[] r45 = this.f40650f;
        if (r45 != null) goto L35;
        p.D("endLinesX");
        r45 = null;
    L35:
        int[] r62 = this.f40651g;
        if (r62 != null) goto L38;
        p.D("startLinesX");
        r62 = null;
    L38:
        r45[0] = r62[0] + r138;
        int r46 = this.f40653i;
        int r63 = 1;
    L39:
        if (r63 >= r46) goto L61;
        int[] r7 = this.f40651g;
        if (r7 != null) goto L43;
        p.D("startLinesX");
        r7 = null;
    L43:
        int[] r8 = this.f40651g;
        if (r8 != null) goto L46;
        p.D("startLinesX");
        r8 = null;
    L46:
        int r82 = r8[r63 - 1] + r138;
        if (r63 != this.f40653i) goto L49;
        int r9 = 0;
    L50:
        r7[r63] = r82 + r9;
        int[] r72 = this.f40650f;
        if (r72 != null) goto L53;
        p.D("endLinesX");
        r72 = null;
    L53:
        int r83 = this.f40653i - r63;
        if (r63 <= 1) goto L59;
        int[] r92 = this.f40650f;
        if (r92 != null) goto L58;
        p.D("endLinesX");
        r92 = null;
    L58:
        int r93 = (r92[(this.f40653i - r63) + 1] - r138) - r124;
    L60:
        r72[r83] = r93;
        r63 = r63 + 1;
        goto L39
    L59:
        r93 = getEndLinePosition();
        goto L60
    L49:
        r9 = r124;
        goto L50
    L61:
        return;
    L19:
        if (r132 == 1073741824) goto L23;
        r03 = 0;
        goto L23
    L22:
        r03 = Math.min(r42, r03);
        goto L23
    }

    public final void setDoneStepLineColor(int r1) {
        this.f40649e = r1;
        invalidate();
    }

    public final void setNextStepLineColor(int r1) {
        this.d = r1;
        invalidate();
    }

    public final void setOnStepChangeListener(G r1) {
    }

    public final void setStepLineHeight(int r1) {
        this.f40648c = r1;
        requestLayout();
        invalidate();
    }

    public final void setStepPadding(int r1) {
        this.f40647b = r1;
        requestLayout();
        invalidate();
    }

    public final void setStepsCount(int r1) {
        this.f40653i = r1;
        requestLayout();
        invalidate();
    }

    public KycStepView(Context r2, AttributeSet r3) {
        p.l(r2, "context");
        p.l(r3, "attrs");
        this(r2, r3, com.iab.digitalidentity.c.f39620G);
    }

    public KycStepView(Context r3, AttributeSet r4, int r5) {
        p.l(r3, "context");
        p.l(r4, "attrs");
        super(r3, r4, r5);
        Paint r02 = new Paint(1);
        this.f40652h = r02;
        r02.setTextAlign(Paint.Align.CENTER);
        TypedArray r32 = r3.obtainStyledAttributes(r4, l.f40076y, r5, k.J1);
        p.k(r32, "context.obtainStyledAttr…ttr, R.style.KycStepView)");
        setStepPadding(r32.getDimensionPixelSize(l.f40051D, 0));
        setDoneStepLineColor(r32.getColor(l.f40048A, 0));
        setNextStepLineColor(r32.getColor(l.f40049B, 0));
        setStepLineHeight(r32.getDimensionPixelSize(l.f40050C, 0));
        this.f40653i = r32.getInteger(l.f40052E, 0);
        setBackground(r32.getDrawable(l.f40077z));
        Drawable r42 = getBackground();
        if (r42 == null) goto L5;
        setBackgroundDrawable(r42);
    L5:
        r32.recycle();
        if (isInEditMode() == false) goto L9;
        setStepsNumber(this.f40653i);
        return;
    }
}
