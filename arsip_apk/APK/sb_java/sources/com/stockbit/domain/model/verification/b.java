package com.stockbit.domain.model.verification;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f87209a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87210b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87211c;

    public b(String r2, String r3, boolean r4) {
        p.l(r2, "sessionId");
        p.l(r3, "verificationToken");
        this.f87209a = r2;
        this.f87210b = r3;
        this.f87211c = r4;
    }

    public final boolean a() {
        return this.f87211c;
    }

    public final String b() {
        return this.f87209a;
    }

    public final String c() {
        return this.f87210b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87209a, r52.f87209a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87210b, r52.f87210b) == true) goto L15;
        return false;
    L15:
        if (this.f87211c == r52.f87211c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f87209a.hashCode() * 31) + this.f87210b.hashCode()) * 31) + Boolean.hashCode(this.f87211c);
    }

    public String toString() {
        return "InitializeVerificationEntity(sessionId=" + this.f87209a + ", verificationToken=" + this.f87210b + ", goAhead=" + this.f87211c + ")";
    }
}
