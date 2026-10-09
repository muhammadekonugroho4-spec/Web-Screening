package com.stockbit.usecase.company.model.profile.mutualfund;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f156543a;

    /* renamed from: b, reason: collision with root package name */
    public final List f156544b;

    /* renamed from: c, reason: collision with root package name */
    public final List f156545c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f156546e;

    /* renamed from: f, reason: collision with root package name */
    public final List f156547f;

    /* renamed from: g, reason: collision with root package name */
    public final List f156548g;

    public e(d r2, List r3, List r4, List r5, List r6, List r7, List r8) {
        p.l(r2, "profile");
        p.l(r3, "fees");
        p.l(r4, "assetAllocations");
        p.l(r5, "shareholderReksa");
        p.l(r6, "prospectuses");
        p.l(r7, "factSheets");
        p.l(r8, "topHoldings");
        this.f156543a = r2;
        this.f156544b = r3;
        this.f156545c = r4;
        this.d = r5;
        this.f156546e = r6;
        this.f156547f = r7;
        this.f156548g = r8;
    }

    public final List a() {
        return this.f156545c;
    }

    public final List b() {
        return this.f156547f;
    }

    public final d c() {
        return this.f156543a;
    }

    public final List d() {
        return this.f156546e;
    }

    public final List e() {
        return this.f156548g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f156543a, r52.f156543a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156544b, r52.f156544b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156545c, r52.f156545c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f156546e, r52.f156546e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f156547f, r52.f156547f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f156548g, r52.f156548g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f156543a.hashCode() * 31) + this.f156544b.hashCode()) * 31) + this.f156545c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156546e.hashCode()) * 31) + this.f156547f.hashCode()) * 31) + this.f156548g.hashCode();
    }

    public String toString() {
        return "MutualFundProfileUIState(profile=" + this.f156543a + ", fees=" + this.f156544b + ", assetAllocations=" + this.f156545c + ", shareholderReksa=" + this.d + ", prospectuses=" + this.f156546e + ", factSheets=" + this.f156547f + ", topHoldings=" + this.f156548g + ")";
    }
}
