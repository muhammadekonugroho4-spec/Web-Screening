package com.stockbit.domain.model.securities.formula;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final e f85221a;

    /* renamed from: b, reason: collision with root package name */
    public final h f85222b;

    public g(e r2, h r3) {
        p.l(r2, "fee");
        p.l(r3, "previewFee");
        this.f85221a = r2;
        this.f85222b = r3;
    }

    public final e a() {
        return this.f85221a;
    }

    public final h b() {
        return this.f85222b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f85221a, r52.f85221a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85222b, r52.f85222b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85221a.hashCode() * 31) + this.f85222b.hashCode();
    }

    public String toString() {
        return "NegoOrderEntity(fee=" + this.f85221a + ", previewFee=" + this.f85222b + ")";
    }
}
