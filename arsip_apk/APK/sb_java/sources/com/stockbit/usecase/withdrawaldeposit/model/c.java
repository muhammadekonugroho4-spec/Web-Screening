package com.stockbit.usecase.withdrawaldeposit.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f164771a;

    /* renamed from: b, reason: collision with root package name */
    public final double f164772b;

    /* renamed from: c, reason: collision with root package name */
    public final double f164773c;
    public final d d;

    public c(List r2, double r3, double r5, d r7) {
        p.l(r2, "options");
        p.l(r7, "withdrawalGuide");
        this.f164771a = r2;
        this.f164772b = r3;
        this.f164773c = r5;
        this.d = r7;
    }

    public final double a() {
        return this.f164773c;
    }

    public final double b() {
        return this.f164772b;
    }

    public final List c() {
        return this.f164771a;
    }

    public final d d() {
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
        if (p.g(this.f164771a, r82.f164771a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f164772b, r82.f164772b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f164773c, r82.f164773c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f164771a.hashCode() * 31) + Double.hashCode(this.f164772b)) * 31) + Double.hashCode(this.f164773c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TransferMethodUIData(options=" + this.f164771a + ", minLimitTransfer=" + this.f164772b + ", maxLimitTransfer=" + this.f164773c + ", withdrawalGuide=" + this.d + ")";
    }
}
