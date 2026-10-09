package com.stockbit.watchlist.ui.main.adapter;

/* renamed from: com.stockbit.watchlist.ui.main.adapter.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11111a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f169502a;

    public C11111a(boolean r1) {
        this.f169502a = r1;
    }

    public final boolean a() {
        return this.f169502a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C11111a) == true) goto L9;
        return false;
    L9:
        if (this.f169502a == ((C11111a) r4).f169502a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f169502a);
    }

    public String toString() {
        return "SelectionChanged(isSelected=" + this.f169502a + ')';
    }
}
