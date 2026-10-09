package com.stockbit.usecase.search.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f160042a;

    /* renamed from: b, reason: collision with root package name */
    public final int f160043b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160044c;
    public final String d;

    public o(int r2, int r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r5, "symbol");
        this.f160042a = r2;
        this.f160043b = r3;
        this.f160044c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f160043b;
    }

    public final String b() {
        return this.f160044c;
    }

    public final int c() {
        return this.f160042a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (this.f160042a == r52.f160042a) goto L12;
        return false;
    L12:
        if (this.f160043b == r52.f160043b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f160044c, r52.f160044c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f160042a) * 31) + Integer.hashCode(this.f160043b)) * 31) + this.f160044c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MarketSpecialBoardItemUIState(parentId=" + this.f160042a + ", id=" + this.f160043b + ", name=" + this.f160044c + ", symbol=" + this.d + ")";
    }
}
