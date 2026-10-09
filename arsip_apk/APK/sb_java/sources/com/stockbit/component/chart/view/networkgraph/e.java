package com.stockbit.component.chart.view.networkgraph;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f69937a;

    /* renamed from: b, reason: collision with root package name */
    public final double f69938b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69939c;

    static {
    }

    public e(String r2, double r3, String r5) {
        kotlin.jvm.internal.p.l(r2, "ticker");
        kotlin.jvm.internal.p.l(r5, "logoUrl");
        this.f69937a = r2;
        this.f69938b = r3;
        this.f69939c = r5;
    }

    public final String a() {
        return this.f69939c;
    }

    public final double b() {
        return this.f69938b;
    }

    public final String c() {
        return this.f69937a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (kotlin.jvm.internal.p.g(this.f69937a, r82.f69937a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f69938b, r82.f69938b) == 0) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f69939c, r82.f69939c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f69937a.hashCode() * 31) + Double.hashCode(this.f69938b)) * 31) + this.f69939c.hashCode();
    }

    public String toString() {
        return "HoldingInfo(ticker=" + this.f69937a + ", percentage=" + this.f69938b + ", logoUrl=" + this.f69939c + ')';
    }
}
