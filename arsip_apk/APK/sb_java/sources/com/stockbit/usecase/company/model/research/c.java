package com.stockbit.usecase.company.model.research;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f156564a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156565b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156566c;

    public c(String r2, String r3, String r4) {
        p.l(r2, "url");
        p.l(r3, "symbol");
        p.l(r4, "username");
        this.f156564a = r2;
        this.f156565b = r3;
        this.f156566c = r4;
    }

    public final String a() {
        return this.f156565b;
    }

    public final String b() {
        return this.f156564a;
    }

    public final String c() {
        return this.f156566c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f156564a, r52.f156564a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156565b, r52.f156565b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156566c, r52.f156566c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156564a.hashCode() * 31) + this.f156565b.hashCode()) * 31) + this.f156566c.hashCode();
    }

    public String toString() {
        return "MaskedTextRefUIState(url=" + this.f156564a + ", symbol=" + this.f156565b + ", username=" + this.f156566c + ")";
    }
}
