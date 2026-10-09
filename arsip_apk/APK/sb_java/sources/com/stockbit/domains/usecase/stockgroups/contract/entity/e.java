package com.stockbit.domains.usecase.stockgroups.contract.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f88424a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f88425b;

    public e(List r2, boolean r3) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        this.f88424a = r2;
        this.f88425b = r3;
    }

    public final boolean a() {
        return this.f88425b;
    }

    public final List b() {
        return this.f88424a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f88424a, r52.f88424a) == true) goto L12;
        return false;
    L12:
        if (this.f88425b == r52.f88425b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f88424a.hashCode() * 31) + Boolean.hashCode(this.f88425b);
    }

    public String toString() {
        return "StockGroupListEntity(items=" + this.f88424a + ", hasNext=" + this.f88425b + ")";
    }
}
