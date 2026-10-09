package com.stockbit.usecase.chat.model.search;

import com.stockbit.search.SearchEntryPoint;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f155640a;

    /* renamed from: b, reason: collision with root package name */
    public final List f155641b;

    /* renamed from: c, reason: collision with root package name */
    public final List f155642c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final c f155643e;

    public f(List r2, List r3, List r4, List r5, c r6) {
        p.l(r2, "company");
        p.l(r3, SearchEntryPoint.KEY_SECTOR);
        p.l(r4, "insider");
        p.l(r5, "people");
        p.l(r6, "pagination");
        this.f155640a = r2;
        this.f155641b = r3;
        this.f155642c = r4;
        this.d = r5;
        this.f155643e = r6;
    }

    public final List a() {
        return this.f155640a;
    }

    public final List b() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f155640a, r52.f155640a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155641b, r52.f155641b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155642c, r52.f155642c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f155643e, r52.f155643e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f155640a.hashCode() * 31) + this.f155641b.hashCode()) * 31) + this.f155642c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f155643e.hashCode();
    }

    public String toString() {
        return "SearchUIState(company=" + this.f155640a + ", sector=" + this.f155641b + ", insider=" + this.f155642c + ", people=" + this.d + ", pagination=" + this.f155643e + ")";
    }
}
