package com.stockbit.usecase.company.model.tradebook;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f156601a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156602b;

    /* renamed from: c, reason: collision with root package name */
    public final float f156603c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156604e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156605f;

    /* renamed from: g, reason: collision with root package name */
    public final float f156606g;

    /* renamed from: h, reason: collision with root package name */
    public final String f156607h;

    public b(long r2, String r4, float r5, String r6, String r7, String r8, float r9, String r10) {
        p.l(r4, "frequencyFormatted");
        p.l(r6, "lotFormatted");
        p.l(r7, Constants.KEY_DATE);
        p.l(r8, CrashHianalyticsData.TIME);
        p.l(r10, "valueFormatted");
        this.f156601a = r2;
        this.f156602b = r4;
        this.f156603c = r5;
        this.d = r6;
        this.f156604e = r7;
        this.f156605f = r8;
        this.f156606g = r9;
        this.f156607h = r10;
    }

    public final String a() {
        return this.f156604e;
    }

    public final String b() {
        return this.d;
    }

    public final float c() {
        return this.f156603c;
    }

    public final String d() {
        return this.f156605f;
    }

    public final String e() {
        return this.f156607h;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f156601a == r82.f156601a) goto L12;
        return false;
    L12:
        if (p.g(this.f156602b, r82.f156602b) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.f156603c, r82.f156603c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f156604e, r82.f156604e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f156605f, r82.f156605f) == true) goto L27;
        return false;
    L27:
        if (Float.compare(this.f156606g, r82.f156606g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f156607h, r82.f156607h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final float f() {
        return this.f156606g;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.f156601a) * 31) + this.f156602b.hashCode()) * 31) + Float.hashCode(this.f156603c)) * 31) + this.d.hashCode()) * 31) + this.f156604e.hashCode()) * 31) + this.f156605f.hashCode()) * 31) + Float.hashCode(this.f156606g)) * 31) + this.f156607h.hashCode();
    }

    public String toString() {
        return "TradeBookChartItemUIState(frequencyRaw=" + this.f156601a + ", frequencyFormatted=" + this.f156602b + ", lotRaw=" + this.f156603c + ", lotFormatted=" + this.d + ", date=" + this.f156604e + ", time=" + this.f156605f + ", valueRaw=" + this.f156606g + ", valueFormatted=" + this.f156607h + ")";
    }

    public /* synthetic */ b(long r11, String r13, float r14, String r15, String r16, String r17, float r18, String r19, int r20, i r21) {
        if ((r20 & 1) == 0) goto L5;
        r11 = 0;
    L5:
        long r1 = r11;
        if ((r20 & 2) == 0) goto L8;
        String r3 = "";
    L10:
        if ((r20 & 4) == 0) goto L12;
        float r4 = 0.0f;
    L14:
        if ((r20 & 8) == 0) goto L16;
        String r5 = "";
    L18:
        if ((r20 & 16) == 0) goto L20;
        String r6 = "";
    L22:
        if ((r20 & 32) == 0) goto L24;
        String r7 = "";
    L26:
        if ((r20 & 64) == 0) goto L28;
        float r8 = 0.0f;
    L30:
        if ((r20 & 128) == 0) goto L33;
        String r9 = "";
    L34:
        this(r1, r3, r4, r5, r6, r7, r8, r9);
        return;
    L33:
        r9 = r19;
        goto L34
    L28:
        r8 = r18;
        goto L30
    L24:
        r7 = r17;
        goto L26
    L20:
        r6 = r16;
        goto L22
    L16:
        r5 = r15;
        goto L18
    L12:
        r4 = r14;
        goto L14
    L8:
        r3 = r13;
        goto L10
    }
}
