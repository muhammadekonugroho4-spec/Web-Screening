package com.stockbit.usecase.runningtrade.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f159607a;

    /* renamed from: b, reason: collision with root package name */
    public final a f159608b;

    /* renamed from: c, reason: collision with root package name */
    public final a f159609c;

    public d(a r2, a r3, a r4) {
        p.l(r2, "value");
        p.l(r3, "lot");
        p.l(r4, Constants.KEY_FREQUENCY);
        this.f159607a = r2;
        this.f159608b = r3;
        this.f159609c = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f159607a, r52.f159607a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159608b, r52.f159608b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f159609c, r52.f159609c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f159607a.hashCode() * 31) + this.f159608b.hashCode()) * 31) + this.f159609c.hashCode();
    }

    public String toString() {
        return "RunningTradeGroupedTotalUIState(value=" + this.f159607a + ", lot=" + this.f159608b + ", frequency=" + this.f159609c + ")";
    }
}
