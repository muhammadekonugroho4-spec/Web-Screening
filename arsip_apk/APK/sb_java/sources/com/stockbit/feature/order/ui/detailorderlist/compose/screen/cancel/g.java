package com.stockbit.feature.order.ui.detailorderlist.compose.screen.cancel;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final OrderDetailCancelErrorType f102628a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102629b;

    static {
    }

    public g(OrderDetailCancelErrorType r2, String r3) {
        p.l(r2, "errorType");
        p.l(r3, "errorMessage");
        this.f102628a = r2;
        this.f102629b = r3;
    }

    public static /* synthetic */ g b(g r02, OrderDetailCancelErrorType r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f102628a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f102629b;
    L9:
        return r02.a(r1, r2);
    }

    public final g a(OrderDetailCancelErrorType r2, String r3) {
        p.l(r2, "errorType");
        p.l(r3, "errorMessage");
        return new g(r2, r3);
    }

    public final String c() {
        return this.f102629b;
    }

    public final OrderDetailCancelErrorType d() {
        return this.f102628a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f102628a == r52.f102628a) goto L12;
        return false;
    L12:
        if (p.g(this.f102629b, r52.f102629b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f102628a.hashCode() * 31) + this.f102629b.hashCode();
    }

    public String toString() {
        return "OrderDetailCancelUIState(errorType=" + this.f102628a + ", errorMessage=" + this.f102629b + ')';
    }

    public /* synthetic */ g(OrderDetailCancelErrorType r1, String r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = OrderDetailCancelErrorType.UNSPECIFIED;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
