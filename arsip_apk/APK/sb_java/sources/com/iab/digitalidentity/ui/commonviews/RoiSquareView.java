package com.iab.digitalidentity.ui.commonviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bR*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/iab/digitalidentity/ui/commonviews/RoiSquareView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "value", "b", "I", "getColor", "()I", "setColor", "(I)V", Constants.KEY_COLOR, "Landroid/graphics/RectF;", "c", "Landroid/graphics/RectF;", "getRoiRect", "()Landroid/graphics/RectF;", "setRoiRect", "(Landroid/graphics/RectF;)V", "roiRect", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoiSquareView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f40664a;

    /* renamed from: b, reason: collision with root package name */
    public int f40665b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f40666c;

    public RoiSquareView(Context r3, AttributeSet r4) {
        p.l(r3, "context");
        super(r3, r4);
        Paint r32 = new Paint(1);
        this.f40664a = r32;
        this.f40665b = Color.argb(com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, 0, 0, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH);
        this.f40666c = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        r32.setColor(this.f40665b);
        r32.setStyle(Paint.Style.STROKE);
        r32.setStrokeWidth(6.0f);
        setWillNotDraw(false);
    }

    public final int getColor() {
        return this.f40665b;
    }

    public final RectF getRoiRect() {
        return this.f40666c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r3) {
        p.l(r3, "canvas");
        r3.drawRect(this.f40666c, this.f40664a);
    }

    public final void setColor(int r2) {
        this.f40665b = r2;
        this.f40664a.setColor(r2);
    }

    public final void setRoiRect(RectF r2) {
        p.l(r2, "value");
        this.f40666c = r2;
        invalidate();
    }

    public RoiSquareView(Context r2) {
        p.l(r2, "context");
        this(r2, null);
    }
}
