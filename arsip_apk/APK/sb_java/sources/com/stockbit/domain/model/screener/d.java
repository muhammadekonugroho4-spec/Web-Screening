package com.stockbit.domain.model.screener;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f84874a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84875b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84876c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84877e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84878f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84879g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84880h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84881i;

    /* renamed from: j, reason: collision with root package name */
    public final a f84882j;

    public d(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, a r11) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "symbol");
        p.l(r5, "symbol2");
        p.l(r6, "symbol3");
        p.l(r7, "country");
        p.l(r8, "exchange");
        p.l(r9, "type");
        p.l(r10, "iconUrl");
        this.f84874a = r2;
        this.f84875b = r3;
        this.f84876c = r4;
        this.d = r5;
        this.f84877e = r6;
        this.f84878f = r7;
        this.f84879g = r8;
        this.f84880h = r9;
        this.f84881i = r10;
        this.f84882j = r11;
    }

    public final a a() {
        return this.f84882j;
    }

    public final String b() {
        return this.f84878f;
    }

    public final String c() {
        return this.f84879g;
    }

    public final String d() {
        return this.f84881i;
    }

    public final String e() {
        return this.f84874a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f84874a, r52.f84874a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84875b, r52.f84875b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84876c, r52.f84876c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84877e, r52.f84877e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84878f, r52.f84878f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84879g, r52.f84879g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84880h, r52.f84880h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84881i, r52.f84881i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f84882j, r52.f84882j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f84875b;
    }

    public final String g() {
        return this.f84876c;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((this.f84874a.hashCode() * 31) + this.f84875b.hashCode()) * 31) + this.f84876c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84877e.hashCode()) * 31) + this.f84878f.hashCode()) * 31) + this.f84879g.hashCode()) * 31) + this.f84880h.hashCode()) * 31) + this.f84881i.hashCode()) * 31;
        a r1 = this.f84882j;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String i() {
        return this.f84877e;
    }

    public final String j() {
        return this.f84880h;
    }

    public String toString() {
        return "ScreenerCompanyBeanEntity(id=" + this.f84874a + ", name=" + this.f84875b + ", symbol=" + this.f84876c + ", symbol2=" + this.d + ", symbol3=" + this.f84877e + ", country=" + this.f84878f + ", exchange=" + this.f84879g + ", type=" + this.f84880h + ", iconUrl=" + this.f84881i + ", badges=" + this.f84882j + ")";
    }
}
