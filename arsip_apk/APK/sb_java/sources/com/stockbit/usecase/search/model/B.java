package com.stockbit.usecase.search.model;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f159945a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159946b;

    public B(boolean r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "multiplier");
        this.f159945a = r2;
        this.f159946b = r3;
    }

    public final String a() {
        return this.f159946b;
    }

    public final boolean b() {
        return this.f159945a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof B) == true) goto L8;
        return false;
    L8:
        B r52 = (B) r5;
        if (this.f159945a == r52.f159945a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f159946b, r52.f159946b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f159945a) * 31) + this.f159946b.hashCode();
    }

    public String toString() {
        return "SubSectorCompanyDayTradeUIState(isShowMultiplier=" + this.f159945a + ", multiplier=" + this.f159946b + ")";
    }
}
