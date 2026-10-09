package com.stockbit.domain.model.company;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f81682a;

    public l(String r2) {
        kotlin.jvm.internal.p.l(r2, "token");
        this.f81682a = r2;
    }

    public final String a() {
        return this.f81682a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof l) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f81682a, ((l) r4).f81682a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81682a.hashCode();
    }

    public String toString() {
        return "CompanyShareholderTokenEntity(token=" + this.f81682a + ")";
    }
}
