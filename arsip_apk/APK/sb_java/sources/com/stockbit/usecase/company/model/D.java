package com.stockbit.usecase.company.model;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f156154a;

    public D(String r2) {
        kotlin.jvm.internal.p.l(r2, "token");
        this.f156154a = r2;
    }

    public final String a() {
        return this.f156154a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof D) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f156154a, ((D) r4).f156154a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f156154a.hashCode();
    }

    public String toString() {
        return "FundachartTokenUIState(token=" + this.f156154a + ")";
    }
}
