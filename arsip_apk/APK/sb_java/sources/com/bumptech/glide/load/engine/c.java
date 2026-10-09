package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class c implements com.bumptech.glide.load.c {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.c f32712b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.c f32713c;

    public c(com.bumptech.glide.load.c r1, com.bumptech.glide.load.c r2) {
        this.f32712b = r1;
        this.f32713c = r2;
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest r2) {
        this.f32712b.b(r2);
        this.f32713c.b(r2);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object r4) {
        if ((r4 instanceof c) == false) goto L10;
        c r42 = (c) r4;
        if (this.f32712b.equals(r42.f32712b) == false) goto L10;
        if (this.f32713c.equals(r42.f32713c) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return (this.f32712b.hashCode() * 31) + this.f32713c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f32712b + ", signature=" + this.f32713c + '}';
    }
}
