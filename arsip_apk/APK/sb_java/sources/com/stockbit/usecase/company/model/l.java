package com.stockbit.usecase.company.model;

import java.util.List;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final List f156318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f156319b;

    /* renamed from: c, reason: collision with root package name */
    public final k f156320c;

    public l(List r2, int r3, k r4) {
        kotlin.jvm.internal.p.l(r2, "periods");
        kotlin.jvm.internal.p.l(r4, "tableData");
        this.f156318a = r2;
        this.f156319b = r3;
        this.f156320c = r4;
    }

    public final int a() {
        return this.f156319b;
    }

    public final k b() {
        return this.f156320c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f156318a, r52.f156318a) == true) goto L12;
        return false;
    L12:
        if (this.f156319b == r52.f156319b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156320c, r52.f156320c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156318a.hashCode() * 31) + Integer.hashCode(this.f156319b)) * 31) + this.f156320c.hashCode();
    }

    public String toString() {
        return "CompanyFinancialTableUIState(periods=" + this.f156318a + ", periodsCount=" + this.f156319b + ", tableData=" + this.f156320c + ")";
    }
}
