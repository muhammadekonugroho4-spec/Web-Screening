package com.stockbit.usecase.securities.model.history.v2;

import com.stockbit.usecase.securities.model.history.RealizedGainType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f160875a;

    /* renamed from: b, reason: collision with root package name */
    public final RealizedGainType f160876b;

    public c(String r2, RealizedGainType r3) {
        p.l(r2, "amount");
        p.l(r3, "gainType");
        this.f160875a = r2;
        this.f160876b = r3;
    }

    public final String a() {
        return this.f160875a;
    }

    public final RealizedGainType b() {
        return this.f160876b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f160875a, r52.f160875a) == true) goto L12;
        return false;
    L12:
        if (this.f160876b == r52.f160876b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f160875a.hashCode() * 31) + this.f160876b.hashCode();
    }

    public String toString() {
        return "HistoryRealizedSummaryUIState(amount=" + this.f160875a + ", gainType=" + this.f160876b + ")";
    }

    public /* synthetic */ c(String r1, RealizedGainType r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = RealizedGainType.NEUTRAL;
    L8:
        this(r1, r2);
    }
}
