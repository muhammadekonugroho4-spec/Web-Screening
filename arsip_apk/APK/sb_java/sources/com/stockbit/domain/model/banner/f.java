package com.stockbit.domain.model.banner;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f80711a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80712b;

    public f(String r1, String r2) {
        this.f80711a = r1;
        this.f80712b = r2;
    }

    public final String a() {
        return this.f80711a;
    }

    public final String b() {
        return this.f80712b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f80711a, r52.f80711a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80712b, r52.f80712b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f80711a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f80712b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "BannerUpdateStatusEntity(bannerNotificationId=" + this.f80711a + ", status=" + this.f80712b + ")";
    }
}
