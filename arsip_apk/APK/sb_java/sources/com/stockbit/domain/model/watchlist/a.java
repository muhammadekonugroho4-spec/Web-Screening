package com.stockbit.domain.model.watchlist;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87218a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87219b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87220c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final int f87221e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f87222f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87223g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f87224h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f87225i;

    /* renamed from: j, reason: collision with root package name */
    public final int f87226j;

    /* renamed from: k, reason: collision with root package name */
    public final String f87227k;

    public a(String r2, String r3, String r4, boolean r5, int r6, boolean r7, String r8, boolean r9, boolean r10, int r11, String r12) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "description");
        p.l(r8, "emoji");
        p.l(r12, "type");
        this.f87218a = r2;
        this.f87219b = r3;
        this.f87220c = r4;
        this.d = r5;
        this.f87221e = r6;
        this.f87222f = r7;
        this.f87223g = r8;
        this.f87224h = r9;
        this.f87225i = r10;
        this.f87226j = r11;
        this.f87227k = r12;
    }

    public final String a() {
        return this.f87218a;
    }

    public final String b() {
        return this.f87219b;
    }

    public final int c() {
        return this.f87226j;
    }

    public final int d() {
        return this.f87221e;
    }

    public final String e() {
        return this.f87227k;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f87218a, r52.f87218a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87219b, r52.f87219b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87220c, r52.f87220c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f87221e == r52.f87221e) goto L24;
        return false;
    L24:
        if (this.f87222f == r52.f87222f) goto L27;
        return false;
    L27:
        if (p.g(this.f87223g, r52.f87223g) == true) goto L30;
        return false;
    L30:
        if (this.f87224h == r52.f87224h) goto L33;
        return false;
    L33:
        if (this.f87225i == r52.f87225i) goto L36;
        return false;
    L36:
        if (this.f87226j == r52.f87226j) goto L39;
        return false;
    L39:
        if (p.g(this.f87227k, r52.f87227k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final boolean f() {
        return this.f87222f;
    }

    public final boolean g() {
        return this.f87225i;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f87218a.hashCode() * 31) + this.f87219b.hashCode()) * 31) + this.f87220c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Integer.hashCode(this.f87221e)) * 31) + Boolean.hashCode(this.f87222f)) * 31) + this.f87223g.hashCode()) * 31) + Boolean.hashCode(this.f87224h)) * 31) + Boolean.hashCode(this.f87225i)) * 31) + Integer.hashCode(this.f87226j)) * 31) + this.f87227k.hashCode();
    }

    public String toString() {
        return "WatchlistGroupEntity(id=" + this.f87218a + ", name=" + this.f87219b + ", description=" + this.f87220c + ", isFollowed=" + this.d + ", totalItems=" + this.f87221e + ", isDefault=" + this.f87222f + ", emoji=" + this.f87223g + ", containsGivenItem=" + this.f87224h + ", isFavorite=" + this.f87225i + ", orderPosition=" + this.f87226j + ", type=" + this.f87227k + ")";
    }
}
