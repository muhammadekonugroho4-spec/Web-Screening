package com.stockbit.domain.model.withdrawaldeposit;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f87372a;

    /* renamed from: b, reason: collision with root package name */
    public final d f87373b;

    public b(List r2, d r3) {
        p.l(r2, "options");
        p.l(r3, "withdrawalGuide");
        this.f87372a = r2;
        this.f87373b = r3;
    }

    public final List a() {
        return this.f87372a;
    }

    public final d b() {
        return this.f87373b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87372a, r52.f87372a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87373b, r52.f87373b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f87372a.hashCode() * 31) + this.f87373b.hashCode();
    }

    public String toString() {
        return "TransferMethodEntity(options=" + this.f87372a + ", withdrawalGuide=" + this.f87373b + ")";
    }
}
