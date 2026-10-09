package com.stockbit.usecase.login.model;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f158371a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158372b;

    public o(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "loginToken");
        kotlin.jvm.internal.p.l(r3, "verificationToken");
        this.f158371a = r2;
        this.f158372b = r3;
    }

    public final String a() {
        return this.f158371a;
    }

    public final String b() {
        return this.f158372b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f158371a, r52.f158371a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f158372b, r52.f158372b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f158371a.hashCode() * 31) + this.f158372b.hashCode();
    }

    public String toString() {
        return "UnfreezeAccountLoginUIState(loginToken=" + this.f158371a + ", verificationToken=" + this.f158372b + ')';
    }
}
