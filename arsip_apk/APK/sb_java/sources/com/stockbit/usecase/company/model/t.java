package com.stockbit.usecase.company.model;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f156579a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156580b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156581c;

    public t(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "companyName");
        kotlin.jvm.internal.p.l(r3, "percentage");
        kotlin.jvm.internal.p.l(r4, "businessType");
        this.f156579a = r2;
        this.f156580b = r3;
        this.f156581c = r4;
    }

    public final String a() {
        return this.f156581c;
    }

    public final String b() {
        return this.f156579a;
    }

    public final String c() {
        return this.f156580b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof t) == true) goto L8;
        return false;
    L8:
        t r52 = (t) r5;
        if (kotlin.jvm.internal.p.g(this.f156579a, r52.f156579a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156580b, r52.f156580b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156581c, r52.f156581c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156579a.hashCode() * 31) + this.f156580b.hashCode()) * 31) + this.f156581c.hashCode();
    }

    public String toString() {
        return "CompanySubsidiaryUIState(companyName=" + this.f156579a + ", percentage=" + this.f156580b + ", businessType=" + this.f156581c + ")";
    }
}
