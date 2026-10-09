package com.stockbit.domain.model.entity;

import java.util.List;

/* loaded from: classes8.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public List f82261a;

    /* renamed from: b, reason: collision with root package name */
    public String f82262b;

    /* renamed from: c, reason: collision with root package name */
    public String f82263c;

    public A(List r1, String r2, String r3) {
        this.f82261a = r1;
        this.f82262b = r2;
        this.f82263c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof A) == true) goto L8;
        return false;
    L8:
        A r52 = (A) r5;
        if (kotlin.jvm.internal.p.g(this.f82261a, r52.f82261a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82262b, r52.f82262b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82263c, r52.f82263c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        List r02 = this.f82261a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f82262b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f82263c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "UpdateReferralCode(data=" + this.f82261a + ", message=" + this.f82262b + ", error=" + this.f82263c + ')';
    }
}
