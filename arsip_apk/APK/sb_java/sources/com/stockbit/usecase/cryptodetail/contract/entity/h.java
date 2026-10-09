package com.stockbit.usecase.cryptodetail.contract.entity;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f157088a;

    /* renamed from: b, reason: collision with root package name */
    public final List f157089b;

    /* renamed from: c, reason: collision with root package name */
    public final List f157090c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final int f157091e;

    public h(List r2, List r3, List r4, List r5, int r6) {
        p.l(r2, "months");
        p.l(r3, "yearRows");
        p.l(r4, "averages");
        p.l(r5, "probabilities");
        this.f157088a = r2;
        this.f157089b = r3;
        this.f157090c = r4;
        this.d = r5;
        this.f157091e = r6;
    }

    public final List a() {
        return this.f157090c;
    }

    public final int b() {
        return this.f157091e;
    }

    public final List c() {
        return this.f157088a;
    }

    public final List d() {
        return this.d;
    }

    public final List e() {
        return this.f157089b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f157088a, r52.f157088a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157089b, r52.f157089b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157090c, r52.f157090c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f157091e == r52.f157091e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f157088a.hashCode() * 31) + this.f157089b.hashCode()) * 31) + this.f157090c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f157091e);
    }

    public String toString() {
        return "CryptoSeasonalityEntity(months=" + this.f157088a + ", yearRows=" + this.f157089b + ", averages=" + this.f157090c + ", probabilities=" + this.d + ", defaultLastYears=" + this.f157091e + ")";
    }
}
