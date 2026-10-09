package com.stockbit.usecase.securities.model.portfolio;

/* loaded from: classes2.dex */
public final class F implements J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f161605a;

    public F(boolean r1) {
        this.f161605a = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof F) == true) goto L9;
        return false;
    L9:
        if (this.f161605a == ((F) r4).f161605a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f161605a);
    }

    public String toString() {
        return "PortfolioRegularSeparatorUIState(shouldShowDivider=" + this.f161605a + ")";
    }

    public final boolean w() {
        return this.f161605a;
    }
}
