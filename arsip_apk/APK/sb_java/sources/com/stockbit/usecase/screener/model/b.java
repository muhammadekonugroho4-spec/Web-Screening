package com.stockbit.usecase.screener.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f159716a;

    /* renamed from: b, reason: collision with root package name */
    public final List f159717b;

    public b(d r2, List r3) {
        p.l(r2, "company");
        p.l(r3, "results");
        this.f159716a = r2;
        this.f159717b = r3;
    }

    public final d a() {
        return this.f159716a;
    }

    public final List b() {
        return this.f159717b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f159716a, r52.f159716a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159717b, r52.f159717b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f159716a.hashCode() * 31) + this.f159717b.hashCode();
    }

    public String toString() {
        return "ScreenerCalcsBeanUIState(company=" + this.f159716a + ", results=" + this.f159717b + ")";
    }
}
