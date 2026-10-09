package com.stockbit.domain.model.securities.history.detail;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final double f85319a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85320b;

    /* renamed from: c, reason: collision with root package name */
    public final i f85321c;

    public h(double r2, double r4, i r6) {
        p.l(r6, "colorCode");
        this.f85319a = r2;
        this.f85320b = r4;
        this.f85321c = r6;
    }

    public final double a() {
        return this.f85319a;
    }

    public final double b() {
        return this.f85320b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (Double.compare(this.f85319a, r82.f85319a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85320b, r82.f85320b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f85321c, r82.f85321c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f85319a) * 31) + Double.hashCode(this.f85320b)) * 31) + this.f85321c.hashCode();
    }

    public String toString() {
        return "HistoryDetailRealizedEntity(amount=" + this.f85319a + ", percentage=" + this.f85320b + ", colorCode=" + this.f85321c + ")";
    }

    public /* synthetic */ h(double r3, double r5, i r7, int r8, kotlin.jvm.internal.i r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r5 = 0.0d;
    L9:
        if ((r8 & 4) == 0) goto L11;
        r7 = new i(null, null, 3, null);
    L11:
        double r4 = r3;
        this(r4, r5, r7);
    }
}
