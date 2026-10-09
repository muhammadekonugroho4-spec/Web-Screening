package com.stockbit.domain.model.company.runningtrade;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f81883a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81884b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81885c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81886e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81887f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81888g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81889h;

    /* renamed from: i, reason: collision with root package name */
    public final c f81890i;

    /* renamed from: j, reason: collision with root package name */
    public final c f81891j;

    /* renamed from: k, reason: collision with root package name */
    public final c f81892k;

    /* renamed from: l, reason: collision with root package name */
    public final c f81893l;

    /* renamed from: m, reason: collision with root package name */
    public final c f81894m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f81895n;

    /* renamed from: o, reason: collision with root package name */
    public final List f81896o;

    /* renamed from: p, reason: collision with root package name */
    public final List f81897p;

    public f(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, c r25, c r26, c r27, c r28, c r29, boolean r30, List r31, List r32) {
        p.l(r17, Constants.KEY_ID);
        p.l(r18, "orderNumber");
        p.l(r19, Constants.KEY_ACTION);
        p.l(r20, "groupAction");
        p.l(r21, CrashHianalyticsData.TIME);
        p.l(r22, "tradeNumber");
        p.l(r23, "code");
        p.l(r24, "marketBoard");
        p.l(r25, FirebaseAnalytics.Param.PRICE);
        p.l(r26, "change");
        p.l(r27, "lot");
        p.l(r28, "freq");
        p.l(r29, "value");
        p.l(r31, "buyer");
        p.l(r32, "seller");
        this.f81883a = r17;
        this.f81884b = r18;
        this.f81885c = r19;
        this.d = r20;
        this.f81886e = r21;
        this.f81887f = r22;
        this.f81888g = r23;
        this.f81889h = r24;
        this.f81890i = r25;
        this.f81891j = r26;
        this.f81892k = r27;
        this.f81893l = r28;
        this.f81894m = r29;
        this.f81895n = r30;
        this.f81896o = r31;
        this.f81897p = r32;
    }

    public final String a() {
        return this.f81885c;
    }

    public final List b() {
        return this.f81896o;
    }

    public final c c() {
        return this.f81891j;
    }

    public final String d() {
        return this.f81888g;
    }

    public final c e() {
        return this.f81893l;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f81883a, r52.f81883a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81884b, r52.f81884b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81885c, r52.f81885c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81886e, r52.f81886e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81887f, r52.f81887f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81888g, r52.f81888g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81889h, r52.f81889h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81890i, r52.f81890i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81891j, r52.f81891j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81892k, r52.f81892k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f81893l, r52.f81893l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f81894m, r52.f81894m) == true) goto L48;
        return false;
    L48:
        if (this.f81895n == r52.f81895n) goto L51;
        return false;
    L51:
        if (p.g(this.f81896o, r52.f81896o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f81897p, r52.f81897p) == true) goto L56;
        return false;
    L56:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f81883a;
    }

    public final c h() {
        return this.f81892k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.f81883a.hashCode() * 31) + this.f81884b.hashCode()) * 31) + this.f81885c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81886e.hashCode()) * 31) + this.f81887f.hashCode()) * 31) + this.f81888g.hashCode()) * 31) + this.f81889h.hashCode()) * 31) + this.f81890i.hashCode()) * 31) + this.f81891j.hashCode()) * 31) + this.f81892k.hashCode()) * 31) + this.f81893l.hashCode()) * 31) + this.f81894m.hashCode()) * 31) + Boolean.hashCode(this.f81895n)) * 31) + this.f81896o.hashCode()) * 31) + this.f81897p.hashCode();
    }

    public final String i() {
        return this.f81889h;
    }

    public final String j() {
        return this.f81884b;
    }

    public final c k() {
        return this.f81890i;
    }

    public final List l() {
        return this.f81897p;
    }

    public final String m() {
        return this.f81886e;
    }

    public final String n() {
        return this.f81887f;
    }

    public final c o() {
        return this.f81894m;
    }

    public final boolean p() {
        return this.f81895n;
    }

    public String toString() {
        return "RunningTradeGroupedItemEntity(id=" + this.f81883a + ", orderNumber=" + this.f81884b + ", action=" + this.f81885c + ", groupAction=" + this.d + ", time=" + this.f81886e + ", tradeNumber=" + this.f81887f + ", code=" + this.f81888g + ", marketBoard=" + this.f81889h + ", price=" + this.f81890i + ", change=" + this.f81891j + ", lot=" + this.f81892k + ", freq=" + this.f81893l + ", value=" + this.f81894m + ", isBrokerExists=" + this.f81895n + ", buyer=" + this.f81896o + ", seller=" + this.f81897p + ")";
    }
}
