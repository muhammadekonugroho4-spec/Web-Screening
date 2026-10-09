package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f86640a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86641b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86642c;

    public h(String r2, String r3, long r4) {
        kotlin.jvm.internal.p.l(r2, "token");
        kotlin.jvm.internal.p.l(r3, "target");
        this.f86640a = r2;
        this.f86641b = r3;
        this.f86642c = r4;
    }

    public final long a() {
        return this.f86642c;
    }

    public final String b() {
        return this.f86641b;
    }

    public final String c() {
        return this.f86640a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (kotlin.jvm.internal.p.g(this.f86640a, r82.f86640a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86641b, r82.f86641b) == true) goto L15;
        return false;
    L15:
        if (this.f86642c == r82.f86642c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86640a.hashCode() * 31) + this.f86641b.hashCode()) * 31) + Long.hashCode(this.f86642c);
    }

    public String toString() {
        return "OTPChangeEmailEntity(token=" + this.f86640a + ", target=" + this.f86641b + ", nextAttemptIn=" + this.f86642c + ")";
    }
}
