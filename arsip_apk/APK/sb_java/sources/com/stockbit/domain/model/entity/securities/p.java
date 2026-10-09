package com.stockbit.domain.model.entity.securities;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public String f83510a;

    /* renamed from: b, reason: collision with root package name */
    public String f83511b;

    /* renamed from: c, reason: collision with root package name */
    public String f83512c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public String f83513e;

    /* renamed from: f, reason: collision with root package name */
    public String f83514f;

    /* renamed from: g, reason: collision with root package name */
    public String f83515g;

    /* renamed from: h, reason: collision with root package name */
    public String f83516h;

    /* renamed from: i, reason: collision with root package name */
    public String f83517i;

    public p(String r2, String r3, String r4, ArrayList r5, String r6, String r7, String r8, String r9, String r10) {
        kotlin.jvm.internal.p.l(r5, "compositions");
        this.f83510a = r2;
        this.f83511b = r3;
        this.f83512c = r4;
        this.d = r5;
        this.f83513e = r6;
        this.f83514f = r7;
        this.f83515g = r8;
        this.f83516h = r9;
        this.f83517i = r10;
    }

    public final ArrayList a() {
        return this.d;
    }

    public final String b() {
        return this.f83511b;
    }

    public final String c() {
        return this.f83514f;
    }

    public final String d() {
        return this.f83516h;
    }

    public final String e() {
        return this.f83517i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f83510a, r52.f83510a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83511b, r52.f83511b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83512c, r52.f83512c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83513e, r52.f83513e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83514f, r52.f83514f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f83515g, r52.f83515g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f83516h, r52.f83516h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f83517i, r52.f83517i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f83515g;
    }

    public final String g() {
        return this.f83513e;
    }

    public final String h() {
        return this.f83512c;
    }

    public int hashCode() {
        String r02 = this.f83510a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83511b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83512c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (((r05 + r24) * 31) + this.d.hashCode()) * 31;
        String r25 = this.f83513e;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f83514f;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83515g;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f83516h;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f83517i;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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

    public final String i() {
        return this.f83510a;
    }

    public String toString() {
        return "FormulaExchange(title=" + this.f83510a + ", desc=" + this.f83511b + ", subtitle=" + this.f83512c + ", compositions=" + this.d + ", exchangeFeeTotalTitle=" + this.f83513e + ", exchangeFeeTotalBuy=" + this.f83514f + ", exchangeFeeTotalSell=" + this.f83515g + ", exchangeFeeTotalCaBuy=" + this.f83516h + ", exchangeFeeTotalCaSell=" + this.f83517i + ')';
    }
}
