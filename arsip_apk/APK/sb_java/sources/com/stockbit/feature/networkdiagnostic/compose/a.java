package com.stockbit.feature.networkdiagnostic.compose;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f100359a;

    /* renamed from: b, reason: collision with root package name */
    public final String f100360b;

    /* renamed from: c, reason: collision with root package name */
    public final double f100361c;
    public final String d;

    static {
    }

    public a(String r2, String r3, double r4, String r6) {
        p.l(r2, "networkType");
        p.l(r6, "rawResult");
        this.f100359a = r2;
        this.f100360b = r3;
        this.f100361c = r4;
        this.d = r6;
    }

    public final String a() {
        return this.f100360b;
    }

    public final double b() {
        return this.f100361c;
    }

    public final String c() {
        return this.f100359a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f100359a, r82.f100359a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f100360b, r82.f100360b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f100361c, r82.f100361c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = this.f100359a.hashCode() * 31;
        String r1 = this.f100360b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((r02 + r12) * 31) + Double.hashCode(this.f100361c)) * 31) + this.d.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "DiagnosticResultState(networkType=" + this.f100359a + ", ipLocation=" + this.f100360b + ", networkDelay=" + this.f100361c + ", rawResult=" + this.d + ')';
    }

    public /* synthetic */ a(String r2, String r3, double r4, String r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0.0d;
    L12:
        if ((r7 & 8) == 0) goto L15;
        String r72 = "";
    L14:
        double r5 = r4;
        String r42 = r3;
        this(r2, r42, r5, r72);
        return;
    L15:
        r72 = r6;
        goto L14
    }
}
