package com.stockbit.feature.cryptoorder.ui.state;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f94578a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94579b;

    static {
    }

    public a(int r1, String r2) {
        this.f94578a = r1;
        this.f94579b = r2;
    }

    public final String a() {
        return this.f94579b;
    }

    public final int b() {
        return this.f94578a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f94578a == r52.f94578a) goto L12;
        return false;
    L12:
        if (p.g(this.f94579b, r52.f94579b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f94578a) * 31;
        String r1 = this.f94579b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CryptoOrderDetailErrorUIData(errorMessageRes=" + this.f94578a + ", dynamicError=" + this.f94579b + ')';
    }
}
