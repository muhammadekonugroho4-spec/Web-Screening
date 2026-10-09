package com.koushikdutta.ion.bitmap;

/* loaded from: classes6.dex */
public class BitmapDecodeException extends Exception {
    public final int height;
    public final int width;

    public BitmapDecodeException(int r1, int r2) {
        this.width = r1;
        this.height = r2;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + " size=" + this.width + 'x' + this.height;
    }
}
