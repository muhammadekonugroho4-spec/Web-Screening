package com.stockbit.domain.model.entity.search;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f83004a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83005b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83006c;

    public i(boolean r2, String r3, int r4) {
        p.l(r3, "haircutPercentage");
        this.f83004a = r2;
        this.f83005b = r3;
        this.f83006c = r4;
    }

    public final String a() {
        return this.f83005b;
    }

    public final boolean b() {
        return this.f83004a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f83004a == r52.f83004a) goto L12;
        return false;
    L12:
        if (p.g(this.f83005b, r52.f83005b) == true) goto L15;
        return false;
    L15:
        if (this.f83006c == r52.f83006c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f83004a) * 31) + this.f83005b.hashCode()) * 31) + Integer.hashCode(this.f83006c);
    }

    public String toString() {
        return "SubSectorCompanyMarginTrading(isMarginTrading=" + this.f83004a + ", haircutPercentage=" + this.f83005b + ", haircutPercentageRaw=" + this.f83006c + ')';
    }

    public /* synthetic */ i(boolean r2, String r3, int r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
