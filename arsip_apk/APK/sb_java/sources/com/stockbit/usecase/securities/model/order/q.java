package com.stockbit.usecase.securities.model.order;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f161426a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f161427b;

    public q(Object r1, Object r2) {
        this.f161426a = r1;
        this.f161427b = r2;
    }

    public static /* synthetic */ q b(q r02, Object r1, Object r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f161426a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f161427b;
    L9:
        return r02.a(r1, r2);
    }

    public final q a(Object r2, Object r3) {
        return new q(r2, r3);
    }

    public final Object c() {
        return this.f161427b;
    }

    public final Object d() {
        return this.f161426a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (kotlin.jvm.internal.p.g(this.f161426a, r52.f161426a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161427b, r52.f161427b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f161426a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Object r2 = this.f161427b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OrderDoneUIState(order=" + this.f161426a + ", done=" + this.f161427b + ")";
    }
}
