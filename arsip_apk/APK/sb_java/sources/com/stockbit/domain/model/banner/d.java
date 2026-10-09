package com.stockbit.domain.model.banner;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f80708a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80709b;

    public d(String r1, String r2) {
        this.f80708a = r1;
        this.f80709b = r2;
    }

    public final String a() {
        return this.f80708a;
    }

    public final String b() {
        return this.f80709b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f80708a, r52.f80708a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80709b, r52.f80709b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f80708a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f80709b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "BannerInfoboxTickerEntity(alertType=" + this.f80708a + ", imageUrl=" + this.f80709b + ")";
    }

    public /* synthetic */ d(String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
