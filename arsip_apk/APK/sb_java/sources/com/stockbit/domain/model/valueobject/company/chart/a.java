package com.stockbit.domain.model.valueobject.company.chart;

import kotlin.jvm.internal.i;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f86759a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f86760b;

    public a(boolean r1, boolean r2) {
        this.f86759a = r1;
        this.f86760b = r2;
    }

    public final boolean a() {
        return this.f86760b;
    }

    public final boolean b() {
        return this.f86759a;
    }

    public final void c(boolean r1) {
        this.f86760b = r1;
    }

    public final void d(boolean r1) {
        this.f86759a = r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f86759a == r52.f86759a) goto L12;
        return false;
    L12:
        if (this.f86760b == r52.f86760b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f86759a) * 31) + Boolean.hashCode(this.f86760b);
    }

    public String toString() {
        return "ChartAnimationState(currentChangeChart=" + this.f86759a + ", alreadyInitializeLottie=" + this.f86760b + ')';
    }

    public /* synthetic */ a(boolean r2, boolean r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }
}
