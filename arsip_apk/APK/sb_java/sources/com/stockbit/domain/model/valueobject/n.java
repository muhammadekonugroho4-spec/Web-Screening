package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public String f86857a;

    /* renamed from: b, reason: collision with root package name */
    public String f86858b;

    /* renamed from: c, reason: collision with root package name */
    public int f86859c;
    public Integer d;

    public n(String r1, String r2, int r3, Integer r4) {
        this.f86857a = r1;
        this.f86858b = r2;
        this.f86859c = r3;
        this.d = r4;
    }

    public final String a() {
        return this.f86857a;
    }

    public final String b() {
        return this.f86858b;
    }

    public final int c() {
        return this.f86859c;
    }

    public final Integer d() {
        return this.d;
    }

    public final void e(Integer r1) {
        this.d = r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f86857a, r52.f86857a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86858b, r52.f86858b) == true) goto L15;
        return false;
    L15:
        if (this.f86859c == r52.f86859c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86857a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86858b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (((r04 + r22) * 31) + Integer.hashCode(this.f86859c)) * 31;
        Integer r23 = this.d;
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
        return "ReferralListReferral(createdAt=" + this.f86857a + ", from=" + this.f86858b + ", id=" + this.f86859c + ", status=" + this.d + ')';
    }
}
