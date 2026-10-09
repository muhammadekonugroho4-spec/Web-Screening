package com.bumptech.glide.signature;

import com.bumptech.glide.util.k;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class d implements com.bumptech.glide.load.c {

    /* renamed from: b, reason: collision with root package name */
    public final Object f33373b;

    public d(Object r1) {
        this.f33373b = k.d(r1);
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest r3) {
        r3.update(this.f33373b.toString().getBytes(com.bumptech.glide.load.c.f32567a));
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object r2) {
        if ((r2 instanceof d) == true) goto L5;
        return false;
    L5:
        return this.f33373b.equals(((d) r2).f33373b);
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f33373b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f33373b + '}';
    }
}
