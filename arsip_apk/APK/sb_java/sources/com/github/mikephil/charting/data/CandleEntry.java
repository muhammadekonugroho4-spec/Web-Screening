package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes4.dex */
public class CandleEntry extends Entry {
    private float mClose;
    private float mOpen;
    private float mShadowHigh;
    private float mShadowLow;

    public CandleEntry(float r3, float r4, float r5, float r6, float r7) {
        super(r3, (r4 + r5) / 2.0f);
        this.mShadowHigh = r4;
        this.mShadowLow = r5;
        this.mOpen = r6;
        this.mClose = r7;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public /* bridge */ /* synthetic */ Entry copy() {
        return copy();
    }

    public float getBodyRange() {
        return Math.abs(this.mOpen - this.mClose);
    }

    public float getClose() {
        return this.mClose;
    }

    public float getHigh() {
        return this.mShadowHigh;
    }

    public float getLow() {
        return this.mShadowLow;
    }

    public float getOpen() {
        return this.mOpen;
    }

    public float getShadowRange() {
        return Math.abs(this.mShadowHigh - this.mShadowLow);
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
        return super.getY();
    }

    public void setClose(float r1) {
        this.mClose = r1;
    }

    public void setHigh(float r1) {
        this.mShadowHigh = r1;
    }

    public void setLow(float r1) {
        this.mShadowLow = r1;
    }

    public void setOpen(float r1) {
        this.mOpen = r1;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public CandleEntry copy() {
        return new CandleEntry(getX(), this.mShadowHigh, this.mShadowLow, this.mOpen, this.mClose, getData());
    }

    public CandleEntry(float r3, float r4, float r5, float r6, float r7, Object r8) {
        super(r3, (r4 + r5) / 2.0f, r8);
        this.mShadowHigh = r4;
        this.mShadowLow = r5;
        this.mOpen = r6;
        this.mClose = r7;
    }

    public CandleEntry(float r3, float r4, float r5, float r6, float r7, Drawable r8) {
        super(r3, (r4 + r5) / 2.0f, r8);
        this.mShadowHigh = r4;
        this.mShadowLow = r5;
        this.mOpen = r6;
        this.mClose = r7;
    }

    public CandleEntry(float r3, float r4, float r5, float r6, float r7, Drawable r8, Object r9) {
        super(r3, (r4 + r5) / 2.0f, r8, r9);
        this.mShadowHigh = r4;
        this.mShadowLow = r5;
        this.mOpen = r6;
        this.mClose = r7;
    }
}
