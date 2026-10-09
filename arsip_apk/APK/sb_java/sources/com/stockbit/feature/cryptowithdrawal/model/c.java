package com.stockbit.feature.cryptowithdrawal.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f96251a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96252b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f96253c;

    static {
    }

    public c(String r2, String r3, boolean r4) {
        p.l(r2, "accountNumber");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f96251a = r2;
        this.f96252b = r3;
        this.f96253c = r4;
    }

    public final String a() {
        return this.f96251a;
    }

    public final String b() {
        return this.f96252b;
    }

    public final boolean c() {
        return this.f96253c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f96251a, r52.f96251a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f96252b, r52.f96252b) == true) goto L15;
        return false;
    L15:
        if (this.f96253c == r52.f96253c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f96251a.hashCode() * 31) + this.f96252b.hashCode()) * 31) + Boolean.hashCode(this.f96253c);
    }

    public String toString() {
        return "CryptoWithdrawalPortfolioItem(accountNumber=" + this.f96251a + ", name=" + this.f96252b + ", isMainAccount=" + this.f96253c + ')';
    }
}
