package com.google.android.play.core.integrity;

/* loaded from: classes5.dex */
public final class au implements com.google.android.play.integrity.internal.ak {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f38245a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f38246b;

    public au(com.google.android.play.integrity.internal.an r1, com.google.android.play.integrity.internal.an r2) {
        this.f38245a = r1;
        this.f38246b = r2;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }

    public final at b() {
        return new at(this.f38245a, this.f38246b);
    }
}
