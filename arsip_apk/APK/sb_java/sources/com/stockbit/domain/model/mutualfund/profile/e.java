package com.stockbit.domain.model.mutualfund.profile;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f84420a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84421b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84422c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84423e;

    /* renamed from: f, reason: collision with root package name */
    public final f f84424f;

    /* renamed from: g, reason: collision with root package name */
    public final f f84425g;

    /* renamed from: h, reason: collision with root package name */
    public final f f84426h;

    /* renamed from: i, reason: collision with root package name */
    public final f f84427i;

    /* renamed from: j, reason: collision with root package name */
    public final f f84428j;

    /* renamed from: k, reason: collision with root package name */
    public final f f84429k;

    /* renamed from: l, reason: collision with root package name */
    public final String f84430l;

    /* renamed from: m, reason: collision with root package name */
    public final String f84431m;

    /* renamed from: n, reason: collision with root package name */
    public final String f84432n;

    /* renamed from: o, reason: collision with root package name */
    public final String f84433o;

    /* renamed from: p, reason: collision with root package name */
    public final List f84434p;

    /* renamed from: q, reason: collision with root package name */
    public final List f84435q;

    /* renamed from: r, reason: collision with root package name */
    public final f f84436r;

    public e(String r17, String r18, String r19, String r20, String r21, f r22, f r23, f r24, f r25, f r26, f r27, String r28, String r29, String r30, String r31, List r32, List r33, f r34) {
        p.l(r17, "inceptionDate");
        p.l(r18, "fundManager");
        p.l(r19, "fundManagerIco");
        p.l(r20, "custodianBank");
        p.l(r21, "custodianIco");
        p.l(r22, "cagr5year");
        p.l(r23, "maxDrawDown");
        p.l(r24, "expenseRatio");
        p.l(r25, "aum");
        p.l(r26, "fundType");
        p.l(r27, "riskLevel");
        p.l(r28, "minBuy");
        p.l(r29, "redemptionBank");
        p.l(r30, "buyFee");
        p.l(r31, "sellFee");
        p.l(r32, "fundFactSheet");
        p.l(r33, "prospectus");
        p.l(r34, "averageYield");
        this.f84420a = r17;
        this.f84421b = r18;
        this.f84422c = r19;
        this.d = r20;
        this.f84423e = r21;
        this.f84424f = r22;
        this.f84425g = r23;
        this.f84426h = r24;
        this.f84427i = r25;
        this.f84428j = r26;
        this.f84429k = r27;
        this.f84430l = r28;
        this.f84431m = r29;
        this.f84432n = r30;
        this.f84433o = r31;
        this.f84434p = r32;
        this.f84435q = r33;
        this.f84436r = r34;
    }

    public final f a() {
        return this.f84427i;
    }

    public final f b() {
        return this.f84436r;
    }

    public final String c() {
        return this.f84432n;
    }

    public final f d() {
        return this.f84424f;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f84420a, r52.f84420a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84421b, r52.f84421b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84422c, r52.f84422c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84423e, r52.f84423e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84424f, r52.f84424f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84425g, r52.f84425g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84426h, r52.f84426h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84427i, r52.f84427i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f84428j, r52.f84428j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f84429k, r52.f84429k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f84430l, r52.f84430l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f84431m, r52.f84431m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f84432n, r52.f84432n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f84433o, r52.f84433o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f84434p, r52.f84434p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f84435q, r52.f84435q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f84436r, r52.f84436r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final String f() {
        return this.f84423e;
    }

    public final f g() {
        return this.f84426h;
    }

    public final List h() {
        return this.f84434p;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f84420a.hashCode() * 31) + this.f84421b.hashCode()) * 31) + this.f84422c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84423e.hashCode()) * 31) + this.f84424f.hashCode()) * 31) + this.f84425g.hashCode()) * 31) + this.f84426h.hashCode()) * 31) + this.f84427i.hashCode()) * 31) + this.f84428j.hashCode()) * 31) + this.f84429k.hashCode()) * 31) + this.f84430l.hashCode()) * 31) + this.f84431m.hashCode()) * 31) + this.f84432n.hashCode()) * 31) + this.f84433o.hashCode()) * 31) + this.f84434p.hashCode()) * 31) + this.f84435q.hashCode()) * 31) + this.f84436r.hashCode();
    }

    public final String i() {
        return this.f84422c;
    }

    public final f j() {
        return this.f84428j;
    }

    public final f k() {
        return this.f84425g;
    }

    public final String l() {
        return this.f84430l;
    }

    public final List m() {
        return this.f84435q;
    }

    public final String n() {
        return this.f84431m;
    }

    public final f o() {
        return this.f84429k;
    }

    public final String p() {
        return this.f84433o;
    }

    public String toString() {
        return "MutualFundProfileItemEntity(inceptionDate=" + this.f84420a + ", fundManager=" + this.f84421b + ", fundManagerIco=" + this.f84422c + ", custodianBank=" + this.d + ", custodianIco=" + this.f84423e + ", cagr5year=" + this.f84424f + ", maxDrawDown=" + this.f84425g + ", expenseRatio=" + this.f84426h + ", aum=" + this.f84427i + ", fundType=" + this.f84428j + ", riskLevel=" + this.f84429k + ", minBuy=" + this.f84430l + ", redemptionBank=" + this.f84431m + ", buyFee=" + this.f84432n + ", sellFee=" + this.f84433o + ", fundFactSheet=" + this.f84434p + ", prospectus=" + this.f84435q + ", averageYield=" + this.f84436r + ")";
    }
}
