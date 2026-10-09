package com.stockbit.usecase.cryptodetail.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f157080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157081b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157082c;
    public final String d;

    public e(d r2, String r3, String r4, String r5) {
        p.l(r2, "finItem");
        this.f157080a = r2;
        this.f157081b = r3;
        this.f157082c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f157081b;
    }

    public final d b() {
        return this.f157080a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f157082c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f157080a, r52.f157080a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157081b, r52.f157081b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157082c, r52.f157082c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = this.f157080a.hashCode() * 31;
        String r1 = this.f157081b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f157082c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CryptoProfileEntity(finItem=" + this.f157080a + ", description=" + this.f157081b + ", websiteUrl=" + this.f157082c + ", riskDisclosureUrl=" + this.d + ")";
    }
}
