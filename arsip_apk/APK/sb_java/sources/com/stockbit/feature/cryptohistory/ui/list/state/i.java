package com.stockbit.feature.cryptohistory.ui.list.state;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f94080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94081b;

    static {
    }

    public i(boolean r2, String r3) {
        p.l(r3, "amountLabel");
        this.f94080a = r2;
        this.f94081b = r3;
    }

    public final String a() {
        return this.f94081b;
    }

    public final boolean b() {
        return this.f94080a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f94080a == r52.f94080a) goto L12;
        return false;
    L12:
        if (p.g(this.f94081b, r52.f94081b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f94080a) * 31) + this.f94081b.hashCode();
    }

    public String toString() {
        return "CryptoRealizedSummaryUIData(isGain=" + this.f94080a + ", amountLabel=" + this.f94081b + ')';
    }
}
