package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class ReedSolomonEncoder {
    private final List<GenericGFPoly> cachedGenerators;
    private final GenericGF field;

    public ReedSolomonEncoder(GenericGF r4) {
        this.field = r4;
        ArrayList r02 = new ArrayList();
        this.cachedGenerators = r02;
        r02.add(new GenericGFPoly(r4, new int[]{1}));
    }

    private GenericGFPoly buildGenerator(int r8) {
        if (r8 < this.cachedGenerators.size()) goto L8;
        List<GenericGFPoly> r02 = this.cachedGenerators;
        GenericGFPoly r03 = r02.get(r02.size() - 1);
        int r1 = this.cachedGenerators.size();
    L5:
        if (r1 > r8) goto L8;
        GenericGF r4 = this.field;
        r03 = r03.multiply(new GenericGFPoly(r4, new int[]{1, r4.exp((r1 - 1) + r4.getGeneratorBase())}));
        this.cachedGenerators.add(r03);
        r1 = r1 + 1;
    L8:
        return this.cachedGenerators.get(r8);
    }

    public void encode(int[] r7, int r8) {
        if (r8 == 0) goto L13;
        int r02 = r7.length - r8;
        if (r02 <= 0) goto L11;
        GenericGFPoly r1 = buildGenerator(r8);
        int[] r2 = new int[r02];
        System.arraycopy(r7, 0, r2, 0, r02);
        int[] r12 = new GenericGFPoly(this.field, r2).multiplyByMonomial(r8, 1).divide(r1)[1].getCoefficients();
        int r82 = r8 - r12.length;
        int r22 = 0;
    L6:
        if (r22 >= r82) goto L8;
        r7[r02 + r22] = 0;
        r22 = r22 + 1;
        goto L6
    L8:
        System.arraycopy(r12, 0, r7, r02 + r82, r12.length);
        return;
    L11:
        throw new IllegalArgumentException("No data bytes provided");
    L13:
        throw new IllegalArgumentException("No error correction bytes");
    }
}
