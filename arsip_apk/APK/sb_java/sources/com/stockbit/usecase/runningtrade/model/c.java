package com.stockbit.usecase.runningtrade.model;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f159587a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159588b;

    /* renamed from: c, reason: collision with root package name */
    public final RunningTradeActionType f159589c;
    public final RunningTradeActionType d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159590e;

    /* renamed from: f, reason: collision with root package name */
    public final String f159591f;

    /* renamed from: g, reason: collision with root package name */
    public final String f159592g;

    /* renamed from: h, reason: collision with root package name */
    public final String f159593h;

    /* renamed from: i, reason: collision with root package name */
    public final a f159594i;

    /* renamed from: j, reason: collision with root package name */
    public final a f159595j;

    /* renamed from: k, reason: collision with root package name */
    public final a f159596k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f159597l;

    /* renamed from: m, reason: collision with root package name */
    public final a f159598m;

    /* renamed from: n, reason: collision with root package name */
    public final a f159599n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f159600o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f159601p;

    /* renamed from: q, reason: collision with root package name */
    public final List f159602q;

    /* renamed from: r, reason: collision with root package name */
    public final List f159603r;

    /* renamed from: s, reason: collision with root package name */
    public final RunningTradeDataItemColor f159604s;

    /* renamed from: t, reason: collision with root package name */
    public final RunningTradeDataItemColor f159605t;

    /* renamed from: u, reason: collision with root package name */
    public final RunningTradeDataItemColor f159606u;

    public c(String r17, String r18, RunningTradeActionType r19, RunningTradeActionType r20, String r21, String r22, String r23, String r24, a r25, a r26, a r27, boolean r28, a r29, a r30, boolean r31, boolean r32, List r33, List r34, RunningTradeDataItemColor r35, RunningTradeDataItemColor r36, RunningTradeDataItemColor r37) {
        p.l(r17, Constants.KEY_ID);
        p.l(r18, "orderNumber");
        p.l(r19, Constants.KEY_ACTION);
        p.l(r20, "groupAction");
        p.l(r21, CrashHianalyticsData.TIME);
        p.l(r22, "tradeNumber");
        p.l(r23, "code");
        p.l(r24, "marketBoard");
        p.l(r25, FirebaseAnalytics.Param.PRICE);
        p.l(r26, "changePercentage");
        p.l(r27, "lot");
        p.l(r29, "freq");
        p.l(r30, "value");
        p.l(r33, "buyer");
        p.l(r34, "seller");
        p.l(r35, "colorPrice");
        p.l(r36, "colorAction");
        p.l(r37, "colorVal");
        this.f159587a = r17;
        this.f159588b = r18;
        this.f159589c = r19;
        this.d = r20;
        this.f159590e = r21;
        this.f159591f = r22;
        this.f159592g = r23;
        this.f159593h = r24;
        this.f159594i = r25;
        this.f159595j = r26;
        this.f159596k = r27;
        this.f159597l = r28;
        this.f159598m = r29;
        this.f159599n = r30;
        this.f159600o = r31;
        this.f159601p = r32;
        this.f159602q = r33;
        this.f159603r = r34;
        this.f159604s = r35;
        this.f159605t = r36;
        this.f159606u = r37;
    }

    public final RunningTradeActionType a() {
        return this.f159589c;
    }

    public final List b() {
        return this.f159602q;
    }

    public final RunningTradeDataItemColor c() {
        return this.f159605t;
    }

    public final RunningTradeDataItemColor d() {
        return this.f159604s;
    }

    public final RunningTradeDataItemColor e() {
        return this.f159606u;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f159587a, r52.f159587a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159588b, r52.f159588b) == true) goto L15;
        return false;
    L15:
        if (this.f159589c == r52.f159589c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f159590e, r52.f159590e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f159591f, r52.f159591f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f159592g, r52.f159592g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f159593h, r52.f159593h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f159594i, r52.f159594i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f159595j, r52.f159595j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f159596k, r52.f159596k) == true) goto L42;
        return false;
    L42:
        if (this.f159597l == r52.f159597l) goto L45;
        return false;
    L45:
        if (p.g(this.f159598m, r52.f159598m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f159599n, r52.f159599n) == true) goto L51;
        return false;
    L51:
        if (this.f159600o == r52.f159600o) goto L54;
        return false;
    L54:
        if (this.f159601p == r52.f159601p) goto L57;
        return false;
    L57:
        if (p.g(this.f159602q, r52.f159602q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f159603r, r52.f159603r) == true) goto L63;
        return false;
    L63:
        if (this.f159604s == r52.f159604s) goto L66;
        return false;
    L66:
        if (this.f159605t == r52.f159605t) goto L69;
        return false;
    L69:
        if (this.f159606u == r52.f159606u) goto L71;
        return false;
    L71:
        return true;
    }

    public final a f() {
        return this.f159598m;
    }

    public final RunningTradeActionType g() {
        return this.d;
    }

    public final String h() {
        return this.f159587a;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.f159587a.hashCode() * 31) + this.f159588b.hashCode()) * 31) + this.f159589c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159590e.hashCode()) * 31) + this.f159591f.hashCode()) * 31) + this.f159592g.hashCode()) * 31) + this.f159593h.hashCode()) * 31) + this.f159594i.hashCode()) * 31) + this.f159595j.hashCode()) * 31) + this.f159596k.hashCode()) * 31) + Boolean.hashCode(this.f159597l)) * 31) + this.f159598m.hashCode()) * 31) + this.f159599n.hashCode()) * 31) + Boolean.hashCode(this.f159600o)) * 31) + Boolean.hashCode(this.f159601p)) * 31) + this.f159602q.hashCode()) * 31) + this.f159603r.hashCode()) * 31) + this.f159604s.hashCode()) * 31) + this.f159605t.hashCode()) * 31) + this.f159606u.hashCode();
    }

    public final a i() {
        return this.f159596k;
    }

    public final String j() {
        return this.f159593h;
    }

    public final String k() {
        return this.f159588b;
    }

    public final a l() {
        return this.f159594i;
    }

    public final List m() {
        return this.f159603r;
    }

    public final String n() {
        return this.f159590e;
    }

    public final a o() {
        return this.f159599n;
    }

    public final boolean p() {
        return this.f159597l;
    }

    public final boolean q() {
        return this.f159600o;
    }

    public String toString() {
        return "RunningTradeGroupedItemUIState(id=" + this.f159587a + ", orderNumber=" + this.f159588b + ", action=" + this.f159589c + ", groupAction=" + this.d + ", time=" + this.f159590e + ", tradeNumber=" + this.f159591f + ", code=" + this.f159592g + ", marketBoard=" + this.f159593h + ", price=" + this.f159594i + ", changePercentage=" + this.f159595j + ", lot=" + this.f159596k + ", isBigLot=" + this.f159597l + ", freq=" + this.f159598m + ", value=" + this.f159599n + ", isBigValue=" + this.f159600o + ", isBrokerExists=" + this.f159601p + ", buyer=" + this.f159602q + ", seller=" + this.f159603r + ", colorPrice=" + this.f159604s + ", colorAction=" + this.f159605t + ", colorVal=" + this.f159606u + ")";
    }
}
