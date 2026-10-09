package com.stockbit.domain.model.entity.discover;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f82735a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82736b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82737c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final long f82738e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82739f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82740g;

    /* renamed from: h, reason: collision with root package name */
    public final double f82741h;

    public a(String r2, String r3, String r4, String r5, long r6, String r8, String r9, double r10) {
        p.l(r2, "percent");
        p.l(r3, "symbol");
        p.l(r4, "symbol2");
        p.l(r5, Constants.KEY_ICON);
        p.l(r8, "type");
        p.l(r9, "percentText");
        this.f82735a = r2;
        this.f82736b = r3;
        this.f82737c = r4;
        this.d = r5;
        this.f82738e = r6;
        this.f82739f = r8;
        this.f82740g = r9;
        this.f82741h = r10;
    }

    public final long a() {
        return this.f82738e;
    }

    public final String b() {
        return this.f82737c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f82735a, r82.f82735a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82736b, r82.f82736b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82737c, r82.f82737c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f82738e == r82.f82738e) goto L24;
        return false;
    L24:
        if (p.g(this.f82739f, r82.f82739f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82740g, r82.f82740g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f82741h, r82.f82741h) == 0) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        return (((((((((((((this.f82735a.hashCode() * 31) + this.f82736b.hashCode()) * 31) + this.f82737c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.f82738e)) * 31) + this.f82739f.hashCode()) * 31) + this.f82740g.hashCode()) * 31) + Double.hashCode(this.f82741h);
    }

    public String toString() {
        return "DiscoverMarketSector(percent=" + this.f82735a + ", symbol=" + this.f82736b + ", symbol2=" + this.f82737c + ", icon=" + this.d + ", companyId=" + this.f82738e + ", type=" + this.f82739f + ", percentText=" + this.f82740g + ", percentDouble=" + this.f82741h + ')';
    }

    public /* synthetic */ a(String r2, String r3, String r4, String r5, long r6, String r8, String r9, double r10, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r12 & 128) == 0) goto L26;
        r10 = 0.0d;
    L26:
        double r11 = r10;
        String r102 = r9;
        long r7 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        String r32 = r2;
        this(r32, r42, r52, r62, r7, r8, r102, r11);
    }
}
