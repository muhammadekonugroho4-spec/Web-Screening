package com.stockbit.domains.usecase.stockgroups.contract.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f88453a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f88454b;

    public i(List r2, boolean r3) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        this.f88453a = r2;
        this.f88454b = r3;
    }

    public final boolean a() {
        return this.f88454b;
    }

    public final List b() {
        return this.f88453a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f88453a, r52.f88453a) == true) goto L12;
        return false;
    L12:
        if (this.f88454b == r52.f88454b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f88453a.hashCode() * 31) + Boolean.hashCode(this.f88454b);
    }

    public String toString() {
        return "StockItemsByGroupEntity(items=" + this.f88453a + ", hasNext=" + this.f88454b + ")";
    }
}
