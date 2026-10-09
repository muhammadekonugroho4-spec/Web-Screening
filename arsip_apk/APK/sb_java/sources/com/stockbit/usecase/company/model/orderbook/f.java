package com.stockbit.usecase.company.model.orderbook;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f156387a;

    /* renamed from: b, reason: collision with root package name */
    public final double f156388b;

    /* renamed from: c, reason: collision with root package name */
    public final OrderBookColorType f156389c;

    public f(String r2, double r3, OrderBookColorType r5) {
        p.l(r2, "formatted");
        p.l(r5, Constants.KEY_COLOR);
        this.f156387a = r2;
        this.f156388b = r3;
        this.f156389c = r5;
    }

    public final OrderBookColorType a() {
        return this.f156389c;
    }

    public final String b() {
        return this.f156387a;
    }

    public final double c() {
        return this.f156388b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (p.g(this.f156387a, r82.f156387a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f156388b, r82.f156388b) == 0) goto L15;
        return false;
    L15:
        if (this.f156389c == r82.f156389c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156387a.hashCode() * 31) + Double.hashCode(this.f156388b)) * 31) + this.f156389c.hashCode();
    }

    public String toString() {
        return "OrderBookValueUIState(formatted=" + this.f156387a + ", raw=" + this.f156388b + ", color=" + this.f156389c + ")";
    }

    public /* synthetic */ f(String r1, double r2, OrderBookColorType r4, int r5, i r6) {
        if ((r5 & 4) == 0) goto L5;
        r4 = OrderBookColorType.DEFAULT;
    L5:
        this(r1, r2, r4);
    }
}
