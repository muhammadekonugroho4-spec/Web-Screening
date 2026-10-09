package com.stockbit.usecase.exercise.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f157624a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f157625b;

    /* renamed from: c, reason: collision with root package name */
    public final c f157626c;

    public d(String r2, Double r3, c r4) {
        p.l(r2, "numberPriceResultText");
        this.f157624a = r2;
        this.f157625b = r3;
        this.f157626c = r4;
    }

    public final c a() {
        return this.f157626c;
    }

    public final Double b() {
        return this.f157625b;
    }

    public final String c() {
        return this.f157624a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f157624a, r52.f157624a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157625b, r52.f157625b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157626c, r52.f157626c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f157624a.hashCode() * 31;
        Double r1 = this.f157625b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        c r13 = this.f157626c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ExerciseManipulatedLotValue(numberPriceResultText=" + this.f157624a + ", numberPriceResult=" + this.f157625b + ", exerciseDetailUiState=" + this.f157626c + ")";
    }

    public /* synthetic */ d(String r2, Double r3, c r4, int r5, i r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = null;
    L8:
        this(r2, r3, r4);
    }
}
