package com.stockbit.usecase.emittenclassification.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f157566a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157567b;

    public e(boolean r2, String r3) {
        p.l(r3, "percentage");
        this.f157566a = r2;
        this.f157567b = r3;
    }

    public final String a() {
        return this.f157567b;
    }

    public final boolean b() {
        return this.f157566a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f157566a == r52.f157566a) goto L12;
        return false;
    L12:
        if (p.g(this.f157567b, r52.f157567b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f157566a) * 31) + this.f157567b.hashCode();
    }

    public String toString() {
        return "EmittenClassificationMarginEntity(isMarginTrading=" + this.f157566a + ", percentage=" + this.f157567b + ")";
    }
}
