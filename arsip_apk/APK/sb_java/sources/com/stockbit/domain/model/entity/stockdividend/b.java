package com.stockbit.domain.model.entity.stockdividend;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f83588a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83589b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83590c;
    public final String d;

    public b(String r2, String r3, String r4, String r5) {
        p.l(r2, "cum");
        p.l(r3, "ex");
        p.l(r4, "payment");
        p.l(r5, "recording");
        this.f83588a = r2;
        this.f83589b = r3;
        this.f83590c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f83588a;
    }

    public final String b() {
        return this.f83589b;
    }

    public final String c() {
        return this.f83590c;
    }

    public final String d() {
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
        if (p.g(this.f83588a, r52.f83588a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83589b, r52.f83589b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83590c, r52.f83590c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f83588a.hashCode() * 31) + this.f83589b.hashCode()) * 31) + this.f83590c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "StockDividendDate(cum=" + this.f83588a + ", ex=" + this.f83589b + ", payment=" + this.f83590c + ", recording=" + this.d + ')';
    }

    public /* synthetic */ b(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
