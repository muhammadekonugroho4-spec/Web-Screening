package com.stockbit.domain.model.sharetrade;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f85804a;

    /* renamed from: b, reason: collision with root package name */
    public final e f85805b;

    public d(List r1, e r2) {
        this.f85804a = r1;
        this.f85805b = r2;
    }

    public final e a() {
        return this.f85805b;
    }

    public final List b() {
        return this.f85804a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f85804a, r52.f85804a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85805b, r52.f85805b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        List r02 = this.f85804a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        e r2 = this.f85805b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ShareTradeTargetListEntity(targets=" + this.f85804a + ", pagination=" + this.f85805b + ")";
    }
}
