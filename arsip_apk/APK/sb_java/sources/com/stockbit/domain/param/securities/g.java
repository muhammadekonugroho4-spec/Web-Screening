package com.stockbit.domain.param.securities;

import java.util.List;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f87485a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87486b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87487c;

    public g(String r1, List r2, String r3) {
        this.f87485a = r1;
        this.f87486b = r2;
        this.f87487c = r3;
    }

    public final String a() {
        return this.f87485a;
    }

    public final List b() {
        return this.f87486b;
    }

    public final String c() {
        return this.f87487c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f87485a, r52.f87485a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87486b, r52.f87486b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87487c, r52.f87487c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f87485a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List r2 = this.f87486b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f87487c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "PostOrderBulkCancelDomainParam(accNo=" + this.f87485a + ", orderId=" + this.f87486b + ", salesName=" + this.f87487c + ")";
    }
}
