package com.stockbit.domain.model.emitten;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f82247a;

    /* renamed from: b, reason: collision with root package name */
    public String f82248b;

    /* renamed from: c, reason: collision with root package name */
    public String f82249c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f82250e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f82251f;

    public e(String r2, String r3, String r4, String r5, String r6, boolean r7) {
        p.l(r2, "catalogName");
        p.l(r3, "companySymbol");
        p.l(r4, "companyType");
        p.l(r5, Constants.KEY_ID);
        p.l(r6, "parent");
        this.f82247a = r2;
        this.f82248b = r3;
        this.f82249c = r4;
        this.d = r5;
        this.f82250e = r6;
        this.f82251f = r7;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f82247a, r52.f82247a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82248b, r52.f82248b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82249c, r52.f82249c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82250e, r52.f82250e) == true) goto L24;
        return false;
    L24:
        if (this.f82251f == r52.f82251f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f82247a.hashCode() * 31) + this.f82248b.hashCode()) * 31) + this.f82249c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82250e.hashCode()) * 31) + Boolean.hashCode(this.f82251f);
    }

    public String toString() {
        return "EmittenInfoCatalogEntity(catalogName=" + this.f82247a + ", companySymbol=" + this.f82248b + ", companyType=" + this.f82249c + ", id=" + this.d + ", parent=" + this.f82250e + ", show=" + this.f82251f + ")";
    }
}
