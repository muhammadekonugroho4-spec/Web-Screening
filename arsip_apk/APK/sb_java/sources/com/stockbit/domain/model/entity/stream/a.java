package com.stockbit.domain.model.entity.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f83693a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83694b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83695c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83696e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83697f;

    /* renamed from: g, reason: collision with root package name */
    public final String f83698g;

    /* renamed from: h, reason: collision with root package name */
    public final String f83699h;

    /* renamed from: i, reason: collision with root package name */
    public final String f83700i;

    public a(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        this.f83693a = r1;
        this.f83694b = r2;
        this.f83695c = r3;
        this.d = r4;
        this.f83696e = r5;
        this.f83697f = r6;
        this.f83698g = r7;
        this.f83699h = r8;
        this.f83700i = r9;
    }

    public final String a() {
        return this.f83697f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f83700i;
    }

    public final String d() {
        return this.f83699h;
    }

    public final String e() {
        return this.f83698g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f83693a, r52.f83693a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83694b, r52.f83694b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83695c, r52.f83695c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83696e, r52.f83696e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83697f, r52.f83697f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83698g, r52.f83698g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f83699h, r52.f83699h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f83700i, r52.f83700i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f83696e;
    }

    public int hashCode() {
        String r02 = this.f83693a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83694b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83695c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f83696e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83697f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f83698g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f83699h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f83700i;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return r011 + r1;
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
        return "Announcement(id=" + this.f83693a + ", companyId=" + this.f83694b + ", postedon=" + this.f83695c + ", headline=" + this.d + ", title=" + this.f83696e + ", attachment=" + this.f83697f + ", symbol=" + this.f83698g + ", name=" + this.f83699h + ", iconUrl=" + this.f83700i + ')';
    }
}
