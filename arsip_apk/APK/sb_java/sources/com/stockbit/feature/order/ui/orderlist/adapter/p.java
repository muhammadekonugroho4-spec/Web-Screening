package com.stockbit.feature.order.ui.orderlist.adapter;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f103021a;

    static {
    }

    public p(boolean r1) {
        this.f103021a = r1;
    }

    public final boolean a() {
        return this.f103021a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof p) == true) goto L9;
        return false;
    L9:
        if (this.f103021a == ((p) r4).f103021a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f103021a);
    }

    public String toString() {
        return "ExpandBracketOrder(isExpand=" + this.f103021a + ')';
    }
}
