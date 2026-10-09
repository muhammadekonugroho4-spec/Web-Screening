package com.stockbit.features.tradingperformance.ui.portfolio.model;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f119618a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f119619b;

    static {
    }

    public c(Object r1, boolean r2) {
        this.f119618a = r1;
        this.f119619b = r2;
    }

    public static /* synthetic */ c b(c r02, Object r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f119618a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f119619b;
    L9:
        return r02.a(r1, r2);
    }

    public final c a(Object r2, boolean r3) {
        return new c(r2, r3);
    }

    public final Object c() {
        return this.f119618a;
    }

    public final boolean d() {
        return this.f119619b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f119618a, r52.f119618a) == true) goto L12;
        return false;
    L12:
        if (this.f119619b == r52.f119619b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f119618a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f119619b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "SelectableItem(item=" + this.f119618a + ", isSelected=" + this.f119619b + ')';
    }
}
