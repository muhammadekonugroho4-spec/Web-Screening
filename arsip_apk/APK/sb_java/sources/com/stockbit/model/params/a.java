package com.stockbit.model.params;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f122122a;

    /* renamed from: b, reason: collision with root package name */
    public int f122123b;

    /* renamed from: c, reason: collision with root package name */
    public String f122124c;

    public a(String r1, int r2, String r3) {
        this.f122122a = r1;
        this.f122123b = r2;
        this.f122124c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f122122a, r52.f122122a) == true) goto L12;
        return false;
    L12:
        if (this.f122123b == r52.f122123b) goto L15;
        return false;
    L15:
        if (p.g(this.f122124c, r52.f122124c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f122122a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + Integer.hashCode(this.f122123b)) * 31;
        String r2 = this.f122124c;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TradingOrderlistParams(gtcStatus=" + this.f122122a + ", limit=" + this.f122123b + ", order_id=" + this.f122124c + ')';
    }

    public /* synthetic */ a(String r1, int r2, String r3, int r4, i r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r1, r2, r3);
    }
}
