package com.stockbit.domain.model.company.tradebook;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81984b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81985c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81986e;

    public a(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "lot");
        p.l(r3, Constants.KEY_FREQUENCY);
        p.l(r4, "percent");
        p.l(r5, "value");
        p.l(r6, "valuePercentage");
        this.f81983a = r2;
        this.f81984b = r3;
        this.f81985c = r4;
        this.d = r5;
        this.f81986e = r6;
    }

    public final String a() {
        return this.f81984b;
    }

    public final String b() {
        return this.f81983a;
    }

    public final String c() {
        return this.f81985c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81983a, r52.f81983a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81984b, r52.f81984b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81985c, r52.f81985c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81986e, r52.f81986e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f81983a.hashCode() * 31) + this.f81984b.hashCode()) * 31) + this.f81985c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81986e.hashCode();
    }

    public String toString() {
        return "TradeBookBuySellEntity(lot=" + this.f81983a + ", frequency=" + this.f81984b + ", percent=" + this.f81985c + ", value=" + this.d + ", valuePercentage=" + this.f81986e + ")";
    }
}
