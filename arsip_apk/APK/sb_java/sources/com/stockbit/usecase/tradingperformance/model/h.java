package com.stockbit.usecase.tradingperformance.model;

import com.clevertap.android.sdk.Constants;
import java.util.List;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f163485a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163486b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163487c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final SubSectorAllocationColorUIType f163488e;

    /* renamed from: f, reason: collision with root package name */
    public final List f163489f;

    public h(String r2, String r3, String r4, float r5, SubSectorAllocationColorUIType r6, List r7) {
        kotlin.jvm.internal.p.l(r2, "subSectorName");
        kotlin.jvm.internal.p.l(r3, "value");
        kotlin.jvm.internal.p.l(r4, "percentageText");
        kotlin.jvm.internal.p.l(r6, Constants.KEY_COLOR);
        kotlin.jvm.internal.p.l(r7, "others");
        this.f163485a = r2;
        this.f163486b = r3;
        this.f163487c = r4;
        this.d = r5;
        this.f163488e = r6;
        this.f163489f = r7;
    }

    public final SubSectorAllocationColorUIType a() {
        return this.f163488e;
    }

    public final List b() {
        return this.f163489f;
    }

    public final float c() {
        return this.d;
    }

    public final String d() {
        return this.f163487c;
    }

    public final String e() {
        return this.f163485a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f163485a, r52.f163485a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f163486b, r52.f163486b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f163487c, r52.f163487c) == true) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L21;
        return false;
    L21:
        if (this.f163488e == r52.f163488e) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f163489f, r52.f163489f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f163486b;
    }

    public final boolean g() {
        return !this.f163489f.isEmpty();
    }

    public int hashCode() {
        return (((((((((this.f163485a.hashCode() * 31) + this.f163486b.hashCode()) * 31) + this.f163487c.hashCode()) * 31) + Float.hashCode(this.d)) * 31) + this.f163488e.hashCode()) * 31) + this.f163489f.hashCode();
    }

    public String toString() {
        return "OtherSubSectorAllocationItemUIState(subSectorName=" + this.f163485a + ", value=" + this.f163486b + ", percentageText=" + this.f163487c + ", percentage=" + this.d + ", color=" + this.f163488e + ", others=" + this.f163489f + ")";
    }
}
