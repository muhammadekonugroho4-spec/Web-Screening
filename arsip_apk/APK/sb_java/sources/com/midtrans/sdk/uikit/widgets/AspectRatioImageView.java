package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.midtrans.sdk.uikit.l;

/* loaded from: classes6.dex */
public class AspectRatioImageView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public float f43384a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f43385b;

    /* renamed from: c, reason: collision with root package name */
    public int f43386c;

    public AspectRatioImageView(Context r2) {
        this(r2, null);
    }

    public float getAspectRatio() {
        return this.f43384a;
    }

    public boolean getAspectRatioEnabled() {
        return this.f43385b;
    }

    public int getDominantMeasurement() {
        return this.f43386c;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        if (this.f43385b == true) goto L5;
        return;
    L5:
        int r22 = this.f43386c;
        if (r22 != 0) goto L8;
        int r32 = getMeasuredWidth();
        int r23 = (int) (r32 / this.f43384a);
    L13:
        setMeasuredDimension(r32, r23);
        return;
    L8:
        if (r22 != 1) goto L11;
        r23 = getMeasuredHeight();
        r32 = (int) (r23 * this.f43384a);
        goto L13
    L11:
        throw new IllegalStateException("Unknown measurement with ID " + this.f43386c);
    }

    public void setAspectRatio(float r1) {
        this.f43384a = r1;
        if (this.f43385b == false) goto L6;
        requestLayout();
        return;
    }

    public void setAspectRatioEnabled(boolean r1) {
        this.f43385b = r1;
        requestLayout();
    }

    public void setDominantMeasurement(int r2) {
        if (r2 == 1) goto L8;
        if (r2 == 0) goto L8;
        throw new IllegalArgumentException("Invalid measurement type.");
    L8:
        this.f43386c = r2;
        requestLayout();
    }

    public AspectRatioImageView(Context r2, AttributeSet r3) {
        super(r2, r3);
        TypedArray r22 = r2.obtainStyledAttributes(r3, l.f42745s);
        this.f43384a = r22.getFloat(l.f42747t, 1.0f);
        this.f43385b = r22.getBoolean(l.f42749u, false);
        this.f43386c = r22.getInt(l.f42751v, 0);
        r22.recycle();
    }
}
