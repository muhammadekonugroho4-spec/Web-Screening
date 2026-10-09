package com.stockbit.domain.model.company.analyst;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f81392a;

    /* renamed from: b, reason: collision with root package name */
    public final c f81393b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81394c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f81395e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81396f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81397g;

    public d(String r2, c r3, int r4, int r5, int r6, int r7, String r8) {
        p.l(r2, NotificationCompat.CATEGORY_RECOMMENDATION);
        p.l(r8, "lastUpdated");
        this.f81392a = r2;
        this.f81393b = r3;
        this.f81394c = r4;
        this.d = r5;
        this.f81395e = r6;
        this.f81396f = r7;
        this.f81397g = r8;
    }

    public final String a() {
        return this.f81397g;
    }

    public final c b() {
        return this.f81393b;
    }

    public final String c() {
        return this.f81392a;
    }

    public final int d() {
        return this.f81396f;
    }

    public final int e() {
        return this.f81394c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f81392a, r52.f81392a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81393b, r52.f81393b) == true) goto L15;
        return false;
    L15:
        if (this.f81394c == r52.f81394c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f81395e == r52.f81395e) goto L24;
        return false;
    L24:
        if (this.f81396f == r52.f81396f) goto L27;
        return false;
    L27:
        if (p.g(this.f81397g, r52.f81397g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final int f() {
        return this.f81395e;
    }

    public final int g() {
        return this.d;
    }

    public int hashCode() {
        int r02 = this.f81392a.hashCode() * 31;
        c r1 = this.f81393b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((((r02 + r12) * 31) + Integer.hashCode(this.f81394c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f81395e)) * 31) + Integer.hashCode(this.f81396f)) * 31) + this.f81397g.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "AnalystRatingEntity(recommendation=" + this.f81392a + ", priceTarget=" + this.f81393b + ", totalBuy=" + this.f81394c + ", totalSell=" + this.d + ", totalHold=" + this.f81395e + ", totalAnalystRating=" + this.f81396f + ", lastUpdated=" + this.f81397g + ")";
    }
}
