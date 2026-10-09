package com.stockbit.domain.model.company.tradebook;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f81999a;

    /* renamed from: b, reason: collision with root package name */
    public final List f82000b;

    /* renamed from: c, reason: collision with root package name */
    public final d f82001c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f82002e;

    /* renamed from: f, reason: collision with root package name */
    public final List f82003f;

    /* renamed from: g, reason: collision with root package name */
    public final List f82004g;

    /* renamed from: h, reason: collision with root package name */
    public final List f82005h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82006i;

    /* renamed from: j, reason: collision with root package name */
    public final String f82007j;

    /* renamed from: k, reason: collision with root package name */
    public final String f82008k;

    /* renamed from: l, reason: collision with root package name */
    public final String f82009l;

    /* renamed from: m, reason: collision with root package name */
    public final b f82010m;

    /* renamed from: n, reason: collision with root package name */
    public final List f82011n;

    /* renamed from: o, reason: collision with root package name */
    public final List f82012o;

    /* renamed from: p, reason: collision with root package name */
    public final List f82013p;

    /* renamed from: q, reason: collision with root package name */
    public final List f82014q;

    /* renamed from: r, reason: collision with root package name */
    public final d f82015r;

    public c(List r17, List r18, d r19, boolean r20, boolean r21, List r22, List r23, List r24, String r25, String r26, String r27, String r28, b r29, List r30, List r31, List r32, List r33, d r34) {
        p.l(r17, "buy");
        p.l(r18, "sell");
        p.l(r19, "prePost");
        p.l(r22, "prices");
        p.l(r23, "netValues");
        p.l(r24, "netValuesVolume");
        p.l(r25, Constants.KEY_DATE);
        p.l(r26, Constants.MessagePayloadKeys.FROM);
        p.l(r27, "to");
        p.l(r28, "minDate");
        p.l(r29, "bookTotal");
        p.l(r30, "bigMoneyNetValues");
        p.l(r31, "bigMoneyNetValuesVolume");
        p.l(r32, "bigMoneyBuy");
        p.l(r33, "bigMoneySell");
        p.l(r34, "bigMoneyPrePost");
        this.f81999a = r17;
        this.f82000b = r18;
        this.f82001c = r19;
        this.d = r20;
        this.f82002e = r21;
        this.f82003f = r22;
        this.f82004g = r23;
        this.f82005h = r24;
        this.f82006i = r25;
        this.f82007j = r26;
        this.f82008k = r27;
        this.f82009l = r28;
        this.f82010m = r29;
        this.f82011n = r30;
        this.f82012o = r31;
        this.f82013p = r32;
        this.f82014q = r33;
        this.f82015r = r34;
    }

    public final List a() {
        return this.f82013p;
    }

    public final List b() {
        return this.f82011n;
    }

    public final List c() {
        return this.f82012o;
    }

    public final d d() {
        return this.f82015r;
    }

    public final List e() {
        return this.f82014q;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f81999a, r52.f81999a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82000b, r52.f82000b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82001c, r52.f82001c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f82002e == r52.f82002e) goto L24;
        return false;
    L24:
        if (p.g(this.f82003f, r52.f82003f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82004g, r52.f82004g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82005h, r52.f82005h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82006i, r52.f82006i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f82007j, r52.f82007j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f82008k, r52.f82008k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f82009l, r52.f82009l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f82010m, r52.f82010m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f82011n, r52.f82011n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f82012o, r52.f82012o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f82013p, r52.f82013p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f82014q, r52.f82014q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f82015r, r52.f82015r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final b f() {
        return this.f82010m;
    }

    public final List g() {
        return this.f81999a;
    }

    public final String h() {
        return this.f82006i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f81999a.hashCode() * 31) + this.f82000b.hashCode()) * 31) + this.f82001c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f82002e)) * 31) + this.f82003f.hashCode()) * 31) + this.f82004g.hashCode()) * 31) + this.f82005h.hashCode()) * 31) + this.f82006i.hashCode()) * 31) + this.f82007j.hashCode()) * 31) + this.f82008k.hashCode()) * 31) + this.f82009l.hashCode()) * 31) + this.f82010m.hashCode()) * 31) + this.f82011n.hashCode()) * 31) + this.f82012o.hashCode()) * 31) + this.f82013p.hashCode()) * 31) + this.f82014q.hashCode()) * 31) + this.f82015r.hashCode();
    }

    public final String i() {
        return this.f82007j;
    }

    public final String j() {
        return this.f82009l;
    }

    public final List k() {
        return this.f82004g;
    }

    public final List l() {
        return this.f82005h;
    }

    public final d m() {
        return this.f82001c;
    }

    public final List n() {
        return this.f82003f;
    }

    public final List o() {
        return this.f82000b;
    }

    public final String p() {
        return this.f82008k;
    }

    public final boolean q() {
        return this.f82002e;
    }

    public final boolean r() {
        return this.d;
    }

    public String toString() {
        return "TradeBookChartEntity(buy=" + this.f81999a + ", sell=" + this.f82000b + ", prePost=" + this.f82001c + ", isShowPrePost=" + this.d + ", isFcaStock=" + this.f82002e + ", prices=" + this.f82003f + ", netValues=" + this.f82004g + ", netValuesVolume=" + this.f82005h + ", date=" + this.f82006i + ", from=" + this.f82007j + ", to=" + this.f82008k + ", minDate=" + this.f82009l + ", bookTotal=" + this.f82010m + ", bigMoneyNetValues=" + this.f82011n + ", bigMoneyNetValuesVolume=" + this.f82012o + ", bigMoneyBuy=" + this.f82013p + ", bigMoneySell=" + this.f82014q + ", bigMoneyPrePost=" + this.f82015r + ")";
    }
}
