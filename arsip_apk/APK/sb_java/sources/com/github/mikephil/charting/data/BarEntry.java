package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.highlight.Range;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes4.dex */
public class BarEntry extends Entry {
    private float mNegativeSum;
    private float mPositiveSum;
    private Range[] mRanges;
    private float[] mYVals;

    public BarEntry(float r1, float r2) {
        super(r1, r2);
    }

    private void calcPosNegSum() {
        float[] r02 = this.mYVals;
        if (r02 != null) goto L6;
        this.mNegativeSum = 0.0f;
        this.mPositiveSum = 0.0f;
        return;
    L6:
        int r2 = r02.length;
        int r3 = 0;
        float r4 = 0.0f;
        float r5 = 0.0f;
    L7:
        if (r3 >= r2) goto L13;
        float r6 = r02[r3];
        if (r6 > 0.0f) goto L11;
        r4 = r4 + Math.abs(r6);
    L12:
        r3 = r3 + 1;
        goto L7
    L11:
        r5 = r5 + r6;
        goto L12
    L13:
        this.mNegativeSum = r4;
        this.mPositiveSum = r5;
    }

    private static float calcSum(float[] r4) {
        float r02 = 0.0f;
        if (r4 != null) goto L5;
        return 0.0f;
    L5:
        int r1 = r4.length;
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L8;
        r02 = r02 + r4[r2];
        r2 = r2 + 1;
        goto L6
    L8:
        return r02;
    }

    public void calcRanges() {
        float[] r02 = getYVals();
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.length == 0) goto L19;
        this.mRanges = new Range[r02.length];
        float r1 = -getNegativeSum();
        int r3 = 0;
        float r4 = 0.0f;
    L8:
        Range[] r5 = this.mRanges;
        if (r3 >= r5.length) goto L20;
        float r6 = r02[r3];
        if (r6 >= 0.0f) goto L13;
        float r62 = r1 - r6;
        r5[r3] = new Range(r1, r62);
        r1 = r62;
    L14:
        r3 = r3 + 1;
        goto L8
    L13:
        float r63 = r6 + r4;
        r5[r3] = new Range(r4, r63);
        r4 = r63;
        goto L14
    L20:
        return;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public /* bridge */ /* synthetic */ Entry copy() {
        return copy();
    }

    @Deprecated
    public float getBelowSum(int r1) {
        return getSumBelow(r1);
    }

    public float getNegativeSum() {
        return this.mNegativeSum;
    }

    public float getPositiveSum() {
        return this.mPositiveSum;
    }

    public Range[] getRanges() {
        return this.mRanges;
    }

    public float getSumBelow(int r4) {
        float[] r02 = this.mYVals;
        float r1 = 0.0f;
        if (r02 != null) goto L5;
        return 0.0f;
    L5:
        int r03 = r02.length - 1;
    L6:
        if (r03 <= r4) goto L9;
        if (r03 < 0) goto L9;
        r1 = r1 + this.mYVals[r03];
        r03 = r03 - 1;
    L9:
        return r1;
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
        return super.getY();
    }

    public float[] getYVals() {
        return this.mYVals;
    }

    public boolean isStacked() {
        if (this.mYVals == null) goto L6;
        return true;
    L6:
        return false;
    }

    public void setVals(float[] r2) {
        setY(calcSum(r2));
        this.mYVals = r2;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float r1, float r2, Object r3) {
        super(r1, r2, r3);
    }

    @Override // com.github.mikephil.charting.data.Entry
    public BarEntry copy() {
        BarEntry r02 = new BarEntry(getX(), getY(), getData());
        r02.setVals(this.mYVals);
        return r02;
    }

    public BarEntry(float r1, float r2, Drawable r3) {
        super(r1, r2, r3);
    }

    public BarEntry(float r1, float r2, Drawable r3, Object r4) {
        super(r1, r2, r3, r4);
    }

    public BarEntry(float r2, float[] r3) {
        super(r2, calcSum(r3));
        this.mYVals = r3;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float r2, float[] r3, Object r4) {
        super(r2, calcSum(r3), r4);
        this.mYVals = r3;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float r2, float[] r3, Drawable r4) {
        super(r2, calcSum(r3), r4);
        this.mYVals = r3;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float r2, float[] r3, Drawable r4, Object r5) {
        super(r2, calcSum(r3), r4, r5);
        this.mYVals = r3;
        calcPosNegSum();
        calcRanges();
    }
}
