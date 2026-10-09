package com.koushikdutta.async;

/* loaded from: classes6.dex */
public abstract class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f41610a;

    /* renamed from: b, reason: collision with root package name */
    public com.koushikdutta.async.callback.a f41611b;

    /* renamed from: c, reason: collision with root package name */
    public com.koushikdutta.async.callback.c f41612c;

    public r() {
    }

    public void A(Exception r2) {
        if (this.f41610a == true) goto L10;
        this.f41610a = true;
        if (z() == null) goto L9;
        z().a(r2);
        return;
    L9:
        return;
    }

    @Override // com.koushikdutta.async.q
    public com.koushikdutta.async.callback.c p() {
        return this.f41612c;
    }

    @Override // com.koushikdutta.async.q
    public final void w(com.koushikdutta.async.callback.a r1) {
        this.f41611b = r1;
    }

    @Override // com.koushikdutta.async.q
    public void x(com.koushikdutta.async.callback.c r1) {
        this.f41612c = r1;
    }

    public final com.koushikdutta.async.callback.a z() {
        return this.f41611b;
    }
}
