package com.google.zxing.common.reedsolomon;

/* loaded from: classes6.dex */
final class GenericGFPoly {
    private final int[] coefficients;
    private final GenericGF field;

    public GenericGFPoly(GenericGF r4, int[] r5) {
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

    public GenericGFPoly addOrSubtract(GenericGFPoly r8) {
        if (this.field.equals(r8.field) == false) goto L21;
        if (isZero() == false) goto L8;
        return r8;
    L8:
        if (r8.isZero() == false) goto L10;
        return this;
    L10:
        int[] r02 = this.coefficients;
        int[] r82 = r8.coefficients;
        if (r02.length > r82.length) goto L14;
        r02 = r82;
        r82 = r02;
    L14:
        int[] r1 = new int[r02.length];
        int r2 = r02.length - r82.length;
        System.arraycopy(r02, 0, r1, 0, r2);
        int r3 = r2;
    L16:
        if (r3 >= r02.length) goto L19;
        r1[r3] = GenericGF.addOrSubtract(r82[r3 - r2], r02[r3]);
        r3 = r3 + 1;
        goto L16
    L19:
        return new GenericGFPoly(this.field, r1);
    L21:
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public GenericGFPoly[] divide(GenericGFPoly r8) {
        if (this.field.equals(r8.field) == false) goto L17;
        if (r8.isZero() == true) goto L15;
        GenericGFPoly r02 = this.field.getZero();
        int r1 = r8.getCoefficient(r8.getDegree());
        int r12 = this.field.inverse(r1);
        GenericGFPoly r2 = this;
    L8:
        if (r2.getDegree() < r8.getDegree()) goto L13;
        if (r2.isZero() == true) goto L13;
        int r3 = r2.getDegree() - r8.getDegree();
        int r4 = this.field.multiply(r2.getCoefficient(r2.getDegree()), r12);
        GenericGFPoly r5 = r8.multiplyByMonomial(r3, r4);
        r02 = r02.addOrSubtract(this.field.buildMonomial(r3, r4));
        r2 = r2.addOrSubtract(r5);
    L13:
        return new GenericGFPoly[]{r02, r2};
    L15:
        throw new IllegalArgumentException("Divide by 0");
    L17:
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public int evaluateAt(int r5) {
        int r02 = 0;
        if (r5 == 0) goto L5;
        int r1 = 1;
        if (r5 != 1) goto L12;
        int[] r52 = this.coefficients;
        int r12 = r52.length;
        int r2 = 0;
    L9:
        if (r02 >= r12) goto L11;
        r2 = GenericGF.addOrSubtract(r2, r52[r02]);
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
        r03 = GenericGF.addOrSubtract(this.field.multiply(r5, r03), this.coefficients[r1]);
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

    public GenericGFPoly multiply(GenericGFPoly r13) {
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
        r3[r8] = GenericGF.addOrSubtract(r3[r8], this.field.multiply(r6, r132[r7]));
        r7 = r7 + 1;
        goto L12
    L14:
        r5 = r5 + 1;
        goto L10
    L16:
        return new GenericGFPoly(this.field, r3);
    L18:
        return this.field.getZero();
    L20:
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public GenericGFPoly multiplyByMonomial(int r5, int r6) {
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
        return new GenericGFPoly(this.field, r52);
    L5:
        return this.field.getZero();
    L12:
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder(getDegree() * 8);
        int r1 = getDegree();
    L3:
        if (r1 < 0) goto L26;
        int r2 = getCoefficient(r1);
        if (r2 == 0) goto L24;
        if (r2 >= 0) goto L9;
        r02.append(" - ");
        r2 = -r2;
    L12:
        if (r1 == 0) goto L14;
        if (r2 != 1) goto L14;
    L20:
        if (r1 == 0) goto L24;
        if (r1 != 1) goto L23;
        r02.append('x');
        goto L24
    L23:
        r02.append("x^");
        r02.append(r1);
    L14:
        int r22 = this.field.log(r2);
        if (r22 != 0) goto L17;
        r02.append('1');
        goto L20
    L17:
        if (r22 != 1) goto L19;
        r02.append('a');
        goto L20
    L19:
        r02.append("a^");
        r02.append(r22);
        goto L20
    L9:
        if (r02.length() <= 0) goto L12;
        r02.append(" + ");
    L24:
        r1 = r1 - 1;
        goto L3
    L26:
        return r02.toString();
    }

    public GenericGFPoly multiply(int r6) {
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
        return new GenericGFPoly(this.field, r1);
    }
}
