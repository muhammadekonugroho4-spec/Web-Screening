package com.stockbit.component.order;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes7.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final String f72330a;

    /* renamed from: b, reason: collision with root package name */
    public final OrderStatusStyle f72331b;

    static {
    }

    public B(String r2, OrderStatusStyle r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TEXT);
        kotlin.jvm.internal.p.l(r3, "style");
        this.f72330a = r2;
        this.f72331b = r3;
    }

    public final OrderStatusStyle a() {
        return this.f72331b;
    }

    public final String b() {
        return this.f72330a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof B) == true) goto L8;
        return false;
    L8:
        B r52 = (B) r5;
        if (kotlin.jvm.internal.p.g(this.f72330a, r52.f72330a) == true) goto L12;
        return false;
    L12:
        if (this.f72331b == r52.f72331b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f72330a.hashCode() * 31) + this.f72331b.hashCode();
    }

    public String toString() {
        return "OrderStatusBadgeUiState(text=" + this.f72330a + ", style=" + this.f72331b + ')';
    }
}
