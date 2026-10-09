package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f80901a;

    /* renamed from: b, reason: collision with root package name */
    public final m f80902b;

    public k(String r2, m r3) {
        kotlin.jvm.internal.p.l(r2, "closePrice");
        kotlin.jvm.internal.p.l(r3, "returnSummary");
        this.f80901a = r2;
        this.f80902b = r3;
    }

    public final String a() {
        return this.f80901a;
    }

    public final m b() {
        return this.f80902b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f80901a, r52.f80901a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80902b, r52.f80902b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80901a.hashCode() * 31) + this.f80902b.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyPriceActivityEntity(closePrice=" + this.f80901a + ", returnSummary=" + this.f80902b + ")";
    }
}
