package com.stockbit.domain.model.banner;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f80700a;

    /* renamed from: b, reason: collision with root package name */
    public final a f80701b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80702c;
    public final d d;

    public b(String r1, a r2, String r3, d r4) {
        this.f80700a = r1;
        this.f80701b = r2;
        this.f80702c = r3;
        this.d = r4;
    }

    public final a a() {
        return this.f80701b;
    }

    public final String b() {
        return this.f80700a;
    }

    public final d c() {
        return this.d;
    }

    public final String d() {
        return this.f80702c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f80700a, r52.f80700a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80701b, r52.f80701b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80702c, r52.f80702c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f80700a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        a r2 = this.f80701b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f80702c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        d r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "BannerEntity(id=" + this.f80700a + ", content=" + this.f80701b + ", viewType=" + this.f80702c + ", infoboxTicker=" + this.d + ")";
    }
}
