package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f86925a;

    /* renamed from: b, reason: collision with root package name */
    public s f86926b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86927c;

    public r(int r1, s r2, String r3) {
        this.f86925a = r1;
        this.f86926b = r2;
        this.f86927c = r3;
    }

    public final int a() {
        return this.f86925a;
    }

    public final s b() {
        return this.f86926b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (this.f86925a == r52.f86925a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86926b, r52.f86926b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86927c, r52.f86927c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f86925a) * 31;
        s r1 = this.f86926b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f86927c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "TippingDetailTipping(amount=" + this.f86925a + ", sender=" + this.f86926b + ", date=" + this.f86927c + ')';
    }
}
