package com.stockbit.domain.model.company;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f81479a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81480b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81481c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final List f81482e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f81483f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81484g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f81485h;

    public e(List r2, int r3, int r4, String r5, List r6, boolean r7, int r8, boolean r9) {
        kotlin.jvm.internal.p.l(r2, "accounts");
        kotlin.jvm.internal.p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r6, "values");
        this.f81479a = r2;
        this.f81480b = r3;
        this.f81481c = r4;
        this.d = r5;
        this.f81482e = r6;
        this.f81483f = r7;
        this.f81484g = r8;
        this.f81485h = r9;
    }

    public final List a() {
        return this.f81479a;
    }

    public final int b() {
        return this.f81481c;
    }

    public final int c() {
        return this.f81484g;
    }

    public final String d() {
        return this.d;
    }

    public final List e() {
        return this.f81482e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f81479a, r52.f81479a) == true) goto L12;
        return false;
    L12:
        if (this.f81480b == r52.f81480b) goto L15;
        return false;
    L15:
        if (this.f81481c == r52.f81481c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f81482e, r52.f81482e) == true) goto L24;
        return false;
    L24:
        if (this.f81483f == r52.f81483f) goto L27;
        return false;
    L27:
        if (this.f81484g == r52.f81484g) goto L30;
        return false;
    L30:
        if (this.f81485h == r52.f81485h) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f81485h;
    }

    public final boolean g() {
        return this.f81483f;
    }

    public int hashCode() {
        return (((((((((((((this.f81479a.hashCode() * 31) + Integer.hashCode(this.f81480b)) * 31) + Integer.hashCode(this.f81481c)) * 31) + this.d.hashCode()) * 31) + this.f81482e.hashCode()) * 31) + Boolean.hashCode(this.f81483f)) * 31) + Integer.hashCode(this.f81484g)) * 31) + Boolean.hashCode(this.f81485h);
    }

    public String toString() {
        return "CompanyFinancialAccountEntity(accounts=" + this.f81479a + ", id=" + this.f81480b + ", level=" + this.f81481c + ", name=" + this.d + ", values=" + this.f81482e + ", isTotalExist=" + this.f81483f + ", maxShowLevel=" + this.f81484g + ", isDefaultExpanded=" + this.f81485h + ")";
    }
}
