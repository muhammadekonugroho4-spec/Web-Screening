package com.stockbit.domain.model.company.corpaction;

import com.stockbit.company.CompanyEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81445b;

    public a(String r2, String r3) {
        p.l(r2, "code");
        p.l(r3, CompanyEntryPoint.EXTRA_DESC);
        this.f81444a = r2;
        this.f81445b = r3;
    }

    public final String a() {
        return this.f81444a;
    }

    public final String b() {
        return this.f81445b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81444a, r52.f81444a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81445b, r52.f81445b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81444a.hashCode() * 31) + this.f81445b.hashCode();
    }

    public String toString() {
        return "CorpActionNotationEntity(code=" + this.f81444a + ", desc=" + this.f81445b + ")";
    }
}
