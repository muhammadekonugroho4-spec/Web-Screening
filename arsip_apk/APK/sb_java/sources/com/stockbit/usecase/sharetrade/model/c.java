package com.stockbit.usecase.sharetrade.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f162915a;

    /* renamed from: b, reason: collision with root package name */
    public final d f162916b;

    public c(List r2, d r3) {
        p.l(r2, "targets");
        this.f162915a = r2;
        this.f162916b = r3;
    }

    public final d a() {
        return this.f162916b;
    }

    public final List b() {
        return this.f162915a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f162915a, r52.f162915a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f162916b, r52.f162916b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f162915a.hashCode() * 31;
        d r1 = this.f162916b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ShareTradeTargetListUIState(targets=" + this.f162915a + ", pagination=" + this.f162916b + ")";
    }
}
