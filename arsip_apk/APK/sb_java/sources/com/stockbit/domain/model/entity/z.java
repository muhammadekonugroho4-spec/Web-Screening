package com.stockbit.domain.model.entity;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f83982a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83983b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83984c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83985e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83986f;

    /* renamed from: g, reason: collision with root package name */
    public final String f83987g;

    /* renamed from: h, reason: collision with root package name */
    public final int f83988h;

    public z(String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9) {
        kotlin.jvm.internal.p.l(r2, "code");
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "address");
        kotlin.jvm.internal.p.l(r5, "phone");
        kotlin.jvm.internal.p.l(r6, "email");
        kotlin.jvm.internal.p.l(r7, "image");
        kotlin.jvm.internal.p.l(r8, "imageDark");
        this.f83982a = r2;
        this.f83983b = r3;
        this.f83984c = r4;
        this.d = r5;
        this.f83985e = r6;
        this.f83986f = r7;
        this.f83987g = r8;
        this.f83988h = r9;
    }

    public final String a() {
        return this.f83984c;
    }

    public final String b() {
        return this.f83983b;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof z) == true) goto L8;
        return false;
    L8:
        z r52 = (z) r5;
        if (kotlin.jvm.internal.p.g(this.f83982a, r52.f83982a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83983b, r52.f83983b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83984c, r52.f83984c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83985e, r52.f83985e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83986f, r52.f83986f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f83987g, r52.f83987g) == true) goto L30;
        return false;
    L30:
        if (this.f83988h == r52.f83988h) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        return (((((((((((((this.f83982a.hashCode() * 31) + this.f83983b.hashCode()) * 31) + this.f83984c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f83985e.hashCode()) * 31) + this.f83986f.hashCode()) * 31) + this.f83987g.hashCode()) * 31) + Integer.hashCode(this.f83988h);
    }

    public String toString() {
        return "TransferStockSecurities(code=" + this.f83982a + ", name=" + this.f83983b + ", address=" + this.f83984c + ", phone=" + this.d + ", email=" + this.f83985e + ", image=" + this.f83986f + ", imageDark=" + this.f83987g + ", baseFee=" + this.f83988h + ')';
    }
}
