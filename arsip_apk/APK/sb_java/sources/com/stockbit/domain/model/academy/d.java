package com.stockbit.domain.model.academy;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f80551a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80552b;

    public d(String r2, String r3) {
        p.l(r2, "href");
        p.l(r3, "symbolCompany");
        this.f80551a = r2;
        this.f80552b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f80551a, r52.f80551a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80552b, r52.f80552b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80551a.hashCode() * 31) + this.f80552b.hashCode();
    }

    public String toString() {
        return "UnboxingMaskAttrEntity(href=" + this.f80551a + ", symbolCompany=" + this.f80552b + ")";
    }
}
