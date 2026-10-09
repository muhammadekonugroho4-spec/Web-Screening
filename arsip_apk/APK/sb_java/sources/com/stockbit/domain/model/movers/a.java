package com.stockbit.domain.model.movers;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84328a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84329b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84330c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final c f84331e;

    /* renamed from: f, reason: collision with root package name */
    public final r f84332f;

    /* renamed from: g, reason: collision with root package name */
    public final s f84333g;

    /* renamed from: h, reason: collision with root package name */
    public final g f84334h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84335i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f84336j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f84337k;

    public a(String r2, String r3, String r4, double r5, c r7, r r8, s r9, g r10, boolean r11, boolean r12, boolean r13) {
        kotlin.jvm.internal.p.l(r2, "code");
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "iconUrl");
        kotlin.jvm.internal.p.l(r7, "change");
        kotlin.jvm.internal.p.l(r8, "value");
        kotlin.jvm.internal.p.l(r9, "volume");
        kotlin.jvm.internal.p.l(r10, Constants.KEY_FREQUENCY);
        this.f84328a = r2;
        this.f84329b = r3;
        this.f84330c = r4;
        this.d = r5;
        this.f84331e = r7;
        this.f84332f = r8;
        this.f84333g = r9;
        this.f84334h = r10;
        this.f84335i = r11;
        this.f84336j = r12;
        this.f84337k = r13;
    }

    public final c a() {
        return this.f84331e;
    }

    public final String b() {
        return this.f84328a;
    }

    public final g c() {
        return this.f84334h;
    }

    public final String d() {
        return this.f84330c;
    }

    public final String e() {
        return this.f84329b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (kotlin.jvm.internal.p.g(this.f84328a, r82.f84328a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84329b, r82.f84329b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84330c, r82.f84330c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f84331e, r82.f84331e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f84332f, r82.f84332f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f84333g, r82.f84333g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f84334h, r82.f84334h) == true) goto L33;
        return false;
    L33:
        if (this.f84335i == r82.f84335i) goto L36;
        return false;
    L36:
        if (this.f84336j == r82.f84336j) goto L39;
        return false;
    L39:
        if (this.f84337k == r82.f84337k) goto L41;
        return false;
    L41:
        return true;
    }

    public final double f() {
        return this.d;
    }

    public final r g() {
        return this.f84332f;
    }

    public final s h() {
        return this.f84333g;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f84328a.hashCode() * 31) + this.f84329b.hashCode()) * 31) + this.f84330c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f84331e.hashCode()) * 31) + this.f84332f.hashCode()) * 31) + this.f84333g.hashCode()) * 31) + this.f84334h.hashCode()) * 31) + Boolean.hashCode(this.f84335i)) * 31) + Boolean.hashCode(this.f84336j)) * 31) + Boolean.hashCode(this.f84337k);
    }

    public final boolean i() {
        return this.f84336j;
    }

    public final boolean j() {
        return this.f84335i;
    }

    public final boolean k() {
        return this.f84337k;
    }

    public String toString() {
        return "CatalogStockEntity(code=" + this.f84328a + ", name=" + this.f84329b + ", iconUrl=" + this.f84330c + ", price=" + this.d + ", change=" + this.f84331e + ", value=" + this.f84332f + ", volume=" + this.f84333g + ", frequency=" + this.f84334h + ", isShowNotation=" + this.f84335i + ", isShowCorporateAction=" + this.f84336j + ", isShowUma=" + this.f84337k + ")";
    }
}
