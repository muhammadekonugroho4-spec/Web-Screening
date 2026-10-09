package com.stockbit.domain.model.entity.virtual;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f83846a;

    /* renamed from: b, reason: collision with root package name */
    public final d f83847b;

    public c(String r1, d r2) {
        this.f83846a = r1;
        this.f83847b = r2;
    }

    public final d a() {
        return this.f83847b;
    }

    public final String b() {
        return this.f83846a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f83846a, r52.f83846a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83847b, r52.f83847b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f83846a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        d r2 = this.f83847b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TradingFormula(version=" + this.f83846a + ", formula=" + this.f83847b + ')';
    }
}
