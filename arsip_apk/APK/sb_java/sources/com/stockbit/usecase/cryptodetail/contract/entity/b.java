package com.stockbit.usecase.cryptodetail.contract.entity;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.cryptoheader.contract.entity.b f157064a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.usecase.cryptoheader.contract.entity.b f157065b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.usecase.cryptoheader.contract.entity.b f157066c;
    public final com.stockbit.usecase.cryptoheader.contract.entity.b d;

    /* renamed from: e, reason: collision with root package name */
    public final com.stockbit.usecase.cryptoheader.contract.entity.b f157067e;

    /* renamed from: f, reason: collision with root package name */
    public final com.stockbit.usecase.cryptoheader.contract.entity.b f157068f;

    /* renamed from: g, reason: collision with root package name */
    public final com.stockbit.usecase.cryptoheader.contract.entity.b f157069g;

    /* renamed from: h, reason: collision with root package name */
    public final com.stockbit.usecase.cryptoheader.contract.entity.b f157070h;

    /* renamed from: i, reason: collision with root package name */
    public final long f157071i;

    /* renamed from: j, reason: collision with root package name */
    public final String f157072j;

    public b(com.stockbit.usecase.cryptoheader.contract.entity.b r2, com.stockbit.usecase.cryptoheader.contract.entity.b r3, com.stockbit.usecase.cryptoheader.contract.entity.b r4, com.stockbit.usecase.cryptoheader.contract.entity.b r5, com.stockbit.usecase.cryptoheader.contract.entity.b r6, com.stockbit.usecase.cryptoheader.contract.entity.b r7, com.stockbit.usecase.cryptoheader.contract.entity.b r8, com.stockbit.usecase.cryptoheader.contract.entity.b r9, long r10, String r12) {
        p.l(r2, "value");
        p.l(r3, "change");
        p.l(r4, "changePercentage");
        p.l(r5, "open");
        p.l(r6, Constants.PRIORITY_HIGH);
        p.l(r7, "low");
        p.l(r8, "volume");
        p.l(r9, Constants.KEY_HIDE_CLOSE);
        p.l(r12, "formattedDate");
        this.f157064a = r2;
        this.f157065b = r3;
        this.f157066c = r4;
        this.d = r5;
        this.f157067e = r6;
        this.f157068f = r7;
        this.f157069g = r8;
        this.f157070h = r9;
        this.f157071i = r10;
        this.f157072j = r12;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b a() {
        return this.f157065b;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b b() {
        return this.f157066c;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b c() {
        return this.f157070h;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b d() {
        return this.f157067e;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b e() {
        return this.f157068f;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f157064a, r82.f157064a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157065b, r82.f157065b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157066c, r82.f157066c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157067e, r82.f157067e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157068f, r82.f157068f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f157069g, r82.f157069g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f157070h, r82.f157070h) == true) goto L33;
        return false;
    L33:
        if (this.f157071i == r82.f157071i) goto L36;
        return false;
    L36:
        if (p.g(this.f157072j, r82.f157072j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b f() {
        return this.d;
    }

    public final long g() {
        return this.f157071i;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b h() {
        return this.f157064a;
    }

    public int hashCode() {
        return (((((((((((((((((this.f157064a.hashCode() * 31) + this.f157065b.hashCode()) * 31) + this.f157066c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157067e.hashCode()) * 31) + this.f157068f.hashCode()) * 31) + this.f157069g.hashCode()) * 31) + this.f157070h.hashCode()) * 31) + Long.hashCode(this.f157071i)) * 31) + this.f157072j.hashCode();
    }

    public String toString() {
        return "CryptoChartPointEntity(value=" + this.f157064a + ", change=" + this.f157065b + ", changePercentage=" + this.f157066c + ", open=" + this.d + ", high=" + this.f157067e + ", low=" + this.f157068f + ", volume=" + this.f157069g + ", close=" + this.f157070h + ", unixDate=" + this.f157071i + ", formattedDate=" + this.f157072j + ")";
    }
}
