package com.stockbit.usecase.foreignflow.contract.entity;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f157891a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157892b;

    public e(double r2, String r4) {
        p.l(r4, "formatted");
        this.f157891a = r2;
        this.f157892b = r4;
    }

    public final String a() {
        return this.f157892b;
    }

    public final double b() {
        return this.f157891a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f157891a, r82.f157891a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f157892b, r82.f157892b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f157891a) * 31) + this.f157892b.hashCode();
    }

    public String toString() {
        return "ForeignFlowMetricEntity(raw=" + this.f157891a + ", formatted=" + this.f157892b + ")";
    }

    public /* synthetic */ e(double r1, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0.0d;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r1, r3);
    }
}
