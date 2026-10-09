package com.stockbit.domain.model.valueobject.company.stockdividend;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f86825a;

    /* renamed from: b, reason: collision with root package name */
    public final List f86826b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86827c;

    public a(List r2, List r3, int r4) {
        p.l(r2, "headerRows");
        p.l(r3, "cellRows");
        this.f86825a = r2;
        this.f86826b = r3;
        this.f86827c = r4;
    }

    public final List a() {
        return this.f86825a;
    }

    public final List b() {
        return this.f86826b;
    }

    public final int c() {
        return this.f86827c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f86825a, r52.f86825a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86826b, r52.f86826b) == true) goto L15;
        return false;
    L15:
        if (this.f86827c == r52.f86827c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86825a.hashCode() * 31) + this.f86826b.hashCode()) * 31) + Integer.hashCode(this.f86827c);
    }

    public String toString() {
        return "StockDividendTableData(headerRows=" + this.f86825a + ", cellRows=" + this.f86826b + ", ratios=" + this.f86827c + ')';
    }
}
