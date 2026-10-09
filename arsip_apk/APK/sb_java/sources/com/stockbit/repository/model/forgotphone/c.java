package com.stockbit.repository.model.forgotphone;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f130230a;

    /* renamed from: b, reason: collision with root package name */
    public final String f130231b;

    /* renamed from: c, reason: collision with root package name */
    public final long f130232c;

    public c(String r2, String r3, long r4) {
        p.l(r2, "token");
        p.l(r3, "target");
        this.f130230a = r2;
        this.f130231b = r3;
        this.f130232c = r4;
    }

    public final long a() {
        return this.f130232c;
    }

    public final String b() {
        return this.f130230a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f130230a, r82.f130230a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f130231b, r82.f130231b) == true) goto L15;
        return false;
    L15:
        if (this.f130232c == r82.f130232c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f130230a.hashCode() * 31) + this.f130231b.hashCode()) * 31) + Long.hashCode(this.f130232c);
    }

    public String toString() {
        return "RequestOtpNewPhoneEntity(token=" + this.f130230a + ", target=" + this.f130231b + ", nextAttemptIn=" + this.f130232c + ")";
    }
}
