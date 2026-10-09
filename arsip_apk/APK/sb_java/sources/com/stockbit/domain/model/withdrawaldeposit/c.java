package com.stockbit.domain.model.withdrawaldeposit;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f87374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87375b;

    /* renamed from: c, reason: collision with root package name */
    public final double f87376c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87377e;

    /* renamed from: f, reason: collision with root package name */
    public final double f87378f;

    /* renamed from: g, reason: collision with root package name */
    public final double f87379g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f87380h;

    /* renamed from: i, reason: collision with root package name */
    public final String f87381i;

    /* renamed from: j, reason: collision with root package name */
    public final String f87382j;

    /* renamed from: k, reason: collision with root package name */
    public final a f87383k;

    public c(String r2, String r3, double r4, String r6, String r7, double r8, double r10, boolean r12, String r13, String r14, a r15) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "code");
        p.l(r6, "duration");
        p.l(r7, "description");
        p.l(r13, "operationalStart");
        p.l(r14, "operationalEnd");
        this.f87374a = r2;
        this.f87375b = r3;
        this.f87376c = r4;
        this.d = r6;
        this.f87377e = r7;
        this.f87378f = r8;
        this.f87379g = r10;
        this.f87380h = r12;
        this.f87381i = r13;
        this.f87382j = r14;
        this.f87383k = r15;
    }

    public final double a() {
        return this.f87378f;
    }

    public final double b() {
        return this.f87379g;
    }

    public final String c() {
        return this.f87375b;
    }

    public final a d() {
        return this.f87383k;
    }

    public final String e() {
        return this.f87377e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f87374a, r82.f87374a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87375b, r82.f87375b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f87376c, r82.f87376c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87377e, r82.f87377e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f87378f, r82.f87378f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f87379g, r82.f87379g) == 0) goto L30;
        return false;
    L30:
        if (this.f87380h == r82.f87380h) goto L33;
        return false;
    L33:
        if (p.g(this.f87381i, r82.f87381i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f87382j, r82.f87382j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f87383k, r82.f87383k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final double g() {
        return this.f87376c;
    }

    public final String h() {
        return this.f87374a;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((((this.f87374a.hashCode() * 31) + this.f87375b.hashCode()) * 31) + Double.hashCode(this.f87376c)) * 31) + this.d.hashCode()) * 31) + this.f87377e.hashCode()) * 31) + Double.hashCode(this.f87378f)) * 31) + Double.hashCode(this.f87379g)) * 31) + Boolean.hashCode(this.f87380h)) * 31) + this.f87381i.hashCode()) * 31) + this.f87382j.hashCode()) * 31;
        a r1 = this.f87383k;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String i() {
        return this.f87382j;
    }

    public final String j() {
        return this.f87381i;
    }

    public final boolean k() {
        return this.f87380h;
    }

    public String toString() {
        return "TransferMethodOptionEntity(name=" + this.f87374a + ", code=" + this.f87375b + ", fee=" + this.f87376c + ", duration=" + this.d + ", description=" + this.f87377e + ", amountMax=" + this.f87378f + ", amountMin=" + this.f87379g + ", isRealTime=" + this.f87380h + ", operationalStart=" + this.f87381i + ", operationalEnd=" + this.f87382j + ", dailyLimit=" + this.f87383k + ")";
    }
}
