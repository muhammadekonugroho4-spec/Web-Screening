package com.stockbit.domains.usecase.stockgroups.contract.entity;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f88438a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88439b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88440c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f88441e;

    /* renamed from: f, reason: collision with root package name */
    public final String f88442f;

    /* renamed from: g, reason: collision with root package name */
    public final String f88443g;

    /* renamed from: h, reason: collision with root package name */
    public final String f88444h;

    /* renamed from: i, reason: collision with root package name */
    public final String f88445i;

    /* renamed from: j, reason: collision with root package name */
    public final String f88446j;

    /* renamed from: k, reason: collision with root package name */
    public final double f88447k;

    /* renamed from: l, reason: collision with root package name */
    public final double f88448l;

    /* renamed from: m, reason: collision with root package name */
    public final double f88449m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f88450n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f88451o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f88452p;

    public h(String r3, String r4, String r5, String r6, double r7, String r9, String r10, String r11, String r12, String r13, double r14, double r16, double r18, boolean r20, boolean r21, boolean r22) {
        p.l(r3, "code");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "iconUrl");
        p.l(r6, FirebaseAnalytics.Param.PRICE);
        p.l(r9, "change");
        p.l(r10, "percentage");
        p.l(r11, "value");
        p.l(r12, "volume");
        p.l(r13, "freq");
        this.f88438a = r3;
        this.f88439b = r4;
        this.f88440c = r5;
        this.d = r6;
        this.f88441e = r7;
        this.f88442f = r9;
        this.f88443g = r10;
        this.f88444h = r11;
        this.f88445i = r12;
        this.f88446j = r13;
        this.f88447k = r14;
        this.f88448l = r16;
        this.f88449m = r18;
        this.f88450n = r20;
        this.f88451o = r21;
        this.f88452p = r22;
    }

    public static /* synthetic */ h b(h r16, String r17, String r18, String r19, String r20, double r21, String r23, String r24, String r25, String r26, String r27, double r28, double r30, double r32, boolean r34, boolean r35, boolean r36, int r37, Object r38) {
        if ((r37 & 1) == 0) goto L5;
        String r2 = r16.f88438a;
    L7:
        if ((r37 & 2) == 0) goto L9;
        String r3 = r16.f88439b;
    L11:
        if ((r37 & 4) == 0) goto L13;
        String r4 = r16.f88440c;
    L15:
        if ((r37 & 8) == 0) goto L17;
        String r5 = r16.d;
    L19:
        if ((r37 & 16) == 0) goto L21;
        double r6 = r16.f88441e;
    L23:
        if ((r37 & 32) == 0) goto L25;
        String r8 = r16.f88442f;
    L27:
        if ((r37 & 64) == 0) goto L29;
        String r9 = r16.f88443g;
    L31:
        if ((r37 & 128) == 0) goto L33;
        String r10 = r16.f88444h;
    L35:
        if ((r37 & 256) == 0) goto L37;
        String r11 = r16.f88445i;
    L39:
        if ((r37 & 512) == 0) goto L41;
        String r12 = r16.f88446j;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        double r13 = r16.f88447k;
    L46:
        String r172 = r2;
        String r182 = r3;
        if ((r37 & 2048) == 0) goto L49;
        double r22 = r16.f88448l;
    L50:
        double r192 = r22;
        if ((r37 & 4096) == 0) goto L53;
        double r29 = r16.f88449m;
    L55:
        if ((r37 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        boolean r15 = r16.f88450n;
    L58:
        double r212 = r29;
        if ((r37 & 16384) == 0) goto L61;
        boolean r210 = r16.f88451o;
    L63:
        if ((r37 & 32768) == 0) goto L66;
        boolean r372 = r16.f88452p;
    L68:
        return r16.a(r172, r182, r4, r5, r6, r8, r9, r10, r11, r12, r13, r192, r212, r15, r210, r372);
    L66:
        r372 = r36;
        goto L68
    L61:
        r210 = r35;
        goto L63
    L57:
        r15 = r34;
        goto L58
    L53:
        r29 = r32;
        goto L55
    L49:
        r22 = r30;
        goto L50
    L45:
        r13 = r28;
        goto L46
    L41:
        r12 = r27;
        goto L43
    L37:
        r11 = r26;
        goto L39
    L33:
        r10 = r25;
        goto L35
    L29:
        r9 = r24;
        goto L31
    L25:
        r8 = r23;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final h a(String r23, String r24, String r25, String r26, double r27, String r29, String r30, String r31, String r32, String r33, double r34, double r36, double r38, boolean r40, boolean r41, boolean r42) {
        p.l(r23, "code");
        p.l(r24, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r25, "iconUrl");
        p.l(r26, FirebaseAnalytics.Param.PRICE);
        p.l(r29, "change");
        p.l(r30, "percentage");
        p.l(r31, "value");
        p.l(r32, "volume");
        p.l(r33, "freq");
        return new h(r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r36, r38, r40, r41, r42);
    }

    public final String c() {
        return this.f88442f;
    }

    public final String d() {
        return this.f88438a;
    }

    public final String e() {
        return this.f88446j;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (p.g(this.f88438a, r82.f88438a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88439b, r82.f88439b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88440c, r82.f88440c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f88441e, r82.f88441e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f88442f, r82.f88442f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f88443g, r82.f88443g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f88444h, r82.f88444h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f88445i, r82.f88445i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f88446j, r82.f88446j) == true) goto L39;
        return false;
    L39:
        if (Double.compare(this.f88447k, r82.f88447k) == 0) goto L42;
        return false;
    L42:
        if (Double.compare(this.f88448l, r82.f88448l) == 0) goto L45;
        return false;
    L45:
        if (Double.compare(this.f88449m, r82.f88449m) == 0) goto L48;
        return false;
    L48:
        if (this.f88450n == r82.f88450n) goto L51;
        return false;
    L51:
        if (this.f88451o == r82.f88451o) goto L54;
        return false;
    L54:
        if (this.f88452p == r82.f88452p) goto L56;
        return false;
    L56:
        return true;
    }

    public final double f() {
        return this.f88449m;
    }

    public final String g() {
        return this.f88440c;
    }

    public final String h() {
        return this.f88439b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.f88438a.hashCode() * 31) + this.f88439b.hashCode()) * 31) + this.f88440c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f88441e)) * 31) + this.f88442f.hashCode()) * 31) + this.f88443g.hashCode()) * 31) + this.f88444h.hashCode()) * 31) + this.f88445i.hashCode()) * 31) + this.f88446j.hashCode()) * 31) + Double.hashCode(this.f88447k)) * 31) + Double.hashCode(this.f88448l)) * 31) + Double.hashCode(this.f88449m)) * 31) + Boolean.hashCode(this.f88450n)) * 31) + Boolean.hashCode(this.f88451o)) * 31) + Boolean.hashCode(this.f88452p);
    }

    public final String i() {
        return this.f88443g;
    }

    public final String j() {
        return this.d;
    }

    public final double k() {
        return this.f88441e;
    }

    public final String l() {
        return this.f88444h;
    }

    public final double m() {
        return this.f88447k;
    }

    public final String n() {
        return this.f88445i;
    }

    public final double o() {
        return this.f88448l;
    }

    public final boolean p() {
        return this.f88451o;
    }

    public final boolean q() {
        return this.f88450n;
    }

    public final boolean r() {
        return this.f88452p;
    }

    public String toString() {
        return "StockItemByGroupEntity(code=" + this.f88438a + ", name=" + this.f88439b + ", iconUrl=" + this.f88440c + ", price=" + this.d + ", priceRaw=" + this.f88441e + ", change=" + this.f88442f + ", percentage=" + this.f88443g + ", value=" + this.f88444h + ", volume=" + this.f88445i + ", freq=" + this.f88446j + ", valueRaw=" + this.f88447k + ", volumeRaw=" + this.f88448l + ", freqRaw=" + this.f88449m + ", isShowNotation=" + this.f88450n + ", isShowCorporateAction=" + this.f88451o + ", isShowUma=" + this.f88452p + ")";
    }
}
