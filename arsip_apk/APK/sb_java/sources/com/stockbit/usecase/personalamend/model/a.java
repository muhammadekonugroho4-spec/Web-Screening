package com.stockbit.usecase.personalamend.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f159012a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159013b;

    public a(String r2, String r3) {
        p.l(r2, "phoneNumber");
        p.l(r3, "email");
        this.f159012a = r2;
        this.f159013b = r3;
    }

    public final String a() {
        return this.f159013b;
    }

    public final String b() {
        return this.f159012a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f159012a, r52.f159012a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159013b, r52.f159013b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f159012a.hashCode() * 31) + this.f159013b.hashCode();
    }

    public String toString() {
        return "AmendProfileUIState(phoneNumber=" + this.f159012a + ", email=" + this.f159013b + ")";
    }
}
