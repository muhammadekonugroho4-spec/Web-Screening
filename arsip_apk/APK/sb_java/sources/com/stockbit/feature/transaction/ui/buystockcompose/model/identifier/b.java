package com.stockbit.feature.transaction.ui.buystockcompose.model.identifier;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f111595a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111596b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111597c;

    static {
    }

    public b(String r2, String r3, String r4) {
        p.l(r2, "totalLotSliderId");
        p.l(r3, "balanceUsagePercentageTextId");
        p.l(r4, "sliderThumbId");
        this.f111595a = r2;
        this.f111596b = r3;
        this.f111597c = r4;
    }

    public final String a() {
        return this.f111596b;
    }

    public final String b() {
        return this.f111597c;
    }

    public final String c() {
        return this.f111595a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f111595a, r52.f111595a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f111596b, r52.f111596b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f111597c, r52.f111597c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f111595a.hashCode() * 31) + this.f111596b.hashCode()) * 31) + this.f111597c.hashCode();
    }

    public String toString() {
        return "BuyStockSliderIdentifier(totalLotSliderId=" + this.f111595a + ", balanceUsagePercentageTextId=" + this.f111596b + ", sliderThumbId=" + this.f111597c + ')';
    }
}
