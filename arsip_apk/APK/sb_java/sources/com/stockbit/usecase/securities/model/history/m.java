package com.stockbit.usecase.securities.model.history;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f160813a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160814b;

    /* renamed from: c, reason: collision with root package name */
    public final RealizedGainType f160815c;

    public m(String r2, String r3, RealizedGainType r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, "monthlyGain");
        kotlin.jvm.internal.p.l(r4, "gainType");
        this.f160813a = r2;
        this.f160814b = r3;
        this.f160815c = r4;
    }

    public final String a() {
        return this.f160813a;
    }

    public final String b() {
        return this.f160814b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f160813a, r52.f160813a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160814b, r52.f160814b) == true) goto L15;
        return false;
    L15:
        if (this.f160815c == r52.f160815c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f160813a.hashCode() * 31) + this.f160814b.hashCode()) * 31) + this.f160815c.hashCode();
    }

    public String toString() {
        return "RealizedDateUIState(date=" + this.f160813a + ", monthlyGain=" + this.f160814b + ", gainType=" + this.f160815c + ")";
    }
}
