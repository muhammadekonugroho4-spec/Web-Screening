package com.stockbit.domain.model.auth;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public String f80685a;

    public l(String r1) {
        this.f80685a = r1;
    }

    public final String a() {
        return this.f80685a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof l) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f80685a, ((l) r4).f80685a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f80685a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "SupportDataEntity(id=" + this.f80685a + ")";
    }
}
