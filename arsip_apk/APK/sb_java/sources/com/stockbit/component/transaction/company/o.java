package com.stockbit.component.transaction.company;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f77508a;

    static {
    }

    public o(String r2) {
        kotlin.jvm.internal.p.l(r2, "automationIdPrice");
        this.f77508a = r2;
    }

    public final String a() {
        return this.f77508a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof o) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f77508a, ((o) r4).f77508a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f77508a.hashCode();
    }

    public String toString() {
        return "PriceAndChangesTextIdentifier(automationIdPrice=" + this.f77508a + ')';
    }
}
