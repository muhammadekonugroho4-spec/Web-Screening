package com.stockbit.usecase.brokeractivity.model;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final p f154857a;

    /* renamed from: b, reason: collision with root package name */
    public final p f154858b;

    public o(p r2, p r3) {
        kotlin.jvm.internal.p.l(r2, "buy");
        kotlin.jvm.internal.p.l(r3, "sell");
        this.f154857a = r2;
        this.f154858b = r3;
    }

    public final p a() {
        return this.f154857a;
    }

    public final p b() {
        return this.f154858b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f154857a, r52.f154857a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f154858b, r52.f154858b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f154857a.hashCode() * 31) + this.f154858b.hashCode();
    }

    public String toString() {
        return "BrokerActivityListItemUIState(buy=" + this.f154857a + ", sell=" + this.f154858b + ")";
    }
}
