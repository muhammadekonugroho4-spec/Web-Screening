package com.stockbit.feature.cryptotransaction.ui.buy.component.common;

/* renamed from: com.stockbit.feature.cryptotransaction.ui.buy.component.common.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7475a {

    /* renamed from: a, reason: collision with root package name */
    public final String f95544a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95545b;

    /* renamed from: c, reason: collision with root package name */
    public final String f95546c;

    static {
    }

    public C7475a(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "decreaseButtonId");
        kotlin.jvm.internal.p.l(r3, "inputItId");
        kotlin.jvm.internal.p.l(r4, "increaseId");
        this.f95544a = r2;
        this.f95545b = r3;
        this.f95546c = r4;
    }

    public final String a() {
        return this.f95544a;
    }

    public final String b() {
        return this.f95546c;
    }

    public final String c() {
        return this.f95545b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C7475a) == true) goto L8;
        return false;
    L8:
        C7475a r52 = (C7475a) r5;
        if (kotlin.jvm.internal.p.g(this.f95544a, r52.f95544a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f95545b, r52.f95545b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f95546c, r52.f95546c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f95544a.hashCode() * 31) + this.f95545b.hashCode()) * 31) + this.f95546c.hashCode();
    }

    public String toString() {
        return "CounterValueInputIdentifier(decreaseButtonId=" + this.f95544a + ", inputItId=" + this.f95545b + ", increaseId=" + this.f95546c + ')';
    }
}
