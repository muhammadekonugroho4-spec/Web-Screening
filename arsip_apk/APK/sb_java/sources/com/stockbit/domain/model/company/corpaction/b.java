package com.stockbit.domain.model.company.corpaction;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f81446a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81447b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81448c;
    public final boolean d;

    public b(c r2, List r3, String r4, boolean r5) {
        p.l(r2, "corpAction");
        p.l(r3, "notations");
        p.l(r4, "symbol");
        this.f81446a = r2;
        this.f81447b = r3;
        this.f81448c = r4;
        this.d = r5;
    }

    public final c a() {
        return this.f81446a;
    }

    public final List b() {
        return this.f81447b;
    }

    public final String c() {
        return this.f81448c;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f81446a, r52.f81446a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81447b, r52.f81447b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81448c, r52.f81448c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f81446a.hashCode() * 31) + this.f81447b.hashCode()) * 31) + this.f81448c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "CorpActionStatusEntity(corpAction=" + this.f81446a + ", notations=" + this.f81447b + ", symbol=" + this.f81448c + ", uma=" + this.d + ")";
    }
}
