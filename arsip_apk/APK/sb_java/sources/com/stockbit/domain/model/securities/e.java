package com.stockbit.domain.model.securities;

import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final m f85113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85114b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85115c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f85116e;

    /* renamed from: f, reason: collision with root package name */
    public final List f85117f;

    public e(m r2, int r3, String r4, String r5, BigDecimal r6, List r7) {
        kotlin.jvm.internal.p.l(r2, "colorRealizedAmount");
        kotlin.jvm.internal.p.l(r4, "tooltip");
        kotlin.jvm.internal.p.l(r5, "tooltipHeader");
        kotlin.jvm.internal.p.l(r6, "totalRealizedAmount");
        kotlin.jvm.internal.p.l(r7, "tooltips");
        this.f85113a = r2;
        this.f85114b = r3;
        this.f85115c = r4;
        this.d = r5;
        this.f85116e = r6;
        this.f85117f = r7;
    }

    public final m a() {
        return this.f85113a;
    }

    public final int b() {
        return this.f85114b;
    }

    public final String c() {
        return this.f85115c;
    }

    public final String d() {
        return this.d;
    }

    public final List e() {
        return this.f85117f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f85113a, r52.f85113a) == true) goto L12;
        return false;
    L12:
        if (this.f85114b == r52.f85114b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85115c, r52.f85115c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f85116e, r52.f85116e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f85117f, r52.f85117f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final BigDecimal f() {
        return this.f85116e;
    }

    public int hashCode() {
        return (((((((((this.f85113a.hashCode() * 31) + Integer.hashCode(this.f85114b)) * 31) + this.f85115c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85116e.hashCode()) * 31) + this.f85117f.hashCode();
    }

    public String toString() {
        return "HistoryMetaEntity(colorRealizedAmount=" + this.f85113a + ", maxPage=" + this.f85114b + ", tooltip=" + this.f85115c + ", tooltipHeader=" + this.d + ", totalRealizedAmount=" + this.f85116e + ", tooltips=" + this.f85117f + ")";
    }
}
