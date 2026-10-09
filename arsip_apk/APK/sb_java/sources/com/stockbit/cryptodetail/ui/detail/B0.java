package com.stockbit.cryptodetail.ui.detail;

import java.util.List;

/* loaded from: classes8.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f79194a;

    /* renamed from: b, reason: collision with root package name */
    public final List f79195b;

    static {
    }

    public B0(List r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "columnHeaders");
        kotlin.jvm.internal.p.l(r3, "rows");
        this.f79194a = r2;
        this.f79195b = r3;
    }

    public final List a() {
        return this.f79194a;
    }

    public final List b() {
        return this.f79195b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof B0) == true) goto L8;
        return false;
    L8:
        B0 r52 = (B0) r5;
        if (kotlin.jvm.internal.p.g(this.f79194a, r52.f79194a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f79195b, r52.f79195b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f79194a.hashCode() * 31) + this.f79195b.hashCode();
    }

    public String toString() {
        return "SeasonalityTableData(columnHeaders=" + this.f79194a + ", rows=" + this.f79195b + ')';
    }
}
