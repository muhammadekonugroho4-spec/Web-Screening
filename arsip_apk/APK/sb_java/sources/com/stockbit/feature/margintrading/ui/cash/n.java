package com.stockbit.feature.margintrading.ui.cash;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.math.BigDecimal;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f99679a;

    /* renamed from: b, reason: collision with root package name */
    public final String f99680b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f99681c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f99682e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f99683f;

    /* renamed from: g, reason: collision with root package name */
    public final BigDecimal f99684g;

    /* renamed from: h, reason: collision with root package name */
    public final BigDecimal f99685h;

    /* renamed from: i, reason: collision with root package name */
    public final BigDecimal f99686i;

    static {
    }

    public n(String r2, String r3, BigDecimal r4, BigDecimal r5, BigDecimal r6, boolean r7) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "input");
        kotlin.jvm.internal.p.l(r5, "cashOnHandBalance");
        this.f99679a = r2;
        this.f99680b = r3;
        this.f99681c = r4;
        this.d = r5;
        this.f99682e = r6;
        this.f99683f = r7;
        if (r6 == null) goto L5;
        BigDecimal r22 = r5.add(r6);
        kotlin.jvm.internal.p.k(r22, "add(...)");
    L6:
        this.f99684g = r22;
        if (r4.compareTo(r5) < 0) goto L9;
        BigDecimal r23 = r5;
    L10:
        this.f99685h = r23;
        if (r4.compareTo(r5) > 0) goto L14;
        BigDecimal r24 = BigDecimal.ZERO;
        String r32 = "ZERO";
    L13:
        kotlin.jvm.internal.p.k(r24, r32);
        this.f99686i = r24;
        return;
    L14:
        r24 = r4.subtract(r5);
        r32 = "subtract(...)";
        goto L13
    L9:
        r23 = r4;
        goto L10
    L5:
        r22 = r5;
        goto L6
    }

    public static /* synthetic */ n b(n r02, String r1, String r2, BigDecimal r3, BigDecimal r4, BigDecimal r5, boolean r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.f99679a;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.f99680b;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r02.f99681c;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r02.f99682e;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r02.f99683f;
    L20:
        BigDecimal r72 = r5;
        boolean r82 = r6;
        BigDecimal r52 = r3;
        BigDecimal r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82);
    }

    public final n a(String r9, String r10, BigDecimal r11, BigDecimal r12, BigDecimal r13, boolean r14) {
        kotlin.jvm.internal.p.l(r9, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r10, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r11, "input");
        kotlin.jvm.internal.p.l(r12, "cashOnHandBalance");
        return new n(r9, r10, r11, r12, r13, r14);
    }

    public final BigDecimal c() {
        return this.d;
    }

    public final BigDecimal d() {
        return this.f99682e;
    }

    public final String e() {
        return this.f99679a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f99679a, r52.f99679a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f99680b, r52.f99680b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f99681c, r52.f99681c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f99682e, r52.f99682e) == true) goto L24;
        return false;
    L24:
        if (this.f99683f == r52.f99683f) goto L26;
        return false;
    L26:
        return true;
    }

    public final BigDecimal f() {
        return this.f99681c;
    }

    public final BigDecimal g() {
        return this.f99685h;
    }

    public final BigDecimal h() {
        return this.f99686i;
    }

    public int hashCode() {
        int r02 = ((((((this.f99679a.hashCode() * 31) + this.f99680b.hashCode()) * 31) + this.f99681c.hashCode()) * 31) + this.d.hashCode()) * 31;
        BigDecimal r1 = this.f99682e;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.f99683f);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String i() {
        return this.f99680b;
    }

    public final BigDecimal j() {
        return this.f99684g;
    }

    public final boolean k() {
        return this.f99683f;
    }

    public String toString() {
        return "AddCashCollateralPortfolioState(id=" + this.f99679a + ", name=" + this.f99680b + ", input=" + this.f99681c + ", cashOnHandBalance=" + this.d + ", cashSweepBalance=" + this.f99682e + ", isErrorMinBalance=" + this.f99683f + ')';
    }

    public /* synthetic */ n(String r8, String r9, BigDecimal r10, BigDecimal r11, BigDecimal r12, boolean r13, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 16) == 0) goto L5;
        r12 = null;
    L5:
        BigDecimal r5 = r12;
        if ((r14 & 32) == 0) goto L8;
        r13 = false;
    L8:
        this(r8, r9, r10, r11, r5, r13);
    }
}
