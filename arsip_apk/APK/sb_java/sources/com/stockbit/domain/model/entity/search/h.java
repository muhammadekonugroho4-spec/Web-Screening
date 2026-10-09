package com.stockbit.domain.model.entity.search;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f83002a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83003b;

    public h(boolean r2, String r3) {
        p.l(r3, "multiplier");
        this.f83002a = r2;
        this.f83003b = r3;
    }

    public final String a() {
        return this.f83003b;
    }

    public final boolean b() {
        return this.f83002a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f83002a == r52.f83002a) goto L12;
        return false;
    L12:
        if (p.g(this.f83003b, r52.f83003b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f83002a) * 31) + this.f83003b.hashCode();
    }

    public String toString() {
        return "SubSectorCompanyDayTrade(isShowMultiplier=" + this.f83002a + ", multiplier=" + this.f83003b + ')';
    }

    public /* synthetic */ h(boolean r1, String r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "0";
    L8:
        this(r1, r2);
    }
}
