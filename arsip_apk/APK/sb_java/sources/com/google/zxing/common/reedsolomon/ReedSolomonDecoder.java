package com.google.zxing.common.reedsolomon;

/* loaded from: classes6.dex */
public final class ReedSolomonDecoder {
    private final GenericGF field;

    public ReedSolomonDecoder(GenericGF r1) {
        this.field = r1;
    }

    private int[] findErrorLocations(GenericGFPoly r6) throws ReedSolomonException {
        int r02 = r6.getDegree();
        int r1 = 1;
        if (r02 == 1) goto L5;
        int[] r2 = new int[r02];
        int r3 = 0;
    L8:
        if (r1 >= this.field.getSize()) goto L14;
        if (r3 >= r02) goto L14;
        if (r6.evaluateAt(r1) != 0) goto L13;
        r2[r3] = this.field.inverse(r1);
        r3 = r3 + 1;
    L13:
        r1 = r1 + 1;
    L14:
        if (r3 != r02) goto L17;
        return r2;
    L17:
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    L5:
        return new int[]{r6.getCoefficient(1)};
    }

    private int[] findErrorMagnitudes(GenericGFPoly r10, int[] r11) {
        int r02 = r11.length;
        int[] r1 = new int[r02];
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L17;
        int r4 = this.field.inverse(r11[r3]);
        int r5 = 1;
        int r6 = 0;
    L5:
        if (r6 >= r02) goto L13;
        if (r3 == r6) goto L12;
        int r7 = this.field.multiply(r11[r6], r4);
        if ((r7 & 1) != 0) goto L10;
        int r72 = r7 | 1;
    L11:
        r5 = this.field.multiply(r5, r72);
        goto L12
    L10:
        r72 = r7 & (-2);
    L12:
        r6 = r6 + 1;
        goto L5
    L13:
        r1[r3] = this.field.multiply(r10.evaluateAt(r4), this.field.inverse(r5));
        if (this.field.getGeneratorBase() == 0) goto L16;
        r1[r3] = this.field.multiply(r1[r3], r4);
    L16:
        r3 = r3 + 1;
        goto L3
    L17:
        return r1;
    }

    private GenericGFPoly[] runEuclideanAlgorithm(GenericGFPoly r9, GenericGFPoly r10, int r11) throws ReedSolomonException {
        if (r9.getDegree() >= r10.getDegree()) goto L5;
        r10 = r9;
        r9 = r10;
    L5:
        GenericGFPoly r02 = this.field.getZero();
        GenericGFPoly r1 = this.field.getOne();
    L6:
        GenericGFPoly r7 = r10;
        r10 = r9;
        r9 = r7;
        GenericGFPoly r72 = r1;
        GenericGFPoly r12 = r02;
        r02 = r72;
        if (r9.getDegree() < (r11 / 2)) goto L23;
        if (r9.isZero() == true) goto L22;
        GenericGFPoly r2 = this.field.getZero();
        int r3 = r9.getCoefficient(r9.getDegree());
        int r32 = this.field.inverse(r3);
    L12:
        if (r10.getDegree() < r9.getDegree()) goto L16;
        if (r10.isZero() == true) goto L16;
        int r4 = r10.getDegree() - r9.getDegree();
        int r5 = this.field.multiply(r10.getCoefficient(r10.getDegree()), r32);
        r2 = r2.addOrSubtract(this.field.buildMonomial(r4, r5));
        r10 = r10.addOrSubtract(r9.multiplyByMonomial(r4, r5));
    L16:
        r1 = r2.multiply(r02).addOrSubtract(r12);
        if (r10.getDegree() < r9.getDegree()) goto L6;
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    L22:
        throw new ReedSolomonException("r_{i-1} was zero");
    L23:
        int r102 = r02.getCoefficient(0);
        if (r102 == 0) goto L28;
        int r103 = this.field.inverse(r102);
        return new GenericGFPoly[]{r02.multiply(r103), r9.multiply(r103)};
    L28:
        throw new ReedSolomonException("sigmaTilde(0) was zero");
    }

    public void decode(int[] r9, int r10) throws ReedSolomonException {
        GenericGFPoly r02 = new GenericGFPoly(this.field, r9);
        int[] r1 = new int[r10];
        int r3 = 0;
        boolean r5 = true;
        int r4 = 0;
    L3:
        if (r4 >= r10) goto L8;
        GenericGF r6 = this.field;
        int r62 = r02.evaluateAt(r6.exp(r6.getGeneratorBase() + r4));
        r1[(r10 - 1) - r4] = r62;
        if (r62 == 0) goto L7;
        r5 = false;
    L7:
        r4 = r4 + 1;
        goto L3
    L8:
        if (r5 == true) goto L18;
        GenericGFPoly[] r102 = runEuclideanAlgorithm(this.field.buildMonomial(r10, 1), new GenericGFPoly(this.field, r1), r10);
        GenericGFPoly r03 = r102[0];
        GenericGFPoly r103 = r102[1];
        int[] r04 = findErrorLocations(r03);
        int[] r104 = findErrorMagnitudes(r103, r04);
    L12:
        if (r3 >= r04.length) goto L24;
        int r12 = (r9.length - 1) - this.field.log(r04[r3]);
        if (r12 < 0) goto L17;
        r9[r12] = GenericGF.addOrSubtract(r9[r12], r104[r3]);
        r3 = r3 + 1;
        goto L12
    L17:
        throw new ReedSolomonException("Bad error location");
    L24:
        return;
    }
}
