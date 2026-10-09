package com.stockbit.usecase.company.model.historicaldata;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f156232a;

    /* renamed from: b, reason: collision with root package name */
    public final d f156233b;

    public b(List r2, d r3) {
        p.l(r2, "historicalData");
        p.l(r3, "pagination");
        this.f156232a = r2;
        this.f156233b = r3;
    }

    public static /* synthetic */ b b(b r02, List r1, d r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f156232a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f156233b;
    L9:
        return r02.a(r1, r2);
    }

    public final b a(List r2, d r3) {
        p.l(r2, "historicalData");
        p.l(r3, "pagination");
        return new b(r2, r3);
    }

    public final List c() {
        return this.f156232a;
    }

    public d d() {
        return this.f156233b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f156232a, r52.f156232a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156233b, r52.f156233b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156232a.hashCode() * 31) + this.f156233b.hashCode();
    }

    public String toString() {
        return "HistoricalDataUIState(historicalData=" + this.f156232a + ", pagination=" + this.f156233b + ")";
    }
}
