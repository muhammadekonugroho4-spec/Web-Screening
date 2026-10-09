package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* loaded from: classes6.dex */
public final class DefaultGridSampler extends GridSampler {
    public DefaultGridSampler() {
    }

    @Override // com.google.zxing.common.GridSampler
    public BitMatrix sampleGrid(BitMatrix r1, int r2, int r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, float r19) throws NotFoundException {
        return sampleGrid(r1, r2, r3, PerspectiveTransform.quadrilateralToQuadrilateral(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19));
    }

    @Override // com.google.zxing.common.GridSampler
    public BitMatrix sampleGrid(BitMatrix r9, int r10, int r11, PerspectiveTransform r12) throws NotFoundException {
        if (r10 <= 0) goto L20;
        if (r11 <= 0) goto L20;
        BitMatrix r02 = new BitMatrix(r10, r11);
        int r102 = r10 * 2;
        float[] r1 = new float[r102];
        int r3 = 0;
    L5:
        if (r3 >= r11) goto L18;
        float r4 = r3 + 0.5f;
        int r6 = 0;
    L7:
        if (r6 >= r102) goto L9;
        r1[r6] = (r6 / 2) + 0.5f;
        r1[r6 + 1] = r4;
        r6 = r6 + 2;
        goto L7
    L9:
        r12.transformPoints(r1);
        GridSampler.checkAndNudgePoints(r9, r1);
        int r42 = 0;
    L10:
        if (r42 >= r102) goto L17;
        if (r9.get((int) r1[r42], (int) r1[r42 + 1]) == false) goto L14;
        r02.set(r42 / 2, r3);     // Catch: ArrayIndexOutOfBoundsException -> L15
    L14:
        r42 = r42 + 2;
    L16:
        throw NotFoundException.getNotFoundInstance();
    L17:
        r3 = r3 + 1;
        goto L5
    L18:
        return r02;
    L20:
        throw NotFoundException.getNotFoundInstance();
    }
}
