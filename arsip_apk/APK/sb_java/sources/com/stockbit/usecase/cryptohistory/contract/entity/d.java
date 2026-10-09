package com.stockbit.usecase.cryptohistory.contract.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f157191a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f157192b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f157193c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f157194e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f157195f;

    /* renamed from: g, reason: collision with root package name */
    public final BigDecimal f157196g;

    /* renamed from: h, reason: collision with root package name */
    public final BigDecimal f157197h;

    /* renamed from: i, reason: collision with root package name */
    public final List f157198i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f157199a;

        /* renamed from: b, reason: collision with root package name */
        public final BigDecimal f157200b;

        /* renamed from: c, reason: collision with root package name */
        public final BigDecimal f157201c;
        public final BigDecimal d;

        /* renamed from: e, reason: collision with root package name */
        public final BigDecimal f157202e;

        /* renamed from: f, reason: collision with root package name */
        public final BigDecimal f157203f;

        public a(long r2, BigDecimal r4, BigDecimal r5, BigDecimal r6, BigDecimal r7, BigDecimal r8) {
            p.l(r4, "baseQty");
            p.l(r5, "quoteQty");
            p.l(r6, FirebaseAnalytics.Param.PRICE);
            p.l(r7, "realizedPnl");
            p.l(r8, "realizedPnlPct");
            this.f157199a = r2;
            this.f157200b = r4;
            this.f157201c = r5;
            this.d = r6;
            this.f157202e = r7;
            this.f157203f = r8;
        }

        public final BigDecimal a() {
            return this.f157200b;
        }

        public final long b() {
            return this.f157199a;
        }

        public final BigDecimal c() {
            return this.d;
        }

        public final BigDecimal d() {
            return this.f157201c;
        }

        public final BigDecimal e() {
            return this.f157202e;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L8;
            return false;
        L8:
            a r82 = (a) r8;
            if (this.f157199a == r82.f157199a) goto L12;
            return false;
        L12:
            if (p.g(this.f157200b, r82.f157200b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f157201c, r82.f157201c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r82.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f157202e, r82.f157202e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f157203f, r82.f157203f) == true) goto L26;
            return false;
        L26:
            return true;
        }

        public final BigDecimal f() {
            return this.f157203f;
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.f157199a) * 31) + this.f157200b.hashCode()) * 31) + this.f157201c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157202e.hashCode()) * 31) + this.f157203f.hashCode();
        }

        public String toString() {
            return "Trade(executedAtMillis=" + this.f157199a + ", baseQty=" + this.f157200b + ", quoteQty=" + this.f157201c + ", price=" + this.d + ", realizedPnl=" + this.f157202e + ", realizedPnlPct=" + this.f157203f + ")";
        }
    }

    public d(long r2, BigDecimal r4, BigDecimal r5, BigDecimal r6, BigDecimal r7, BigDecimal r8, BigDecimal r9, BigDecimal r10, List r11) {
        p.l(r4, "avgPrice");
        p.l(r5, "quantityDone");
        p.l(r6, "amount");
        p.l(r7, "totalFee");
        p.l(r8, "netAmount");
        p.l(r9, "realizedPnl");
        p.l(r10, "realizedPnlPct");
        p.l(r11, "trades");
        this.f157191a = r2;
        this.f157192b = r4;
        this.f157193c = r5;
        this.d = r6;
        this.f157194e = r7;
        this.f157195f = r8;
        this.f157196g = r9;
        this.f157197h = r10;
        this.f157198i = r11;
    }

    public final BigDecimal a() {
        return this.d;
    }

    public final BigDecimal b() {
        return this.f157192b;
    }

    public final long c() {
        return this.f157191a;
    }

    public final BigDecimal d() {
        return this.f157195f;
    }

    public final BigDecimal e() {
        return this.f157193c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (this.f157191a == r82.f157191a) goto L12;
        return false;
    L12:
        if (p.g(this.f157192b, r82.f157192b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157193c, r82.f157193c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157194e, r82.f157194e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157195f, r82.f157195f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f157196g, r82.f157196g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f157197h, r82.f157197h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f157198i, r82.f157198i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final BigDecimal f() {
        return this.f157196g;
    }

    public final BigDecimal g() {
        return this.f157197h;
    }

    public final BigDecimal h() {
        return this.f157194e;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.f157191a) * 31) + this.f157192b.hashCode()) * 31) + this.f157193c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157194e.hashCode()) * 31) + this.f157195f.hashCode()) * 31) + this.f157196g.hashCode()) * 31) + this.f157197h.hashCode()) * 31) + this.f157198i.hashCode();
    }

    public final List i() {
        return this.f157198i;
    }

    public String toString() {
        return "CryptoHistoryRealizedDetailEntity(createdAtMillis=" + this.f157191a + ", avgPrice=" + this.f157192b + ", quantityDone=" + this.f157193c + ", amount=" + this.d + ", totalFee=" + this.f157194e + ", netAmount=" + this.f157195f + ", realizedPnl=" + this.f157196g + ", realizedPnlPct=" + this.f157197h + ", trades=" + this.f157198i + ")";
    }
}
