package com.stockbit.domain.model.topstock;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85873a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85874b;

    public a(String r2, String r3) {
        p.l(r2, "formatted");
        p.l(r3, "raw");
        this.f85873a = r2;
        this.f85874b = r3;
    }

    public final String a() {
        return this.f85873a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f85873a, r52.f85873a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85874b, r52.f85874b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85873a.hashCode() * 31) + this.f85874b.hashCode();
    }

    public String toString() {
        return "FormattedRawDataEntity(formatted=" + this.f85873a + ", raw=" + this.f85874b + ")";
    }
}
