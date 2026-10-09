package com.stockbit.usecase.emittenclassification.contract.entity;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f157568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f157569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f157570c;

    public f(int r1, int r2, int r3) {
        this.f157568a = r1;
        this.f157569b = r2;
        this.f157570c = r3;
    }

    public final boolean a() {
        if (this.f157568a >= this.f157569b) goto L6;
        return true;
    L6:
        return false;
    }

    public final int b() {
        return this.f157570c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f157568a == r52.f157568a) goto L12;
        return false;
    L12:
        if (this.f157569b == r52.f157569b) goto L15;
        return false;
    L15:
        if (this.f157570c == r52.f157570c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f157568a) * 31) + Integer.hashCode(this.f157569b)) * 31) + Integer.hashCode(this.f157570c);
    }

    public String toString() {
        return "EmittenClassificationPaginationEntity(currentPage=" + this.f157568a + ", totalPage=" + this.f157569b + ", totalData=" + this.f157570c + ")";
    }
}
