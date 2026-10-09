package com.stockbit.domain.model.margintrading;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84306a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84307b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84308c;

    public b(boolean r2, boolean r3, String r4) {
        p.l(r4, "reason");
        this.f84306a = r2;
        this.f84307b = r3;
        this.f84308c = r4;
    }

    public final String a() {
        return this.f84308c;
    }

    public final boolean b() {
        return this.f84306a;
    }

    public final boolean c() {
        return this.f84307b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f84306a == r52.f84306a) goto L12;
        return false;
    L12:
        if (this.f84307b == r52.f84307b) goto L15;
        return false;
    L15:
        if (p.g(this.f84308c, r52.f84308c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f84306a) * 31) + Boolean.hashCode(this.f84307b)) * 31) + this.f84308c.hashCode();
    }

    public String toString() {
        return "MarginTradingCollateralSubmissionEntity(isAssetSufficient=" + this.f84306a + ", isCashSufficient=" + this.f84307b + ", reason=" + this.f84308c + ")";
    }
}
