package com.stockbit.company.ui.orderbook.brokerdistribution.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f67226a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67227b;

    static {
    }

    public e(String r2, boolean r3) {
        p.l(r2, "nodeId");
        this.f67226a = r2;
        this.f67227b = r3;
    }

    public final String a() {
        return this.f67226a;
    }

    public final boolean b() {
        return this.f67227b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f67226a, r52.f67226a) == true) goto L12;
        return false;
    L12:
        if (this.f67227b == r52.f67227b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f67226a.hashCode() * 31) + Boolean.hashCode(this.f67227b);
    }

    public String toString() {
        return "NodeSelection(nodeId=" + this.f67226a + ", isSource=" + this.f67227b + ')';
    }
}
