package com.stockbit.usecase.notification.model;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f158621a;

    /* renamed from: b, reason: collision with root package name */
    public final c f158622b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158623c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f158624e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158625f;

    /* renamed from: g, reason: collision with root package name */
    public final String f158626g;

    /* renamed from: h, reason: collision with root package name */
    public final String f158627h;

    public b(int r2, c r3, String r4, boolean r5, boolean r6, String r7, String r8, String r9) {
        p.l(r3, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        p.l(r4, CrashHianalyticsData.TIME);
        p.l(r7, "messageHtml");
        this.f158621a = r2;
        this.f158622b = r3;
        this.f158623c = r4;
        this.d = r5;
        this.f158624e = r6;
        this.f158625f = r7;
        this.f158626g = r8;
        this.f158627h = r9;
    }

    public final String a() {
        return this.f158626g;
    }

    public final c b() {
        return this.f158622b;
    }

    public final int c() {
        return this.f158621a;
    }

    public final String d() {
        return this.f158625f;
    }

    public final String e() {
        return this.f158623c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f158621a == r52.f158621a) goto L12;
        return false;
    L12:
        if (p.g(this.f158622b, r52.f158622b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158623c, r52.f158623c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f158624e == r52.f158624e) goto L24;
        return false;
    L24:
        if (p.g(this.f158625f, r52.f158625f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f158626g, r52.f158626g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f158627h, r52.f158627h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f158627h;
    }

    public int hashCode() {
        int r02 = ((((((((((Integer.hashCode(this.f158621a) * 31) + this.f158622b.hashCode()) * 31) + this.f158623c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f158624e)) * 31) + this.f158625f.hashCode()) * 31;
        String r1 = this.f158626g;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f158627h;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "NotificationItem(id=" + this.f158621a + ", direction=" + this.f158622b + ", time=" + this.f158623c + ", isRead=" + this.d + ", isFollowButtonVisible=" + this.f158624e + ", messageHtml=" + this.f158625f + ", avatarUrl=" + this.f158626g + ", userName=" + this.f158627h + ")";
    }
}
