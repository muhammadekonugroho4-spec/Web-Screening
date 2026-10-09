package com.stockbit.usecase.academy.model;

import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f154307a;

    public a(String r2) {
        p.l(r2, "academyToken");
        this.f154307a = r2;
    }

    public final String a() {
        return this.f154307a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f154307a, ((a) r4).f154307a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f154307a.hashCode();
    }

    public String toString() {
        return "AcademyTokenUIState(academyToken=" + this.f154307a + ")";
    }
}
