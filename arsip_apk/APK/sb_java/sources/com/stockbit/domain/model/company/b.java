package com.stockbit.domain.model.company;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f81398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81399b;

    /* renamed from: c, reason: collision with root package name */
    public final long f81400c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81401e;

    /* renamed from: f, reason: collision with root package name */
    public final double f81402f;

    public b(String r2, String r3, long r4, String r6, String r7, double r8) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, "formattedDate");
        kotlin.jvm.internal.p.l(r6, "value");
        kotlin.jvm.internal.p.l(r7, "percentage");
        this.f81398a = r2;
        this.f81399b = r3;
        this.f81400c = r4;
        this.d = r6;
        this.f81401e = r7;
        this.f81402f = r8;
    }

    public static /* synthetic */ b b(b r02, String r1, String r2, long r3, String r5, String r6, double r7, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r02.f81398a;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r02.f81399b;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r02.f81400c;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = r02.d;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = r02.f81401e;
    L18:
        if ((r9 & 32) == 0) goto L20;
        r7 = r02.f81402f;
    L20:
        double r92 = r7;
        long r52 = r3;
        String r32 = r1;
        String r4 = r2;
        return r02.a(r32, r4, r52, r5, r6, r92);
    }

    public final b a(String r11, String r12, long r13, String r15, String r16, double r17) {
        kotlin.jvm.internal.p.l(r11, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r12, "formattedDate");
        kotlin.jvm.internal.p.l(r15, "value");
        kotlin.jvm.internal.p.l(r16, "percentage");
        return new b(r11, r12, r13, r15, r16, r17);
    }

    public final String c() {
        return this.f81398a;
    }

    public final String d() {
        return this.f81399b;
    }

    public final String e() {
        return this.f81401e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (kotlin.jvm.internal.p.g(this.f81398a, r82.f81398a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81399b, r82.f81399b) == true) goto L15;
        return false;
    L15:
        if (this.f81400c == r82.f81400c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f81401e, r82.f81401e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f81402f, r82.f81402f) == 0) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final long g() {
        return this.f81400c;
    }

    public int hashCode() {
        return (((((((((this.f81398a.hashCode() * 31) + this.f81399b.hashCode()) * 31) + Long.hashCode(this.f81400c)) * 31) + this.d.hashCode()) * 31) + this.f81401e.hashCode()) * 31) + Double.hashCode(this.f81402f);
    }

    public String toString() {
        return "CompanyChartPriceEntity(date=" + this.f81398a + ", formattedDate=" + this.f81399b + ", xlabel=" + this.f81400c + ", value=" + this.d + ", percentage=" + this.f81401e + ", change=" + this.f81402f + ")";
    }
}
