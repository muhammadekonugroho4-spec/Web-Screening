package com.stockbit.domain.model.valueobject.sector;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f86935a;

    /* renamed from: b, reason: collision with root package name */
    public String f86936b;

    /* renamed from: c, reason: collision with root package name */
    public String f86937c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public int f86938e;

    public a(long r2, String r4, String r5, String r6, int r7) {
        p.l(r4, "symbol");
        p.l(r5, "symbol2");
        p.l(r6, Constants.KEY_ICON);
        this.f86935a = r2;
        this.f86936b = r4;
        this.f86937c = r5;
        this.d = r6;
        this.f86938e = r7;
    }

    public final long a() {
        return this.f86935a;
    }

    public final String b() {
        return this.f86936b;
    }

    public final int c() {
        return this.f86938e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (this.f86935a == r82.f86935a) goto L12;
        return false;
    L12:
        if (p.g(this.f86936b, r82.f86936b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86937c, r82.f86937c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f86938e == r82.f86938e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f86935a) * 31) + this.f86936b.hashCode()) * 31) + this.f86937c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f86938e);
    }

    public String toString() {
        return "DiscoverSectorItem(companyid=" + this.f86935a + ", symbol=" + this.f86936b + ", symbol2=" + this.f86937c + ", icon=" + this.d + ", totalStock=" + this.f86938e + ')';
    }
}
