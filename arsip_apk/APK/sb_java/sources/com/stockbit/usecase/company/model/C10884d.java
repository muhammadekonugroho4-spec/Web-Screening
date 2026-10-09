package com.stockbit.usecase.company.model;

import androidx.core.app.NotificationCompat;

/* renamed from: com.stockbit.usecase.company.model.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10884d {

    /* renamed from: a, reason: collision with root package name */
    public final String f156205a;

    /* renamed from: b, reason: collision with root package name */
    public final C10883c f156206b;

    /* renamed from: c, reason: collision with root package name */
    public final int f156207c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f156208e;

    /* renamed from: f, reason: collision with root package name */
    public final int f156209f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156210g;

    public C10884d(String r2, C10883c r3, int r4, int r5, int r6, int r7, String r8) {
        kotlin.jvm.internal.p.l(r2, NotificationCompat.CATEGORY_RECOMMENDATION);
        kotlin.jvm.internal.p.l(r3, "priceTarget");
        kotlin.jvm.internal.p.l(r8, "lastUpdated");
        this.f156205a = r2;
        this.f156206b = r3;
        this.f156207c = r4;
        this.d = r5;
        this.f156208e = r6;
        this.f156209f = r7;
        this.f156210g = r8;
    }

    public final String a() {
        return this.f156210g;
    }

    public final C10883c b() {
        return this.f156206b;
    }

    public final String c() {
        return this.f156205a;
    }

    public final int d() {
        return this.f156209f;
    }

    public final int e() {
        return this.f156207c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10884d) == true) goto L8;
        return false;
    L8:
        C10884d r52 = (C10884d) r5;
        if (kotlin.jvm.internal.p.g(this.f156205a, r52.f156205a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156206b, r52.f156206b) == true) goto L15;
        return false;
    L15:
        if (this.f156207c == r52.f156207c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f156208e == r52.f156208e) goto L24;
        return false;
    L24:
        if (this.f156209f == r52.f156209f) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f156210g, r52.f156210g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final int f() {
        return this.f156208e;
    }

    public final int g() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((this.f156205a.hashCode() * 31) + this.f156206b.hashCode()) * 31) + Integer.hashCode(this.f156207c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f156208e)) * 31) + Integer.hashCode(this.f156209f)) * 31) + this.f156210g.hashCode();
    }

    public String toString() {
        return "AnalystRatingUIState(recommendation=" + this.f156205a + ", priceTarget=" + this.f156206b + ", totalBuy=" + this.f156207c + ", totalSell=" + this.d + ", totalHold=" + this.f156208e + ", totalAnalystRating=" + this.f156209f + ", lastUpdated=" + this.f156210g + ")";
    }
}
