package com.stockbit.emittenclassification.ui.state;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f91365a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91366b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91367c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f91368e;

    /* renamed from: f, reason: collision with root package name */
    public final String f91369f;

    /* renamed from: g, reason: collision with root package name */
    public final PercentDirection f91370g;

    /* renamed from: h, reason: collision with root package name */
    public final Double f91371h;

    /* renamed from: i, reason: collision with root package name */
    public final Double f91372i;

    /* renamed from: j, reason: collision with root package name */
    public final Double f91373j;

    /* renamed from: k, reason: collision with root package name */
    public final Double f91374k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f91375l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f91376m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f91377n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f91378o;

    /* renamed from: p, reason: collision with root package name */
    public final List f91379p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f91380q;

    /* renamed from: r, reason: collision with root package name */
    public final String f91381r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f91382s;

    /* renamed from: t, reason: collision with root package name */
    public final String f91383t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f91384u;

    /* renamed from: v, reason: collision with root package name */
    public final String f91385v;

    static {
    }

    public a(String r6, String r7, String r8, String r9, String r10, String r11, PercentDirection r12, Double r13, Double r14, Double r15, Double r16, boolean r17, boolean r18, boolean r19, boolean r20, List r21, boolean r22, String r23, boolean r24, String r25, boolean r26, String r27) {
        p.l(r6, "symbol");
        p.l(r7, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r8, "iconUrl");
        p.l(r9, "formattedPrice");
        p.l(r10, "change");
        p.l(r11, "percent");
        p.l(r12, "percentDirection");
        p.l(r21, "notations");
        p.l(r23, "dayTradeMultiplier");
        p.l(r25, "tradingLimitText");
        p.l(r27, "marginText");
        this.f91365a = r6;
        this.f91366b = r7;
        this.f91367c = r8;
        this.d = r9;
        this.f91368e = r10;
        this.f91369f = r11;
        this.f91370g = r12;
        this.f91371h = r13;
        this.f91372i = r14;
        this.f91373j = r15;
        this.f91374k = r16;
        this.f91375l = r17;
        this.f91376m = r18;
        this.f91377n = r19;
        this.f91378o = r20;
        this.f91379p = r21;
        this.f91380q = r22;
        this.f91381r = r23;
        this.f91382s = r24;
        this.f91383t = r25;
        this.f91384u = r26;
        this.f91385v = r27;
    }

    public final String a() {
        return this.f91368e;
    }

    public final String b() {
        return this.f91381r;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f91367c;
    }

    public final Double e() {
        return this.f91374k;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f91365a, r52.f91365a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f91366b, r52.f91366b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f91367c, r52.f91367c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f91368e, r52.f91368e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f91369f, r52.f91369f) == true) goto L27;
        return false;
    L27:
        if (this.f91370g == r52.f91370g) goto L30;
        return false;
    L30:
        if (p.g(this.f91371h, r52.f91371h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f91372i, r52.f91372i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f91373j, r52.f91373j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f91374k, r52.f91374k) == true) goto L42;
        return false;
    L42:
        if (this.f91375l == r52.f91375l) goto L45;
        return false;
    L45:
        if (this.f91376m == r52.f91376m) goto L48;
        return false;
    L48:
        if (this.f91377n == r52.f91377n) goto L51;
        return false;
    L51:
        if (this.f91378o == r52.f91378o) goto L54;
        return false;
    L54:
        if (p.g(this.f91379p, r52.f91379p) == true) goto L57;
        return false;
    L57:
        if (this.f91380q == r52.f91380q) goto L60;
        return false;
    L60:
        if (p.g(this.f91381r, r52.f91381r) == true) goto L63;
        return false;
    L63:
        if (this.f91382s == r52.f91382s) goto L66;
        return false;
    L66:
        if (p.g(this.f91383t, r52.f91383t) == true) goto L69;
        return false;
    L69:
        if (this.f91384u == r52.f91384u) goto L72;
        return false;
    L72:
        if (p.g(this.f91385v, r52.f91385v) == true) goto L74;
        return false;
    L74:
        return true;
    }

    public final String f() {
        return this.f91385v;
    }

    public final Double g() {
        return this.f91373j;
    }

    public final String h() {
        return this.f91366b;
    }

    public int hashCode() {
        int r02 = ((((((((((((this.f91365a.hashCode() * 31) + this.f91366b.hashCode()) * 31) + this.f91367c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f91368e.hashCode()) * 31) + this.f91369f.hashCode()) * 31) + this.f91370g.hashCode()) * 31;
        Double r1 = this.f91371h;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        Double r13 = this.f91372i;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        Double r15 = this.f91373j;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        Double r17 = this.f91374k;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return ((((((((((((((((((((((r05 + r2) * 31) + Boolean.hashCode(this.f91375l)) * 31) + Boolean.hashCode(this.f91376m)) * 31) + Boolean.hashCode(this.f91377n)) * 31) + Boolean.hashCode(this.f91378o)) * 31) + this.f91379p.hashCode()) * 31) + Boolean.hashCode(this.f91380q)) * 31) + this.f91381r.hashCode()) * 31) + Boolean.hashCode(this.f91382s)) * 31) + this.f91383t.hashCode()) * 31) + Boolean.hashCode(this.f91384u)) * 31) + this.f91385v.hashCode();
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final List i() {
        return this.f91379p;
    }

    public final String j() {
        return this.f91369f;
    }

    public final PercentDirection k() {
        return this.f91370g;
    }

    public final Double l() {
        return this.f91371h;
    }

    public final Double m() {
        return this.f91372i;
    }

    public final boolean n() {
        return this.f91380q;
    }

    public final boolean o() {
        return this.f91384u;
    }

    public final boolean p() {
        return this.f91376m;
    }

    public final boolean q() {
        return this.f91378o;
    }

    public final boolean r() {
        return this.f91382s;
    }

    public final boolean s() {
        return this.f91377n;
    }

    public final String t() {
        return this.f91365a;
    }

    public String toString() {
        return "EmittenClassificationCompanyUiState(symbol=" + this.f91365a + ", name=" + this.f91366b + ", iconUrl=" + this.f91367c + ", formattedPrice=" + this.d + ", change=" + this.f91368e + ", percent=" + this.f91369f + ", percentDirection=" + this.f91370g + ", percentValue=" + this.f91371h + ", priceValue=" + this.f91372i + ", marketCapValue=" + this.f91373j + ", liquidityValue=" + this.f91374k + ", isNew=" + this.f91375l + ", showNotation=" + this.f91376m + ", showUma=" + this.f91377n + ", showSuspended=" + this.f91378o + ", notations=" + this.f91379p + ", showDayTradeMultiplier=" + this.f91380q + ", dayTradeMultiplier=" + this.f91381r + ", showTradingLimit=" + this.f91382s + ", tradingLimitText=" + this.f91383t + ", showMargin=" + this.f91384u + ", marginText=" + this.f91385v + ')';
    }

    public final String u() {
        return this.f91383t;
    }

    public final boolean v() {
        return this.f91375l;
    }
}
