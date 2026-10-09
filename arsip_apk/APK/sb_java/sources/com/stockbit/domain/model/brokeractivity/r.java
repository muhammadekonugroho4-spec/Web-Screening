package com.stockbit.domain.model.brokeractivity;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f80920a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80921b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80922c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80923e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80924f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80925g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80926h;

    /* renamed from: i, reason: collision with root package name */
    public final String f80927i;

    /* renamed from: j, reason: collision with root package name */
    public final String f80928j;

    public r(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        kotlin.jvm.internal.p.l(r2, "code");
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "netVal");
        kotlin.jvm.internal.p.l(r5, "buyVal");
        kotlin.jvm.internal.p.l(r6, "sellVal");
        kotlin.jvm.internal.p.l(r7, "totalFreq");
        kotlin.jvm.internal.p.l(r8, "totalVal");
        kotlin.jvm.internal.p.l(r9, "totalVol");
        kotlin.jvm.internal.p.l(r10, "investorType");
        kotlin.jvm.internal.p.l(r11, "group");
        this.f80920a = r2;
        this.f80921b = r3;
        this.f80922c = r4;
        this.d = r5;
        this.f80923e = r6;
        this.f80924f = r7;
        this.f80925g = r8;
        this.f80926h = r9;
        this.f80927i = r10;
        this.f80928j = r11;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f80920a;
    }

    public final String c() {
        return this.f80928j;
    }

    public final String d() {
        return this.f80927i;
    }

    public final String e() {
        return this.f80921b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f80920a, r52.f80920a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80921b, r52.f80921b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80922c, r52.f80922c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f80923e, r52.f80923e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f80924f, r52.f80924f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f80925g, r52.f80925g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f80926h, r52.f80926h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f80927i, r52.f80927i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f80928j, r52.f80928j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f80922c;
    }

    public final String g() {
        return this.f80923e;
    }

    public final String h() {
        return this.f80924f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f80920a.hashCode() * 31) + this.f80921b.hashCode()) * 31) + this.f80922c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80923e.hashCode()) * 31) + this.f80924f.hashCode()) * 31) + this.f80925g.hashCode()) * 31) + this.f80926h.hashCode()) * 31) + this.f80927i.hashCode()) * 31) + this.f80928j.hashCode();
    }

    public final String i() {
        return this.f80925g;
    }

    public final String j() {
        return this.f80926h;
    }

    public String toString() {
        return "BrokerActivityDataEntity(code=" + this.f80920a + ", name=" + this.f80921b + ", netVal=" + this.f80922c + ", buyVal=" + this.d + ", sellVal=" + this.f80923e + ", totalFreq=" + this.f80924f + ", totalVal=" + this.f80925g + ", totalVol=" + this.f80926h + ", investorType=" + this.f80927i + ", group=" + this.f80928j + ")";
    }
}
