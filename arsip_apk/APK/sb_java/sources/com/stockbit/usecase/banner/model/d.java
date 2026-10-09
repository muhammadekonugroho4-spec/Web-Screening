package com.stockbit.usecase.banner.model;

import com.clevertap.android.sdk.Constants;
import com.stockbit.usecase.banner.model.type.BannerViewType;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f154400a;

    /* renamed from: b, reason: collision with root package name */
    public final a f154401b;

    /* renamed from: c, reason: collision with root package name */
    public final BannerViewType f154402c;
    public final b d;

    public d(String r2, a r3, BannerViewType r4, b r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "content");
        p.l(r4, "viewType");
        p.l(r5, "infoboxTicker");
        this.f154400a = r2;
        this.f154401b = r3;
        this.f154402c = r4;
        this.d = r5;
    }

    public final a a() {
        return this.f154401b;
    }

    public final String b() {
        return this.f154400a;
    }

    public final b c() {
        return this.d;
    }

    public final BannerViewType d() {
        return this.f154402c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f154400a, r52.f154400a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154401b, r52.f154401b) == true) goto L15;
        return false;
    L15:
        if (this.f154402c == r52.f154402c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f154400a.hashCode() * 31) + this.f154401b.hashCode()) * 31) + this.f154402c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BannerUIState(id=" + this.f154400a + ", content=" + this.f154401b + ", viewType=" + this.f154402c + ", infoboxTicker=" + this.d + ")";
    }
}
