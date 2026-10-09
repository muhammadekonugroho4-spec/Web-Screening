package com.stockbit.cryptodetail.ui.detail.state;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f79729a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79730b;

    static {
    }

    public i(int r1, String r2) {
        this.f79729a = r1;
        this.f79730b = r2;
    }

    public final String a() {
        return this.f79730b;
    }

    public final int b() {
        return this.f79729a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f79729a == r52.f79729a) goto L12;
        return false;
    L12:
        if (p.g(this.f79730b, r52.f79730b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f79729a) * 31;
        String r1 = this.f79730b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CryptoProfileErrorUIData(errorMessageRes=" + this.f79729a + ", dynamicError=" + this.f79730b + ')';
    }

    public /* synthetic */ i(int r1, String r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }
}
