package com.stockbit.domain.model.brokeractivity;

import java.util.List;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final List f80945a;

    /* renamed from: b, reason: collision with root package name */
    public final List f80946b;

    public w(List r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "brokersBuy");
        kotlin.jvm.internal.p.l(r3, "brokersSell");
        this.f80945a = r2;
        this.f80946b = r3;
    }

    public final List a() {
        return this.f80945a;
    }

    public final List b() {
        return this.f80946b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof w) == true) goto L8;
        return false;
    L8:
        w r52 = (w) r5;
        if (kotlin.jvm.internal.p.g(this.f80945a, r52.f80945a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80946b, r52.f80946b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80945a.hashCode() * 31) + this.f80946b.hashCode();
    }

    public String toString() {
        return "BrokerActivityTransactionEntity(brokersBuy=" + this.f80945a + ", brokersSell=" + this.f80946b + ")";
    }
}
