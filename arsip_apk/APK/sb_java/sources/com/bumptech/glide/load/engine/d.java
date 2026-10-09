package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.cache.a;
import java.io.File;

/* loaded from: classes4.dex */
public class d implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.a f32745a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f32746b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.f f32747c;

    public d(com.bumptech.glide.load.a r1, Object r2, com.bumptech.glide.load.f r3) {
        this.f32745a = r1;
        this.f32746b = r2;
        this.f32747c = r3;
    }

    @Override // com.bumptech.glide.load.engine.cache.a.b
    public boolean a(File r4) {
        return this.f32745a.a(this.f32746b, r4, this.f32747c);
    }
}
