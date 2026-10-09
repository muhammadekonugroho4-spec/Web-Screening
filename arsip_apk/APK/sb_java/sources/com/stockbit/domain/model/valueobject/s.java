package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f86932a;

    /* renamed from: b, reason: collision with root package name */
    public int f86933b;

    public s(String r1, int r2) {
        this.f86932a = r1;
        this.f86933b = r2;
    }

    public final int a() {
        return this.f86933b;
    }

    public final String b() {
        return this.f86932a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f86932a, r52.f86932a) == true) goto L12;
        return false;
    L12:
        if (this.f86933b == r52.f86933b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86932a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Integer.hashCode(this.f86933b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "TippingDetailTippingUserSender(username=" + this.f86932a + ", userId=" + this.f86933b + ')';
    }
}
