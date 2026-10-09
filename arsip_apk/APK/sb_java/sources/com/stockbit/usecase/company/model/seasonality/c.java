package com.stockbit.usecase.company.model.seasonality;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public List f156573a;

    /* renamed from: b, reason: collision with root package name */
    public List f156574b;

    /* renamed from: c, reason: collision with root package name */
    public List f156575c;
    public List d;

    /* renamed from: e, reason: collision with root package name */
    public int f156576e;

    public c(List r2, List r3, List r4, List r5, int r6) {
        p.l(r2, "probability");
        p.l(r3, "priceChange");
        p.l(r4, "totalMonths");
        p.l(r5, "average");
        this.f156573a = r2;
        this.f156574b = r3;
        this.f156575c = r4;
        this.d = r5;
        this.f156576e = r6;
    }

    public final List a() {
        return this.d;
    }

    public final int b() {
        return this.f156576e;
    }

    public final List c() {
        return this.f156574b;
    }

    public final List d() {
        return this.f156573a;
    }

    public final List e() {
        return this.f156575c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f156573a, r52.f156573a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156574b, r52.f156574b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156575c, r52.f156575c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f156576e == r52.f156576e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f156573a.hashCode() * 31) + this.f156574b.hashCode()) * 31) + this.f156575c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f156576e);
    }

    public String toString() {
        return "SeasonalityUIState(probability=" + this.f156573a + ", priceChange=" + this.f156574b + ", totalMonths=" + this.f156575c + ", average=" + this.d + ", defaultLastYear=" + this.f156576e + ")";
    }
}
