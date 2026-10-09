package com.stockbit.domain.model.academy;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80533a;

    public a(String r2) {
        p.l(r2, "token");
        this.f80533a = r2;
    }

    public final String a() {
        return this.f80533a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f80533a, ((a) r4).f80533a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f80533a.hashCode();
    }

    public String toString() {
        return "AcademyTokenEntity(token=" + this.f80533a + ")";
    }
}
