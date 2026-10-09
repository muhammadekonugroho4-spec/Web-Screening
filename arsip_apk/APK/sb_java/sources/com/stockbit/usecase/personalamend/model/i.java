package com.stockbit.usecase.personalamend.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f159062a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159063b;

    /* renamed from: c, reason: collision with root package name */
    public final long f159064c;

    public i(String r2, String r3, long r4) {
        p.l(r2, "token");
        p.l(r3, "target");
        this.f159062a = r2;
        this.f159063b = r3;
        this.f159064c = r4;
    }

    public final long a() {
        return this.f159064c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof i) == true) goto L8;
        return false;
    L8:
        i r82 = (i) r8;
        if (p.g(this.f159062a, r82.f159062a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159063b, r82.f159063b) == true) goto L15;
        return false;
    L15:
        if (this.f159064c == r82.f159064c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f159062a.hashCode() * 31) + this.f159063b.hashCode()) * 31) + Long.hashCode(this.f159064c);
    }

    public String toString() {
        return "OTPChangePasswordUIState(token=" + this.f159062a + ", target=" + this.f159063b + ", nextAttemptIn=" + this.f159064c + ")";
    }
}
