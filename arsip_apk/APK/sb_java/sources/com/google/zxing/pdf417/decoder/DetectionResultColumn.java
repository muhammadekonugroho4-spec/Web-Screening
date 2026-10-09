package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* loaded from: classes6.dex */
class DetectionResultColumn {
    private static final int MAX_NEARBY_DISTANCE = 5;
    private final BoundingBox boundingBox;
    private final Codeword[] codewords;

    public DetectionResultColumn(BoundingBox r2) {
        this.boundingBox = new BoundingBox(r2);
        this.codewords = new Codeword[(r2.getMaxY() - r2.getMinY()) + 1];
    }

    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public final Codeword getCodeword(int r2) {
        return this.codewords[imageRowToCodewordIndex(r2)];
    }

    public final Codeword getCodewordNearby(int r5) {
        Codeword r02 = getCodeword(r5);
        if (r02 == null) goto L5;
        return r02;
    L5:
        int r03 = 1;
    L7:
        if (r03 >= 5) goto L19;
        int r1 = imageRowToCodewordIndex(r5) - r03;
        if (r1 < 0) goto L13;
        Codeword r12 = this.codewords[r1];
        if (r12 == null) goto L13;
        return r12;
    L13:
        int r13 = imageRowToCodewordIndex(r5) + r03;
        Codeword[] r2 = this.codewords;
        if (r13 >= r2.length) goto L18;
        Codeword r14 = r2[r13];
        if (r14 == null) goto L18;
        return r14;
    L18:
        r03 = r03 + 1;
        goto L7
    L19:
        return null;
    }

    public final Codeword[] getCodewords() {
        return this.codewords;
    }

    public final int imageRowToCodewordIndex(int r2) {
        return r2 - this.boundingBox.getMinY();
    }

    public final void setCodeword(int r2, Codeword r3) {
        this.codewords[imageRowToCodewordIndex(r2)] = r3;
    }

    public String toString() {
        Formatter r02 = new Formatter();
        Codeword[] r1 = this.codewords;     // Catch: Throwable -> L8
        int r2 = r1.length;     // Catch: Throwable -> L8
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r3 >= r2) goto L12;
        Codeword r5 = r1[r3];     // Catch: Throwable -> L8
        if (r5 != null) goto L10;
        r02.format("%3d:    |   %n", new Object[]{Integer.valueOf(r4)});     // Catch: Throwable -> L8
        r4 = r4 + 1;     // Catch: Throwable -> L8
    L11:
        r3 = r3 + 1;     // Catch: Throwable -> L8
        goto L4
    L10:
        r02.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(r4), Integer.valueOf(r5.getRowNumber()), Integer.valueOf(r5.getValue())});     // Catch: Throwable -> L8
        r4 = r4 + 1;     // Catch: Throwable -> L8
        goto L11
    L12:
        String r12 = r02.toString();     // Catch: Throwable -> L8
        r02.close();
        return r12;
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L19
    L21:
        throw th;
    L19:
        th = move-exception;
        th.addSuppressed(th);
        goto L21
    }
}
