package com.stockbit.usecase.company.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f156253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f156254b;

    /* renamed from: c, reason: collision with root package name */
    public final float f156255c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final List f156256e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f156257f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f156258g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f156259h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f156260i;

    public i(List r2, int r3, float r4, String r5, List r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        kotlin.jvm.internal.p.l(r2, "accounts");
        kotlin.jvm.internal.p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r6, "values");
        this.f156253a = r2;
        this.f156254b = r3;
        this.f156255c = r4;
        this.d = r5;
        this.f156256e = r6;
        this.f156257f = r7;
        this.f156258g = r8;
        this.f156259h = r9;
        this.f156260i = r10;
    }

    public static /* synthetic */ i b(i r02, List r1, int r2, float r3, String r4, List r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r02.f156253a;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r02.f156254b;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r02.f156255c;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r02.f156256e;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r02.f156257f;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r02.f156258g;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r02.f156259h;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r02.f156260i;
    L29:
        boolean r102 = r8;
        boolean r112 = r9;
        boolean r82 = r6;
        boolean r92 = r7;
        String r62 = r4;
        List r72 = r5;
        float r52 = r3;
        List r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92, r102, r112);
    }

    public final i a(List r12, int r13, float r14, String r15, List r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        kotlin.jvm.internal.p.l(r12, "accounts");
        kotlin.jvm.internal.p.l(r15, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r16, "values");
        return new i(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public final List c() {
        return this.f156253a;
    }

    public final int d() {
        return this.f156254b;
    }

    public final float e() {
        return this.f156255c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f156253a, r52.f156253a) == true) goto L12;
        return false;
    L12:
        if (this.f156254b == r52.f156254b) goto L15;
        return false;
    L15:
        if (Float.compare(this.f156255c, r52.f156255c) == 0) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f156256e, r52.f156256e) == true) goto L24;
        return false;
    L24:
        if (this.f156257f == r52.f156257f) goto L27;
        return false;
    L27:
        if (this.f156258g == r52.f156258g) goto L30;
        return false;
    L30:
        if (this.f156259h == r52.f156259h) goto L33;
        return false;
    L33:
        if (this.f156260i == r52.f156260i) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final List g() {
        return this.f156256e;
    }

    public final boolean h() {
        return this.f156260i;
    }

    public int hashCode() {
        return (((((((((((((((this.f156253a.hashCode() * 31) + Integer.hashCode(this.f156254b)) * 31) + Float.hashCode(this.f156255c)) * 31) + this.d.hashCode()) * 31) + this.f156256e.hashCode()) * 31) + Boolean.hashCode(this.f156257f)) * 31) + Boolean.hashCode(this.f156258g)) * 31) + Boolean.hashCode(this.f156259h)) * 31) + Boolean.hashCode(this.f156260i);
    }

    public final boolean i() {
        return this.f156259h;
    }

    public final boolean j() {
        return this.f156257f;
    }

    public final boolean k() {
        return this.f156258g;
    }

    public final void l(boolean r1) {
        this.f156259h = r1;
    }

    public final void m(boolean r1) {
        this.f156257f = r1;
    }

    public String toString() {
        return "CompanyFinancialAccountUIState(accounts=" + this.f156253a + ", level=" + this.f156254b + ", levelMargin=" + this.f156255c + ", name=" + this.d + ", values=" + this.f156256e + ", isExpanding=" + this.f156257f + ", isTotalExist=" + this.f156258g + ", isDefaultExpanded=" + this.f156259h + ", isBoldText=" + this.f156260i + ")";
    }
}
