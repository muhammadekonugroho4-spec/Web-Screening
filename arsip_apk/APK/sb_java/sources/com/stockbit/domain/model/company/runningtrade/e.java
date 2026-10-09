package com.stockbit.domain.model.company.runningtrade;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81880a;

    /* renamed from: b, reason: collision with root package name */
    public final g f81881b;

    /* renamed from: c, reason: collision with root package name */
    public final List f81882c;

    public e(boolean r2, g r3, List r4) {
        p.l(r3, "total");
        p.l(r4, "runningTradeGroup");
        this.f81880a = r2;
        this.f81881b = r3;
        this.f81882c = r4;
    }

    public final List a() {
        return this.f81882c;
    }

    public final boolean b() {
        return this.f81880a;
    }

    public final g c() {
        return this.f81881b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f81880a == r52.f81880a) goto L12;
        return false;
    L12:
        if (p.g(this.f81881b, r52.f81881b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81882c, r52.f81882c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f81880a) * 31) + this.f81881b.hashCode()) * 31) + this.f81882c.hashCode();
    }

    public String toString() {
        return "RunningTradeGroupedEntity(singleOrder=" + this.f81880a + ", total=" + this.f81881b + ", runningTradeGroup=" + this.f81882c + ")";
    }
}
