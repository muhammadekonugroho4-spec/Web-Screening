package com.bumptech.glide;

import com.bumptech.glide.util.k;
import com.bumptech.glide.util.l;

/* loaded from: classes4.dex */
public abstract class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public com.bumptech.glide.request.transition.e f32551a;

    public j() {
        this.f32551a = com.bumptech.glide.request.transition.c.c();
    }

    public final j a() {
        return (j) super.clone();
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public final com.bumptech.glide.request.transition.e b() {
        return this.f32551a;
    }

    public final j c() {
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    public final j e(com.bumptech.glide.request.transition.e r1) {
        this.f32551a = (com.bumptech.glide.request.transition.e) k.d(r1);
        return c();
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof j) == true) goto L5;
        return false;
    L5:
        return l.d(this.f32551a, ((j) r2).f32551a);
    }

    public int hashCode() {
        com.bumptech.glide.request.transition.e r02 = this.f32551a;
        if (r02 != null) goto L5;
        return 0;
    L5:
        return r02.hashCode();
    }
}
