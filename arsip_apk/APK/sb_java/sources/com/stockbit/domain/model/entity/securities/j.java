package com.stockbit.domain.model.entity.securities;

/* loaded from: classes8.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final FilterExpiryType f83501a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83502b;

    public j(FilterExpiryType r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "filter");
        this.f83501a = r2;
        this.f83502b = r3;
    }

    public static /* synthetic */ j b(j r02, FilterExpiryType r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f83501a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f83502b;
    L9:
        return r02.a(r1, r2);
    }

    public final j a(FilterExpiryType r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "filter");
        return new j(r2, r3);
    }

    @Override // com.stockbit.domain.model.entity.securities.m
    public /* bridge */ m c(boolean r1) {
        return super.c(r1);
    }

    public final FilterExpiryType d() {
        return this.f83501a;
    }

    public boolean e() {
        return this.f83502b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f83501a == r52.f83501a) goto L12;
        return false;
    L12:
        if (this.f83502b == r52.f83502b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f83501a.hashCode() * 31) + Boolean.hashCode(this.f83502b);
    }

    public String toString() {
        return "FilterItemExpiry(filter=" + this.f83501a + ", isActive=" + this.f83502b + ')';
    }

    public /* synthetic */ j(FilterExpiryType r1, boolean r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = FilterExpiryType.UNSPECIFIED;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = false;
    L8:
        this(r1, r2);
    }
}
