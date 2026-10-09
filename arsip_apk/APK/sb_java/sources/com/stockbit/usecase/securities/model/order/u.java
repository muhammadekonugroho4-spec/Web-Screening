package com.stockbit.usecase.securities.model.order;

import com.google.firebase.crashlytics.internal.common.IdManager;
import com.stockbit.usecase.securities.model.history.RealizedGainType;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final y f161451a;

    /* renamed from: b, reason: collision with root package name */
    public final y f161452b;

    /* renamed from: c, reason: collision with root package name */
    public final RealizedGainType f161453c;

    public u(y r2, y r3, RealizedGainType r4) {
        kotlin.jvm.internal.p.l(r2, "amount");
        kotlin.jvm.internal.p.l(r3, "percentage");
        kotlin.jvm.internal.p.l(r4, "gainType");
        this.f161451a = r2;
        this.f161452b = r3;
        this.f161453c = r4;
    }

    public final y a() {
        return this.f161451a;
    }

    public final RealizedGainType b() {
        return this.f161453c;
    }

    public final y c() {
        return this.f161452b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof u) == true) goto L8;
        return false;
    L8:
        u r52 = (u) r5;
        if (kotlin.jvm.internal.p.g(this.f161451a, r52.f161451a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161452b, r52.f161452b) == true) goto L15;
        return false;
    L15:
        if (this.f161453c == r52.f161453c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f161451a.hashCode() * 31) + this.f161452b.hashCode()) * 31) + this.f161453c.hashCode();
    }

    public String toString() {
        return "OrderRealizedUIState(amount=" + this.f161451a + ", percentage=" + this.f161452b + ", gainType=" + this.f161453c + ")";
    }

    public /* synthetic */ u(y r4, y r5, RealizedGainType r6, int r7, kotlin.jvm.internal.i r8) {
        int r82 = r7 & 1;
        Double r1 = Double.valueOf(0.0d);
        if (r82 == 0) goto L6;
        r4 = new y(r1, IdManager.DEFAULT_VERSION_NAME);
    L6:
        if ((r7 & 2) == 0) goto L9;
        r5 = new y(r1, IdManager.DEFAULT_VERSION_NAME);
    L9:
        if ((r7 & 4) == 0) goto L11;
        r6 = RealizedGainType.NEUTRAL;
    L11:
        this(r4, r5, r6);
    }
}
