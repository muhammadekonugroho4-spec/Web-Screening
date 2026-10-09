package com.stockbit.usecase.cryptoorderlist.contract.entity;

import androidx.core.app.NotificationCompat;
import com.stockbit.usecase.cryptoorder.contract.entity.CryptoOrderStatus;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f157315a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157316b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157317c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f157318e;

    /* renamed from: f, reason: collision with root package name */
    public final double f157319f;

    /* renamed from: g, reason: collision with root package name */
    public final double f157320g;

    /* renamed from: h, reason: collision with root package name */
    public final double f157321h;

    /* renamed from: i, reason: collision with root package name */
    public final double f157322i;

    /* renamed from: j, reason: collision with root package name */
    public final double f157323j;

    /* renamed from: k, reason: collision with root package name */
    public final CryptoOrderStatus f157324k;

    /* renamed from: l, reason: collision with root package name */
    public final long f157325l;

    public a(String r3, String r4, String r5, String r6, String r7, double r8, double r10, double r12, double r14, double r16, CryptoOrderStatus r18, long r19) {
        p.l(r3, "orderId");
        p.l(r4, "baseAsset");
        p.l(r5, "quoteAsset");
        p.l(r6, "side");
        p.l(r7, "type");
        p.l(r18, NotificationCompat.CATEGORY_STATUS);
        this.f157315a = r3;
        this.f157316b = r4;
        this.f157317c = r5;
        this.d = r6;
        this.f157318e = r7;
        this.f157319f = r8;
        this.f157320g = r10;
        this.f157321h = r12;
        this.f157322i = r14;
        this.f157323j = r16;
        this.f157324k = r18;
        this.f157325l = r19;
    }

    public final String a() {
        return this.f157316b;
    }

    public final double b() {
        return this.f157323j;
    }

    public final String c() {
        return this.f157315a;
    }

    public final double d() {
        return this.f157319f;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f157315a, r82.f157315a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157316b, r82.f157316b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157317c, r82.f157317c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157318e, r82.f157318e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f157319f, r82.f157319f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f157320g, r82.f157320g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f157321h, r82.f157321h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f157322i, r82.f157322i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f157323j, r82.f157323j) == 0) goto L39;
        return false;
    L39:
        if (this.f157324k == r82.f157324k) goto L42;
        return false;
    L42:
        if (this.f157325l == r82.f157325l) goto L44;
        return false;
    L44:
        return true;
    }

    public final CryptoOrderStatus f() {
        return this.f157324k;
    }

    public final String g() {
        return this.f157318e;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f157315a.hashCode() * 31) + this.f157316b.hashCode()) * 31) + this.f157317c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157318e.hashCode()) * 31) + Double.hashCode(this.f157319f)) * 31) + Double.hashCode(this.f157320g)) * 31) + Double.hashCode(this.f157321h)) * 31) + Double.hashCode(this.f157322i)) * 31) + Double.hashCode(this.f157323j)) * 31) + this.f157324k.hashCode()) * 31) + Long.hashCode(this.f157325l);
    }

    public String toString() {
        return "CryptoOrderListItemEntity(orderId=" + this.f157315a + ", baseAsset=" + this.f157316b + ", quoteAsset=" + this.f157317c + ", side=" + this.d + ", type=" + this.f157318e + ", price=" + this.f157319f + ", baseQty=" + this.f157320g + ", filledBaseQty=" + this.f157321h + ", filledQuoteQty=" + this.f157322i + ", grossQuoteQty=" + this.f157323j + ", status=" + this.f157324k + ", createdAtMillis=" + this.f157325l + ")";
    }
}
