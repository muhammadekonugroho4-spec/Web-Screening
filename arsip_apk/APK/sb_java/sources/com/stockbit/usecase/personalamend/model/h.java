package com.stockbit.usecase.personalamend.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f159059a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159060b;

    /* renamed from: c, reason: collision with root package name */
    public final long f159061c;

    public h(String r2, String r3, long r4) {
        p.l(r2, "token");
        p.l(r3, "target");
        this.f159059a = r2;
        this.f159060b = r3;
        this.f159061c = r4;
    }

    public final long a() {
        return this.f159061c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (p.g(this.f159059a, r82.f159059a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159060b, r82.f159060b) == true) goto L15;
        return false;
    L15:
        if (this.f159061c == r82.f159061c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f159059a.hashCode() * 31) + this.f159060b.hashCode()) * 31) + Long.hashCode(this.f159061c);
    }

    public String toString() {
        return "OTPChangeEmailUIState(token=" + this.f159059a + ", target=" + this.f159060b + ", nextAttemptIn=" + this.f159061c + ")";
    }
}
