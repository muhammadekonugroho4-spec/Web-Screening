package com.stockbit.usecase.social.subscription.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.usecase.social.subscription.model.type.SocialSubscriptionUIType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f162986a;

    /* renamed from: b, reason: collision with root package name */
    public final String f162987b;

    /* renamed from: c, reason: collision with root package name */
    public final String f162988c;
    public final SocialSubscriptionUIType d;

    public d(String r2, String r3, String r4, SocialSubscriptionUIType r5) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "code");
        p.l(r4, "formattedPrice");
        p.l(r5, "productType");
        this.f162986a = r2;
        this.f162987b = r3;
        this.f162988c = r4;
        this.d = r5;
    }

    public static /* synthetic */ d b(d r02, String r1, String r2, String r3, SocialSubscriptionUIType r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f162986a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f162987b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f162988c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final d a(String r2, String r3, String r4, SocialSubscriptionUIType r5) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "code");
        p.l(r4, "formattedPrice");
        p.l(r5, "productType");
        return new d(r2, r3, r4, r5);
    }

    public final String c() {
        return this.f162988c;
    }

    public final SocialSubscriptionUIType d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f162986a, r52.f162986a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f162987b, r52.f162987b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f162988c, r52.f162988c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f162986a.hashCode() * 31) + this.f162987b.hashCode()) * 31) + this.f162988c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "SocialSubscriptionProductUIState(name=" + this.f162986a + ", code=" + this.f162987b + ", formattedPrice=" + this.f162988c + ", productType=" + this.d + ')';
    }
}
