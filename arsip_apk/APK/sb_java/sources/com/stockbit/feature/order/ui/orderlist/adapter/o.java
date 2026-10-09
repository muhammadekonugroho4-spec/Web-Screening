package com.stockbit.feature.order.ui.orderlist.adapter;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f103020a;

    static {
    }

    public o(boolean r1) {
        this.f103020a = r1;
    }

    public final boolean a() {
        return this.f103020a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof o) == true) goto L9;
        return false;
    L9:
        if (this.f103020a == ((o) r4).f103020a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f103020a);
    }

    public String toString() {
        return "CheckedChange(isChecked=" + this.f103020a + ')';
    }
}
