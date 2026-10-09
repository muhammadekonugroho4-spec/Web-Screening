package com.stockbit.domains.usecase.stockgroups.contract.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f88411a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f88412b;

    public a(List r2, boolean r3) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        this.f88411a = r2;
        this.f88412b = r3;
    }

    public final boolean a() {
        return this.f88412b;
    }

    public final List b() {
        return this.f88411a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f88411a, r52.f88411a) == true) goto L12;
        return false;
    L12:
        if (this.f88412b == r52.f88412b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f88411a.hashCode() * 31) + Boolean.hashCode(this.f88412b);
    }

    public String toString() {
        return "StockGroupCatalogEntity(items=" + this.f88411a + ", hasNext=" + this.f88412b + ")";
    }
}
