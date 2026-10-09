package com.stockbit.model.params.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f122150a;

    public e(String r1) {
        this.f122150a = r1;
    }

    public final String a() {
        return this.f122150a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f122150a, ((e) r4).f122150a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f122150a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "ResearchListParam(lastId=" + this.f122150a + ')';
    }
}
