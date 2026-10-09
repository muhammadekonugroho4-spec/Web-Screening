package com.stockbit.usecase.foreignflow.contract.entity;

import com.clevertap.android.sdk.Constants;
import java.time.LocalDate;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f157875a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157876b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157877c;
    public final e d;

    /* renamed from: e, reason: collision with root package name */
    public final e f157878e;

    /* renamed from: f, reason: collision with root package name */
    public final e f157879f;

    /* renamed from: g, reason: collision with root package name */
    public final e f157880g;

    /* renamed from: h, reason: collision with root package name */
    public final e f157881h;

    /* renamed from: i, reason: collision with root package name */
    public final e f157882i;

    /* renamed from: j, reason: collision with root package name */
    public final e f157883j;

    /* renamed from: k, reason: collision with root package name */
    public final e f157884k;

    /* renamed from: l, reason: collision with root package name */
    public final e f157885l;

    public c(LocalDate r2, String r3, String r4, e r5, e r6, e r7, e r8, e r9, e r10, e r11, e r12, e r13) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, "dateLabel");
        p.l(r4, "tableDateLabel");
        p.l(r5, "netForeign");
        p.l(r6, "foreignBuy");
        p.l(r7, "foreignSell");
        p.l(r8, "foreignFlow");
        p.l(r9, "netLot");
        p.l(r10, "netFrequency");
        p.l(r11, "averagePrice");
        p.l(r12, "percentageForeign");
        p.l(r13, "percentageDomestic");
        this.f157875a = r2;
        this.f157876b = r3;
        this.f157877c = r4;
        this.d = r5;
        this.f157878e = r6;
        this.f157879f = r7;
        this.f157880g = r8;
        this.f157881h = r9;
        this.f157882i = r10;
        this.f157883j = r11;
        this.f157884k = r12;
        this.f157885l = r13;
    }

    public final e a() {
        return this.f157883j;
    }

    public final LocalDate b() {
        return this.f157875a;
    }

    public final String c() {
        return this.f157876b;
    }

    public final e d() {
        return this.f157878e;
    }

    public final e e() {
        return this.f157880g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f157875a, r52.f157875a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157876b, r52.f157876b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157877c, r52.f157877c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157878e, r52.f157878e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157879f, r52.f157879f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f157880g, r52.f157880g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f157881h, r52.f157881h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f157882i, r52.f157882i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f157883j, r52.f157883j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f157884k, r52.f157884k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f157885l, r52.f157885l) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final e f() {
        return this.f157879f;
    }

    public final e g() {
        return this.d;
    }

    public final e h() {
        return this.f157882i;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f157875a.hashCode() * 31) + this.f157876b.hashCode()) * 31) + this.f157877c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157878e.hashCode()) * 31) + this.f157879f.hashCode()) * 31) + this.f157880g.hashCode()) * 31) + this.f157881h.hashCode()) * 31) + this.f157882i.hashCode()) * 31) + this.f157883j.hashCode()) * 31) + this.f157884k.hashCode()) * 31) + this.f157885l.hashCode();
    }

    public final e i() {
        return this.f157881h;
    }

    public final e j() {
        return this.f157885l;
    }

    public final e k() {
        return this.f157884k;
    }

    public final String l() {
        return this.f157877c;
    }

    public String toString() {
        return "ForeignFlowHistoricalNetEntity(date=" + this.f157875a + ", dateLabel=" + this.f157876b + ", tableDateLabel=" + this.f157877c + ", netForeign=" + this.d + ", foreignBuy=" + this.f157878e + ", foreignSell=" + this.f157879f + ", foreignFlow=" + this.f157880g + ", netLot=" + this.f157881h + ", netFrequency=" + this.f157882i + ", averagePrice=" + this.f157883j + ", percentageForeign=" + this.f157884k + ", percentageDomestic=" + this.f157885l + ")";
    }
}
