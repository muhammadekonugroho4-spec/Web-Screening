package com.stockbit.feature.portfolio.model;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f104811a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f104812b;

    static {
    }

    public b(boolean r1, boolean r2) {
        this.f104811a = r1;
        this.f104812b = r2;
    }

    public final boolean a() {
        return this.f104812b;
    }

    public final boolean b() {
        return this.f104811a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f104811a == r52.f104811a) goto L12;
        return false;
    L12:
        if (this.f104812b == r52.f104812b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f104811a) * 31) + Boolean.hashCode(this.f104812b);
    }

    public String toString() {
        return "PortfolioOptionsMenuState(shouldShowMoreActionMenu=" + this.f104811a + ", shouldShowActionMenu=" + this.f104812b + ')';
    }
}
