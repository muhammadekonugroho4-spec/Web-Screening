package com.stockbit.domain.model.valueobject.company.orderbook;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f86803a;

    /* renamed from: b, reason: collision with root package name */
    public final double f86804b;

    /* renamed from: c, reason: collision with root package name */
    public final f f86805c;

    public e(double r2, double r4, f r6) {
        p.l(r6, "top3");
        this.f86803a = r2;
        this.f86804b = r4;
        this.f86805c = r6;
    }

    public final f a() {
        return this.f86805c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f86803a, r82.f86803a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f86804b, r82.f86804b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f86805c, r82.f86805c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f86803a) * 31) + Double.hashCode(this.f86804b)) * 31) + this.f86805c.hashCode();
    }

    public String toString() {
        return "BandarDetectorData(volume=" + this.f86803a + ", value=" + this.f86804b + ", top3=" + this.f86805c + ')';
    }

    public /* synthetic */ e(double r17, double r19, f r21, int r22, i r23) {
        double r1 = 0.0d;
        if ((r22 & 1) == 0) goto L5;
        double r3 = 0.0d;
    L7:
        if ((r22 & 2) != 0) goto L11;
        r1 = r19;
    L11:
        if ((r22 & 4) == 0) goto L14;
        f r222 = new f(0.0d, 0.0d, 0.0d, 0.0d, 15, null);
    L15:
        this(r3, r1, r222);
        return;
    L14:
        r222 = r21;
        goto L15
    L5:
        r3 = r17;
        goto L7
    }
}
