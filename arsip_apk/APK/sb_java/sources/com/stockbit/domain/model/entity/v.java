package com.stockbit.domain.model.entity;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.domain.model.valueobject.r f83780a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.domain.model.valueobject.q f83781b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83782c;

    public v(com.stockbit.domain.model.valueobject.r r2, com.stockbit.domain.model.valueobject.q r3, String r4) {
        kotlin.jvm.internal.p.l(r4, Constants.KEY_DATE);
        this.f83780a = r2;
        this.f83781b = r3;
        this.f83782c = r4;
    }

    public final com.stockbit.domain.model.valueobject.q a() {
        return this.f83781b;
    }

    public final String b() {
        return this.f83782c;
    }

    public final com.stockbit.domain.model.valueobject.r c() {
        return this.f83780a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (kotlin.jvm.internal.p.g(this.f83780a, r52.f83780a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83781b, r52.f83781b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83782c, r52.f83782c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        com.stockbit.domain.model.valueobject.r r02 = this.f83780a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        com.stockbit.domain.model.valueobject.q r2 = this.f83781b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return ((r04 + r1) * 31) + this.f83782c.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TippingDetail(tipping=" + this.f83780a + ", claim=" + this.f83781b + ", date=" + this.f83782c + ')';
    }
}
