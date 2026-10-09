package com.stockbit.usecase.tradingperformance.model;

import com.clevertap.android.sdk.Constants;
import java.util.List;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f163515a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163516b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163517c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final SubSectorAllocationColorUIType f163518e;

    /* renamed from: f, reason: collision with root package name */
    public final List f163519f;

    public k(String r2, String r3, String r4, float r5, SubSectorAllocationColorUIType r6, List r7) {
        kotlin.jvm.internal.p.l(r2, "subSectorName");
        kotlin.jvm.internal.p.l(r3, "value");
        kotlin.jvm.internal.p.l(r4, "percentageText");
        kotlin.jvm.internal.p.l(r6, Constants.KEY_COLOR);
        kotlin.jvm.internal.p.l(r7, "stocks");
        this.f163515a = r2;
        this.f163516b = r3;
        this.f163517c = r4;
        this.d = r5;
        this.f163518e = r6;
        this.f163519f = r7;
    }

    public final SubSectorAllocationColorUIType a() {
        return this.f163518e;
    }

    public final float b() {
        return this.d;
    }

    public final String c() {
        return this.f163517c;
    }

    public final List d() {
        return this.f163519f;
    }

    public final String e() {
        return this.f163515a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f163515a, r52.f163515a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f163516b, r52.f163516b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f163517c, r52.f163517c) == true) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L21;
        return false;
    L21:
        if (this.f163518e == r52.f163518e) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f163519f, r52.f163519f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f163516b;
    }

    public int hashCode() {
        return (((((((((this.f163515a.hashCode() * 31) + this.f163516b.hashCode()) * 31) + this.f163517c.hashCode()) * 31) + Float.hashCode(this.d)) * 31) + this.f163518e.hashCode()) * 31) + this.f163519f.hashCode();
    }

    public String toString() {
        return "SubSectorAllocationItemUIState(subSectorName=" + this.f163515a + ", value=" + this.f163516b + ", percentageText=" + this.f163517c + ", percentage=" + this.d + ", color=" + this.f163518e + ", stocks=" + this.f163519f + ")";
    }
}
