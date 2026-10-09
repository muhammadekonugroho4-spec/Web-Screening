package com.stockbit.feature.transaction.ui.composecomponent.model.identifier;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f113167a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113168b;

    static {
    }

    public a(String r2, String r3) {
        p.l(r2, "totalLotSliderId");
        p.l(r3, "sliderThumbId");
        this.f113167a = r2;
        this.f113168b = r3;
    }

    public final String a() {
        return this.f113168b;
    }

    public final String b() {
        return this.f113167a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f113167a, r52.f113167a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f113168b, r52.f113168b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f113167a.hashCode() * 31) + this.f113168b.hashCode();
    }

    public String toString() {
        return "StockLotSliderIdentifier(totalLotSliderId=" + this.f113167a + ", sliderThumbId=" + this.f113168b + ')';
    }

    public /* synthetic */ a(String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
