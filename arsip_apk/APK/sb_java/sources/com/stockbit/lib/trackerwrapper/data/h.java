package com.stockbit.lib.trackerwrapper.data;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f120558a;

    /* renamed from: b, reason: collision with root package name */
    public String f120559b;

    /* renamed from: c, reason: collision with root package name */
    public String f120560c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f120561e;

    /* renamed from: f, reason: collision with root package name */
    public String f120562f;

    public h(String r1, String r2, String r3, String r4, String r5, String r6) {
        this.f120558a = r1;
        this.f120559b = r2;
        this.f120560c = r3;
        this.d = r4;
        this.f120561e = r5;
        this.f120562f = r6;
    }

    public final String a() {
        return this.f120562f;
    }

    public final String b() {
        return this.f120558a;
    }

    public final String c() {
        return this.f120559b;
    }

    public final String d() {
        return this.f120561e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f120558a, r52.f120558a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120559b, r52.f120559b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f120560c, r52.f120560c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f120561e, r52.f120561e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f120562f, r52.f120562f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f120560c;
    }

    public int hashCode() {
        String r02 = this.f120558a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f120559b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f120560c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f120561e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f120562f;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
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
        return "TrackingMetaData(loginMethod=" + this.f120558a + ", loginTimeStamp=" + this.f120559b + ", sourceIp=" + this.f120560c + ", sourceCountryCode=" + this.d + ", sourceCity=" + this.f120561e + ", isp=" + this.f120562f + ')';
    }
}
