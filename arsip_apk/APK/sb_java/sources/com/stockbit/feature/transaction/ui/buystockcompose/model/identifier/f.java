package com.stockbit.feature.transaction.ui.buystockcompose.model.identifier;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f111619a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111620b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111621c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f111622e;

    /* renamed from: f, reason: collision with root package name */
    public final String f111623f;

    /* renamed from: g, reason: collision with root package name */
    public final String f111624g;

    /* renamed from: h, reason: collision with root package name */
    public final String f111625h;

    /* renamed from: i, reason: collision with root package name */
    public final String f111626i;

    /* renamed from: j, reason: collision with root package name */
    public final String f111627j;

    /* renamed from: k, reason: collision with root package name */
    public final String f111628k;

    /* renamed from: l, reason: collision with root package name */
    public final String f111629l;

    /* renamed from: m, reason: collision with root package name */
    public final String f111630m;

    /* renamed from: n, reason: collision with root package name */
    public final String f111631n;

    /* renamed from: o, reason: collision with root package name */
    public final String f111632o;

    /* renamed from: p, reason: collision with root package name */
    public final String f111633p;

    /* renamed from: q, reason: collision with root package name */
    public final String f111634q;

    /* renamed from: r, reason: collision with root package name */
    public final String f111635r;

    /* renamed from: s, reason: collision with root package name */
    public final String f111636s;

    static {
    }

    public f(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35) {
        p.l(r17, "infoIconId");
        p.l(r18, "switchId");
        p.l(r19, "quantityTextInputId");
        p.l(r20, "splitMethodInfoId");
        p.l(r21, "randomChipId");
        p.l(r22, "equalChipId");
        p.l(r23, "minSplitTextInputId");
        p.l(r24, "maxSplitTextInputId");
        p.l(r25, "headerTextId");
        p.l(r26, "contentTextId");
        p.l(r27, "titleQuantityTextId");
        p.l(r28, "contentQuantityTextId");
        p.l(r29, "titleRangeId");
        p.l(r30, "contentRangeId");
        p.l(r31, "headerMethodTextId");
        p.l(r32, "titleRandomTextId");
        p.l(r33, "contentRandomTextId");
        p.l(r34, "titleEqualTextId");
        p.l(r35, "contentEqualTextId");
        this.f111619a = r17;
        this.f111620b = r18;
        this.f111621c = r19;
        this.d = r20;
        this.f111622e = r21;
        this.f111623f = r22;
        this.f111624g = r23;
        this.f111625h = r24;
        this.f111626i = r25;
        this.f111627j = r26;
        this.f111628k = r27;
        this.f111629l = r28;
        this.f111630m = r29;
        this.f111631n = r30;
        this.f111632o = r31;
        this.f111633p = r32;
        this.f111634q = r33;
        this.f111635r = r34;
        this.f111636s = r35;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f111620b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f111619a, r52.f111619a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f111620b, r52.f111620b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f111621c, r52.f111621c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f111622e, r52.f111622e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f111623f, r52.f111623f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f111624g, r52.f111624g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f111625h, r52.f111625h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f111626i, r52.f111626i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f111627j, r52.f111627j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f111628k, r52.f111628k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f111629l, r52.f111629l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f111630m, r52.f111630m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f111631n, r52.f111631n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f111632o, r52.f111632o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f111633p, r52.f111633p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f111634q, r52.f111634q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f111635r, r52.f111635r) == true) goto L63;
        return false;
    L63:
        if (p.g(this.f111636s, r52.f111636s) == true) goto L65;
        return false;
    L65:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.f111619a.hashCode() * 31) + this.f111620b.hashCode()) * 31) + this.f111621c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f111622e.hashCode()) * 31) + this.f111623f.hashCode()) * 31) + this.f111624g.hashCode()) * 31) + this.f111625h.hashCode()) * 31) + this.f111626i.hashCode()) * 31) + this.f111627j.hashCode()) * 31) + this.f111628k.hashCode()) * 31) + this.f111629l.hashCode()) * 31) + this.f111630m.hashCode()) * 31) + this.f111631n.hashCode()) * 31) + this.f111632o.hashCode()) * 31) + this.f111633p.hashCode()) * 31) + this.f111634q.hashCode()) * 31) + this.f111635r.hashCode()) * 31) + this.f111636s.hashCode();
    }

    public String toString() {
        return "SplitOrderLayoutIdentifier(infoIconId=" + this.f111619a + ", switchId=" + this.f111620b + ", quantityTextInputId=" + this.f111621c + ", splitMethodInfoId=" + this.d + ", randomChipId=" + this.f111622e + ", equalChipId=" + this.f111623f + ", minSplitTextInputId=" + this.f111624g + ", maxSplitTextInputId=" + this.f111625h + ", headerTextId=" + this.f111626i + ", contentTextId=" + this.f111627j + ", titleQuantityTextId=" + this.f111628k + ", contentQuantityTextId=" + this.f111629l + ", titleRangeId=" + this.f111630m + ", contentRangeId=" + this.f111631n + ", headerMethodTextId=" + this.f111632o + ", titleRandomTextId=" + this.f111633p + ", contentRandomTextId=" + this.f111634q + ", titleEqualTextId=" + this.f111635r + ", contentEqualTextId=" + this.f111636s + ')';
    }
}
