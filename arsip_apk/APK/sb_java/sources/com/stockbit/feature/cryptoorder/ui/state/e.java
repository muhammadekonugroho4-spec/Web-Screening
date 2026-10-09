package com.stockbit.feature.cryptoorder.ui.state;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f94604a;

    static {
    }

    public e(int r1) {
        this.f94604a = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (this.f94604a == ((e) r4).f94604a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f94604a);
    }

    public String toString() {
        return "CryptoOrderListErrorUIData(errorMessageRes=" + this.f94604a + ')';
    }
}
