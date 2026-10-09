package com.stockbit.domain.model.entity.securities;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f83565a;

    /* renamed from: b, reason: collision with root package name */
    public String f83566b;

    public u(boolean r1, String r2) {
        this.f83565a = r1;
        this.f83566b = r2;
    }

    public final String a() {
        return this.f83566b;
    }

    public final boolean b() {
        return this.f83565a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof u) == true) goto L8;
        return false;
    L8:
        u r52 = (u) r5;
        if (this.f83565a == r52.f83565a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83566b, r52.f83566b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f83565a) * 31;
        String r1 = this.f83566b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "TradingExerciseTradeable(isTradeable=" + this.f83565a + ", message=" + this.f83566b + ')';
    }
}
