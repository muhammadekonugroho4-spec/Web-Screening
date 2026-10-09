package com.stockbit.components.cryptoorderbook;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final String f78331a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78332b;

    /* renamed from: c, reason: collision with root package name */
    public final String f78333c;
    public final float d;

    static {
    }

    public G(String r2, String r3, String r4, float r5) {
        kotlin.jvm.internal.p.l(r2, "qty");
        kotlin.jvm.internal.p.l(r3, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r4, "priceFillValue");
        this.f78331a = r2;
        this.f78332b = r3;
        this.f78333c = r4;
        this.d = r5;
    }

    public final float a() {
        return this.d;
    }

    public final String b() {
        return this.f78332b;
    }

    public final String c() {
        return this.f78333c;
    }

    public final String d() {
        return this.f78331a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof G) == true) goto L8;
        return false;
    L8:
        G r52 = (G) r5;
        if (kotlin.jvm.internal.p.g(this.f78331a, r52.f78331a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f78332b, r52.f78332b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f78333c, r52.f78333c) == true) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f78331a.hashCode() * 31) + this.f78332b.hashCode()) * 31) + this.f78333c.hashCode()) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        return "OrderBookEntry(qty=" + this.f78331a + ", price=" + this.f78332b + ", priceFillValue=" + this.f78333c + ", depthFraction=" + this.d + ')';
    }

    public /* synthetic */ G(String r1, String r2, String r3, float r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = r2;
    L6:
        if ((r5 & 8) == 0) goto L8;
        r4 = 0.0f;
    L8:
        this(r1, r2, r3, r4);
    }
}
