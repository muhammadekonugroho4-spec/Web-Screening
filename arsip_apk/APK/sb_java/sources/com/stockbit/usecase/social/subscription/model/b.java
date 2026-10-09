package com.stockbit.usecase.social.subscription.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final String f162982a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f162983b;

    public b(String r2, boolean r3) {
        p.l(r2, "expirationDate");
        super(null);
        this.f162982a = r2;
        this.f162983b = r3;
    }

    public final String a() {
        return this.f162982a;
    }

    public final boolean b() {
        return this.f162983b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f162982a, r52.f162982a) == true) goto L12;
        return false;
    L12:
        if (this.f162983b == r52.f162983b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f162982a.hashCode() * 31) + Boolean.hashCode(this.f162983b);
    }

    public String toString() {
        return "SocialSubscriptionHistorySubscriptionUIState(expirationDate=" + this.f162982a + ", isLifetime=" + this.f162983b + ')';
    }
}
