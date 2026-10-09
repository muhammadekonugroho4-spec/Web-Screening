package com.stockbit.domain.model.entity;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f82780a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82781b;

    public k(String r1, boolean r2) {
        this.f82780a = r1;
        this.f82781b = r2;
    }

    public final boolean a() {
        return this.f82781b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f82780a, r52.f82780a) == true) goto L12;
        return false;
    L12:
        if (this.f82781b == r52.f82781b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f82780a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f82781b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "LivenessScore(fileUrl=" + this.f82780a + ", isValid=" + this.f82781b + ')';
    }
}
