package com.stockbit.usecase.securities.model.portfolio;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10926h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f161738a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161739b;

    public C10926h(boolean r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "message");
        this.f161738a = r2;
        this.f161739b = r3;
    }

    public final String a() {
        return this.f161739b;
    }

    public final boolean b() {
        return this.f161738a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10926h) == true) goto L8;
        return false;
    L8:
        C10926h r52 = (C10926h) r5;
        if (this.f161738a == r52.f161738a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161739b, r52.f161739b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f161738a) * 31) + this.f161739b.hashCode();
    }

    public String toString() {
        return "ExerciseTradableStatusUIState(isTradable=" + this.f161738a + ", message=" + this.f161739b + ")";
    }
}
