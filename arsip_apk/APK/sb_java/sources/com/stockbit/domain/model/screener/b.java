package com.stockbit.domain.model.screener;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f84869a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84870b;

    public b(d r2, List r3) {
        p.l(r3, "results");
        this.f84869a = r2;
        this.f84870b = r3;
    }

    public final d a() {
        return this.f84869a;
    }

    public final List b() {
        return this.f84870b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f84869a, r52.f84869a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84870b, r52.f84870b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        d r02 = this.f84869a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f84870b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "ScreenerCalcsBeanEntity(company=" + this.f84869a + ", results=" + this.f84870b + ")";
    }
}
