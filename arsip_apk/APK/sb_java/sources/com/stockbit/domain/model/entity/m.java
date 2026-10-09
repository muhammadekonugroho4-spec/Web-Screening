package com.stockbit.domain.model.entity;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public String f82786a;

    /* renamed from: b, reason: collision with root package name */
    public String f82787b;

    /* renamed from: c, reason: collision with root package name */
    public String f82788c;

    public m(String r1, String r2, String r3) {
        this.f82786a = r1;
        this.f82787b = r2;
        this.f82788c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f82786a, r52.f82786a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82787b, r52.f82787b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82788c, r52.f82788c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f82786a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f82787b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f82788c;
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
        return "RedeemAll(message=" + this.f82786a + ", error=" + this.f82787b + ", code=" + this.f82788c + ')';
    }
}
