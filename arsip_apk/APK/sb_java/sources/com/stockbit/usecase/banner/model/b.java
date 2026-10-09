package com.stockbit.usecase.banner.model;

import com.stockbit.usecase.banner.model.type.BannerAlertType;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final BannerAlertType f154397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154398b;

    public b(BannerAlertType r2, String r3) {
        p.l(r2, "alertType");
        p.l(r3, "imageUrl");
        this.f154397a = r2;
        this.f154398b = r3;
    }

    public final BannerAlertType a() {
        return this.f154397a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f154397a == r52.f154397a) goto L12;
        return false;
    L12:
        if (p.g(this.f154398b, r52.f154398b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f154397a.hashCode() * 31) + this.f154398b.hashCode();
    }

    public String toString() {
        return "BannerInfoboxTickerUIState(alertType=" + this.f154397a + ", imageUrl=" + this.f154398b + ")";
    }
}
