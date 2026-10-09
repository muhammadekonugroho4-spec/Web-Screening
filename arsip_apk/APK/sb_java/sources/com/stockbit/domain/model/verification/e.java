package com.stockbit.domain.model.verification;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f87216a;

    /* renamed from: b, reason: collision with root package name */
    public final long f87217b;

    public e(String r2, long r3) {
        p.l(r2, "target");
        this.f87216a = r2;
        this.f87217b = r3;
    }

    public final long a() {
        return this.f87217b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (p.g(this.f87216a, r82.f87216a) == true) goto L12;
        return false;
    L12:
        if (this.f87217b == r82.f87217b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f87216a.hashCode() * 31) + Long.hashCode(this.f87217b);
    }

    public String toString() {
        return "VerificationOTPEntity(target=" + this.f87216a + ", nextAttemptIn=" + this.f87217b + ")";
    }
}
