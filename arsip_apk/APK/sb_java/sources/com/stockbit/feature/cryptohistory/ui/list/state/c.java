package com.stockbit.feature.cryptohistory.ui.list.state;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f94053a;

    static {
    }

    public c(int r1) {
        this.f94053a = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (this.f94053a == ((c) r4).f94053a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f94053a);
    }

    public String toString() {
        return "CryptoHistoryListErrorUIData(errorMessageRes=" + this.f94053a + ')';
    }
}
