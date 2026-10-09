package com.stockbit.usecase.emittenclassification.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f157576a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f157577b;

    /* renamed from: c, reason: collision with root package name */
    public final int f157578c;

    public a(List r2, boolean r3, int r4) {
        p.l(r2, "companies");
        this.f157576a = r2;
        this.f157577b = r3;
        this.f157578c = r4;
    }

    public final List a() {
        return this.f157576a;
    }

    public final boolean b() {
        return this.f157577b;
    }

    public final int c() {
        return this.f157578c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f157576a, r52.f157576a) == true) goto L12;
        return false;
    L12:
        if (this.f157577b == r52.f157577b) goto L15;
        return false;
    L15:
        if (this.f157578c == r52.f157578c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157576a.hashCode() * 31) + Boolean.hashCode(this.f157577b)) * 31) + Integer.hashCode(this.f157578c);
    }

    public String toString() {
        return "EmittenClassificationPageResult(companies=" + this.f157576a + ", hasNextPage=" + this.f157577b + ", totalData=" + this.f157578c + ")";
    }
}
