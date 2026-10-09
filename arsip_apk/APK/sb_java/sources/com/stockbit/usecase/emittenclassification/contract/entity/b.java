package com.stockbit.usecase.emittenclassification.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f157560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157561b;

    public b(boolean r2, String r3) {
        p.l(r3, "multiplier");
        this.f157560a = r2;
        this.f157561b = r3;
    }

    public final String a() {
        return this.f157561b;
    }

    public final boolean b() {
        return this.f157560a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f157560a == r52.f157560a) goto L12;
        return false;
    L12:
        if (p.g(this.f157561b, r52.f157561b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f157560a) * 31) + this.f157561b.hashCode();
    }

    public String toString() {
        return "EmittenClassificationDayTradeEntity(isShowMultiplier=" + this.f157560a + ", multiplier=" + this.f157561b + ")";
    }
}
