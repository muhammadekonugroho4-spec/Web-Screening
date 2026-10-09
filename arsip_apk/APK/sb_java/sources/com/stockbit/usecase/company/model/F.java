package com.stockbit.usecase.company.model;

import java.util.List;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public String f156157a;

    /* renamed from: b, reason: collision with root package name */
    public String f156158b;

    /* renamed from: c, reason: collision with root package name */
    public List f156159c;

    public F(String r2, String r3, List r4) {
        kotlin.jvm.internal.p.l(r2, "fitemId");
        kotlin.jvm.internal.p.l(r3, "fitemName");
        kotlin.jvm.internal.p.l(r4, "ratios");
        this.f156157a = r2;
        this.f156158b = r3;
        this.f156159c = r4;
    }

    public final String a() {
        return this.f156157a;
    }

    public final String b() {
        return this.f156158b;
    }

    public final List c() {
        return this.f156159c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof F) == true) goto L8;
        return false;
    L8:
        F r52 = (F) r5;
        if (kotlin.jvm.internal.p.g(this.f156157a, r52.f156157a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156158b, r52.f156158b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156159c, r52.f156159c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156157a.hashCode() * 31) + this.f156158b.hashCode()) * 31) + this.f156159c.hashCode();
    }

    public String toString() {
        return "MetricItemUIState(fitemId=" + this.f156157a + ", fitemName=" + this.f156158b + ", ratios=" + this.f156159c + ")";
    }
}
