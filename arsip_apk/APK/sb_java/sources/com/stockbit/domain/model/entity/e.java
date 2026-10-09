package com.stockbit.domain.model.entity;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f82742a;

    /* renamed from: b, reason: collision with root package name */
    public String f82743b;

    public e(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "averageType");
        kotlin.jvm.internal.p.l(r3, "averageTypeText");
        this.f82742a = r2;
        this.f82743b = r3;
    }

    public final String a() {
        return this.f82742a;
    }

    public final String b() {
        return this.f82743b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f82742a, r52.f82742a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82743b, r52.f82743b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f82742a.hashCode() * 31) + this.f82743b.hashCode();
    }

    public String toString() {
        return "CompanyAverageType(averageType=" + this.f82742a + ", averageTypeText=" + this.f82743b + ')';
    }
}
