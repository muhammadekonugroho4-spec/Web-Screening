package com.stockbit.domains.usecase.tradingaccount.model.tradingprofile;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f88518a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88519b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88520c;
    public final List d;

    public b(String r2, String r3, String r4, List r5) {
        p.l(r2, "relation");
        p.l(r3, "relationName");
        p.l(r4, "income");
        p.l(r5, "additionalIncome");
        this.f88518a = r2;
        this.f88519b = r3;
        this.f88520c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f88520c;
    }

    public final String b() {
        return this.f88518a;
    }

    public final String c() {
        return this.f88519b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f88518a, r52.f88518a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88519b, r52.f88519b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88520c, r52.f88520c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f88518a.hashCode() * 31) + this.f88519b.hashCode()) * 31) + this.f88520c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TradingProfileBeneficiaryUIState(relation=" + this.f88518a + ", relationName=" + this.f88519b + ", income=" + this.f88520c + ", additionalIncome=" + this.d + ")";
    }
}
