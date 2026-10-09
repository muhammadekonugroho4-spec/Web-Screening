package com.stockbit.usecase.cryptoorderlist.contract.entity;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f157326a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157327b;

    public b(List r2, String r3) {
        p.l(r2, "orders");
        this.f157326a = r2;
        this.f157327b = r3;
    }

    public final String a() {
        return this.f157327b;
    }

    public final List b() {
        return this.f157326a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f157326a, r52.f157326a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157327b, r52.f157327b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f157326a.hashCode() * 31;
        String r1 = this.f157327b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CryptoOrderListPage(orders=" + this.f157326a + ", nextPageToken=" + this.f157327b + ")";
    }
}
