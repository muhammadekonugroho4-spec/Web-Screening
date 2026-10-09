package com.stockbit.feature.transaction.ui.composecomponent.component;

/* loaded from: classes9.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final String f112165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f112166b;

    /* renamed from: c, reason: collision with root package name */
    public final String f112167c;

    static {
    }

    public K(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "decreaseButtonId");
        kotlin.jvm.internal.p.l(r3, "inputItId");
        kotlin.jvm.internal.p.l(r4, "increaseId");
        this.f112165a = r2;
        this.f112166b = r3;
        this.f112167c = r4;
    }

    public final String a() {
        return this.f112165a;
    }

    public final String b() {
        return this.f112167c;
    }

    public final String c() {
        return this.f112166b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof K) == true) goto L8;
        return false;
    L8:
        K r52 = (K) r5;
        if (kotlin.jvm.internal.p.g(this.f112165a, r52.f112165a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f112166b, r52.f112166b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f112167c, r52.f112167c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f112165a.hashCode() * 31) + this.f112166b.hashCode()) * 31) + this.f112167c.hashCode();
    }

    public String toString() {
        return "CounterValueInputIdentifier(decreaseButtonId=" + this.f112165a + ", inputItId=" + this.f112166b + ", increaseId=" + this.f112167c + ')';
    }
}
