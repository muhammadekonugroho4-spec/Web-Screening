package com.stockbit.domain.model.socialsubscription;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f85814a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85815b;

    public b(String r2, boolean r3) {
        p.l(r2, "expirationDate");
        super(null);
        this.f85814a = r2;
        this.f85815b = r3;
    }

    public final String a() {
        return this.f85814a;
    }

    public final boolean b() {
        return this.f85815b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f85814a, r52.f85814a) == true) goto L12;
        return false;
    L12:
        if (this.f85815b == r52.f85815b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85814a.hashCode() * 31) + Boolean.hashCode(this.f85815b);
    }

    public String toString() {
        return "SocialSubscriptionHistorySubscriptionEntity(expirationDate=" + this.f85814a + ", isLifetime=" + this.f85815b + ")";
    }
}
