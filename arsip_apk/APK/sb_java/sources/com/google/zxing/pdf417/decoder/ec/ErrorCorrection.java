package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.ChecksumException;

/* loaded from: classes6.dex */
public final class ErrorCorrection {
    private final ModulusGF field;

    public ErrorCorrection() {
        this.field = ModulusGF.PDF417_GF;
    }

    private int[] findErrorLocations(ModulusPoly r6) throws ChecksumException {
        int r02 = r6.getDegree();
        int[] r1 = new int[r02];
        int r2 = 0;
        int r3 = 1;
    L4:
        if (r3 >= this.field.getSize()) goto L10;
        if (r2 >= r02) goto L10;
        if (r6.evaluateAt(r3) != 0) goto L9;
        r1[r2] = this.field.inverse(r3);
        r2 = r2 + 1;
    L9:
        r3 = r3 + 1;
    L10:
        if (r2 != r02) goto L13;
        return r1;
    L13:
        throw ChecksumException.getChecksumInstance();
    }

    private int[] findErrorMagnitudes(ModulusPoly r8, ModulusPoly r9, int[] r10) {
        int r02 = r9.getDegree();
        int[] r1 = new int[r02];
        int r2 = 1;
    L3:
        if (r2 > r02) goto L5;
        r1[r02 - r2] = this.field.multiply(r2, r9.getCoefficient(r2));
        r2 = r2 + 1;
        goto L3
    L5:
        ModulusPoly r92 = new ModulusPoly(this.field, r1);
        int r03 = r10.length;
        int[] r12 = new int[r03];
        int r3 = 0;
    L6:
        if (r3 >= r03) goto L8;
        int r4 = this.field.inverse(r10[r3]);
        r12[r3] = this.field.multiply(this.field.subtract(0, r8.evaluateAt(r4)), this.field.inverse(r92.evaluateAt(r4)));
        r3 = r3 + 1;
        goto L6
    L8:
        return r12;
    }

    private ModulusPoly[] runEuclideanAlgorithm(ModulusPoly r9, ModulusPoly r10, int r11) throws ChecksumException {
        if (r9.getDegree() >= r10.getDegree()) goto L5;
        r10 = r9;
        r9 = r10;
    L5:
        ModulusPoly r02 = this.field.getZero();
        ModulusPoly r1 = this.field.getOne();
    L6:
        ModulusPoly r7 = r10;
        r10 = r9;
        r9 = r7;
        ModulusPoly r72 = r1;
        ModulusPoly r12 = r02;
        r02 = r72;
        if (r9.getDegree() < (r11 / 2)) goto L19;
        if (r9.isZero() == true) goto L18;
        ModulusPoly r2 = this.field.getZero();
        int r3 = r9.getCoefficient(r9.getDegree());
        int r32 = this.field.inverse(r3);
    L12:
        if (r10.getDegree() < r9.getDegree()) goto L16;
        if (r10.isZero() == true) goto L16;
        int r4 = r10.getDegree() - r9.getDegree();
        int r5 = this.field.multiply(r10.getCoefficient(r10.getDegree()), r32);
        r2 = r2.add(this.field.buildMonomial(r4, r5));
        r10 = r10.subtract(r9.multiplyByMonomial(r4, r5));
    L16:
        r1 = r2.multiply(r02).subtract(r12).negative();
        goto L6
    L18:
        throw ChecksumException.getChecksumInstance();
    L19:
        int r102 = r02.getCoefficient(0);
        if (r102 == 0) goto L24;
        int r103 = this.field.inverse(r102);
        return new ModulusPoly[]{r02.multiply(r103), r9.multiply(r103)};
    L24:
        throw ChecksumException.getChecksumInstance();
    }

    public int decode(int[] r10, int r11, int[] r12) throws ChecksumException {
        ModulusPoly r02 = new ModulusPoly(this.field, r10);
        int[] r1 = new int[r11];
        int r2 = 0;
        int r3 = r11;
        boolean r4 = false;
    L4:
        if (r3 <= 0) goto L9;
        int r6 = r02.evaluateAt(this.field.exp(r3));
        r1[r11 - r3] = r6;
        if (r6 == 0) goto L8;
        r4 = true;
    L8:
        r3 = r3 - 1;
        goto L4
    L9:
        if (r4 == true) goto L11;
        return 0;
    L11:
        ModulusPoly r03 = this.field.getOne();
        if (r12 == null) goto L16;
        int r32 = r12.length;
        int r42 = 0;
    L14:
        if (r42 >= r32) goto L16;
        int r62 = this.field.exp((r10.length - 1) - r12[r42]);
        ModulusGF r8 = this.field;
        r03 = r03.multiply(new ModulusPoly(r8, new int[]{r8.subtract(0, r62), 1}));
        r42 = r42 + 1;
    L16:
        ModulusPoly[] r112 = runEuclideanAlgorithm(this.field.buildMonomial(r11, 1), new ModulusPoly(this.field, r1), r11);
        ModulusPoly r122 = r112[0];
        ModulusPoly r113 = r112[1];
        int[] r04 = findErrorLocations(r122);
        int[] r114 = findErrorMagnitudes(r113, r122, r04);
    L18:
        if (r2 >= r04.length) goto L25;
        int r123 = (r10.length - 1) - this.field.log(r04[r2]);
        if (r123 < 0) goto L23;
        r10[r123] = this.field.subtract(r10[r123], r114[r2]);
        r2 = r2 + 1;
        goto L18
    L23:
        throw ChecksumException.getChecksumInstance();
    L25:
        return r04.length;
    }
}
