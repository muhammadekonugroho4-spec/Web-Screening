package com.stockbit.domain.model.changephone;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f81167a;

    public c(String r1) {
        this.f81167a = r1;
    }

    public final String a() {
        return this.f81167a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f81167a, ((c) r4).f81167a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f81167a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "ChangePhoneFaceMatchingEntity(refId=" + this.f81167a + ")";
    }
}
