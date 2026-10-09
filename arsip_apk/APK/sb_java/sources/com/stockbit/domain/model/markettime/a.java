package com.stockbit.domain.model.markettime;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84316a;

    /* renamed from: b, reason: collision with root package name */
    public final b f84317b;

    /* renamed from: c, reason: collision with root package name */
    public final b f84318c;

    public a(String r2, b r3, b r4) {
        p.l(r2, "datetime");
        p.l(r3, "fca");
        p.l(r4, "regular");
        this.f84316a = r2;
        this.f84317b = r3;
        this.f84318c = r4;
    }

    public final b a() {
        return this.f84317b;
    }

    public final b b() {
        return this.f84318c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84316a, r52.f84316a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84317b, r52.f84317b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84318c, r52.f84318c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84316a.hashCode() * 31) + this.f84317b.hashCode()) * 31) + this.f84318c.hashCode();
    }

    public String toString() {
        return "MarketTimeSessionEntity(datetime=" + this.f84316a + ", fca=" + this.f84317b + ", regular=" + this.f84318c + ")";
    }
}
