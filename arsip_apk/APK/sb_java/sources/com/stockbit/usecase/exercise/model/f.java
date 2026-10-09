package com.stockbit.usecase.exercise.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f157630a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157631b;

    /* renamed from: c, reason: collision with root package name */
    public final int f157632c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f157633e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f157634f;

    /* renamed from: g, reason: collision with root package name */
    public final String f157635g;

    /* renamed from: h, reason: collision with root package name */
    public final String f157636h;

    /* renamed from: i, reason: collision with root package name */
    public final String f157637i;

    /* renamed from: j, reason: collision with root package name */
    public final String f157638j;

    /* renamed from: k, reason: collision with root package name */
    public final String f157639k;

    public f(String r2, String r3, int r4, double r5, String r7, BigDecimal r8, String r9, String r10, String r11, String r12, String r13) {
        p.l(r2, "exerciseType");
        p.l(r3, "symbol");
        p.l(r7, "lot");
        p.l(r8, "lotDecimal");
        p.l(r9, FirebaseAnalytics.Param.PRICE);
        p.l(r10, "amountCreditLimit");
        p.l(r11, "uiRef");
        this.f157630a = r2;
        this.f157631b = r3;
        this.f157632c = r4;
        this.d = r5;
        this.f157633e = r7;
        this.f157634f = r8;
        this.f157635g = r9;
        this.f157636h = r10;
        this.f157637i = r11;
        this.f157638j = r12;
        this.f157639k = r13;
    }

    public final String a() {
        return this.f157636h;
    }

    public final String b() {
        return this.f157630a;
    }

    public final String c() {
        return this.f157633e;
    }

    public final BigDecimal d() {
        return this.f157634f;
    }

    public final String e() {
        return this.f157635g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (p.g(this.f157630a, r82.f157630a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157631b, r82.f157631b) == true) goto L15;
        return false;
    L15:
        if (this.f157632c == r82.f157632c) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f157633e, r82.f157633e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157634f, r82.f157634f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f157635g, r82.f157635g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f157636h, r82.f157636h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f157637i, r82.f157637i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f157638j, r82.f157638j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f157639k, r82.f157639k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final int f() {
        return this.f157632c;
    }

    public final double g() {
        return this.d;
    }

    public final String h() {
        return this.f157631b;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((this.f157630a.hashCode() * 31) + this.f157631b.hashCode()) * 31) + Integer.hashCode(this.f157632c)) * 31) + Double.hashCode(this.d)) * 31) + this.f157633e.hashCode()) * 31) + this.f157634f.hashCode()) * 31) + this.f157635g.hashCode()) * 31) + this.f157636h.hashCode()) * 31) + this.f157637i.hashCode()) * 31;
        String r1 = this.f157638j;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f157639k;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.f157637i;
    }

    public String toString() {
        return "PreviewExerciseUiState(exerciseType=" + this.f157630a + ", symbol=" + this.f157631b + ", shareValue=" + this.f157632c + ", stockOnHand=" + this.d + ", lot=" + this.f157633e + ", lotDecimal=" + this.f157634f + ", price=" + this.f157635g + ", amountCreditLimit=" + this.f157636h + ", uiRef=" + this.f157637i + ", companyName=" + this.f157638j + ", companyLogoUrl=" + this.f157639k + ")";
    }
}
