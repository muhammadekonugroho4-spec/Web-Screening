package com.github.mikephil.charting.components;

import android.graphics.Typeface;
import com.github.mikephil.charting.utils.Utils;

/* loaded from: classes4.dex */
public abstract class ComponentBase {
    protected boolean mEnabled;
    protected int mTextColor;
    protected float mTextSize;
    protected Typeface mTypeface;
    protected float mXOffset;
    protected float mYOffset;

    public ComponentBase() {
        this.mEnabled = true;
        this.mXOffset = 5.0f;
        this.mYOffset = 5.0f;
        this.mTypeface = null;
        this.mTextSize = Utils.convertDpToPixel(10.0f);
        this.mTextColor = -16777216;
    }

    public int getTextColor() {
        return this.mTextColor;
    }

    public float getTextSize() {
        return this.mTextSize;
    }

    public Typeface getTypeface() {
        return this.mTypeface;
    }

    public float getXOffset() {
        return this.mXOffset;
    }

    public float getYOffset() {
        return this.mYOffset;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setEnabled(boolean r1) {
        this.mEnabled = r1;
    }

    public void setTextColor(int r1) {
        this.mTextColor = r1;
    }

    public void setTextSize(float r3) {
        if (r3 <= 24.0f) goto L6;
        r3 = 24.0f;
    L6:
        if (r3 >= 6.0f) goto L8;
        r3 = 6.0f;
    L8:
        this.mTextSize = Utils.convertDpToPixel(r3);
    }

    public void setTypeface(Typeface r1) {
        this.mTypeface = r1;
    }

    public void setXOffset(float r1) {
        this.mXOffset = Utils.convertDpToPixel(r1);
    }

    public void setYOffset(float r1) {
        this.mYOffset = Utils.convertDpToPixel(r1);
    }
}
