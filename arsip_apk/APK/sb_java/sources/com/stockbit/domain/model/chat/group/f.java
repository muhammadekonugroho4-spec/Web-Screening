package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final p f81220a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81221b;

    public f(p r1, String r2) {
        this.f81220a = r1;
        this.f81221b = r2;
    }

    public final p a() {
        return this.f81220a;
    }

    public final String b() {
        return this.f81221b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f81220a, r52.f81220a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81221b, r52.f81221b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        p r02 = this.f81220a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f81221b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "GroupJoinRequirementEntity(minimumPortfolioEquity=" + this.f81220a + ", rejectionMessage=" + this.f81221b + ")";
    }
}
