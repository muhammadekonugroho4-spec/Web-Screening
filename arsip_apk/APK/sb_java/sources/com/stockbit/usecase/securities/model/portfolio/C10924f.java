package com.stockbit.usecase.securities.model.portfolio;

import java.util.List;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10924f {

    /* renamed from: a, reason: collision with root package name */
    public final String f161734a;

    /* renamed from: b, reason: collision with root package name */
    public final List f161735b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f161736c;
    public final boolean d;

    public C10924f(String r2, List r3, boolean r4, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "notation");
        this.f161734a = r2;
        this.f161735b = r3;
        this.f161736c = r4;
        this.d = r5;
    }

    public final boolean a() {
        return this.d;
    }

    public final List b() {
        return this.f161735b;
    }

    public final String c() {
        return this.f161734a;
    }

    public final boolean d() {
        return this.f161736c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10924f) == true) goto L8;
        return false;
    L8:
        C10924f r52 = (C10924f) r5;
        if (kotlin.jvm.internal.p.g(this.f161734a, r52.f161734a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161735b, r52.f161735b) == true) goto L15;
        return false;
    L15:
        if (this.f161736c == r52.f161736c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f161734a.hashCode() * 31) + this.f161735b.hashCode()) * 31) + Boolean.hashCode(this.f161736c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "CorpActionUIState(symbol=" + this.f161734a + ", notation=" + this.f161735b + ", isUma=" + this.f161736c + ", hasCorpAction=" + this.d + ")";
    }
}
