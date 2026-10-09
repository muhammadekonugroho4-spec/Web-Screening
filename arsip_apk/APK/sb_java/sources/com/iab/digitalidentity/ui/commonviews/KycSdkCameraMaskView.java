package com.iab.digitalidentity.ui.commonviews;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bR.\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R*\u0010\u001d\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR.\u0010!\u001a\u0004\u0018\u00010\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR$\u0010&\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/iab/digitalidentity/ui/commonviews/KycSdkCameraMaskView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "value", "a", "Ljava/lang/Integer;", "getOverlayColor", "()Ljava/lang/Integer;", "setOverlayColor", "(Ljava/lang/Integer;)V", "overlayColor", "b", "getBorderColor", "setBorderColor", "borderColor", "Landroid/graphics/RectF;", "c", "Landroid/graphics/RectF;", "getMaskingRect", "()Landroid/graphics/RectF;", "setMaskingRect", "(Landroid/graphics/RectF;)V", "maskingRect", Constants.INAPP_DATA_TAG, "getFaceRect", "setFaceRect", "faceRect", "e", "I", "setCornerRadius", "(I)V", "cornerRadius", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycSdkCameraMaskView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public Integer f40632a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f40633b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f40634c;
    public RectF d;

    /* renamed from: e, reason: collision with root package name */
    public int f40635e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f40636f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f40637g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f40638h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f40639i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f40640j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f40641k;

    /* renamed from: l, reason: collision with root package name */
    public final int f40642l;

    /* renamed from: m, reason: collision with root package name */
    public final int f40643m;

    /* renamed from: n, reason: collision with root package name */
    public final Bitmap f40644n;

    public KycSdkCameraMaskView(Context r9, AttributeSet r10) {
        p.l(r9, "context");
        super(r9, r10);
        this.f40634c = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f40635e = n0.c.b(10);
        this.f40636f = new Path();
        Paint r92 = new Paint(1);
        this.f40637g = r92;
        Paint r1 = new Paint(1);
        this.f40638h = r1;
        Paint r2 = new Paint(1);
        this.f40639i = r2;
        Paint r3 = new Paint(1);
        this.f40640j = r3;
        this.f40641k = new Paint(1);
        int r4 = n0.c.b(4);
        this.f40642l = n0.c.b(48);
        int r5 = n0.c.b(8);
        this.f40643m = n0.c.b(12);
        this.f40644n = BitmapFactory.decodeResource(getResources(), com.iab.digitalidentity.f.f39698h);
        r92.setColor(Color.argb(SubsamplingScaleImageView.ORIENTATION_180, 0, 0, 0));
        r92.setStyle(Paint.Style.FILL);
        r1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        r2.setColor(Color.argb(com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH));
        Paint.Style r12 = Paint.Style.STROKE;
        r2.setStyle(r12);
        float r42 = r4;
        r2.setStrokeWidth(r42);
        Paint.Cap r6 = Paint.Cap.ROUND;
        r2.setStrokeCap(r6);
        r3.setColor(Color.argb(150, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH));
        r3.setStyle(r12);
        r3.setStrokeWidth(r42 / 2);
        r3.setStrokeCap(r6);
        float r22 = r5;
        r3.setPathEffect(new DashPathEffect(new float[]{r22, r22}, 0.0f));
        setWillNotDraw(false);
    }

    private final void setCornerRadius(int r1) {
        this.f40635e = r1;
        postInvalidate();
    }

    public final Integer getBorderColor() {
        return this.f40633b;
    }

    public final RectF getFaceRect() {
        return this.d;
    }

    public final RectF getMaskingRect() {
        return this.f40634c;
    }

    public final Integer getOverlayColor() {
        return this.f40632a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r12) {
        p.l(r12, "canvas");
        Integer r02 = this.f40632a;
        if (r02 == null) goto L5;
        this.f40637g.setColor(r02.intValue());
    L5:
        Integer r03 = this.f40633b;
        if (r03 == null) goto L8;
        this.f40639i.setColor(r03.intValue());
    L8:
        r12.drawPaint(this.f40637g);
        RectF r04 = this.f40634c;
        float r1 = this.f40643m;
        r12.drawRoundRect(r04, r1, r1, this.f40638h);
        RectF r05 = this.f40634c;
        float r13 = r05.top;
        if (r13 == 0.0f) goto L12;
        this.f40636f.moveTo(r05.left + this.f40642l, r13);
        this.f40636f.lineTo(r05.left + this.f40643m, r05.top);
        Path r4 = this.f40636f;
        float r7 = r05.left;
        float r14 = this.f40643m;
        float r6 = r05.top;
        r4.cubicTo(r7 + r14, r6, r7, r6, r7, r6 + r14);
        this.f40636f.lineTo(r05.left, r05.top + this.f40642l);
        this.f40636f.moveTo(r05.left, r05.bottom - this.f40642l);
        this.f40636f.lineTo(r05.left, r05.bottom - this.f40643m);
        Path r42 = this.f40636f;
        float r5 = r05.left;
        float r8 = r05.bottom;
        float r15 = this.f40643m;
        r42.cubicTo(r5, r8 - r15, r5, r8, r5 + r15, r8);
        this.f40636f.lineTo(r05.left + this.f40642l, r05.bottom);
        this.f40636f.moveTo(r05.right - this.f40642l, r05.bottom);
        this.f40636f.lineTo(r05.right - this.f40643m, r05.bottom);
        Path r43 = this.f40636f;
        float r72 = r05.right;
        float r16 = this.f40643m;
        float r62 = r05.bottom;
        r43.cubicTo(r72 - r16, r62, r72, r62, r72, r62 - r16);
        this.f40636f.lineTo(r05.right, r05.bottom - this.f40642l);
        this.f40636f.moveTo(r05.right, r05.top + this.f40642l);
        this.f40636f.lineTo(r05.right, r05.top + this.f40643m);
        Path r44 = this.f40636f;
        float r52 = r05.right;
        float r82 = r05.top;
        float r17 = this.f40643m;
        r44.cubicTo(r52, r82 + r17, r52, r82, r52 - r17, r82);
        this.f40636f.lineTo(r05.right - this.f40642l, r05.top);
        r12.drawPath(this.f40636f, this.f40639i);
    L12:
        RectF r06 = this.d;
        if (r06 == null) goto L18;
        float r18 = this.f40635e;
        r12.drawRoundRect(r06, r18, r18, this.f40640j);
        if (this.f40644n == null) goto L19;
        float r45 = 2;
        float r2 = (r06.width() / r45) + r06.left;
        float r07 = (r06.height() / r45) + r06.top;
        r12.drawBitmap(this.f40644n, r2 - (this.f40644n.getWidth() / 2), r07 - (this.f40644n.getHeight() / 2), this.f40641k);
        return;
    L19:
        return;
    }

    public final void setBorderColor(Integer r1) {
        this.f40633b = r1;
        postInvalidate();
    }

    public final void setFaceRect(RectF r1) {
        this.d = r1;
        postInvalidate();
    }

    public final void setMaskingRect(RectF r2) {
        p.l(r2, "value");
        this.f40634c = r2;
        postInvalidate();
    }

    public final void setOverlayColor(Integer r1) {
        this.f40632a = r1;
        postInvalidate();
    }

    public KycSdkCameraMaskView(Context r2) {
        p.l(r2, "context");
        this(r2, null);
    }
}
