package com.stockbit.usecase.securities.model.portfolio;

/* loaded from: classes2.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final Float f161692a;

    /* renamed from: b, reason: collision with root package name */
    public final Float f161693b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f161694c;
    public final Float d;

    public M(Float r1, Float r2, Float r3, Float r4) {
        this.f161692a = r1;
        this.f161693b = r2;
        this.f161694c = r3;
        this.d = r4;
    }

    public final Float a() {
        return this.f161694c;
    }

    public final Float b() {
        return this.d;
    }

    public final Float c() {
        return this.f161693b;
    }

    public final Float d() {
        return this.f161692a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof M) == true) goto L8;
        return false;
    L8:
        M r52 = (M) r5;
        if (kotlin.jvm.internal.p.g(this.f161692a, r52.f161692a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161693b, r52.f161693b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161694c, r52.f161694c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Float r02 = this.f161692a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Float r2 = this.f161693b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Float r23 = this.f161694c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Float r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "PortfolioWeightUIState(symbol=" + this.f161692a + ", pnl=" + this.f161693b + ", invested=" + this.f161694c + ", market=" + this.d + ")";
    }
}
