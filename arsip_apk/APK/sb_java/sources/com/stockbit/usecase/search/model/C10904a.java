package com.stockbit.usecase.search.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* renamed from: com.stockbit.usecase.search.model.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10904a {

    /* renamed from: l, reason: collision with root package name */
    public static final C1603a f159971l = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f159972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159973b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159974c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159975e;

    /* renamed from: f, reason: collision with root package name */
    public final double f159976f;

    /* renamed from: g, reason: collision with root package name */
    public final String f159977g;

    /* renamed from: h, reason: collision with root package name */
    public final double f159978h;

    /* renamed from: i, reason: collision with root package name */
    public final double f159979i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f159980j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f159981k;

    /* renamed from: com.stockbit.usecase.search.model.a$a, reason: collision with other inner class name */
    public static final class C1603a {
        public /* synthetic */ C1603a(kotlin.jvm.internal.i r1) {
            this();
        }

        public C1603a() {
        }
    }

    static {
        f159971l = new C1603a(null);
    }

    public C10904a(String r2, String r3, String r4, List r5, String r6, double r7, String r9, double r10, double r12, boolean r14, boolean r15) {
        kotlin.jvm.internal.p.l(r2, "iconUrl");
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "symbol");
        kotlin.jvm.internal.p.l(r5, "notations");
        kotlin.jvm.internal.p.l(r6, "priceFormatted");
        kotlin.jvm.internal.p.l(r9, "changeAndPercentageFormatted");
        this.f159972a = r2;
        this.f159973b = r3;
        this.f159974c = r4;
        this.d = r5;
        this.f159975e = r6;
        this.f159976f = r7;
        this.f159977g = r9;
        this.f159978h = r10;
        this.f159979i = r12;
        this.f159980j = r14;
        this.f159981k = r15;
    }

    public static /* synthetic */ C10904a b(C10904a r14, String r15, String r16, String r17, List r18, String r19, double r20, String r22, double r23, double r25, boolean r27, boolean r28, int r29, Object r30) {
        if ((r29 & 1) == 0) goto L5;
        String r1 = r14.f159972a;
    L7:
        if ((r29 & 2) == 0) goto L9;
        String r2 = r14.f159973b;
    L11:
        if ((r29 & 4) == 0) goto L13;
        String r3 = r14.f159974c;
    L15:
        if ((r29 & 8) == 0) goto L17;
        List r4 = r14.d;
    L19:
        if ((r29 & 16) == 0) goto L21;
        String r5 = r14.f159975e;
    L23:
        if ((r29 & 32) == 0) goto L25;
        double r6 = r14.f159976f;
    L27:
        if ((r29 & 64) == 0) goto L29;
        String r8 = r14.f159977g;
    L31:
        if ((r29 & 128) == 0) goto L33;
        double r9 = r14.f159978h;
    L35:
        if ((r29 & 256) == 0) goto L37;
        double r11 = r14.f159979i;
    L39:
        if ((r29 & 512) == 0) goto L41;
        boolean r13 = r14.f159980j;
    L43:
        if ((r29 & 1024) == 0) goto L46;
        boolean r292 = r14.f159981k;
    L48:
        return r14.a(r1, r2, r3, r4, r5, r6, r8, r9, r11, r13, r292);
    L46:
        r292 = r28;
        goto L48
    L41:
        r13 = r27;
        goto L43
    L37:
        r11 = r25;
        goto L39
    L33:
        r9 = r23;
        goto L35
    L29:
        r8 = r22;
        goto L31
    L25:
        r6 = r20;
        goto L27
    L21:
        r5 = r19;
        goto L23
    L17:
        r4 = r18;
        goto L19
    L13:
        r3 = r17;
        goto L15
    L9:
        r2 = r16;
        goto L11
    L5:
        r1 = r15;
        goto L7
    }

    public final C10904a a(String r17, String r18, String r19, List r20, String r21, double r22, String r24, double r25, double r27, boolean r29, boolean r30) {
        kotlin.jvm.internal.p.l(r17, "iconUrl");
        kotlin.jvm.internal.p.l(r18, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r19, "symbol");
        kotlin.jvm.internal.p.l(r20, "notations");
        kotlin.jvm.internal.p.l(r21, "priceFormatted");
        kotlin.jvm.internal.p.l(r24, "changeAndPercentageFormatted");
        return new C10904a(r17, r18, r19, r20, r21, r22, r24, r25, r27, r29, r30);
    }

    public final String c() {
        return this.f159977g;
    }

    public final double d() {
        return this.f159978h;
    }

    public final String e() {
        return this.f159972a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C10904a) == true) goto L8;
        return false;
    L8:
        C10904a r82 = (C10904a) r8;
        if (kotlin.jvm.internal.p.g(this.f159972a, r82.f159972a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f159973b, r82.f159973b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f159974c, r82.f159974c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f159975e, r82.f159975e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f159976f, r82.f159976f) == 0) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f159977g, r82.f159977g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f159978h, r82.f159978h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f159979i, r82.f159979i) == 0) goto L36;
        return false;
    L36:
        if (this.f159980j == r82.f159980j) goto L39;
        return false;
    L39:
        if (this.f159981k == r82.f159981k) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f159973b;
    }

    public final List g() {
        return this.d;
    }

    public final double h() {
        return this.f159979i;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f159972a.hashCode() * 31) + this.f159973b.hashCode()) * 31) + this.f159974c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159975e.hashCode()) * 31) + Double.hashCode(this.f159976f)) * 31) + this.f159977g.hashCode()) * 31) + Double.hashCode(this.f159978h)) * 31) + Double.hashCode(this.f159979i)) * 31) + Boolean.hashCode(this.f159980j)) * 31) + Boolean.hashCode(this.f159981k);
    }

    public final String i() {
        return this.f159975e;
    }

    public final double j() {
        return this.f159976f;
    }

    public final String k() {
        return this.f159974c;
    }

    public final boolean l() {
        return this.f159981k;
    }

    public final boolean m() {
        return this.f159980j;
    }

    public String toString() {
        return "CompanyItemUIState(iconUrl=" + this.f159972a + ", name=" + this.f159973b + ", symbol=" + this.f159974c + ", notations=" + this.d + ", priceFormatted=" + this.f159975e + ", priceRaw=" + this.f159976f + ", changeAndPercentageFormatted=" + this.f159977g + ", changes=" + this.f159978h + ", percentage=" + this.f159979i + ", isUma=" + this.f159980j + ", isCorpActionActive=" + this.f159981k + ")";
    }
}
