package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

/* loaded from: classes6.dex */
public final class FinderPattern {
    private final ResultPoint[] resultPoints;
    private final int[] startEnd;
    private final int value;

    public FinderPattern(int r1, int[] r2, int r3, int r4, int r5) {
        this.value = r1;
        this.startEnd = r2;
        float r22 = r3;
        float r32 = r5;
        this.resultPoints = new ResultPoint[]{new ResultPoint(r22, r32), new ResultPoint(r4, r32)};
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof FinderPattern) == true) goto L6;
        return false;
    L6:
        if (this.value != ((FinderPattern) r3).value) goto L9;
        return true;
    L9:
        return false;
    }

    public ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public int[] getStartEnd() {
        return this.startEnd;
    }

    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }
}
