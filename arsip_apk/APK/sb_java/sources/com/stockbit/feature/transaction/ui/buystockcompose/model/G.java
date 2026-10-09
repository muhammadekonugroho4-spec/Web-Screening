package com.stockbit.feature.transaction.ui.buystockcompose.model;

/* loaded from: classes9.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final String f111485a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111486b;

    static {
    }

    public G(String r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "balance");
        this.f111485a = r2;
        this.f111486b = r3;
    }

    public final String a() {
        return this.f111485a;
    }

    public final boolean b() {
        return this.f111486b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof G) == true) goto L8;
        return false;
    L8:
        G r52 = (G) r5;
        if (kotlin.jvm.internal.p.g(this.f111485a, r52.f111485a) == true) goto L12;
        return false;
    L12:
        if (this.f111486b == r52.f111486b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f111485a.hashCode() * 31) + Boolean.hashCode(this.f111486b);
    }

    public String toString() {
        return "TradingLimitUIState(balance=" + this.f111485a + ", isTradingLimitActivated=" + this.f111486b + ')';
    }

    public /* synthetic */ G(String r1, boolean r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = false;
    L8:
        this(r1, r2);
    }
}
