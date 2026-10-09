package com.stockbit.domain.model.entity;

import java.util.List;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public com.stockbit.domain.model.valueobject.k f82795a;

    /* renamed from: b, reason: collision with root package name */
    public List f82796b;

    public p(com.stockbit.domain.model.valueobject.k r1, List r2) {
        this.f82795a = r1;
        this.f82796b = r2;
    }

    public final com.stockbit.domain.model.valueobject.k a() {
        return this.f82795a;
    }

    public final List b() {
        return this.f82796b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f82795a, r52.f82795a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82796b, r52.f82796b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        com.stockbit.domain.model.valueobject.k r02 = this.f82795a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List r2 = this.f82796b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ReferralList(meta=" + this.f82795a + ", referralList=" + this.f82796b + ')';
    }
}
