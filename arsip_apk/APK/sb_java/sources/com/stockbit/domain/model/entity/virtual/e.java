package com.stockbit.domain.model.entity.virtual;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f83858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83859b;

    /* renamed from: c, reason: collision with root package name */
    public String f83860c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public List f83861e;

    /* renamed from: f, reason: collision with root package name */
    public String f83862f;

    /* renamed from: g, reason: collision with root package name */
    public String f83863g;

    /* renamed from: h, reason: collision with root package name */
    public String f83864h;

    /* renamed from: i, reason: collision with root package name */
    public String f83865i;

    /* renamed from: j, reason: collision with root package name */
    public String f83866j;

    public e(String r1, String r2, String r3, String r4, List r5, String r6, String r7, String r8, String r9, String r10) {
        this.f83858a = r1;
        this.f83859b = r2;
        this.f83860c = r3;
        this.d = r4;
        this.f83861e = r5;
        this.f83862f = r6;
        this.f83863g = r7;
        this.f83864h = r8;
        this.f83865i = r9;
        this.f83866j = r10;
    }

    public final String a() {
        return this.f83860c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f83859b;
    }

    public final String d() {
        return this.f83865i;
    }

    public final String e() {
        return this.f83864h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f83858a, r52.f83858a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83859b, r52.f83859b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83860c, r52.f83860c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83861e, r52.f83861e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83862f, r52.f83862f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83863g, r52.f83863g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f83864h, r52.f83864h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f83865i, r52.f83865i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f83866j, r52.f83866j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final List f() {
        return this.f83861e;
    }

    public final String g() {
        return this.f83858a;
    }

    public final String h() {
        return this.f83862f;
    }

    public int hashCode() {
        String r02 = this.f83858a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83859b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83860c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        List r27 = this.f83861e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83862f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f83863g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f83864h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f83865i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f83866j;
        if (r217 == null) goto L43;
        r1 = r217.hashCode();
    L43:
        return r012 + r1;
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TradingPortfolio(tradingbalance=" + this.f83858a + ", amountInvested=" + this.f83859b + ", amountAllocated=" + this.f83860c + ", amountCreditlimit=" + this.d + ", result=" + this.f83861e + ", unrealisedProfitloss=" + this.f83862f + ", realisedProfitloss=" + this.f83863g + ", profitloss=" + this.f83864h + ", equity=" + this.f83865i + ", gain=" + this.f83866j + ')';
    }
}
