package com.bumptech.glide.load.data;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class g extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f32580c = null;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f32581e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final byte f32582a;

    /* renamed from: b, reason: collision with root package name */
    public int f32583b;

    static {
        byte[] r02 = {-1, -31, 0, Ascii.FS, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};
        f32580c = r02;
        int r03 = r02.length;
        d = r03;
        f32581e = r03 + 2;
    }

    public g(InputStream r3, int r4) {
        super(r3);
        if (r4 < (-1)) goto L9;
        if (r4 > 8) goto L9;
        this.f32582a = (byte) r4;
        return;
    L9:
        throw new IllegalArgumentException("Cannot add invalid orientation: " + r4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int r02 = this.f32583b;
        if (r02 < 2) goto L10;
        int r2 = f32581e;
        if (r02 > r2) goto L10;
        if (r02 != r2) goto L9;
        int r03 = this.f32582a;
    L12:
        if (r03 == (-1)) goto L14;
        this.f32583b++;
    L14:
        return r03;
    L9:
        r03 = f32580c[r02 - 2] & UnsignedBytes.MAX_VALUE;
    L10:
        r03 = super.read();
        goto L12
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r3) {
        long r32 = super.skip(r3);
        if (r32 <= 0) goto L5;
        this.f32583b = (int) (this.f32583b + r32);
    L5:
        return r32;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r4, int r5, int r6) {
        int r02 = this.f32583b;
        int r1 = f32581e;
        if (r02 <= r1) goto L5;
        int r42 = super.read(r4, r5, r6);
    L11:
        if (r42 <= 0) goto L13;
        this.f32583b += r42;
    L13:
        return r42;
    L5:
        if (r02 != r1) goto L8;
        r4[r5] = this.f32582a;
        r42 = 1;
        goto L11
    L8:
        if (r02 >= 2) goto L10;
        r42 = super.read(r4, r5, 2 - r02);
        goto L11
    L10:
        int r62 = Math.min(r1 - r02, r6);
        System.arraycopy(f32580c, this.f32583b - 2, r4, r5, r62);
        r42 = r62;
        goto L11
    }
}
