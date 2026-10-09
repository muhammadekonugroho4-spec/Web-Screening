package com.stockbit.domain.model.company.historicaldata;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f81533a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81534b;

    public a(b r2, List r3) {
        p.l(r2, "paginate");
        p.l(r3, "result");
        this.f81533a = r2;
        this.f81534b = r3;
    }

    public final List a() {
        return this.f81534b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81533a, r52.f81533a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81534b, r52.f81534b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81533a.hashCode() * 31) + this.f81534b.hashCode();
    }

    public String toString() {
        return "HistoricalDataEntity(paginate=" + this.f81533a + ", result=" + this.f81534b + ")";
    }
}
