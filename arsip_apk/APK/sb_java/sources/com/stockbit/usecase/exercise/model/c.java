package com.stockbit.usecase.exercise.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public double f157610a;

    /* renamed from: b, reason: collision with root package name */
    public String f157611b;

    /* renamed from: c, reason: collision with root package name */
    public final double f157612c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f157613e;

    /* renamed from: f, reason: collision with root package name */
    public final double f157614f;

    /* renamed from: g, reason: collision with root package name */
    public final String f157615g;

    /* renamed from: h, reason: collision with root package name */
    public String f157616h;

    /* renamed from: i, reason: collision with root package name */
    public final double f157617i;

    /* renamed from: j, reason: collision with root package name */
    public final String f157618j;

    /* renamed from: k, reason: collision with root package name */
    public final double f157619k;

    /* renamed from: l, reason: collision with root package name */
    public final String f157620l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f157621m;

    /* renamed from: n, reason: collision with root package name */
    public final com.stockbit.usecase.companyprice.model.b f157622n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f157623o;

    public c(double r6, String r8, double r9, double r11, String r13, double r14, String r16, String r17, double r18, String r20, double r21, String r23, boolean r24, com.stockbit.usecase.companyprice.model.b r25, boolean r26) {
        p.l(r8, "priceText");
        p.l(r13, "cashOnHandText");
        p.l(r16, "exercisedAmountText");
        p.l(r17, "uirefValue");
        p.l(r20, "availableShareText");
        p.l(r23, "exercisePriceText");
        this.f157610a = r6;
        this.f157611b = r8;
        this.f157612c = r9;
        this.d = r11;
        this.f157613e = r13;
        this.f157614f = r14;
        this.f157615g = r16;
        this.f157616h = r17;
        this.f157617i = r18;
        this.f157618j = r20;
        this.f157619k = r21;
        this.f157620l = r23;
        this.f157621m = r24;
        this.f157622n = r25;
        this.f157623o = r26;
    }

    public static /* synthetic */ c b(c r18, double r19, String r21, double r22, double r24, String r26, double r27, String r29, String r30, double r31, String r33, double r34, String r36, boolean r37, com.stockbit.usecase.companyprice.model.b r38, boolean r39, int r40, Object r41) {
        if ((r40 & 1) == 0) goto L5;
        double r2 = r18.f157610a;
    L7:
        if ((r40 & 2) == 0) goto L9;
        String r4 = r18.f157611b;
    L11:
        if ((r40 & 4) == 0) goto L13;
        double r5 = r18.f157612c;
    L15:
        if ((r40 & 8) == 0) goto L17;
        double r7 = r18.d;
    L19:
        if ((r40 & 16) == 0) goto L21;
        String r9 = r18.f157613e;
    L23:
        if ((r40 & 32) == 0) goto L25;
        double r10 = r18.f157614f;
    L27:
        if ((r40 & 64) == 0) goto L29;
        String r12 = r18.f157615g;
    L31:
        if ((r40 & 128) == 0) goto L33;
        String r13 = r18.f157616h;
    L35:
        if ((r40 & 256) == 0) goto L37;
        double r14 = r18.f157617i;
    L38:
        double r16 = r2;
        if ((r40 & 512) == 0) goto L41;
        String r23 = r18.f157618j;
    L42:
        String r192 = r23;
        if ((r40 & 1024) == 0) goto L45;
        double r25 = r18.f157619k;
    L46:
        double r20 = r25;
        if ((r40 & 2048) == 0) goto L49;
        String r28 = r18.f157620l;
    L51:
        if ((r40 & 4096) == 0) goto L53;
        boolean r3 = r18.f157621m;
    L54:
        String r222 = r28;
        if ((r40 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        com.stockbit.usecase.companyprice.model.b r210 = r18.f157622n;
    L59:
        if ((r40 & 16384) == 0) goto L62;
        boolean r402 = r18.f157623o;
    L64:
        return r18.a(r16, r4, r5, r7, r9, r10, r12, r13, r14, r192, r20, r222, r3, r210, r402);
    L62:
        r402 = r39;
        goto L64
    L57:
        r210 = r38;
        goto L59
    L53:
        r3 = r37;
        goto L54
    L49:
        r28 = r36;
        goto L51
    L45:
        r25 = r34;
        goto L46
    L41:
        r23 = r33;
        goto L42
    L37:
        r14 = r31;
        goto L38
    L33:
        r13 = r30;
        goto L35
    L29:
        r12 = r29;
        goto L31
    L25:
        r10 = r27;
        goto L27
    L21:
        r9 = r26;
        goto L23
    L17:
        r7 = r24;
        goto L19
    L13:
        r5 = r22;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    public final c a(double r24, String r26, double r27, double r29, String r31, double r32, String r34, String r35, double r36, String r38, double r39, String r41, boolean r42, com.stockbit.usecase.companyprice.model.b r43, boolean r44) {
        p.l(r26, "priceText");
        p.l(r31, "cashOnHandText");
        p.l(r34, "exercisedAmountText");
        p.l(r35, "uirefValue");
        p.l(r38, "availableShareText");
        p.l(r41, "exercisePriceText");
        return new c(r24, r26, r27, r29, r31, r32, r34, r35, r36, r38, r39, r41, r42, r43, r44);
    }

    public final double c() {
        return this.f157617i;
    }

    public final String d() {
        return this.f157618j;
    }

    public final double e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (Double.compare(this.f157610a, r82.f157610a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f157611b, r82.f157611b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f157612c, r82.f157612c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f157613e, r82.f157613e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f157614f, r82.f157614f) == 0) goto L27;
        return false;
    L27:
        if (p.g(this.f157615g, r82.f157615g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f157616h, r82.f157616h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f157617i, r82.f157617i) == 0) goto L36;
        return false;
    L36:
        if (p.g(this.f157618j, r82.f157618j) == true) goto L39;
        return false;
    L39:
        if (Double.compare(this.f157619k, r82.f157619k) == 0) goto L42;
        return false;
    L42:
        if (p.g(this.f157620l, r82.f157620l) == true) goto L45;
        return false;
    L45:
        if (this.f157621m == r82.f157621m) goto L48;
        return false;
    L48:
        if (p.g(this.f157622n, r82.f157622n) == true) goto L51;
        return false;
    L51:
        if (this.f157623o == r82.f157623o) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.f157613e;
    }

    public final com.stockbit.usecase.companyprice.model.b g() {
        return this.f157622n;
    }

    public final double h() {
        return this.f157619k;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((((((((((Double.hashCode(this.f157610a) * 31) + this.f157611b.hashCode()) * 31) + Double.hashCode(this.f157612c)) * 31) + Double.hashCode(this.d)) * 31) + this.f157613e.hashCode()) * 31) + Double.hashCode(this.f157614f)) * 31) + this.f157615g.hashCode()) * 31) + this.f157616h.hashCode()) * 31) + Double.hashCode(this.f157617i)) * 31) + this.f157618j.hashCode()) * 31) + Double.hashCode(this.f157619k)) * 31) + this.f157620l.hashCode()) * 31) + Boolean.hashCode(this.f157621m)) * 31;
        com.stockbit.usecase.companyprice.model.b r1 = this.f157622n;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.f157623o);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String i() {
        return this.f157620l;
    }

    public final double j() {
        return this.f157614f;
    }

    public final String k() {
        return this.f157615g;
    }

    public final double l() {
        return this.f157612c;
    }

    public final double m() {
        return this.f157610a;
    }

    public final String n() {
        return this.f157611b;
    }

    public final boolean o() {
        return this.f157623o;
    }

    public final boolean p() {
        return this.f157621m;
    }

    public String toString() {
        return "ExerciseDetailUiState(price=" + this.f157610a + ", priceText=" + this.f157611b + ", maxPrice=" + this.f157612c + ", cashOnHand=" + this.d + ", cashOnHandText=" + this.f157613e + ", exercisedAmount=" + this.f157614f + ", exercisedAmountText=" + this.f157615g + ", uirefValue=" + this.f157616h + ", availableShare=" + this.f157617i + ", availableShareText=" + this.f157618j + ", exercisePrice=" + this.f157619k + ", exercisePriceText=" + this.f157620l + ", isExerciseEnable=" + this.f157621m + ", companyDetail=" + this.f157622n + ", isAmountOverBalanceVisible=" + this.f157623o + ")";
    }

    public /* synthetic */ c(double r20, String r22, double r23, double r25, String r27, double r28, String r30, String r31, double r32, String r34, double r35, String r37, boolean r38, com.stockbit.usecase.companyprice.model.b r39, boolean r40, int r41, i r42) {
        if ((r41 & 1) == 0) goto L5;
        double r4 = 0.0d;
    L6:
        String r6 = "0";
        if ((r41 & 2) == 0) goto L9;
        String r1 = "0";
    L11:
        if ((r41 & 4) == 0) goto L13;
        double r7 = 0.0d;
    L15:
        if ((r41 & 8) == 0) goto L17;
        double r9 = 0.0d;
    L19:
        if ((r41 & 16) == 0) goto L21;
        String r11 = "0";
    L23:
        if ((r41 & 32) == 0) goto L25;
        double r12 = 0.0d;
    L27:
        if ((r41 & 64) == 0) goto L29;
        String r14 = "0";
    L31:
        if ((r41 & 128) == 0) goto L33;
        String r15 = "";
    L35:
        if ((r41 & 256) == 0) goto L37;
        double r2 = 0.0d;
    L38:
        String r202 = r1;
        if ((r41 & 512) == 0) goto L41;
        String r13 = "0";
    L42:
        String r21 = r13;
        if ((r41 & 1024) == 0) goto L45;
        double r16 = 0.0d;
    L47:
        if ((r41 & 2048) != 0) goto L51;
        r6 = r37;
    L51:
        if ((r41 & 4096) == 0) goto L53;
        boolean r17 = false;
    L54:
        boolean r222 = r17;
        if ((r41 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        com.stockbit.usecase.companyprice.model.b r18 = null;
    L59:
        if ((r41 & 16384) == 0) goto L62;
        boolean r412 = false;
    L63:
        this(r4, r202, r7, r9, r11, r12, r14, r15, r2, r21, r16, r6, r222, r18, r412);
        return;
    L62:
        r412 = r40;
        goto L63
    L57:
        r18 = r39;
        goto L59
    L53:
        r17 = r38;
        goto L54
    L45:
        r16 = r35;
        goto L47
    L41:
        r13 = r34;
        goto L42
    L37:
        r2 = r32;
        goto L38
    L33:
        r15 = r31;
        goto L35
    L29:
        r14 = r30;
        goto L31
    L25:
        r12 = r28;
        goto L27
    L21:
        r11 = r27;
        goto L23
    L17:
        r9 = r25;
        goto L19
    L13:
        r7 = r23;
        goto L15
    L9:
        r1 = r22;
        goto L11
    L5:
        r4 = r20;
        goto L6
    }
}
