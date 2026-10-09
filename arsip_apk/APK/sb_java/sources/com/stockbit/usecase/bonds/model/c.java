package com.stockbit.usecase.bonds.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f154527a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154528b;

    /* renamed from: c, reason: collision with root package name */
    public final float f154529c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f154530e;

    /* renamed from: f, reason: collision with root package name */
    public final float f154531f;

    public c(String r2, String r3, float r4, float r5, float r6, float r7) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, "formatedDate");
        this.f154527a = r2;
        this.f154528b = r3;
        this.f154529c = r4;
        this.d = r5;
        this.f154530e = r6;
        this.f154531f = r7;
    }

    public final float a() {
        return this.d;
    }

    public final String b() {
        return this.f154528b;
    }

    public final float c() {
        return this.f154530e;
    }

    public final float d() {
        return this.f154529c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f154527a, r52.f154527a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154528b, r52.f154528b) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.f154529c, r52.f154529c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.f154530e, r52.f154530e) == 0) goto L24;
        return false;
    L24:
        if (Float.compare(this.f154531f, r52.f154531f) == 0) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f154527a.hashCode() * 31) + this.f154528b.hashCode()) * 31) + Float.hashCode(this.f154529c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f154530e)) * 31) + Float.hashCode(this.f154531f);
    }

    public String toString() {
        return "BondChartPointUIState(date=" + this.f154527a + ", formatedDate=" + this.f154528b + ", yield=" + this.f154529c + ", buyPriceRate=" + this.d + ", sellpriceRate=" + this.f154530e + ", performanceRate=" + this.f154531f + ")";
    }
}
