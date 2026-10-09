package com.stockbit.feature.transaction.ui.buystockcompose.form.layout;

/* loaded from: classes9.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final String f110941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110942b;

    static {
    }

    public V(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "investmentTextId");
        kotlin.jvm.internal.p.l(r3, "totalInvestmentTextId");
        this.f110941a = r2;
        this.f110942b = r3;
    }

    public final String a() {
        return this.f110941a;
    }

    public final String b() {
        return this.f110942b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof V) == true) goto L8;
        return false;
    L8:
        V r52 = (V) r5;
        if (kotlin.jvm.internal.p.g(this.f110941a, r52.f110941a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f110942b, r52.f110942b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f110941a.hashCode() * 31) + this.f110942b.hashCode();
    }

    public String toString() {
        return "InvestmentIdentifier(investmentTextId=" + this.f110941a + ", totalInvestmentTextId=" + this.f110942b + ')';
    }
}
