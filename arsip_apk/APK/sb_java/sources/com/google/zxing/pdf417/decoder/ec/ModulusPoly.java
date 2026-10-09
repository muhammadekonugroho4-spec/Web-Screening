package com.google.zxing.pdf417.decoder.ec;

/* loaded from: classes6.dex */
final class ModulusPoly {
    private final int[] coefficients;
    private final ModulusGF field;

    public ModulusPoly(ModulusGF r4, int[] r5) {
        if (r5.length == 0) goto L20;
        this.field = r4;
        int r42 = r5.length;
        int r02 = 1;
        if (r42 > 1) goto L7;
    L17:
        this.coefficients = r5;
        return;
    L7:
        if (r5[0] != 0) goto L17;
    L8:
        if (r02 >= r42) goto L12;
        if (r5[r02] != 0) goto L12;
        r02 = r02 + 1;
    L12:
        if (r02 != r42) goto L15;
        this.coefficients = new int[]{0};
        return;
    L15:
        int[] r43 = new int[r42 - r02];
        this.coefficients = r43;
        System.arraycopy(r5, r02, r43, 0, r43.length);
        return;
    L20:
        throw new IllegalArgumentException();
    }

    public ModulusPoly add(ModulusPoly r9) {
        if (this.field.equals(r9.field) == false) goto L21;
        if (isZero() == false) goto L8;
        return r9;
    L8:
        if (r9.isZero() == false) goto L10;
        return this;
    L10:
        int[] r02 = this.coefficients;
        int[] r92 = r9.coefficients;
        if (r02.length > r92.length) goto L14;
        r02 = r92;
        r92 = r02;
    L14:
        int[] r1 = new int[r02.length];
        int r2 = r02.length - r92.length;
        System.arraycopy(r02, 0, r1, 0, r2);
        int r3 = r2;
    L16:
        if (r3 >= r02.length) goto L19;
        r1[r3] = this.field.add(r92[r3 - r2], r02[r3]);
        r3 = r3 + 1;
        goto L16
    L19:
        return new ModulusPoly(this.field, r1);
    L21:
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public int evaluateAt(int r6) {
        int r02 = 0;
        if (r6 == 0) goto L5;
        int r1 = 1;
        if (r6 != 1) goto L12;
        int[] r62 = this.coefficients;
        int r12 = r62.length;
        int r2 = 0;
    L9:
        if (r02 >= r12) goto L11;
        r2 = this.field.add(r2, r62[r02]);
        r02 = r02 + 1;
        goto L9
    L11:
        return r2;
    L12:
        int[] r22 = this.coefficients;
        int r03 = r22[0];
        int r23 = r22.length;
    L13:
        if (r1 >= r23) goto L15;
        ModulusGF r3 = this.field;
        r03 = r3.add(r3.multiply(r6, r03), this.coefficients[r1]);
        r1 = r1 + 1;
        goto L13
    L15:
        return r03;
    L5:
        return getCoefficient(0);
    }

    public int getCoefficient(int r3) {
        return this.coefficients[(r0.length - 1) - r3];
    }

    public int[] getCoefficients() {
        return this.coefficients;
    }

    public int getDegree() {
        return this.coefficients.length - 1;
    }

    public boolean isZero() {
        if (this.coefficients[0] != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public ModulusPoly multiply(ModulusPoly r13) {
        if (this.field.equals(r13.field) == false) goto L20;
        if (isZero() == true) goto L18;
        if (r13.isZero() == true) goto L18;
        int[] r02 = this.coefficients;
        int r1 = r02.length;
        int[] r132 = r13.coefficients;
        int r2 = r132.length;
        int[] r3 = new int[(r1 + r2) - 1];
        int r5 = 0;
    L10:
        if (r5 >= r1) goto L16;
        int r6 = r02[r5];
        int r7 = 0;
    L12:
        if (r7 >= r2) goto L14;
        int r8 = r5 + r7;
        ModulusGF r9 = this.field;
        r3[r8] = r9.add(r3[r8], r9.multiply(r6, r132[r7]));
        r7 = r7 + 1;
        goto L12
    L14:
        r5 = r5 + 1;
        goto L10
    L16:
        return new ModulusPoly(this.field, r3);
    L18:
        return this.field.getZero();
    L20:
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public ModulusPoly multiplyByMonomial(int r5, int r6) {
        if (r5 < 0) goto L12;
        if (r6 == 0) goto L5;
        int r02 = this.coefficients.length;
        int[] r52 = new int[r5 + r02];
        int r1 = 0;
    L7:
        if (r1 >= r02) goto L10;
        r52[r1] = this.field.multiply(this.coefficients[r1], r6);
        r1 = r1 + 1;
        goto L7
    L10:
        return new ModulusPoly(this.field, r52);
    L5:
        return this.field.getZero();
    L12:
        throw new IllegalArgumentException();
    }

    public ModulusPoly negative() {
        int r02 = this.coefficients.length;
        int[] r1 = new int[r02];
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L6;
        r1[r3] = this.field.subtract(0, this.coefficients[r3]);
        r3 = r3 + 1;
        goto L3
    L6:
        return new ModulusPoly(this.field, r1);
    }

    public ModulusPoly subtract(ModulusPoly r3) {
        if (this.field.equals(r3.field) == false) goto L10;
        if (r3.isZero() == false) goto L8;
        return this;
    L8:
        return add(r3.negative());
    L10:
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder(getDegree() * 8);
        int r1 = getDegree();
    L3:
        if (r1 < 0) goto L21;
        int r2 = getCoefficient(r1);
        if (r2 == 0) goto L19;
        if (r2 >= 0) goto L9;
        r02.append(" - ");
        r2 = -r2;
    L12:
        if (r1 == 0) goto L14;
        if (r2 != 1) goto L14;
    L15:
        if (r1 == 0) goto L19;
        if (r1 != 1) goto L18;
        r02.append('x');
        goto L19
    L18:
        r02.append("x^");
        r02.append(r1);
    L14:
        r02.append(r2);
        goto L15
    L9:
        if (r02.length() <= 0) goto L12;
        r02.append(" + ");
    L19:
        r1 = r1 - 1;
        goto L3
    L21:
        return r02.toString();
    }

    public ModulusPoly multiply(int r6) {
        if (r6 != 0) goto L6;
        return this.field.getZero();
    L6:
        if (r6 != 1) goto L8;
        return this;
    L8:
        int r02 = this.coefficients.length;
        int[] r1 = new int[r02];
        int r2 = 0;
    L9:
        if (r2 >= r02) goto L12;
        r1[r2] = this.field.multiply(this.coefficients[r2], r6);
        r2 = r2 + 1;
        goto L9
    L12:
        return new ModulusPoly(this.field, r1);
    }
}
