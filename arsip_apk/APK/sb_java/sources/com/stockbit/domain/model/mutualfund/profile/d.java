package com.stockbit.domain.model.mutualfund.profile;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f84415a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84416b;

    /* renamed from: c, reason: collision with root package name */
    public final List f84417c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f84418e;

    /* renamed from: f, reason: collision with root package name */
    public final List f84419f;

    public d(e r2, List r3, List r4, List r5, List r6, List r7) {
        p.l(r2, "profile");
        p.l(r3, "fees");
        p.l(r4, "assetAllocations");
        p.l(r5, "shareholderReksa");
        p.l(r6, "files");
        p.l(r7, "topHoldings");
        this.f84415a = r2;
        this.f84416b = r3;
        this.f84417c = r4;
        this.d = r5;
        this.f84418e = r6;
        this.f84419f = r7;
    }

    public final List a() {
        return this.f84417c;
    }

    public final List b() {
        return this.f84416b;
    }

    public final e c() {
        return this.f84415a;
    }

    public final List d() {
        return this.d;
    }

    public final List e() {
        return this.f84419f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f84415a, r52.f84415a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84416b, r52.f84416b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84417c, r52.f84417c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84418e, r52.f84418e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84419f, r52.f84419f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f84415a.hashCode() * 31) + this.f84416b.hashCode()) * 31) + this.f84417c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84418e.hashCode()) * 31) + this.f84419f.hashCode();
    }

    public String toString() {
        return "MutualFundProfileEntity(profile=" + this.f84415a + ", fees=" + this.f84416b + ", assetAllocations=" + this.f84417c + ", shareholderReksa=" + this.d + ", files=" + this.f84418e + ", topHoldings=" + this.f84419f + ")";
    }
}
