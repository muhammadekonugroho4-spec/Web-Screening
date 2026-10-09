package com.stockbit.usecase.discover.sector.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f157536a;

    /* renamed from: b, reason: collision with root package name */
    public String f157537b;

    /* renamed from: c, reason: collision with root package name */
    public String f157538c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public int f157539e;

    public a(long r2, String r4, String r5, String r6, int r7) {
        p.l(r4, "symbol");
        p.l(r5, "symbol2");
        p.l(r6, Constants.KEY_ICON);
        this.f157536a = r2;
        this.f157537b = r4;
        this.f157538c = r5;
        this.d = r6;
        this.f157539e = r7;
    }

    public final long a() {
        return this.f157536a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f157537b;
    }

    public final String d() {
        return this.f157538c;
    }

    public final int e() {
        return this.f157539e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (this.f157536a == r82.f157536a) goto L12;
        return false;
    L12:
        if (p.g(this.f157537b, r82.f157537b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157538c, r82.f157538c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f157539e == r82.f157539e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f157536a) * 31) + this.f157537b.hashCode()) * 31) + this.f157538c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f157539e);
    }

    public String toString() {
        return "DiscoverSectorUIState(companyId=" + this.f157536a + ", symbol=" + this.f157537b + ", symbol2=" + this.f157538c + ", icon=" + this.d + ", totalStock=" + this.f157539e + ")";
    }
}
