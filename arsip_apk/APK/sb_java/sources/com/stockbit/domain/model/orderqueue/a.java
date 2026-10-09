package com.stockbit.domain.model.orderqueue;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f84560a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84561b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84562c;

    public a(List r2, boolean r3, boolean r4) {
        p.l(r2, "orders");
        this.f84560a = r2;
        this.f84561b = r3;
        this.f84562c = r4;
    }

    public final boolean a() {
        return this.f84562c;
    }

    public final List b() {
        return this.f84560a;
    }

    public final boolean c() {
        return this.f84561b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84560a, r52.f84560a) == true) goto L12;
        return false;
    L12:
        if (this.f84561b == r52.f84561b) goto L15;
        return false;
    L15:
        if (this.f84562c == r52.f84562c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84560a.hashCode() * 31) + Boolean.hashCode(this.f84561b)) * 31) + Boolean.hashCode(this.f84562c);
    }

    public String toString() {
        return "OrderQueueEntity(orders=" + this.f84560a + ", isMarketOpen=" + this.f84561b + ", hasNextPage=" + this.f84562c + ")";
    }
}
