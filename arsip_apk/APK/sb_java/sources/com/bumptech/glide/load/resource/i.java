package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.k;

/* loaded from: classes4.dex */
public abstract class i implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33185a;

    public i(Object r1) {
        this.f33185a = k.d(r1);
    }

    @Override // com.bumptech.glide.load.engine.s
    public Class a() {
        return this.f33185a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.s
    public final Object get() {
        return this.f33185a;
    }

    @Override // com.bumptech.glide.load.engine.s
    public final int getSize() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
    }
}
