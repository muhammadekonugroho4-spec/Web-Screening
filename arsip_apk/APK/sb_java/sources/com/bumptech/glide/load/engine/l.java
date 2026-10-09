package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes4.dex */
public class l implements com.bumptech.glide.load.c {

    /* renamed from: b, reason: collision with root package name */
    public final Object f32848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32849c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f32850e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f32851f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.load.c f32852g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f32853h;

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.load.f f32854i;

    /* renamed from: j, reason: collision with root package name */
    public int f32855j;

    public l(Object r1, com.bumptech.glide.load.c r2, int r3, int r4, Map r5, Class r6, Class r7, com.bumptech.glide.load.f r8) {
        this.f32848b = com.bumptech.glide.util.k.d(r1);
        this.f32852g = (com.bumptech.glide.load.c) com.bumptech.glide.util.k.e(r2, "Signature must not be null");
        this.f32849c = r3;
        this.d = r4;
        this.f32853h = (Map) com.bumptech.glide.util.k.d(r5);
        this.f32850e = (Class) com.bumptech.glide.util.k.e(r6, "Resource class must not be null");
        this.f32851f = (Class) com.bumptech.glide.util.k.e(r7, "Transcode class must not be null");
        this.f32854i = (com.bumptech.glide.load.f) com.bumptech.glide.util.k.d(r8);
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest r1) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object r4) {
        if ((r4 instanceof l) == false) goto L22;
        l r42 = (l) r4;
        if (this.f32848b.equals(r42.f32848b) == false) goto L22;
        if (this.f32852g.equals(r42.f32852g) == false) goto L22;
        if (this.d != r42.d) goto L22;
        if (this.f32849c != r42.f32849c) goto L22;
        if (this.f32853h.equals(r42.f32853h) == false) goto L22;
        if (this.f32850e.equals(r42.f32850e) == false) goto L22;
        if (this.f32851f.equals(r42.f32851f) == false) goto L22;
        if (this.f32854i.equals(r42.f32854i) == false) goto L22;
        return true;
    L22:
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        if (this.f32855j != 0) goto L6;
        int r02 = this.f32848b.hashCode();
        this.f32855j = r02;
        int r03 = (((((r02 * 31) + this.f32852g.hashCode()) * 31) + this.f32849c) * 31) + this.d;
        this.f32855j = r03;
        int r04 = (r03 * 31) + this.f32853h.hashCode();
        this.f32855j = r04;
        int r05 = (r04 * 31) + this.f32850e.hashCode();
        this.f32855j = r05;
        int r06 = (r05 * 31) + this.f32851f.hashCode();
        this.f32855j = r06;
        this.f32855j = (r06 * 31) + this.f32854i.hashCode();
    L6:
        return this.f32855j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f32848b + ", width=" + this.f32849c + ", height=" + this.d + ", resourceClass=" + this.f32850e + ", transcodeClass=" + this.f32851f + ", signature=" + this.f32852g + ", hashCode=" + this.f32855j + ", transformations=" + this.f32853h + ", options=" + this.f32854i + '}';
    }
}
