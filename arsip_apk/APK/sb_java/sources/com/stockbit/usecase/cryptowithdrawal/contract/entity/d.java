package com.stockbit.usecase.cryptowithdrawal.contract.entity;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f157497a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157498b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f157499c;

    public d(String r2, String r3, boolean r4) {
        p.l(r2, "accountNumber");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f157497a = r2;
        this.f157498b = r3;
        this.f157499c = r4;
    }

    public final String a() {
        return this.f157497a;
    }

    public final String b() {
        return this.f157498b;
    }

    public final boolean c() {
        return this.f157499c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f157497a, r52.f157497a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157498b, r52.f157498b) == true) goto L15;
        return false;
    L15:
        if (this.f157499c == r52.f157499c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157497a.hashCode() * 31) + this.f157498b.hashCode()) * 31) + Boolean.hashCode(this.f157499c);
    }

    public String toString() {
        return "CryptoWithdrawalPortfolioEntity(accountNumber=" + this.f157497a + ", name=" + this.f157498b + ", isMainAccount=" + this.f157499c + ")";
    }
}
