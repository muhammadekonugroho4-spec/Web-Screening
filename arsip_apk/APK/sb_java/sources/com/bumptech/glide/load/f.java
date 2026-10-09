package com.bumptech.glide.load;

import androidx.collection.C2337a;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    public final C2337a f32898b;

    public f() {
        this.f32898b = new com.bumptech.glide.util.b();
    }

    public static void g(e r02, Object r1, MessageDigest r2) {
        r02.g(r1, r2);
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest r4) {
        int r02 = 0;
    L4:
        if (r02 >= this.f32898b.size()) goto L6;
        g((e) this.f32898b.g(r02), this.f32898b.l(r02), r4);
        r02 = r02 + 1;
        goto L4
    }

    public Object c(e r2) {
        if (this.f32898b.containsKey(r2) == false) goto L7;
        return this.f32898b.get(r2);
    L7:
        return r2.c();
    }

    public void d(f r2) {
        this.f32898b.h(r2.f32898b);
    }

    public f e(e r2) {
        this.f32898b.remove(r2);
        return this;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object r2) {
        if ((r2 instanceof f) == true) goto L5;
        return false;
    L5:
        return this.f32898b.equals(((f) r2).f32898b);
    }

    public f f(e r2, Object r3) {
        this.f32898b.put(r2, r3);
        return this;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f32898b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f32898b + '}';
    }
}
