package com.stockbit.usecase.tracking;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f163184a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163185b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f163186c;
    public final Double d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f163187e;

    /* renamed from: f, reason: collision with root package name */
    public final String f163188f;

    /* renamed from: g, reason: collision with root package name */
    public final String f163189g;

    /* renamed from: h, reason: collision with root package name */
    public final String f163190h;

    /* renamed from: i, reason: collision with root package name */
    public final String f163191i;

    /* renamed from: j, reason: collision with root package name */
    public final String f163192j;

    /* renamed from: k, reason: collision with root package name */
    public final String f163193k;

    public a(String r1, String r2, Double r3, Double r4, Long r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        this.f163184a = r1;
        this.f163185b = r2;
        this.f163186c = r3;
        this.d = r4;
        this.f163187e = r5;
        this.f163188f = r6;
        this.f163189g = r7;
        this.f163190h = r8;
        this.f163191i = r9;
        this.f163192j = r10;
        this.f163193k = r11;
    }

    public final Long a() {
        return this.f163187e;
    }

    public final String b() {
        return this.f163189g;
    }

    public final String c() {
        return this.f163190h;
    }

    public final String d() {
        return this.f163188f;
    }

    public final String e() {
        return this.f163184a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f163184a, r52.f163184a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163185b, r52.f163185b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163186c, r52.f163186c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f163187e, r52.f163187e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f163188f, r52.f163188f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f163189g, r52.f163189g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f163190h, r52.f163190h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f163191i, r52.f163191i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f163192j, r52.f163192j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f163193k, r52.f163193k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f163185b;
    }

    public final String g() {
        return this.f163191i;
    }

    public final String h() {
        return this.f163192j;
    }

    public int hashCode() {
        String r02 = this.f163184a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f163185b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.f163186c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Long r27 = this.f163187e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f163188f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f163189g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f163190h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f163191i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f163192j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f163193k;
        if (r219 == null) goto L47;
        r1 = r219.hashCode();
    L47:
        return r013 + r1;
    L41:
        r218 = r217.hashCode();
        goto L42
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
        return "IpLocationEntity(ip=" + this.f163184a + ", isp=" + this.f163185b + ", latitude=" + this.f163186c + ", longitude=" + this.d + ", asn=" + this.f163187e + ", country=" + this.f163188f + ", city=" + this.f163189g + ", colo=" + this.f163190h + ", region=" + this.f163191i + ", regionCode=" + this.f163192j + ", timezone=" + this.f163193k + ")";
    }
}
