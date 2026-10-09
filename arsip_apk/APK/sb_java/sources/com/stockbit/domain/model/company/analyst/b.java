package com.stockbit.domain.model.company.analyst;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f81386a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81387b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81388c;

    public b(int r2, boolean r3, String r4) {
        p.l(r4, "value");
        this.f81386a = r2;
        this.f81387b = r3;
        this.f81388c = r4;
    }

    public final String a() {
        return this.f81388c;
    }

    public final int b() {
        return this.f81386a;
    }

    public final boolean c() {
        return this.f81387b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f81386a == r52.f81386a) goto L12;
        return false;
    L12:
        if (this.f81387b == r52.f81387b) goto L15;
        return false;
    L15:
        if (p.g(this.f81388c, r52.f81388c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f81386a) * 31) + Boolean.hashCode(this.f81387b)) * 31) + this.f81388c.hashCode();
    }

    public String toString() {
        return "AnalystConsensusItemEntity(year=" + this.f81386a + ", isEstimate=" + this.f81387b + ", value=" + this.f81388c + ")";
    }
}
