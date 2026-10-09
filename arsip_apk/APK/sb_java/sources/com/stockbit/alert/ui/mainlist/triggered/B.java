package com.stockbit.alert.ui.mainlist.triggered;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes6.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final String f45651a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45652b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45653c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final com.stockbit.domain.model.alert.d f45654e;

    static {
    }

    public B(String r2, String r3, String r4, String r5, com.stockbit.domain.model.alert.d r6) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "symbol");
        kotlin.jvm.internal.p.l(r4, "iconUrl");
        kotlin.jvm.internal.p.l(r5, "updatedAt");
        kotlin.jvm.internal.p.l(r6, "condition");
        this.f45651a = r2;
        this.f45652b = r3;
        this.f45653c = r4;
        this.d = r5;
        this.f45654e = r6;
    }

    public final com.stockbit.domain.model.alert.d a() {
        return this.f45654e;
    }

    public final String b() {
        return this.f45653c;
    }

    public final String c() {
        return this.f45651a;
    }

    public final String d() {
        return this.f45652b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof B) == true) goto L8;
        return false;
    L8:
        B r52 = (B) r5;
        if (kotlin.jvm.internal.p.g(this.f45651a, r52.f45651a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f45652b, r52.f45652b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f45653c, r52.f45653c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f45654e, r52.f45654e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f45651a.hashCode() * 31) + this.f45652b.hashCode()) * 31) + this.f45653c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f45654e.hashCode();
    }

    public String toString() {
        return "TriggeredAlertItemUIState(id=" + this.f45651a + ", symbol=" + this.f45652b + ", iconUrl=" + this.f45653c + ", updatedAt=" + this.d + ", condition=" + this.f45654e + ')';
    }
}
