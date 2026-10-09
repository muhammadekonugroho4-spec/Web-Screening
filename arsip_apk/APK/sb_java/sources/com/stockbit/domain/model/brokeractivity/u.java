package com.stockbit.domain.model.brokeractivity;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f80934a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80935b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80936c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80937e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80938f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80939g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80940h;

    public u(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        kotlin.jvm.internal.p.l(r2, "stockCode");
        kotlin.jvm.internal.p.l(r3, "brokerCode");
        kotlin.jvm.internal.p.l(r4, "type");
        kotlin.jvm.internal.p.l(r5, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r6, "value");
        kotlin.jvm.internal.p.l(r7, "lot");
        kotlin.jvm.internal.p.l(r8, "avgPrice");
        kotlin.jvm.internal.p.l(r9, "freq");
        this.f80934a = r2;
        this.f80935b = r3;
        this.f80936c = r4;
        this.d = r5;
        this.f80937e = r6;
        this.f80938f = r7;
        this.f80939g = r8;
        this.f80940h = r9;
    }

    public final String a() {
        return this.f80939g;
    }

    public final String b() {
        return this.f80938f;
    }

    public final String c() {
        return this.f80934a;
    }

    public final String d() {
        return this.f80937e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof u) == true) goto L8;
        return false;
    L8:
        u r52 = (u) r5;
        if (kotlin.jvm.internal.p.g(this.f80934a, r52.f80934a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80935b, r52.f80935b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80936c, r52.f80936c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f80937e, r52.f80937e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f80938f, r52.f80938f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f80939g, r52.f80939g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f80940h, r52.f80940h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        return (((((((((((((this.f80934a.hashCode() * 31) + this.f80935b.hashCode()) * 31) + this.f80936c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80937e.hashCode()) * 31) + this.f80938f.hashCode()) * 31) + this.f80939g.hashCode()) * 31) + this.f80940h.hashCode();
    }

    public String toString() {
        return "BrokerActivityItemEntity(stockCode=" + this.f80934a + ", brokerCode=" + this.f80935b + ", type=" + this.f80936c + ", date=" + this.d + ", value=" + this.f80937e + ", lot=" + this.f80938f + ", avgPrice=" + this.f80939g + ", freq=" + this.f80940h + ")";
    }
}
