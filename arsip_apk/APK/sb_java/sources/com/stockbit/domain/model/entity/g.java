package com.stockbit.domain.model.entity;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f82754a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82755b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82756c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82757e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82758f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82759g;

    public g(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r3, "sid");
        kotlin.jvm.internal.p.l(r4, "nik");
        kotlin.jvm.internal.p.l(r5, "address");
        kotlin.jvm.internal.p.l(r6, "customerCode");
        kotlin.jvm.internal.p.l(r7, "reason");
        kotlin.jvm.internal.p.l(r8, "rdn");
        this.f82754a = r2;
        this.f82755b = r3;
        this.f82756c = r4;
        this.d = r5;
        this.f82757e = r6;
        this.f82758f = r7;
        this.f82759g = r8;
    }

    public final String a() {
        return this.f82757e;
    }

    public final String b() {
        return this.f82754a;
    }

    public final String c() {
        return this.f82755b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f82754a, r52.f82754a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82755b, r52.f82755b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82756c, r52.f82756c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82757e, r52.f82757e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82758f, r52.f82758f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f82759g, r52.f82759g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f82754a.hashCode() * 31) + this.f82755b.hashCode()) * 31) + this.f82756c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82757e.hashCode()) * 31) + this.f82758f.hashCode()) * 31) + this.f82759g.hashCode();
    }

    public String toString() {
        return "Customer(name=" + this.f82754a + ", sid=" + this.f82755b + ", nik=" + this.f82756c + ", address=" + this.d + ", customerCode=" + this.f82757e + ", reason=" + this.f82758f + ", rdn=" + this.f82759g + ')';
    }

    public /* synthetic */ g(String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = "-";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = "-";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = "-";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = "-";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = "-";
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = "-";
    L21:
        if ((r9 & 64) == 0) goto L24;
        String r92 = "-";
    L23:
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
