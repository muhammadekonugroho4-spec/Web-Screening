package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.h;
import com.bumptech.glide.load.engine.s;

/* loaded from: classes4.dex */
public class g extends com.bumptech.glide.util.h implements h {

    /* renamed from: e, reason: collision with root package name */
    public h.a f32727e;

    public g(long r1) {
        super(r1);
    }

    @Override // com.bumptech.glide.load.engine.cache.h
    public void a(int r5) {
        if (r5 < 40) goto L7;
        b();
        return;
    L7:
        if (r5 < 20) goto L9;
    L12:
        m(h() / 2);
        return;
    L9:
        if (r5 == 15) goto L12;
    }

    @Override // com.bumptech.glide.load.engine.cache.h
    public /* bridge */ /* synthetic */ s c(com.bumptech.glide.load.c r1, s r2) {
        return (s) super.k(r1, r2);
    }

    @Override // com.bumptech.glide.load.engine.cache.h
    public /* bridge */ /* synthetic */ s d(com.bumptech.glide.load.c r1) {
        return (s) super.l(r1);
    }

    @Override // com.bumptech.glide.load.engine.cache.h
    public void e(h.a r1) {
        this.f32727e = r1;
    }

    @Override // com.bumptech.glide.util.h
    public /* bridge */ /* synthetic */ int i(Object r1) {
        return n((s) r1);
    }

    @Override // com.bumptech.glide.util.h
    public /* bridge */ /* synthetic */ void j(Object r1, Object r2) {
        o((com.bumptech.glide.load.c) r1, (s) r2);
    }

    public int n(s r1) {
        if (r1 != null) goto L6;
        return super.i(null);
    L6:
        return r1.getSize();
    }

    public void o(com.bumptech.glide.load.c r1, s r2) {
        h.a r12 = this.f32727e;
        if (r12 == null) goto L7;
        if (r2 == null) goto L8;
        r12.d(r2);
        return;
    L8:
        return;
    }
}
