package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.a;

/* loaded from: classes4.dex */
public final class b implements a.InterfaceC0318a {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f33137a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f33138b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.d r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
        this.f33137a = r1;
        this.f33138b = r2;
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0318a
    public byte[] a(int r3) {
        com.bumptech.glide.load.engine.bitmap_recycle.b r02 = this.f33138b;
        if (r02 != null) goto L7;
        return new byte[r3];
    L7:
        return (byte[]) r02.c(r3, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0318a
    public Bitmap b(int r2, int r3, Bitmap.Config r4) {
        return this.f33137a.e(r2, r3, r4);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0318a
    public int[] c(int r3) {
        com.bumptech.glide.load.engine.bitmap_recycle.b r02 = this.f33138b;
        if (r02 != null) goto L7;
        return new int[r3];
    L7:
        return (int[]) r02.c(r3, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0318a
    public void d(Bitmap r2) {
        this.f33137a.c(r2);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0318a
    public void e(byte[] r2) {
        com.bumptech.glide.load.engine.bitmap_recycle.b r02 = this.f33138b;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.put(r2);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0318a
    public void f(int[] r2) {
        com.bumptech.glide.load.engine.bitmap_recycle.b r02 = this.f33138b;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.put(r2);
    }
}
