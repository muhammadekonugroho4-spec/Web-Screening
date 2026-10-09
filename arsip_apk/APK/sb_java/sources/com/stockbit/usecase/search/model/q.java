package com.stockbit.usecase.search.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.usecase.search.type.SearchItemViewType;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f160046a;

    /* renamed from: b, reason: collision with root package name */
    public final long f160047b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160048c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160049e;

    /* renamed from: f, reason: collision with root package name */
    public final String f160050f;

    /* renamed from: g, reason: collision with root package name */
    public final String f160051g;

    /* renamed from: h, reason: collision with root package name */
    public final String f160052h;

    /* renamed from: i, reason: collision with root package name */
    public final String f160053i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f160054j;

    /* renamed from: k, reason: collision with root package name */
    public final SearchItemViewType f160055k;

    public q(long r2, long r4, String r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13, SearchItemViewType r14) {
        kotlin.jvm.internal.p.l(r6, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r7, "profileImage");
        kotlin.jvm.internal.p.l(r8, "companyImage");
        kotlin.jvm.internal.p.l(r9, "keyword");
        kotlin.jvm.internal.p.l(r10, "url");
        kotlin.jvm.internal.p.l(r11, "symbol");
        kotlin.jvm.internal.p.l(r12, "market");
        kotlin.jvm.internal.p.l(r14, "type");
        this.f160046a = r2;
        this.f160047b = r4;
        this.f160048c = r6;
        this.d = r7;
        this.f160049e = r8;
        this.f160050f = r9;
        this.f160051g = r10;
        this.f160052h = r11;
        this.f160053i = r12;
        this.f160054j = r13;
        this.f160055k = r14;
    }

    public final String a() {
        return this.f160049e;
    }

    public final long b() {
        return this.f160047b;
    }

    public final String c() {
        return this.f160050f;
    }

    public final String d() {
        return this.f160053i;
    }

    public final String e() {
        return this.f160048c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof q) == true) goto L8;
        return false;
    L8:
        q r82 = (q) r8;
        if (this.f160046a == r82.f160046a) goto L12;
        return false;
    L12:
        if (this.f160047b == r82.f160047b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f160048c, r82.f160048c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f160049e, r82.f160049e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f160050f, r82.f160050f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f160051g, r82.f160051g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f160052h, r82.f160052h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f160053i, r82.f160053i) == true) goto L36;
        return false;
    L36:
        if (this.f160054j == r82.f160054j) goto L39;
        return false;
    L39:
        if (this.f160055k == r82.f160055k) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final long g() {
        return this.f160046a;
    }

    public final String h() {
        return this.f160052h;
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.f160046a) * 31) + Long.hashCode(this.f160047b)) * 31) + this.f160048c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160049e.hashCode()) * 31) + this.f160050f.hashCode()) * 31) + this.f160051g.hashCode()) * 31) + this.f160052h.hashCode()) * 31) + this.f160053i.hashCode()) * 31) + Boolean.hashCode(this.f160054j)) * 31) + this.f160055k.hashCode();
    }

    public final SearchItemViewType i() {
        return this.f160055k;
    }

    public final String j() {
        return this.f160051g;
    }

    public final boolean k() {
        return this.f160054j;
    }

    public String toString() {
        return "RecentSearch(searchId=" + this.f160046a + ", itemId=" + this.f160047b + ", name=" + this.f160048c + ", profileImage=" + this.d + ", companyImage=" + this.f160049e + ", keyword=" + this.f160050f + ", url=" + this.f160051g + ", symbol=" + this.f160052h + ", market=" + this.f160053i + ", isOfficial=" + this.f160054j + ", type=" + this.f160055k + ")";
    }
}
