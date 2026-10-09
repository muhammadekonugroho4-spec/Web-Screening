package com.stockbit.usecase.company.model.seasonality;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public List f156571a;

    /* renamed from: b, reason: collision with root package name */
    public int f156572b;

    public b(List r2, int r3) {
        p.l(r2, "columns");
        this.f156571a = r2;
        this.f156572b = r3;
    }

    public final List a() {
        return this.f156571a;
    }

    public final int b() {
        return this.f156572b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f156571a, r52.f156571a) == true) goto L12;
        return false;
    L12:
        if (this.f156572b == r52.f156572b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156571a.hashCode() * 31) + Integer.hashCode(this.f156572b);
    }

    public String toString() {
        return "PriceChangeUIState(columns=" + this.f156571a + ", row=" + this.f156572b + ")";
    }
}
