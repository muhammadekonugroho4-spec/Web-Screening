package com.stockbit.usecase.cryptohistorylist.contract.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f157206a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoHistoryTxnType f157207b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157208c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f157209e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f157210f;

    /* renamed from: g, reason: collision with root package name */
    public final BigDecimal f157211g;

    /* renamed from: h, reason: collision with root package name */
    public final long f157212h;

    public a(String r2, CryptoHistoryTxnType r3, String r4, String r5, String r6, BigDecimal r7, BigDecimal r8, long r9) {
        p.l(r2, "txnId");
        p.l(r3, "txnType");
        p.l(r4, "side");
        p.l(r5, "asset");
        p.l(r6, "quoteAsset");
        p.l(r7, "amount");
        p.l(r8, FirebaseAnalytics.Param.PRICE);
        this.f157206a = r2;
        this.f157207b = r3;
        this.f157208c = r4;
        this.d = r5;
        this.f157209e = r6;
        this.f157210f = r7;
        this.f157211g = r8;
        this.f157212h = r9;
    }

    public final BigDecimal a() {
        return this.f157210f;
    }

    public final String b() {
        return this.d;
    }

    public final long c() {
        return this.f157212h;
    }

    public final BigDecimal d() {
        return this.f157211g;
    }

    public final String e() {
        return this.f157208c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f157206a, r82.f157206a) == true) goto L12;
        return false;
    L12:
        if (this.f157207b == r82.f157207b) goto L15;
        return false;
    L15:
        if (p.g(this.f157208c, r82.f157208c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157209e, r82.f157209e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157210f, r82.f157210f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f157211g, r82.f157211g) == true) goto L30;
        return false;
    L30:
        if (this.f157212h == r82.f157212h) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f157206a;
    }

    public final CryptoHistoryTxnType g() {
        return this.f157207b;
    }

    public int hashCode() {
        return (((((((((((((this.f157206a.hashCode() * 31) + this.f157207b.hashCode()) * 31) + this.f157208c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157209e.hashCode()) * 31) + this.f157210f.hashCode()) * 31) + this.f157211g.hashCode()) * 31) + Long.hashCode(this.f157212h);
    }

    public String toString() {
        return "CryptoHistoryItemEntity(txnId=" + this.f157206a + ", txnType=" + this.f157207b + ", side=" + this.f157208c + ", asset=" + this.d + ", quoteAsset=" + this.f157209e + ", amount=" + this.f157210f + ", price=" + this.f157211g + ", createdAtMillis=" + this.f157212h + ")";
    }
}
