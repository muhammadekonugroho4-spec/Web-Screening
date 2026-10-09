package com.stockbit.domain.model.company.orderbook;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f81767a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81768b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81769c;

    public g(String r1, String r2, String r3) {
        this.f81767a = r1;
        this.f81768b = r2;
        this.f81769c = r3;
    }

    public final String a() {
        return this.f81767a;
    }

    public final String b() {
        return this.f81768b;
    }

    public final String c() {
        return this.f81769c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f81767a, r52.f81767a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81768b, r52.f81768b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81769c, r52.f81769c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f81767a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f81768b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f81769c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OrderBookWebSocketDataEntity(dataPrice=" + this.f81767a + ", dataQueue=" + this.f81768b + ", dataVolume=" + this.f81769c + ")";
    }
}
