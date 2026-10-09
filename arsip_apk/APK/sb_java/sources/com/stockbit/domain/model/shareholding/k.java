package com.stockbit.domain.model.shareholding;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final b f85789a;

    /* renamed from: b, reason: collision with root package name */
    public final f f85790b;

    public k(b r2, f r3) {
        p.l(r2, "company");
        p.l(r3, "investor");
        this.f85789a = r2;
        this.f85790b = r3;
    }

    public final b a() {
        return this.f85789a;
    }

    public final f b() {
        return this.f85790b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f85789a, r52.f85789a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85790b, r52.f85790b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85789a.hashCode() * 31) + this.f85790b.hashCode();
    }

    public String toString() {
        return "ShareholdingNetworkNodeMetadataEntity(company=" + this.f85789a + ", investor=" + this.f85790b + ")";
    }
}
