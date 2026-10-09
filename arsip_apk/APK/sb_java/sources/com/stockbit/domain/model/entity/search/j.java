package com.stockbit.domain.model.entity.search;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f83007a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83008b;

    public j(boolean r2, String r3) {
        p.l(r3, "haircutPercentage");
        this.f83007a = r2;
        this.f83008b = r3;
    }

    public final String a() {
        return this.f83008b;
    }

    public final boolean b() {
        return this.f83007a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f83007a == r52.f83007a) goto L12;
        return false;
    L12:
        if (p.g(this.f83008b, r52.f83008b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f83007a) * 31) + this.f83008b.hashCode();
    }

    public String toString() {
        return "SubSectorCompanyTradingLimit(isTradingLimit=" + this.f83007a + ", haircutPercentage=" + this.f83008b + ')';
    }

    public /* synthetic */ j(boolean r1, String r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
