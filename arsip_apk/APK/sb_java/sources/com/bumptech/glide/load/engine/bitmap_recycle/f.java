package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes4.dex */
public final class f implements a {
    public f() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public /* bridge */ /* synthetic */ int a(Object r1) {
        return c((byte[]) r1);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
        return 1;
    }

    public int c(byte[] r1) {
        return r1.length;
    }

    public byte[] d(int r1) {
        return new byte[r1];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String getTag() {
        return "ByteArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public /* bridge */ /* synthetic */ Object newArray(int r1) {
        return d(r1);
    }
}
