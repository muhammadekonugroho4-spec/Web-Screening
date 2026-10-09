package com.google.zxing.pdf417.encoder;

/* loaded from: classes6.dex */
final class BarcodeRow {
    private int currentLocation;
    private final byte[] row;

    public BarcodeRow(int r1) {
        this.row = new byte[r1];
        this.currentLocation = 0;
    }

    public void addBar(boolean r4, int r5) {
        int r02 = 0;
    L3:
        if (r02 >= r5) goto L5;
        int r1 = this.currentLocation;
        this.currentLocation = r1 + 1;
        set(r1, r4);
        r02 = r02 + 1;
        goto L3
    }

    public byte[] getScaledRow(int r6) {
        int r02 = this.row.length * r6;
        byte[] r1 = new byte[r02];
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1[r2] = this.row[r2 / r6];
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public void set(int r2, byte r3) {
        this.row[r2] = r3;
    }

    private void set(int r2, boolean r3) {
        this.row[r2] = r3 ? 1 : 0;
    }
}
