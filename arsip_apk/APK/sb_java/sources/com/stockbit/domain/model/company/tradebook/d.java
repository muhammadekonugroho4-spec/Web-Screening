package com.stockbit.domain.model.company.tradebook;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f82016a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82017b;

    /* renamed from: c, reason: collision with root package name */
    public final long f82018c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82019e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82020f;

    /* renamed from: g, reason: collision with root package name */
    public final long f82021g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82022h;

    public d(long r2, String r4, long r5, String r7, String r8, String r9, long r10, String r12) {
        p.l(r4, "frequencyFormatted");
        p.l(r7, "lotFormatted");
        p.l(r8, Constants.KEY_DATE);
        p.l(r9, CrashHianalyticsData.TIME);
        p.l(r12, "valueFormatted");
        this.f82016a = r2;
        this.f82017b = r4;
        this.f82018c = r5;
        this.d = r7;
        this.f82019e = r8;
        this.f82020f = r9;
        this.f82021g = r10;
        this.f82022h = r12;
    }

    public final String a() {
        return this.f82019e;
    }

    public final String b() {
        return this.f82017b;
    }

    public final long c() {
        return this.f82016a;
    }

    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.f82018c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (this.f82016a == r82.f82016a) goto L12;
        return false;
    L12:
        if (p.g(this.f82017b, r82.f82017b) == true) goto L15;
        return false;
    L15:
        if (this.f82018c == r82.f82018c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82019e, r82.f82019e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82020f, r82.f82020f) == true) goto L27;
        return false;
    L27:
        if (this.f82021g == r82.f82021g) goto L30;
        return false;
    L30:
        if (p.g(this.f82022h, r82.f82022h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f82020f;
    }

    public final String g() {
        return this.f82022h;
    }

    public final long h() {
        return this.f82021g;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.f82016a) * 31) + this.f82017b.hashCode()) * 31) + Long.hashCode(this.f82018c)) * 31) + this.d.hashCode()) * 31) + this.f82019e.hashCode()) * 31) + this.f82020f.hashCode()) * 31) + Long.hashCode(this.f82021g)) * 31) + this.f82022h.hashCode();
    }

    public String toString() {
        return "TradeBookChartItemEntity(frequencyRaw=" + this.f82016a + ", frequencyFormatted=" + this.f82017b + ", lotRaw=" + this.f82018c + ", lotFormatted=" + this.d + ", date=" + this.f82019e + ", time=" + this.f82020f + ", valueRaw=" + this.f82021g + ", valueFormatted=" + this.f82022h + ")";
    }

    public /* synthetic */ d(long r12, String r14, long r15, String r17, String r18, String r19, long r20, String r22, int r23, kotlin.jvm.internal.i r24) {
        long r2 = 0;
        if ((r23 & 1) == 0) goto L6;
        r12 = 0;
    L6:
        if ((r23 & 2) == 0) goto L8;
        String r1 = "";
    L10:
        if ((r23 & 4) == 0) goto L12;
        long r5 = 0;
    L14:
        if ((r23 & 8) == 0) goto L16;
        String r7 = "";
    L18:
        if ((r23 & 16) == 0) goto L20;
        String r8 = "";
    L22:
        if ((r23 & 32) == 0) goto L24;
        String r9 = "";
    L26:
        if ((r23 & 64) != 0) goto L30;
        r2 = r20;
    L30:
        if ((r23 & 128) == 0) goto L33;
        String r232 = "";
    L34:
        this(r12, r1, r5, r7, r8, r9, r2, r232);
        return;
    L33:
        r232 = r22;
        goto L34
    L24:
        r9 = r19;
        goto L26
    L20:
        r8 = r18;
        goto L22
    L16:
        r7 = r17;
        goto L18
    L12:
        r5 = r15;
        goto L14
    L8:
        r1 = r14;
        goto L10
    }
}
