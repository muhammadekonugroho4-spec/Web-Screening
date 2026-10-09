package com.stockbit.domain.model.shareholding;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f85781a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85782b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85783c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f85784e;

    public i(String r2, String r3, String r4, List r5, List r6) {
        p.l(r2, "rootId");
        p.l(r3, "rootType");
        p.l(r4, "reportDate");
        p.l(r5, "nodes");
        p.l(r6, "edges");
        this.f85781a = r2;
        this.f85782b = r3;
        this.f85783c = r4;
        this.d = r5;
        this.f85784e = r6;
    }

    public final List a() {
        return this.f85784e;
    }

    public final List b() {
        return this.d;
    }

    public final String c() {
        return this.f85781a;
    }

    public final String d() {
        return this.f85782b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f85781a, r52.f85781a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85782b, r52.f85782b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85783c, r52.f85783c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85784e, r52.f85784e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f85781a.hashCode() * 31) + this.f85782b.hashCode()) * 31) + this.f85783c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85784e.hashCode();
    }

    public String toString() {
        return "ShareholdingNetworkEntity(rootId=" + this.f85781a + ", rootType=" + this.f85782b + ", reportDate=" + this.f85783c + ", nodes=" + this.d + ", edges=" + this.f85784e + ")";
    }
}
