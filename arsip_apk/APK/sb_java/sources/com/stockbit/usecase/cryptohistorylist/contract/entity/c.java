package com.stockbit.usecase.cryptohistorylist.contract.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f157215a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157216b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157217c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f157218e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f157219f;

    /* renamed from: g, reason: collision with root package name */
    public final long f157220g;

    /* renamed from: h, reason: collision with root package name */
    public final BigDecimal f157221h;

    /* renamed from: i, reason: collision with root package name */
    public final BigDecimal f157222i;

    public c(String r2, String r3, String r4, String r5, BigDecimal r6, BigDecimal r7, long r8, BigDecimal r10, BigDecimal r11) {
        p.l(r2, "txnId");
        p.l(r3, "side");
        p.l(r4, "asset");
        p.l(r5, "quoteAsset");
        p.l(r6, "amount");
        p.l(r7, FirebaseAnalytics.Param.PRICE);
        p.l(r10, "realizedPnl");
        p.l(r11, "realizedPnlPct");
        this.f157215a = r2;
        this.f157216b = r3;
        this.f157217c = r4;
        this.d = r5;
        this.f157218e = r6;
        this.f157219f = r7;
        this.f157220g = r8;
        this.f157221h = r10;
        this.f157222i = r11;
    }

    public final String a() {
        return this.f157217c;
    }

    public final long b() {
        return this.f157220g;
    }

    public final BigDecimal c() {
        return this.f157221h;
    }

    public final BigDecimal d() {
        return this.f157222i;
    }

    public final String e() {
        return this.f157215a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f157215a, r82.f157215a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157216b, r82.f157216b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157217c, r82.f157217c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157218e, r82.f157218e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157219f, r82.f157219f) == true) goto L27;
        return false;
    L27:
        if (this.f157220g == r82.f157220g) goto L30;
        return false;
    L30:
        if (p.g(this.f157221h, r82.f157221h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f157222i, r82.f157222i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((this.f157215a.hashCode() * 31) + this.f157216b.hashCode()) * 31) + this.f157217c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157218e.hashCode()) * 31) + this.f157219f.hashCode()) * 31) + Long.hashCode(this.f157220g)) * 31) + this.f157221h.hashCode()) * 31) + this.f157222i.hashCode();
    }

    public String toString() {
        return "CryptoRealizedHistoryItemEntity(txnId=" + this.f157215a + ", side=" + this.f157216b + ", asset=" + this.f157217c + ", quoteAsset=" + this.d + ", amount=" + this.f157218e + ", price=" + this.f157219f + ", createdAtMillis=" + this.f157220g + ", realizedPnl=" + this.f157221h + ", realizedPnlPct=" + this.f157222i + ")";
    }
}
