package com.stockbit.domain.model.liveness;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84235b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84236c;
    public final String d;

    public a(String r2, String r3, int r4, String r5) {
        p.l(r2, "license");
        p.l(r3, "expiredAt");
        p.l(r5, "retryableAt");
        this.f84234a = r2;
        this.f84235b = r3;
        this.f84236c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f84235b;
    }

    public final String b() {
        return this.f84234a;
    }

    public final int c() {
        return this.f84236c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84234a, r52.f84234a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84235b, r52.f84235b) == true) goto L15;
        return false;
    L15:
        if (this.f84236c == r52.f84236c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84234a.hashCode() * 31) + this.f84235b.hashCode()) * 31) + Integer.hashCode(this.f84236c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "LivenessEligibilityEntity(license=" + this.f84234a + ", expiredAt=" + this.f84235b + ", quota=" + this.f84236c + ", retryableAt=" + this.d + ")";
    }
}
