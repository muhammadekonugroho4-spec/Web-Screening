package com.stockbit.feature.transaction.ui.composecomponent.layout;

/* renamed from: com.stockbit.feature.transaction.ui.composecomponent.layout.v1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8661v1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f113123a;

    /* renamed from: b, reason: collision with root package name */
    public final int f113124b;

    static {
    }

    public C8661v1(String r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "textValue");
        this.f113123a = r2;
        this.f113124b = r3;
    }

    public final int a() {
        return this.f113124b;
    }

    public final String b() {
        return this.f113123a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C8661v1) == true) goto L8;
        return false;
    L8:
        C8661v1 r52 = (C8661v1) r5;
        if (kotlin.jvm.internal.p.g(this.f113123a, r52.f113123a) == true) goto L12;
        return false;
    L12:
        if (this.f113124b == r52.f113124b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f113123a.hashCode() * 31) + Integer.hashCode(this.f113124b);
    }

    public String toString() {
        return "OrderSwitcherItem(textValue=" + this.f113123a + ", automationId=" + this.f113124b + ')';
    }
}
