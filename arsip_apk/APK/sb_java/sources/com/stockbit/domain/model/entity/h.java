package com.stockbit.domain.model.entity;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f82760a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.domain.model.valueobject.c f82761b;

    public h(String r1, com.stockbit.domain.model.valueobject.c r2) {
        this.f82760a = r1;
        this.f82761b = r2;
    }

    public final String a() {
        return this.f82760a;
    }

    public final com.stockbit.domain.model.valueobject.c b() {
        return this.f82761b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f82760a, r52.f82760a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82761b, r52.f82761b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f82760a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        com.stockbit.domain.model.valueobject.c r2 = this.f82761b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "Giphy(id=" + this.f82760a + ", images=" + this.f82761b + ')';
    }
}
