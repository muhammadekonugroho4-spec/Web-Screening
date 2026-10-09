package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f86860a;

    /* renamed from: b, reason: collision with root package name */
    public String f86861b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f86862c;

    public o(String r1, String r2, Integer r3) {
        this.f86860a = r1;
        this.f86861b = r2;
        this.f86862c = r3;
    }

    public final Integer a() {
        return this.f86862c;
    }

    public final String b() {
        return this.f86861b;
    }

    public final String c() {
        return this.f86860a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f86860a, r52.f86860a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86861b, r52.f86861b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86862c, r52.f86862c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86860a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86861b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.f86862c;
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
        return "RewardStock(stockName=" + this.f86860a + ", stockCode=" + this.f86861b + ", lot=" + this.f86862c + ')';
    }
}
