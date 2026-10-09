package com.stockbit.domain.model.stream.notes;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f85866a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85867b;

    public h(int r2, String r3) {
        p.l(r3, "username");
        this.f85866a = r2;
        this.f85867b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f85866a == r52.f85866a) goto L12;
        return false;
    L12:
        if (p.g(this.f85867b, r52.f85867b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f85866a) * 31) + this.f85867b.hashCode();
    }

    public String toString() {
        return "CompanyNoteUserEntity(id=" + this.f85866a + ", username=" + this.f85867b + ")";
    }
}
