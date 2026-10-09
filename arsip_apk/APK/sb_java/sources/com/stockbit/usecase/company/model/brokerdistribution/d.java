package com.stockbit.usecase.company.model.brokerdistribution;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f156190a;

    /* renamed from: b, reason: collision with root package name */
    public final b f156191b;

    /* renamed from: c, reason: collision with root package name */
    public final float f156192c;

    public d(b r2, b r3, float r4) {
        p.l(r2, "buyer");
        p.l(r3, "seller");
        this.f156190a = r2;
        this.f156191b = r3;
        this.f156192c = r4;
    }

    public final b a() {
        return this.f156190a;
    }

    public final String b() {
        return this.f156190a.b();
    }

    public final b c() {
        return this.f156191b;
    }

    public final String d() {
        return this.f156191b.b();
    }

    public final float e() {
        return this.f156192c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f156190a, r52.f156190a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156191b, r52.f156191b) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.f156192c, r52.f156192c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156190a.hashCode() * 31) + this.f156191b.hashCode()) * 31) + Float.hashCode(this.f156192c);
    }

    public String toString() {
        return "SankeyFlowUIState(buyer=" + this.f156190a + ", seller=" + this.f156191b + ", value=" + this.f156192c + ")";
    }
}
