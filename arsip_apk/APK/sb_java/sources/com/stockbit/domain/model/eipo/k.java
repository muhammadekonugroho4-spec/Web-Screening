package com.stockbit.domain.model.eipo;

import com.stockbit.eipo.EipoEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f82199a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82200b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82201c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82202e;

    public k(String r2, String r3, String r4, String r5, int r6) {
        p.l(r2, EipoEntryPoint.EXTRA_EMITEN_CODE);
        p.l(r3, "companyName");
        p.l(r4, "companyLogo");
        p.l(r5, "imageUrl");
        this.f82199a = r2;
        this.f82200b = r3;
        this.f82201c = r4;
        this.d = r5;
        this.f82202e = r6;
    }

    public final String a() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f82199a, r52.f82199a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82200b, r52.f82200b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82201c, r52.f82201c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f82202e == r52.f82202e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f82199a.hashCode() * 31) + this.f82200b.hashCode()) * 31) + this.f82201c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f82202e);
    }

    public String toString() {
        return "EIpoUnboxingEntity(emitenCode=" + this.f82199a + ", companyName=" + this.f82200b + ", companyLogo=" + this.f82201c + ", imageUrl=" + this.d + ", page=" + this.f82202e + ")";
    }
}
