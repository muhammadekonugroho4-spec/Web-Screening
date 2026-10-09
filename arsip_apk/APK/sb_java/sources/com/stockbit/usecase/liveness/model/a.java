package com.stockbit.usecase.liveness.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158226a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158227b;

    /* renamed from: c, reason: collision with root package name */
    public final int f158228c;
    public final long d;

    public a(String r2, String r3, int r4, long r5) {
        p.l(r2, "license");
        p.l(r3, "expiredAt");
        this.f158226a = r2;
        this.f158227b = r3;
        this.f158228c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f158226a;
    }

    public final long b() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f158226a, r82.f158226a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158227b, r82.f158227b) == true) goto L15;
        return false;
    L15:
        if (this.f158228c == r82.f158228c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f158226a.hashCode() * 31) + this.f158227b.hashCode()) * 31) + Integer.hashCode(this.f158228c)) * 31) + Long.hashCode(this.d);
    }

    public String toString() {
        return "LivenessEligibilityUIState(license=" + this.f158226a + ", expiredAt=" + this.f158227b + ", quota=" + this.f158228c + ", retryTimestamp=" + this.d + ")";
    }
}
