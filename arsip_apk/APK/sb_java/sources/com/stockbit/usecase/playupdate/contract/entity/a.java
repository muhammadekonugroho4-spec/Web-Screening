package com.stockbit.usecase.playupdate.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f159335a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f159336b;

    public a(boolean r1, Integer r2) {
        this.f159335a = r1;
        this.f159336b = r2;
    }

    public final Integer a() {
        return this.f159336b;
    }

    public final boolean b() {
        return this.f159335a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f159335a == r52.f159335a) goto L12;
        return false;
    L12:
        if (p.g(this.f159336b, r52.f159336b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f159335a) * 31;
        Integer r1 = this.f159336b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PlayUpdateStatus(updateAvailable=" + this.f159335a + ", availableVersionCode=" + this.f159336b + ")";
    }
}
