package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes4.dex */
public final class h implements a {
    public h() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public /* bridge */ /* synthetic */ int a(Object r1) {
        return c((int[]) r1);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
        return 4;
    }

    public int c(int[] r1) {
        return r1.length;
    }

    public int[] d(int r1) {
        return new int[r1];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String getTag() {
        return "IntegerArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public /* bridge */ /* synthetic */ Object newArray(int r1) {
        return d(r1);
    }
}
