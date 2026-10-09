package com.stockbit.usecase.watchlistmain.contract.entity;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f164684a;

    /* renamed from: b, reason: collision with root package name */
    public final String f164685b;

    /* renamed from: c, reason: collision with root package name */
    public final String f164686c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f164687e;

    /* renamed from: f, reason: collision with root package name */
    public final int f164688f;

    /* renamed from: g, reason: collision with root package name */
    public final WatchlistMainGroupCategoryType f164689g;

    public b(String r2, String r3, String r4, boolean r5, boolean r6, int r7, WatchlistMainGroupCategoryType r8) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "emoji");
        p.l(r8, "categoryType");
        this.f164684a = r2;
        this.f164685b = r3;
        this.f164686c = r4;
        this.d = r5;
        this.f164687e = r6;
        this.f164688f = r7;
        this.f164689g = r8;
    }

    public final WatchlistMainGroupCategoryType a() {
        return this.f164689g;
    }

    public final String b() {
        return this.f164684a;
    }

    public final String c() {
        return this.f164685b;
    }

    public final int d() {
        return this.f164688f;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f164684a, r52.f164684a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f164685b, r52.f164685b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f164686c, r52.f164686c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f164687e == r52.f164687e) goto L24;
        return false;
    L24:
        if (this.f164688f == r52.f164688f) goto L27;
        return false;
    L27:
        if (this.f164689g == r52.f164689g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f164687e;
    }

    public int hashCode() {
        return (((((((((((this.f164684a.hashCode() * 31) + this.f164685b.hashCode()) * 31) + this.f164686c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f164687e)) * 31) + Integer.hashCode(this.f164688f)) * 31) + this.f164689g.hashCode();
    }

    public String toString() {
        return "WatchlistMainFavoriteGroupEntity(id=" + this.f164684a + ", name=" + this.f164685b + ", emoji=" + this.f164686c + ", isDefault=" + this.d + ", isFavorite=" + this.f164687e + ", orderPosition=" + this.f164688f + ", categoryType=" + this.f164689g + ")";
    }
}
