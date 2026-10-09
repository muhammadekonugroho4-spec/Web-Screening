package com.stockbit.usecase.company.model.ownershipallocation;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f156451a;

    /* renamed from: b, reason: collision with root package name */
    public final ShareholdingNetworkNodeType f156452b;

    public n(String r2, ShareholdingNetworkNodeType r3) {
        p.l(r2, "rootId");
        p.l(r3, "rootType");
        this.f156451a = r2;
        this.f156452b = r3;
    }

    public final String a() {
        return this.f156451a;
    }

    public final ShareholdingNetworkNodeType b() {
        return this.f156452b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f156451a, r52.f156451a) == true) goto L12;
        return false;
    L12:
        if (this.f156452b == r52.f156452b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156451a.hashCode() * 31) + this.f156452b.hashCode();
    }

    public String toString() {
        return "ShareholdingNetworkParam(rootId=" + this.f156451a + ", rootType=" + this.f156452b + ")";
    }
}
