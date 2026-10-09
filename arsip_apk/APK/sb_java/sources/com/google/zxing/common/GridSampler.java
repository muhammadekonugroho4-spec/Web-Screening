package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* loaded from: classes6.dex */
public abstract class GridSampler {
    private static GridSampler gridSampler;

    static {
        gridSampler = new DefaultGridSampler();
    }

    public GridSampler() {
    }

    public static void checkAndNudgePoints(BitMatrix r9, float[] r10) throws NotFoundException {
        int r02 = r9.getWidth();
        int r92 = r9.getHeight();
        boolean r4 = true;
        int r3 = 0;
    L4:
        if (r3 >= r10.length) goto L25;
        if (r4 == false) goto L25;
        int r42 = (int) r10[r3];
        int r5 = r3 + 1;
        int r8 = (int) r10[r5];
        if (r42 < (-1)) goto L24;
        if (r42 > r02) goto L24;
        if (r8 < (-1)) goto L24;
        if (r8 > r92) goto L24;
        if (r42 != (-1)) goto L14;
        r10[r3] = 0.0f;
    L13:
        r4 = true;
    L17:
        if (r8 != (-1)) goto L20;
        r10[r5] = 0.0f;
    L19:
        r4 = true;
    L22:
        r3 = r3 + 2;
        goto L4
    L20:
        if (r8 != r92) goto L22;
        r10[r5] = r92 - 1;
        goto L19
    L14:
        if (r42 != r02) goto L16;
        r10[r3] = r02 - 1;
        goto L13
    L16:
        r4 = false;
    L24:
        throw NotFoundException.getNotFoundInstance();
    L25:
        int r32 = r10.length - 2;
        boolean r43 = true;
    L26:
        if (r32 < 0) goto L47;
        if (r43 == false) goto L64;
        int r44 = (int) r10[r32];
        int r52 = r32 + 1;
        int r82 = (int) r10[r52];
        if (r44 < (-1)) goto L46;
        if (r44 > r02) goto L46;
        if (r82 < (-1)) goto L46;
        if (r82 > r92) goto L46;
        if (r44 != (-1)) goto L36;
        r10[r32] = 0.0f;
    L35:
        r43 = true;
    L39:
        if (r82 != (-1)) goto L42;
        r10[r52] = 0.0f;
    L41:
        r43 = true;
    L44:
        r32 = r32 - 2;
        goto L26
    L42:
        if (r82 != r92) goto L44;
        r10[r52] = r92 - 1;
        goto L41
    L36:
        if (r44 != r02) goto L38;
        r10[r32] = r02 - 1;
        goto L35
    L38:
        r43 = false;
    L46:
        throw NotFoundException.getNotFoundInstance();
    L64:
        return;
    }

    public static GridSampler getInstance() {
        return gridSampler;
    }

    public static void setGridSampler(GridSampler r02) {
        gridSampler = r02;
    }

    public abstract BitMatrix sampleGrid(BitMatrix r1, int r2, int r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, float r19) throws NotFoundException;

    public abstract BitMatrix sampleGrid(BitMatrix r1, int r2, int r3, PerspectiveTransform r4) throws NotFoundException;
}
