package com.stockbit.domain.model.company.seasonality;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f81923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81924b;

    public c(List r2, int r3) {
        p.l(r2, "columns");
        this.f81923a = r2;
        this.f81924b = r3;
    }

    public final List a() {
        return this.f81923a;
    }

    public final int b() {
        return this.f81924b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f81923a, r52.f81923a) == true) goto L12;
        return false;
    L12:
        if (this.f81924b == r52.f81924b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81923a.hashCode() * 31) + Integer.hashCode(this.f81924b);
    }

    public String toString() {
        return "PriceChangeEntity(columns=" + this.f81923a + ", row=" + this.f81924b + ")";
    }
}
