package com.stockbit.usecase.bonds.model;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f154663a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154664b;

    /* renamed from: c, reason: collision with root package name */
    public final ProfitUIType f154665c;

    public m(String r2, String r3, ProfitUIType r4) {
        p.l(r2, "value");
        p.l(r3, "percentage");
        p.l(r4, "profitType");
        this.f154663a = r2;
        this.f154664b = r3;
        this.f154665c = r4;
    }

    public final String a() {
        return this.f154664b;
    }

    public final ProfitUIType b() {
        return this.f154665c;
    }

    public final String c() {
        return this.f154663a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f154663a, r52.f154663a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154664b, r52.f154664b) == true) goto L15;
        return false;
    L15:
        if (this.f154665c == r52.f154665c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f154663a.hashCode() * 31) + this.f154664b.hashCode()) * 31) + this.f154665c.hashCode();
    }

    public String toString() {
        return "ProfitValuePercentageUIState(value=" + this.f154663a + ", percentage=" + this.f154664b + ", profitType=" + this.f154665c + ")";
    }

    public /* synthetic */ m(String r2, String r3, ProfitUIType r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = ProfitUIType.NEUTRAL;
    L11:
        this(r2, r3, r4);
    }
}
