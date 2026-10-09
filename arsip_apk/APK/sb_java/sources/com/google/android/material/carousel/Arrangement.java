package com.google.android.material.carousel;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes5.dex */
public final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    public Arrangement(int r1, float r2, float r3, float r4, int r5, float r6, int r7, float r8, int r9, float r10) {
        this.priority = r1;
        this.smallSize = androidx.core.math.a.a(r2, r3, r4);
        this.smallCount = r5;
        this.mediumSize = r6;
        this.mediumCount = r7;
        this.largeSize = r8;
        this.largeCount = r9;
        fit(r10, r3, r4, r8);
        this.cost = cost(r8);
    }

    private float calculateLargeSize(float r2, int r3, float r4, int r5, int r6) {
        if (r3 > 0) goto L5;
        r4 = 0.0f;
    L5:
        float r52 = r5 / 2.0f;
        return (r2 - ((r3 + r52) * r4)) / (r6 + r52);
    }

    private float cost(float r2) {
        if (isValid() == true) goto L7;
        return Float.MAX_VALUE;
    L7:
        return Math.abs(r2 - this.largeSize) * this.priority;
    }

    public static Arrangement findLowestCostArrangement(float r22, float r23, float r24, float r25, int[] r26, float r27, int[] r28, float r29, int[] r30) {
        int r3 = r30.length;
        Arrangement r4 = null;
        int r5 = 1;
        int r7 = 0;
    L3:
        if (r7 >= r3) goto L19;
        int r17 = r30[r7];
        int r8 = r28.length;
        int r9 = 0;
    L5:
        if (r9 >= r8) goto L18;
        int r15 = r28[r9];
        int r10 = r26.length;
        int r11 = 0;
    L7:
        if (r11 >= r10) goto L17;
        int r12 = r8;
        int r14 = r9;
        int r92 = r5;
        int r20 = r10;
        int r21 = r11;
        Arrangement r82 = new Arrangement(r92, r23, r24, r25, r26[r11], r27, r15, r29, r17, r22);
        if (r4 == null) goto L13;
        if (r82.cost < r4.cost) goto L13;
    L16:
        int r83 = r92 + 1;
        r11 = r21 + 1;
        r9 = r14;
        r5 = r83;
        r8 = r12;
        r10 = r20;
    L13:
        if (r82.cost == 0.0f) goto L14;
        r4 = r82;
        goto L16
    L14:
        return r82;
    L17:
        int r19 = r9;
        r9 = r19 + 1;
        r5 = r5;
        r8 = r8;
        goto L5
    L18:
        r7 = r7 + 1;
        goto L3
    L19:
        return r4;
    }

    private void fit(float r10, float r11, float r12, float r13) {
        float r02 = r10 - getSpace();
        int r1 = this.smallCount;
        if (r1 > 0) goto L5;
    L7:
        if (r1 > 0) goto L9;
    L11:
        int r5 = this.smallCount;
        if (r5 <= 0) goto L14;
        float r6 = this.smallSize;
    L15:
        this.smallSize = r6;
        float r102 = calculateLargeSize(r10, r5, r6, this.mediumCount, this.largeCount);
        this.largeSize = r102;
        float r112 = (this.smallSize + r102) / 2.0f;
        this.mediumSize = r112;
        int r122 = this.mediumCount;
        if (r122 > 0) goto L18;
        return;
    L18:
        if (r102 == r13) goto L26;
        float r132 = (r13 - r102) * this.largeCount;
        float r103 = Math.min(Math.abs(r132), (r112 * MEDIUM_ITEM_FLEX_PERCENTAGE) * r122);
        if (r132 <= 0.0f) goto L23;
        this.mediumSize -= r103 / this.mediumCount;
        this.largeSize += r103 / this.largeCount;
        return;
    L23:
        this.mediumSize += r103 / this.mediumCount;
        this.largeSize -= r103 / this.largeCount;
        return;
    L26:
        return;
    L14:
        r6 = 0.0f;
        goto L15
    L9:
        if (r02 >= 0.0f) goto L11;
        float r123 = this.smallSize;
        this.smallSize = r123 + Math.max(r02 / r1, r11 - r123);
        goto L11
    L5:
        if (r02 <= 0.0f) goto L7;
        float r113 = this.smallSize;
        this.smallSize = r113 + Math.min(r02 / r1, r12 - r113);
        goto L11
    }

    private float getSpace() {
        return ((this.largeSize * this.largeCount) + (this.mediumSize * this.mediumCount)) + (this.smallSize * this.smallCount);
    }

    private boolean isValid() {
        int r02 = this.largeCount;
        if (r02 > 0) goto L5;
    L14:
        if (r02 > 0) goto L16;
    L21:
        return true;
    L16:
        if (this.smallCount <= 0) goto L21;
        if (this.largeSize <= this.smallSize) goto L20;
        return true;
    L20:
        return false;
    L5:
        if (this.smallCount <= 0) goto L14;
        if (this.mediumCount <= 0) goto L14;
        float r03 = this.largeSize;
        float r3 = this.mediumSize;
        if (r03 > r3) goto L11;
    L13:
        return false;
    L11:
        if (r3 <= this.smallSize) goto L13;
        return true;
    }

    public int getItemCount() {
        return (this.smallCount + this.mediumCount) + this.largeCount;
    }

    public String toString() {
        return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + Constants.AES_SUFFIX;
    }
}
