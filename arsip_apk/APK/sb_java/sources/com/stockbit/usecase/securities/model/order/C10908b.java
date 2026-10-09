package com.stockbit.usecase.securities.model.order;

/* renamed from: com.stockbit.usecase.securities.model.order.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10908b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f161211a;

    public C10908b(String r2) {
        kotlin.jvm.internal.p.l(r2, "availableLot");
        this.f161211a = r2;
    }

    public final String a() {
        return this.f161211a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C10908b) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f161211a, ((C10908b) r4).f161211a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f161211a.hashCode();
    }

    public String toString() {
        return "AvailableLotUIState(availableLot=" + this.f161211a + ")";
    }
}
