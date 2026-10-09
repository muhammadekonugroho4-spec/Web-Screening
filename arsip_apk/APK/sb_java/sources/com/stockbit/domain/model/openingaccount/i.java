package com.stockbit.domain.model.openingaccount;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f84555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84556b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84557c;

    public i(String r2, int r3, String r4) {
        p.l(r2, "type");
        p.l(r4, "value");
        this.f84555a = r2;
        this.f84556b = r3;
        this.f84557c = r4;
    }

    public final int a() {
        return this.f84556b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f84555a, r52.f84555a) == true) goto L12;
        return false;
    L12:
        if (this.f84556b == r52.f84556b) goto L15;
        return false;
    L15:
        if (p.g(this.f84557c, r52.f84557c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84555a.hashCode() * 31) + Integer.hashCode(this.f84556b)) * 31) + this.f84557c.hashCode();
    }

    public String toString() {
        return "SecuritiesOADynamicOptionEntity(type=" + this.f84555a + ", key=" + this.f84556b + ", value=" + this.f84557c + ")";
    }
}
