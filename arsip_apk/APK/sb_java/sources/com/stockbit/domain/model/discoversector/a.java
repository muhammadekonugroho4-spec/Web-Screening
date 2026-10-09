package com.stockbit.domain.model.discoversector;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f82085a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82086b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82087c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82088e;

    public a(long r2, String r4, String r5, String r6, int r7) {
        p.l(r4, "symbol");
        p.l(r5, "symbol2");
        p.l(r6, Constants.KEY_ICON);
        this.f82085a = r2;
        this.f82086b = r4;
        this.f82087c = r5;
        this.d = r6;
        this.f82088e = r7;
    }

    public final long a() {
        return this.f82085a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f82086b;
    }

    public final String d() {
        return this.f82087c;
    }

    public final int e() {
        return this.f82088e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (this.f82085a == r82.f82085a) goto L12;
        return false;
    L12:
        if (p.g(this.f82086b, r82.f82086b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82087c, r82.f82087c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f82088e == r82.f82088e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f82085a) * 31) + this.f82086b.hashCode()) * 31) + this.f82087c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f82088e);
    }

    public String toString() {
        return "DiscoverSectorEntity(companyId=" + this.f82085a + ", symbol=" + this.f82086b + ", symbol2=" + this.f82087c + ", icon=" + this.d + ", totalStock=" + this.f82088e + ")";
    }
}
