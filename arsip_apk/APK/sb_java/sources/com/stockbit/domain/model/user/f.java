package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f86634a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86635b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86636c;

    public f(String r2, int r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "token");
        kotlin.jvm.internal.p.l(r4, "target");
        this.f86634a = r2;
        this.f86635b = r3;
        this.f86636c = r4;
    }

    public final int a() {
        return this.f86635b;
    }

    public final String b() {
        return this.f86634a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f86634a, r52.f86634a) == true) goto L12;
        return false;
    L12:
        if (this.f86635b == r52.f86635b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86636c, r52.f86636c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86634a.hashCode() * 31) + Integer.hashCode(this.f86635b)) * 31) + this.f86636c.hashCode();
    }

    public String toString() {
        return "ForgotPasswordOTPEntity(token=" + this.f86634a + ", nextAttemptIn=" + this.f86635b + ", target=" + this.f86636c + ")";
    }
}
