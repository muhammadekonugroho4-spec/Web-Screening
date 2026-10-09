package com.stockbit.usecase.company.model;

import java.util.List;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final List f156453a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156454b;

    public p(List r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "subsidiaries");
        kotlin.jvm.internal.p.l(r3, "lastUpdatedPeriod");
        this.f156453a = r2;
        this.f156454b = r3;
    }

    public final String a() {
        return this.f156454b;
    }

    public final List b() {
        return this.f156453a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f156453a, r52.f156453a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156454b, r52.f156454b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156453a.hashCode() * 31) + this.f156454b.hashCode();
    }

    public String toString() {
        return "CompanyProfileSubsidiaryUIState(subsidiaries=" + this.f156453a + ", lastUpdatedPeriod=" + this.f156454b + ")";
    }
}
