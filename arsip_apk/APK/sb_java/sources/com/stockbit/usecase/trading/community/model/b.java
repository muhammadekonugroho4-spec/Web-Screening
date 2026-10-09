package com.stockbit.usecase.trading.community.model;

import com.stockbit.usecase.trading.community.model.type.BibitRegistrationStatusType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f163255a;

    /* renamed from: b, reason: collision with root package name */
    public final BibitRegistrationStatusType f163256b;

    public b(String r2, BibitRegistrationStatusType r3) {
        p.l(r2, "webviewUrl");
        p.l(r3, "bibitRegistrationStatus");
        this.f163255a = r2;
        this.f163256b = r3;
    }

    public final BibitRegistrationStatusType a() {
        return this.f163256b;
    }

    public final String b() {
        return this.f163255a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f163255a, r52.f163255a) == true) goto L12;
        return false;
    L12:
        if (this.f163256b == r52.f163256b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f163255a.hashCode() * 31) + this.f163256b.hashCode();
    }

    public String toString() {
        return "TradingCommunityActivationUIData(webviewUrl=" + this.f163255a + ", bibitRegistrationStatus=" + this.f163256b + ")";
    }
}
