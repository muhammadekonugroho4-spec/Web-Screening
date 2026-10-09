package com.stockbit.domain.model.changedata;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81156a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81157b;

    public b(boolean r2, String r3) {
        p.l(r3, "nextAttemptTime");
        this.f81156a = r2;
        this.f81157b = r3;
    }

    public final String a() {
        return this.f81157b;
    }

    public final boolean b() {
        return this.f81156a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f81156a == r52.f81156a) goto L12;
        return false;
    L12:
        if (p.g(this.f81157b, r52.f81157b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f81156a) * 31) + this.f81157b.hashCode();
    }

    public String toString() {
        return "ChangeDataStatusEntity(isEligible=" + this.f81156a + ", nextAttemptTime=" + this.f81157b + ")";
    }
}
