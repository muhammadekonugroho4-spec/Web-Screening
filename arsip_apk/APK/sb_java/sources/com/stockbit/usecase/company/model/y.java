package com.stockbit.usecase.company.model;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f156707a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156708b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156709c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f156710e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156711f;

    public y(String r2, String r3, String r4, String r5, boolean r6, String r7) {
        kotlin.jvm.internal.p.l(r2, "companyId");
        kotlin.jvm.internal.p.l(r3, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r4, CrashHianalyticsData.TIME);
        kotlin.jvm.internal.p.l(r5, "venue");
        kotlin.jvm.internal.p.l(r7, "eligibleDate");
        this.f156707a = r2;
        this.f156708b = r3;
        this.f156709c = r4;
        this.d = r5;
        this.f156710e = r6;
        this.f156711f = r7;
    }

    public final String a() {
        return this.f156707a;
    }

    public final String b() {
        return this.f156708b;
    }

    public final String c() {
        return this.f156711f;
    }

    public final String d() {
        return this.f156709c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof y) == true) goto L8;
        return false;
    L8:
        y r52 = (y) r5;
        if (kotlin.jvm.internal.p.g(this.f156707a, r52.f156707a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156708b, r52.f156708b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156709c, r52.f156709c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f156710e == r52.f156710e) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156711f, r52.f156711f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f156710e;
    }

    public int hashCode() {
        return (((((((((this.f156707a.hashCode() * 31) + this.f156708b.hashCode()) * 31) + this.f156709c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f156710e)) * 31) + this.f156711f.hashCode();
    }

    public String toString() {
        return "CorpActionRupsUIState(companyId=" + this.f156707a + ", date=" + this.f156708b + ", time=" + this.f156709c + ", venue=" + this.d + ", isActive=" + this.f156710e + ", eligibleDate=" + this.f156711f + ")";
    }

    public /* synthetic */ y(String r2, String r3, String r4, String r5, boolean r6, String r7, int r8, kotlin.jvm.internal.i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r8 & 32) == 0) goto L21;
        String r82 = "";
    L20:
        boolean r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
