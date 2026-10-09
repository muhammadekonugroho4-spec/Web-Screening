package com.stockbit.usecase.company.model.profile;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f156504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156505b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156506c;
    public final String d;

    public i(String r2, String r3, String r4, String r5) {
        p.l(r2, "shareholderDate");
        p.l(r3, "totalShare");
        p.l(r4, "change");
        p.l(r5, "changeFormatted");
        this.f156504a = r2;
        this.f156505b = r3;
        this.f156506c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f156506c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f156504a;
    }

    public final String d() {
        return this.f156505b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f156504a, r52.f156504a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156505b, r52.f156505b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156506c, r52.f156506c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f156504a.hashCode() * 31) + this.f156505b.hashCode()) * 31) + this.f156506c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CompanyProfileShareHolderNumberUIState(shareholderDate=" + this.f156504a + ", totalShare=" + this.f156505b + ", change=" + this.f156506c + ", changeFormatted=" + this.d + ")";
    }
}
