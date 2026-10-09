package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public String f86854a;

    /* renamed from: b, reason: collision with root package name */
    public String f86855b;

    /* renamed from: c, reason: collision with root package name */
    public String f86856c;

    public m(String r1, String r2, String r3) {
        this.f86854a = r1;
        this.f86855b = r2;
        this.f86856c = r3;
    }

    public final String a() {
        return this.f86856c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f86854a, r52.f86854a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86855b, r52.f86855b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86856c, r52.f86856c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86854a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86855b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f86856c;
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
        return "ReferralListRecord(limit=" + this.f86854a + ", total=" + this.f86855b + ", totalUnredeem=" + this.f86856c + ')';
    }
}
