package com.stockbit.domain.model.company.runningtrade;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f81901a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81902b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81903c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81904e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81905f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81906g;

    /* renamed from: h, reason: collision with root package name */
    public final c f81907h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f81908i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81909j;

    /* renamed from: k, reason: collision with root package name */
    public final String f81910k;

    /* renamed from: l, reason: collision with root package name */
    public final String f81911l;

    /* renamed from: m, reason: collision with root package name */
    public final String f81912m;

    /* renamed from: n, reason: collision with root package name */
    public final String f81913n;

    /* renamed from: o, reason: collision with root package name */
    public final String f81914o;

    /* renamed from: p, reason: collision with root package name */
    public final String f81915p;

    /* renamed from: q, reason: collision with root package name */
    public final String f81916q;

    /* renamed from: r, reason: collision with root package name */
    public final String f81917r;

    public h(String r17, String r18, String r19, String r20, String r21, String r22, String r23, c r24, boolean r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34) {
        p.l(r17, Constants.KEY_ID);
        p.l(r18, CrashHianalyticsData.TIME);
        p.l(r19, Constants.KEY_ACTION);
        p.l(r20, "code");
        p.l(r21, FirebaseAnalytics.Param.PRICE);
        p.l(r22, "change");
        p.l(r23, "lot");
        p.l(r24, "value");
        p.l(r26, "buyer");
        p.l(r27, "seller");
        p.l(r28, "tradeNumber");
        p.l(r29, "buyerType");
        p.l(r30, "sellerType");
        p.l(r31, "marketBoard");
        p.l(r32, "buyOrderNumber");
        p.l(r33, "sellOrderNumber");
        p.l(r34, "groupOrderNumber");
        this.f81901a = r17;
        this.f81902b = r18;
        this.f81903c = r19;
        this.d = r20;
        this.f81904e = r21;
        this.f81905f = r22;
        this.f81906g = r23;
        this.f81907h = r24;
        this.f81908i = r25;
        this.f81909j = r26;
        this.f81910k = r27;
        this.f81911l = r28;
        this.f81912m = r29;
        this.f81913n = r30;
        this.f81914o = r31;
        this.f81915p = r32;
        this.f81916q = r33;
        this.f81917r = r34;
    }

    public final String a() {
        return this.f81903c;
    }

    public final String b() {
        return this.f81915p;
    }

    public final String c() {
        return this.f81909j;
    }

    public final String d() {
        return this.f81912m;
    }

    public final String e() {
        return this.f81905f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f81901a, r52.f81901a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81902b, r52.f81902b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81903c, r52.f81903c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81904e, r52.f81904e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81905f, r52.f81905f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81906g, r52.f81906g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81907h, r52.f81907h) == true) goto L33;
        return false;
    L33:
        if (this.f81908i == r52.f81908i) goto L36;
        return false;
    L36:
        if (p.g(this.f81909j, r52.f81909j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81910k, r52.f81910k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f81911l, r52.f81911l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f81912m, r52.f81912m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f81913n, r52.f81913n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f81914o, r52.f81914o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f81915p, r52.f81915p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f81916q, r52.f81916q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f81917r, r52.f81917r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f81917r;
    }

    public final String h() {
        return this.f81906g;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f81901a.hashCode() * 31) + this.f81902b.hashCode()) * 31) + this.f81903c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81904e.hashCode()) * 31) + this.f81905f.hashCode()) * 31) + this.f81906g.hashCode()) * 31) + this.f81907h.hashCode()) * 31) + Boolean.hashCode(this.f81908i)) * 31) + this.f81909j.hashCode()) * 31) + this.f81910k.hashCode()) * 31) + this.f81911l.hashCode()) * 31) + this.f81912m.hashCode()) * 31) + this.f81913n.hashCode()) * 31) + this.f81914o.hashCode()) * 31) + this.f81915p.hashCode()) * 31) + this.f81916q.hashCode()) * 31) + this.f81917r.hashCode();
    }

    public final String i() {
        return this.f81914o;
    }

    public final String j() {
        return this.f81904e;
    }

    public final String k() {
        return this.f81916q;
    }

    public final String l() {
        return this.f81910k;
    }

    public final String m() {
        return this.f81913n;
    }

    public final String n() {
        return this.f81902b;
    }

    public final String o() {
        return this.f81911l;
    }

    public final c p() {
        return this.f81907h;
    }

    public String toString() {
        return "RunningTradeItemEntity(id=" + this.f81901a + ", time=" + this.f81902b + ", action=" + this.f81903c + ", code=" + this.d + ", price=" + this.f81904e + ", change=" + this.f81905f + ", lot=" + this.f81906g + ", value=" + this.f81907h + ", isBrokerExists=" + this.f81908i + ", buyer=" + this.f81909j + ", seller=" + this.f81910k + ", tradeNumber=" + this.f81911l + ", buyerType=" + this.f81912m + ", sellerType=" + this.f81913n + ", marketBoard=" + this.f81914o + ", buyOrderNumber=" + this.f81915p + ", sellOrderNumber=" + this.f81916q + ", groupOrderNumber=" + this.f81917r + ")";
    }
}
