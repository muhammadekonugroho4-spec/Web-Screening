package com.stockbit.domain.model.entity;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public Integer f82789a;

    public n(Integer r1) {
        this.f82789a = r1;
    }

    public final Integer a() {
        return this.f82789a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof n) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f82789a, ((n) r4).f82789a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f82789a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "RedeemUnit(id=" + this.f82789a + ')';
    }
}
