package com.stockbit.usecase.orderbook.extension;

/* loaded from: classes2.dex */
public abstract class a {
    public static final float a(double r3, double r5, double r7, float r9, float r10) {
        if (r3 > 0.0d) goto L6;
        return 0.0f;
    L6:
        double r32 = r3 / r5;
        if (r32 < r7) goto L9;
    L11:
        double r52 = r10;
        return (float) (Math.rint(r32 * r52) / r52);
    L9:
        if (r32 <= 0.0d) goto L11;
        return r9;
    }

    public static /* synthetic */ float b(double r8, double r10, double r12, float r14, float r15, int r16, Object r17) {
        if ((r16 & 4) == 0) goto L5;
        r12 = 0.04d;
    L5:
        double r4 = r12;
        if ((r16 & 8) == 0) goto L8;
        float r6 = 0.03f;
    L10:
        if ((r16 & 16) == 0) goto L13;
        float r7 = 20.0f;
    L15:
        return a(r8, r10, r4, r6, r7);
    L13:
        r7 = r15;
        goto L15
    L8:
        r6 = r14;
        goto L10
    }
}
