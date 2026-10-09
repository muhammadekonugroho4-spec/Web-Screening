package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.Queue;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f32677a;

    public c() {
        this.f32677a = com.bumptech.glide.util.l.f(20);
    }

    public abstract l a();

    public l b() {
        l r02 = (l) this.f32677a.poll();
        if (r02 == null) goto L5;
        return r02;
    L5:
        return a();
    }

    public void c(l r3) {
        if (this.f32677a.size() >= 20) goto L6;
        this.f32677a.offer(r3);
        return;
    }
}
