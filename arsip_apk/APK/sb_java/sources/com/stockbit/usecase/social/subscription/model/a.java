package com.stockbit.usecase.social.subscription.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a implements com.stockbit.googlebilling.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f162980a;

    /* renamed from: b, reason: collision with root package name */
    public final String f162981b;

    public a(String r2, String r3) {
        p.l(r2, "googleId");
        p.l(r3, "localizedPrice");
        this.f162980a = r2;
        this.f162981b = r3;
    }

    public String a() {
        return this.f162980a;
    }

    public String b() {
        return this.f162981b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f162980a, r52.f162980a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f162981b, r52.f162981b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f162980a.hashCode() * 31) + this.f162981b.hashCode();
    }

    public String toString() {
        return "SocialSubscriptionGoogleUIState(googleId=" + this.f162980a + ", localizedPrice=" + this.f162981b + ')';
    }
}
