package com.stockbit.lib.pocket.flipt.domain.param;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f120387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120388b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.lib.pocket.utils.configurator.a f120389c;

    public b(String r2, String r3, com.stockbit.lib.pocket.utils.configurator.a r4) {
        p.l(r2, "flagName");
        p.l(r3, "namespace");
        this.f120387a = r2;
        this.f120388b = r3;
        this.f120389c = r4;
    }

    public final com.stockbit.lib.pocket.utils.configurator.a a() {
        return this.f120389c;
    }

    public final String b() {
        return this.f120387a;
    }

    public final String c() {
        return this.f120388b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f120387a, r52.f120387a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120388b, r52.f120388b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f120389c, r52.f120389c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f120387a.hashCode() * 31) + this.f120388b.hashCode()) * 31;
        com.stockbit.lib.pocket.utils.configurator.a r1 = this.f120389c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "FliptBatchDomainParam(flagName=" + this.f120387a + ", namespace=" + this.f120388b + ", configurator=" + this.f120389c + ")";
    }
}
