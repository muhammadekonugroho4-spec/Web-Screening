package com.stockbit.domain.model.securities.order.nego;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f85559a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85560b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85561c;

    public b(List r2, double r3, double r5) {
        p.l(r2, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        this.f85559a = r2;
        this.f85560b = r3;
        this.f85561c = r5;
    }

    public final List a() {
        return this.f85559a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f85559a, r82.f85559a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85560b, r82.f85560b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85561c, r82.f85561c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85559a.hashCode() * 31) + Double.hashCode(this.f85560b)) * 31) + Double.hashCode(this.f85561c);
    }

    public String toString() {
        return "OrderBookNegoBidAskEntity(entries=" + this.f85559a + ", totalFrequency=" + this.f85560b + ", totalShares=" + this.f85561c + ")";
    }
}
