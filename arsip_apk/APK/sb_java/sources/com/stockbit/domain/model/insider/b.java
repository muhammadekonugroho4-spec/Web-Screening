package com.stockbit.domain.model.insider;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f84138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84139b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84140c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84141e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84142f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84143g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84144h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84145i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84146j;

    /* renamed from: k, reason: collision with root package name */
    public final String f84147k;

    /* renamed from: l, reason: collision with root package name */
    public final String f84148l;

    /* renamed from: m, reason: collision with root package name */
    public final String f84149m;

    /* renamed from: n, reason: collision with root package name */
    public final String f84150n;

    /* renamed from: o, reason: collision with root package name */
    public final String f84151o;

    /* renamed from: p, reason: collision with root package name */
    public final String f84152p;

    /* renamed from: q, reason: collision with root package name */
    public final String f84153q;

    /* renamed from: r, reason: collision with root package name */
    public final String f84154r;

    /* renamed from: s, reason: collision with root package name */
    public final List f84155s;

    public b(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, List r35) {
        p.l(r17, "changePercentage");
        p.l(r18, "changeValue");
        p.l(r19, "currentPercentage");
        p.l(r20, "currentValue");
        p.l(r21, Constants.KEY_DATE);
        p.l(r22, Constants.KEY_ID);
        p.l(r23, "marker");
        p.l(r24, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r25, "nationality");
        p.l(r26, "previousPercentage");
        p.l(r27, "previousValue");
        p.l(r28, "symbol");
        p.l(r29, FirebaseAnalytics.Param.PRICE);
        p.l(r30, "brokerCode");
        p.l(r31, "brokerGroup");
        p.l(r32, "actionType");
        p.l(r33, "dataSourceType");
        p.l(r34, "dataSourceLabel");
        p.l(r35, "badges");
        this.f84138a = r17;
        this.f84139b = r18;
        this.f84140c = r19;
        this.d = r20;
        this.f84141e = r21;
        this.f84142f = r22;
        this.f84143g = r23;
        this.f84144h = r24;
        this.f84145i = r25;
        this.f84146j = r26;
        this.f84147k = r27;
        this.f84148l = r28;
        this.f84149m = r29;
        this.f84150n = r30;
        this.f84151o = r31;
        this.f84152p = r32;
        this.f84153q = r33;
        this.f84154r = r34;
        this.f84155s = r35;
    }

    public final String a() {
        return this.f84152p;
    }

    public final List b() {
        return this.f84155s;
    }

    public final String c() {
        return this.f84150n;
    }

    public final String d() {
        return this.f84151o;
    }

    public final String e() {
        return this.f84138a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f84138a, r52.f84138a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84139b, r52.f84139b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84140c, r52.f84140c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84141e, r52.f84141e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84142f, r52.f84142f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84143g, r52.f84143g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84144h, r52.f84144h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84145i, r52.f84145i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f84146j, r52.f84146j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f84147k, r52.f84147k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f84148l, r52.f84148l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f84149m, r52.f84149m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f84150n, r52.f84150n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f84151o, r52.f84151o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f84152p, r52.f84152p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f84153q, r52.f84153q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f84154r, r52.f84154r) == true) goto L63;
        return false;
    L63:
        if (p.g(this.f84155s, r52.f84155s) == true) goto L65;
        return false;
    L65:
        return true;
    }

    public final String f() {
        return this.f84139b;
    }

    public final String g() {
        return this.f84140c;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.f84138a.hashCode() * 31) + this.f84139b.hashCode()) * 31) + this.f84140c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84141e.hashCode()) * 31) + this.f84142f.hashCode()) * 31) + this.f84143g.hashCode()) * 31) + this.f84144h.hashCode()) * 31) + this.f84145i.hashCode()) * 31) + this.f84146j.hashCode()) * 31) + this.f84147k.hashCode()) * 31) + this.f84148l.hashCode()) * 31) + this.f84149m.hashCode()) * 31) + this.f84150n.hashCode()) * 31) + this.f84151o.hashCode()) * 31) + this.f84152p.hashCode()) * 31) + this.f84153q.hashCode()) * 31) + this.f84154r.hashCode()) * 31) + this.f84155s.hashCode();
    }

    public final String i() {
        return this.f84154r;
    }

    public final String j() {
        return this.f84153q;
    }

    public final String k() {
        return this.f84141e;
    }

    public final String l() {
        return this.f84142f;
    }

    public final String m() {
        return this.f84143g;
    }

    public final String n() {
        return this.f84144h;
    }

    public final String o() {
        return this.f84145i;
    }

    public final String p() {
        return this.f84146j;
    }

    public final String q() {
        return this.f84147k;
    }

    public final String r() {
        return this.f84149m;
    }

    public String toString() {
        return "InsiderCompanyDataEntity(changePercentage=" + this.f84138a + ", changeValue=" + this.f84139b + ", currentPercentage=" + this.f84140c + ", currentValue=" + this.d + ", date=" + this.f84141e + ", id=" + this.f84142f + ", marker=" + this.f84143g + ", name=" + this.f84144h + ", nationality=" + this.f84145i + ", previousPercentage=" + this.f84146j + ", previousValue=" + this.f84147k + ", symbol=" + this.f84148l + ", price=" + this.f84149m + ", brokerCode=" + this.f84150n + ", brokerGroup=" + this.f84151o + ", actionType=" + this.f84152p + ", dataSourceType=" + this.f84153q + ", dataSourceLabel=" + this.f84154r + ", badges=" + this.f84155s + ")";
    }
}
