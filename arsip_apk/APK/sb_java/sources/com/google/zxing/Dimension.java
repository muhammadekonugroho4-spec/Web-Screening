package com.google.zxing;

/* loaded from: classes6.dex */
public final class Dimension {
    private final int height;
    private final int width;

    public Dimension(int r1, int r2) {
        if (r1 < 0) goto L8;
        if (r2 < 0) goto L8;
        this.width = r1;
        this.height = r2;
        return;
    L8:
        throw new IllegalArgumentException();
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof Dimension) == false) goto L10;
        Dimension r42 = (Dimension) r4;
        if (this.width != r42.width) goto L10;
        if (this.height != r42.height) goto L10;
        return true;
    L10:
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 32713) + this.height;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
