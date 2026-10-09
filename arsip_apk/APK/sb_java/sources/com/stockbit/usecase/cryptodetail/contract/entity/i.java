package com.stockbit.usecase.cryptodetail.contract.entity;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f157092a;

    /* renamed from: b, reason: collision with root package name */
    public final List f157093b;

    public i(int r2, List r3) {
        p.l(r3, "cells");
        this.f157092a = r2;
        this.f157093b = r3;
    }

    public final List a() {
        return this.f157093b;
    }

    public final int b() {
        return this.f157092a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f157092a == r52.f157092a) goto L12;
        return false;
    L12:
        if (p.g(this.f157093b, r52.f157093b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f157092a) * 31) + this.f157093b.hashCode();
    }

    public String toString() {
        return "CryptoSeasonalityRowEntity(year=" + this.f157092a + ", cells=" + this.f157093b + ")";
    }
}
