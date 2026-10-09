package com.stockbit.usecase.company.model.tradebook;

import kotlin.jvm.internal.i;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f156599a;

    /* renamed from: b, reason: collision with root package name */
    public final float f156600b;

    public a(float r1, float r2) {
        this.f156599a = r1;
        this.f156600b = r2;
    }

    public final float a() {
        return this.f156599a;
    }

    public final float b() {
        return this.f156600b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (Float.compare(this.f156599a, r52.f156599a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f156600b, r52.f156600b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f156599a) * 31) + Float.hashCode(this.f156600b);
    }

    public String toString() {
        return "TradeBookChartDistAccPercentageUIState(buy=" + this.f156599a + ", buyValue=" + this.f156600b + ")";
    }

    public /* synthetic */ a(float r2, float r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0.0f;
    L8:
        this(r2, r3);
    }
}
