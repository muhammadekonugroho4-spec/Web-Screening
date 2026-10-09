package com.stockbit.usecase.runningtrade.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f159582a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159583b;

    public a(double r2, String r4) {
        p.l(r4, "formatted");
        this.f159582a = r2;
        this.f159583b = r4;
    }

    public final String a() {
        return this.f159583b;
    }

    public final double b() {
        return this.f159582a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f159582a, r82.f159582a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f159583b, r82.f159583b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f159582a) * 31) + this.f159583b.hashCode();
    }

    public String toString() {
        return "RunningTradeFormattedRawUIState(raw=" + this.f159582a + ", formatted=" + this.f159583b + ")";
    }

    public /* synthetic */ a(double r1, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0.0d;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r1, r3);
    }
}
