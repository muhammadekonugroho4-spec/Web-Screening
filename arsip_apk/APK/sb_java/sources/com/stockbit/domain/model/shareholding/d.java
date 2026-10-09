package com.stockbit.domain.model.shareholding;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f85757a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85758b;

    public d(String r2, String r3) {
        p.l(r2, "raw");
        p.l(r3, "formatted");
        this.f85757a = r2;
        this.f85758b = r3;
    }

    public final String a() {
        return this.f85758b;
    }

    public final String b() {
        return this.f85757a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f85757a, r52.f85757a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85758b, r52.f85758b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85757a.hashCode() * 31) + this.f85758b.hashCode();
    }

    public String toString() {
        return "ShareholdingFormattedValueEntity(raw=" + this.f85757a + ", formatted=" + this.f85758b + ")";
    }
}
