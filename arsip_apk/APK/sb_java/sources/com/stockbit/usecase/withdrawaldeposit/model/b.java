package com.stockbit.usecase.withdrawaldeposit.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f164762a;

    /* renamed from: b, reason: collision with root package name */
    public final String f164763b;

    /* renamed from: c, reason: collision with root package name */
    public final double f164764c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f164765e;

    /* renamed from: f, reason: collision with root package name */
    public final String f164766f;

    /* renamed from: g, reason: collision with root package name */
    public final double f164767g;

    /* renamed from: h, reason: collision with root package name */
    public final double f164768h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f164769i;

    /* renamed from: j, reason: collision with root package name */
    public final a f164770j;

    public b(String r2, String r3, double r4, String r6, String r7, String r8, double r9, double r11, boolean r13, a r14) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "code");
        p.l(r6, "operation");
        p.l(r7, "duration");
        p.l(r8, "description");
        this.f164762a = r2;
        this.f164763b = r3;
        this.f164764c = r4;
        this.d = r6;
        this.f164765e = r7;
        this.f164766f = r8;
        this.f164767g = r9;
        this.f164768h = r11;
        this.f164769i = r13;
        this.f164770j = r14;
    }

    public final double a() {
        return this.f164767g;
    }

    public final double b() {
        return this.f164768h;
    }

    public final String c() {
        return this.f164763b;
    }

    public final a d() {
        return this.f164770j;
    }

    public final String e() {
        return this.f164766f;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f164762a, r82.f164762a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f164763b, r82.f164763b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f164764c, r82.f164764c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f164765e, r82.f164765e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f164766f, r82.f164766f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f164767g, r82.f164767g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f164768h, r82.f164768h) == 0) goto L33;
        return false;
    L33:
        if (this.f164769i == r82.f164769i) goto L36;
        return false;
    L36:
        if (p.g(this.f164770j, r82.f164770j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f164765e;
    }

    public final double g() {
        return this.f164764c;
    }

    public final String h() {
        return this.f164762a;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((this.f164762a.hashCode() * 31) + this.f164763b.hashCode()) * 31) + Double.hashCode(this.f164764c)) * 31) + this.d.hashCode()) * 31) + this.f164765e.hashCode()) * 31) + this.f164766f.hashCode()) * 31) + Double.hashCode(this.f164767g)) * 31) + Double.hashCode(this.f164768h)) * 31) + Boolean.hashCode(this.f164769i)) * 31;
        a r1 = this.f164770j;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.f164769i;
    }

    public String toString() {
        return "TransferMethodOptionUIData(name=" + this.f164762a + ", code=" + this.f164763b + ", fee=" + this.f164764c + ", operation=" + this.d + ", duration=" + this.f164765e + ", description=" + this.f164766f + ", amountMax=" + this.f164767g + ", amountMin=" + this.f164768h + ", isRealTime=" + this.f164769i + ", dailyLimit=" + this.f164770j + ")";
    }
}
