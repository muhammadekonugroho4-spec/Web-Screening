package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.k;

/* loaded from: classes4.dex */
public class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f33120a;

    public b(byte[] r1) {
        this.f33120a = (byte[]) k.d(r1);
    }

    @Override // com.bumptech.glide.load.engine.s
    public Class a() {
        return byte[].class;
    }

    public byte[] b() {
        return this.f33120a;
    }

    @Override // com.bumptech.glide.load.engine.s
    public /* bridge */ /* synthetic */ Object get() {
        return b();
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return this.f33120a.length;
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
    }
}
