package com.stockbit.usecase.tradingperformance.model;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f163510a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163511b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163512c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final float f163513e;

    /* renamed from: f, reason: collision with root package name */
    public final StockAllocationColorUIType f163514f;

    public j(String r2, String r3, String r4, String r5, float r6, StockAllocationColorUIType r7) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "iconUrl");
        kotlin.jvm.internal.p.l(r4, "value");
        kotlin.jvm.internal.p.l(r5, "percentageText");
        kotlin.jvm.internal.p.l(r7, Constants.KEY_COLOR);
        this.f163510a = r2;
        this.f163511b = r3;
        this.f163512c = r4;
        this.d = r5;
        this.f163513e = r6;
        this.f163514f = r7;
    }

    public final StockAllocationColorUIType a() {
        return this.f163514f;
    }

    public final String b() {
        return this.f163511b;
    }

    public final float c() {
        return this.f163513e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f163510a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f163510a, r52.f163510a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f163511b, r52.f163511b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f163512c, r52.f163512c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (Float.compare(this.f163513e, r52.f163513e) == 0) goto L24;
        return false;
    L24:
        if (this.f163514f == r52.f163514f) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f163512c;
    }

    public int hashCode() {
        return (((((((((this.f163510a.hashCode() * 31) + this.f163511b.hashCode()) * 31) + this.f163512c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.hashCode(this.f163513e)) * 31) + this.f163514f.hashCode();
    }

    public String toString() {
        return "StockAllocationItemUIState(symbol=" + this.f163510a + ", iconUrl=" + this.f163511b + ", value=" + this.f163512c + ", percentageText=" + this.d + ", percentage=" + this.f163513e + ", color=" + this.f163514f + ")";
    }

    public /* synthetic */ j(String r2, String r3, String r4, String r5, float r6, StockAllocationColorUIType r7, int r8, kotlin.jvm.internal.i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0.0f;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = StockAllocationColorUIType.Other;
    L20:
        StockAllocationColorUIType r82 = r7;
        float r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82);
    }
}
