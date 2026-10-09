package com.stockbit.domain.model.insider;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f84164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84165b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84166c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84167e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84168f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84169g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84170h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84171i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84172j;

    /* renamed from: k, reason: collision with root package name */
    public final String f84173k;

    /* renamed from: l, reason: collision with root package name */
    public final String f84174l;

    /* renamed from: m, reason: collision with root package name */
    public final String f84175m;

    /* renamed from: n, reason: collision with root package name */
    public final String f84176n;

    /* renamed from: o, reason: collision with root package name */
    public final String f84177o;

    /* renamed from: p, reason: collision with root package name */
    public final String f84178p;

    /* renamed from: q, reason: collision with root package name */
    public final String f84179q;

    /* renamed from: r, reason: collision with root package name */
    public final List f84180r;

    public f(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, List r34) {
        p.l(r17, "changesValue");
        p.l(r18, "changesPercentage");
        p.l(r19, "currentValue");
        p.l(r20, "currentPercentage");
        p.l(r21, Constants.KEY_DATE);
        p.l(r22, Constants.KEY_ID);
        p.l(r23, "marker");
        p.l(r24, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r25, "nationality");
        p.l(r26, "previousValue");
        p.l(r27, "previousPercentage");
        p.l(r28, "actionType");
        p.l(r29, FirebaseAnalytics.Param.PRICE);
        p.l(r30, "dataSourceType");
        p.l(r31, "dataSourceLabel");
        p.l(r32, "brokerCode");
        p.l(r33, "brokerGroup");
        p.l(r34, "badges");
        this.f84164a = r17;
        this.f84165b = r18;
        this.f84166c = r19;
        this.d = r20;
        this.f84167e = r21;
        this.f84168f = r22;
        this.f84169g = r23;
        this.f84170h = r24;
        this.f84171i = r25;
        this.f84172j = r26;
        this.f84173k = r27;
        this.f84174l = r28;
        this.f84175m = r29;
        this.f84176n = r30;
        this.f84177o = r31;
        this.f84178p = r32;
        this.f84179q = r33;
        this.f84180r = r34;
    }

    public final String a() {
        return this.f84174l;
    }

    public final String b() {
        return this.f84178p;
    }

    public final String c() {
        return this.f84179q;
    }

    public final String d() {
        return this.f84165b;
    }

    public final String e() {
        return this.f84164a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f84164a, r52.f84164a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84165b, r52.f84165b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84166c, r52.f84166c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84167e, r52.f84167e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84168f, r52.f84168f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84169g, r52.f84169g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84170h, r52.f84170h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84171i, r52.f84171i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f84172j, r52.f84172j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f84173k, r52.f84173k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f84174l, r52.f84174l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f84175m, r52.f84175m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f84176n, r52.f84176n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f84177o, r52.f84177o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f84178p, r52.f84178p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f84179q, r52.f84179q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f84180r, r52.f84180r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f84166c;
    }

    public final String h() {
        return this.f84176n;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f84164a.hashCode() * 31) + this.f84165b.hashCode()) * 31) + this.f84166c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84167e.hashCode()) * 31) + this.f84168f.hashCode()) * 31) + this.f84169g.hashCode()) * 31) + this.f84170h.hashCode()) * 31) + this.f84171i.hashCode()) * 31) + this.f84172j.hashCode()) * 31) + this.f84173k.hashCode()) * 31) + this.f84174l.hashCode()) * 31) + this.f84175m.hashCode()) * 31) + this.f84176n.hashCode()) * 31) + this.f84177o.hashCode()) * 31) + this.f84178p.hashCode()) * 31) + this.f84179q.hashCode()) * 31) + this.f84180r.hashCode();
    }

    public final String i() {
        return this.f84167e;
    }

    public final String j() {
        return this.f84168f;
    }

    public final String k() {
        return this.f84173k;
    }

    public final String l() {
        return this.f84172j;
    }

    public final String m() {
        return this.f84175m;
    }

    public String toString() {
        return "InsiderDetailListItemEntity(changesValue=" + this.f84164a + ", changesPercentage=" + this.f84165b + ", currentValue=" + this.f84166c + ", currentPercentage=" + this.d + ", date=" + this.f84167e + ", id=" + this.f84168f + ", marker=" + this.f84169g + ", name=" + this.f84170h + ", nationality=" + this.f84171i + ", previousValue=" + this.f84172j + ", previousPercentage=" + this.f84173k + ", actionType=" + this.f84174l + ", price=" + this.f84175m + ", dataSourceType=" + this.f84176n + ", dataSourceLabel=" + this.f84177o + ", brokerCode=" + this.f84178p + ", brokerGroup=" + this.f84179q + ", badges=" + this.f84180r + ")";
    }
}
