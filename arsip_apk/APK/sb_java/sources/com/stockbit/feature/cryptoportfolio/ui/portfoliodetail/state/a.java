package com.stockbit.feature.cryptoportfolio.ui.portfoliodetail.state;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f94839a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94840b;

    static {
    }

    public a(int r1, String r2) {
        this.f94839a = r1;
        this.f94840b = r2;
    }

    public final String a() {
        return this.f94840b;
    }

    public final int b() {
        return this.f94839a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f94839a == r52.f94839a) goto L12;
        return false;
    L12:
        if (p.g(this.f94840b, r52.f94840b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f94839a) * 31;
        String r1 = this.f94840b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CryptoPortfolioDetailErrorUIData(errorMessageRes=" + this.f94839a + ", dynamicError=" + this.f94840b + ')';
    }

    public /* synthetic */ a(int r1, String r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }
}
