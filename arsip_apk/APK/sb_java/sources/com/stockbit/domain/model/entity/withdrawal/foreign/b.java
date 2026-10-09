package com.stockbit.domain.model.entity.withdrawal.foreign;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f83949a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83950b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83951c;

    public b(String r2, String r3, String r4) {
        p.l(r2, "code");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "nameFormatted");
        this.f83949a = r2;
        this.f83950b = r3;
        this.f83951c = r4;
    }

    public final String a() {
        return this.f83949a;
    }

    public final String b() {
        return this.f83951c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f83949a, r52.f83949a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83950b, r52.f83950b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83951c, r52.f83951c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f83949a.hashCode() * 31) + this.f83950b.hashCode()) * 31) + this.f83951c.hashCode();
    }

    public String toString() {
        return "WithdrawalForeignBankRulesCurrency(code=" + this.f83949a + ", name=" + this.f83950b + ", nameFormatted=" + this.f83951c + ')';
    }
}
