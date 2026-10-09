package com.stockbit.model.params.tipping;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f122160a;

    /* renamed from: b, reason: collision with root package name */
    public final TippingActivityTypeParams f122161b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122162c;
    public final Integer d;

    public a(int r2, TippingActivityTypeParams r3, int r4, Integer r5) {
        p.l(r3, "type");
        this.f122160a = r2;
        this.f122161b = r3;
        this.f122162c = r4;
        this.d = r5;
    }

    public final Integer a() {
        return this.d;
    }

    public final TippingActivityTypeParams b() {
        return this.f122161b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f122160a == r52.f122160a) goto L12;
        return false;
    L12:
        if (this.f122161b == r52.f122161b) goto L15;
        return false;
    L15:
        if (this.f122162c == r52.f122162c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((Integer.hashCode(this.f122160a) * 31) + this.f122161b.hashCode()) * 31) + Integer.hashCode(this.f122162c)) * 31;
        Integer r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "TippingActivityParams(page=" + this.f122160a + ", type=" + this.f122161b + ", limit=" + this.f122162c + ", lastId=" + this.d + ')';
    }
}
