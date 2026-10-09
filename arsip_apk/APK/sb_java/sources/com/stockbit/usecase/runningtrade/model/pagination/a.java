package com.stockbit.usecase.runningtrade.model.pagination;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f159639a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f159640b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f159641c;

    public a(boolean r1, Object r2, Object r3) {
        this.f159639a = r1;
        this.f159640b = r2;
        this.f159641c = r3;
    }

    public final Object a() {
        return this.f159641c;
    }

    public final Object b() {
        return this.f159640b;
    }

    public final boolean c() {
        return this.f159639a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f159639a == r52.f159639a) goto L12;
        return false;
    L12:
        if (p.g(this.f159640b, r52.f159640b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f159641c, r52.f159641c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f159639a) * 31;
        Object r1 = this.f159640b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        Object r13 = this.f159641c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "PaginationInfoUIState(isLastPage=" + this.f159639a + ", prevKey=" + this.f159640b + ", nextKey=" + this.f159641c + ")";
    }
}
