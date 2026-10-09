package com.stockbit.usecase.login.model;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f158352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158353b;

    public d(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "loginToken");
        kotlin.jvm.internal.p.l(r3, "verificationToken");
        this.f158352a = r2;
        this.f158353b = r3;
    }

    public final String a() {
        return this.f158352a;
    }

    public final String b() {
        return this.f158353b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f158352a, r52.f158352a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f158353b, r52.f158353b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f158352a.hashCode() * 31) + this.f158353b.hashCode();
    }

    public String toString() {
        return "DoubleOtpLoginUIState(loginToken=" + this.f158352a + ", verificationToken=" + this.f158353b + ')';
    }
}
