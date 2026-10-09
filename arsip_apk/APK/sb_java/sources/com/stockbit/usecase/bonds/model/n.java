package com.stockbit.usecase.bonds.model;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f154666a;

    /* renamed from: b, reason: collision with root package name */
    public final ProfitUIType f154667b;

    public n(String r2, ProfitUIType r3) {
        p.l(r2, "value");
        p.l(r3, "profitType");
        this.f154666a = r2;
        this.f154667b = r3;
    }

    public final ProfitUIType a() {
        return this.f154667b;
    }

    public final String b() {
        return this.f154666a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f154666a, r52.f154666a) == true) goto L12;
        return false;
    L12:
        if (this.f154667b == r52.f154667b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f154666a.hashCode() * 31) + this.f154667b.hashCode();
    }

    public String toString() {
        return "ProfitValueUIState(value=" + this.f154666a + ", profitType=" + this.f154667b + ")";
    }

    public /* synthetic */ n(String r1, ProfitUIType r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = ProfitUIType.NEUTRAL;
    L8:
        this(r1, r2);
    }
}
