package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f86643a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86644b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86645c;

    public i(String r2, String r3, long r4) {
        kotlin.jvm.internal.p.l(r2, "token");
        kotlin.jvm.internal.p.l(r3, "target");
        this.f86643a = r2;
        this.f86644b = r3;
        this.f86645c = r4;
    }

    public final long a() {
        return this.f86645c;
    }

    public final String b() {
        return this.f86644b;
    }

    public final String c() {
        return this.f86643a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof i) == true) goto L8;
        return false;
    L8:
        i r82 = (i) r8;
        if (kotlin.jvm.internal.p.g(this.f86643a, r82.f86643a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86644b, r82.f86644b) == true) goto L15;
        return false;
    L15:
        if (this.f86645c == r82.f86645c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86643a.hashCode() * 31) + this.f86644b.hashCode()) * 31) + Long.hashCode(this.f86645c);
    }

    public String toString() {
        return "OTPChangePasswordEntity(token=" + this.f86643a + ", target=" + this.f86644b + ", nextAttemptIn=" + this.f86645c + ")";
    }
}
