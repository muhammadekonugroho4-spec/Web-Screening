package com.stockbit.domain.model.company.comparison;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f81439a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81440b;

    /* renamed from: c, reason: collision with root package name */
    public final List f81441c;

    public e(String r2, String r3, List r4) {
        p.l(r2, "fitemId");
        p.l(r3, "fitemName");
        p.l(r4, "ratios");
        this.f81439a = r2;
        this.f81440b = r3;
        this.f81441c = r4;
    }

    public final String a() {
        return this.f81439a;
    }

    public final String b() {
        return this.f81440b;
    }

    public final List c() {
        return this.f81441c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f81439a, r52.f81439a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81440b, r52.f81440b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81441c, r52.f81441c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81439a.hashCode() * 31) + this.f81440b.hashCode()) * 31) + this.f81441c.hashCode();
    }

    public String toString() {
        return "MetricItemEntity(fitemId=" + this.f81439a + ", fitemName=" + this.f81440b + ", ratios=" + this.f81441c + ")";
    }
}
