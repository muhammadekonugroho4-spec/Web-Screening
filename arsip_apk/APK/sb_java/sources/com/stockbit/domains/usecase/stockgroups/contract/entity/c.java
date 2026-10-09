package com.stockbit.domains.usecase.stockgroups.contract.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final f f88416a;

    /* renamed from: b, reason: collision with root package name */
    public final List f88417b;

    /* renamed from: c, reason: collision with root package name */
    public final List f88418c;
    public final boolean d;

    public c(f r2, List r3, List r4, boolean r5) {
        p.l(r2, "selectedStockGroupTab");
        p.l(r3, "stockGroupTabs");
        p.l(r4, FirebaseAnalytics.Param.ITEMS);
        this.f88416a = r2;
        this.f88417b = r3;
        this.f88418c = r4;
        this.d = r5;
    }

    public static /* synthetic */ c b(c r02, f r1, List r2, List r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f88416a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f88417b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f88418c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final c a(f r2, List r3, List r4, boolean r5) {
        p.l(r2, "selectedStockGroupTab");
        p.l(r3, "stockGroupTabs");
        p.l(r4, FirebaseAnalytics.Param.ITEMS);
        return new c(r2, r3, r4, r5);
    }

    public final boolean c() {
        return this.d;
    }

    public final List d() {
        return this.f88418c;
    }

    public final f e() {
        return this.f88416a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f88416a, r52.f88416a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88417b, r52.f88417b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88418c, r52.f88418c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f88416a.hashCode() * 31) + this.f88417b.hashCode()) * 31) + this.f88418c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "StockGroupDetailEntity(selectedStockGroupTab=" + this.f88416a + ", stockGroupTabs=" + this.f88417b + ", items=" + this.f88418c + ", hasNext=" + this.d + ")";
    }

    public /* synthetic */ c(f r1, List r2, List r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = false;
    L5:
        this(r1, r2, r3, r4);
    }
}
