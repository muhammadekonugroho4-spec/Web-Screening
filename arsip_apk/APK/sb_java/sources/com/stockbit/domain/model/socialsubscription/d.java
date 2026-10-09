package com.stockbit.domain.model.socialsubscription;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f85825a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85826b;

    public d(String r2, String r3) {
        p.l(r2, "code");
        p.l(r3, "expirationDate");
        this.f85825a = r2;
        this.f85826b = r3;
    }

    public final String a() {
        return this.f85825a;
    }

    public final String b() {
        return this.f85826b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f85825a, r52.f85825a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85826b, r52.f85826b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85825a.hashCode() * 31) + this.f85826b.hashCode();
    }

    public String toString() {
        return "SocialSubscriptionVerifyEntity(code=" + this.f85825a + ", expirationDate=" + this.f85826b + ")";
    }
}
