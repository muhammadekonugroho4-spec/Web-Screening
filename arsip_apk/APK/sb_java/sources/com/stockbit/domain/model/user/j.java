package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f86646a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86647b;

    public j(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "token");
        kotlin.jvm.internal.p.l(r3, "nextAttemptTime");
        this.f86646a = r2;
        this.f86647b = r3;
    }

    public final String a() {
        return this.f86647b;
    }

    public final String b() {
        return this.f86646a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f86646a, r52.f86646a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86647b, r52.f86647b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86646a.hashCode() * 31) + this.f86647b.hashCode();
    }

    public String toString() {
        return "OTPForgotPasswordNonLoginEntity(token=" + this.f86646a + ", nextAttemptTime=" + this.f86647b + ")";
    }
}
