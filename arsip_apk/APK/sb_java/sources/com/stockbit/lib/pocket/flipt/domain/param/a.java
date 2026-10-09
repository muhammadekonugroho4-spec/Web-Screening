package com.stockbit.lib.pocket.flipt.domain.param;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f120385a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120386b;

    public a(String r2, String r3) {
        p.l(r2, "flagName");
        p.l(r3, "namespace");
        this.f120385a = r2;
        this.f120386b = r3;
    }

    public final String a() {
        return this.f120385a;
    }

    public final String b() {
        return this.f120386b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f120385a, r52.f120385a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120386b, r52.f120386b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f120385a.hashCode() * 31) + this.f120386b.hashCode();
    }

    public String toString() {
        return "FliptBatchDataParam(flagName=" + this.f120385a + ", namespace=" + this.f120386b + ")";
    }
}
