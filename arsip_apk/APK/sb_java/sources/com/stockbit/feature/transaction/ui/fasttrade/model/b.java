package com.stockbit.feature.transaction.ui.fasttrade.model;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f114047a;

    /* renamed from: b, reason: collision with root package name */
    public final String f114048b;

    static {
    }

    public b(c r2, String r3) {
        p.l(r2, "type");
        p.l(r3, "message");
        this.f114047a = r2;
        this.f114048b = r3;
    }

    public final c a() {
        return this.f114047a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f114047a, r52.f114047a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f114048b, r52.f114048b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f114047a.hashCode() * 31) + this.f114048b.hashCode();
    }

    public String toString() {
        return "FTErrorScreenState(type=" + this.f114047a + ", message=" + this.f114048b + ')';
    }
}
