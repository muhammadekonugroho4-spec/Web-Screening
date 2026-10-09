package com.stockbit.feature.transaction.ui.fasttrade.model;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f114095a;

    /* renamed from: b, reason: collision with root package name */
    public final String f114096b;

    /* renamed from: c, reason: collision with root package name */
    public final int f114097c;
    public final String d;

    static {
    }

    public h(BigDecimal r2, String r3, int r4, String r5) {
        p.l(r2, "totalLot");
        p.l(r3, "totalLotFormatted");
        p.l(r5, "totalOrderFormatted");
        this.f114095a = r2;
        this.f114096b = r3;
        this.f114097c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f114096b;
    }

    public final int b() {
        return this.f114097c;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f114095a, r52.f114095a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f114096b, r52.f114096b) == true) goto L15;
        return false;
    L15:
        if (this.f114097c == r52.f114097c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f114095a.hashCode() * 31) + this.f114096b.hashCode()) * 31) + Integer.hashCode(this.f114097c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "FTQueueScreenState(totalLot=" + this.f114095a + ", totalLotFormatted=" + this.f114096b + ", totalOrder=" + this.f114097c + ", totalOrderFormatted=" + this.d + ')';
    }
}
