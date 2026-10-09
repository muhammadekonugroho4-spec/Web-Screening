package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f86149a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86150b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86151c;
    public final String d;

    public k(String r2, String r3, String r4, String r5) {
        p.l(r2, "token");
        p.l(r3, "target");
        p.l(r4, "channel");
        p.l(r5, "nextAttemptTime");
        this.f86149a = r2;
        this.f86150b = r3;
        this.f86151c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f86151c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f86150b;
    }

    public final String d() {
        return this.f86149a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f86149a, r52.f86149a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86150b, r52.f86150b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86151c, r52.f86151c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f86149a.hashCode() * 31) + this.f86150b.hashCode()) * 31) + this.f86151c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TrustedDeviceOTPEntity(token=" + this.f86149a + ", target=" + this.f86150b + ", channel=" + this.f86151c + ", nextAttemptTime=" + this.d + ")";
    }
}
