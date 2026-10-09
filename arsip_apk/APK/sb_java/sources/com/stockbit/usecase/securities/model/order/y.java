package com.stockbit.usecase.securities.model.order;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f161508a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161509b;

    public y(Object r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "formatted");
        this.f161508a = r2;
        this.f161509b = r3;
    }

    public static /* synthetic */ y b(y r02, Object r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f161508a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f161509b;
    L9:
        return r02.a(r1, r2);
    }

    public final y a(Object r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "formatted");
        return new y(r2, r3);
    }

    public final String c() {
        return this.f161509b;
    }

    public final Object d() {
        return this.f161508a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof y) == true) goto L8;
        return false;
    L8:
        y r52 = (y) r5;
        if (kotlin.jvm.internal.p.g(this.f161508a, r52.f161508a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161509b, r52.f161509b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f161508a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f161509b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "RawFormattedUIState(raw=" + this.f161508a + ", formatted=" + this.f161509b + ")";
    }
}
