package com.stockbit.usecase.company.model;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f156555a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156556b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.usecase.company.e f156557c;

    public r(String r2, String r3, com.stockbit.usecase.company.e r4) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "content");
        kotlin.jvm.internal.p.l(r4, "masks");
        this.f156555a = r2;
        this.f156556b = r3;
        this.f156557c = r4;
    }

    public final String a() {
        return this.f156556b;
    }

    public final com.stockbit.usecase.company.e b() {
        return this.f156557c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f156555a, r52.f156555a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156556b, r52.f156556b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156557c, r52.f156557c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156555a.hashCode() * 31) + this.f156556b.hashCode()) * 31) + this.f156557c.hashCode();
    }

    public String toString() {
        return "CompanyResearchUIState(symbol=" + this.f156555a + ", content=" + this.f156556b + ", masks=" + this.f156557c + ")";
    }
}
