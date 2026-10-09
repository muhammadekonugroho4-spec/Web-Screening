package com.stockbit.domain.model.securities.order.nego;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f85572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85573b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85574c;
    public final String d;

    public f(String r2, String r3, String r4, String r5) {
        p.l(r2, "accountNo");
        p.l(r3, "mainAccountNo");
        p.l(r4, "userId");
        p.l(r5, "username");
        this.f85572a = r2;
        this.f85573b = r3;
        this.f85574c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f85572a, r52.f85572a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85573b, r52.f85573b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85574c, r52.f85574c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f85572a.hashCode() * 31) + this.f85573b.hashCode()) * 31) + this.f85574c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "OrderNegoPreviewCounterPartyEntity(accountNo=" + this.f85572a + ", mainAccountNo=" + this.f85573b + ", userId=" + this.f85574c + ", username=" + this.d + ")";
    }
}
