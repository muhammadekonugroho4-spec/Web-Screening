package com.stockbit.usecase.company.model;

import java.util.List;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public List f156266a;

    /* renamed from: b, reason: collision with root package name */
    public List f156267b;

    /* renamed from: c, reason: collision with root package name */
    public final List f156268c;
    public final List d;

    public k(List r2, List r3, List r4, List r5) {
        kotlin.jvm.internal.p.l(r2, "rowHeader");
        kotlin.jvm.internal.p.l(r3, "columHeader");
        kotlin.jvm.internal.p.l(r4, "rowCell");
        kotlin.jvm.internal.p.l(r5, "changeValuePosition");
        this.f156266a = r2;
        this.f156267b = r3;
        this.f156268c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.d;
    }

    public final List b() {
        return this.f156267b;
    }

    public final List c() {
        return this.f156268c;
    }

    public final List d() {
        return this.f156266a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f156266a, r52.f156266a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156267b, r52.f156267b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156268c, r52.f156268c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f156266a.hashCode() * 31) + this.f156267b.hashCode()) * 31) + this.f156268c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CompanyFinancialTableDataUIState(rowHeader=" + this.f156266a + ", columHeader=" + this.f156267b + ", rowCell=" + this.f156268c + ", changeValuePosition=" + this.d + ")";
    }
}
