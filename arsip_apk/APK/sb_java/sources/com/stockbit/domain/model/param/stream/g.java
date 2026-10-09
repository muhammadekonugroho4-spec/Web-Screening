package com.stockbit.domain.model.param.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f84618a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84619b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84620c;

    public g(String r1, String r2, String r3) {
        this.f84618a = r1;
        this.f84619b = r2;
        this.f84620c = r3;
    }

    public final String a() {
        return this.f84620c;
    }

    public final String b() {
        return this.f84618a;
    }

    public final String c() {
        return this.f84619b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f84618a, r52.f84618a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84619b, r52.f84619b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84620c, r52.f84620c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f84618a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f84619b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f84620c;
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
        return "TargetPriceParam(targetPrice=" + this.f84618a + ", targetSymbol=" + this.f84619b + ", targetDuration=" + this.f84620c + ')';
    }
}
