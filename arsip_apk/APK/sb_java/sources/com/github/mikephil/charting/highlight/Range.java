package com.github.mikephil.charting.highlight;

/* loaded from: classes4.dex */
public final class Range {
    public float from;
    public float to;

    public Range(float r1, float r2) {
        this.from = r1;
        this.to = r2;
    }

    public boolean contains(float r2) {
        if (r2 > this.from) goto L5;
        return false;
    L5:
        if (r2 > this.to) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isLarger(float r2) {
        if (r2 <= this.to) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isSmaller(float r2) {
        if (r2 >= this.from) goto L6;
        return true;
    L6:
        return false;
    }
}
