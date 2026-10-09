package com.stockbit.domain.model.shareholding;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f85778a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85779b;

    /* renamed from: c, reason: collision with root package name */
    public final c f85780c;
    public final boolean d;

    public h(String r2, String r3, c r4, boolean r5) {
        p.l(r2, "fromId");
        p.l(r3, "toId");
        p.l(r4, "shareholding");
        this.f85778a = r2;
        this.f85779b = r3;
        this.f85780c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f85778a;
    }

    public final c b() {
        return this.f85780c;
    }

    public final String c() {
        return this.f85779b;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f85778a, r52.f85778a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85779b, r52.f85779b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85780c, r52.f85780c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f85778a.hashCode() * 31) + this.f85779b.hashCode()) * 31) + this.f85780c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "ShareholdingNetworkEdgeEntity(fromId=" + this.f85778a + ", toId=" + this.f85779b + ", shareholding=" + this.f85780c + ", isRendered=" + this.d + ")";
    }
}
