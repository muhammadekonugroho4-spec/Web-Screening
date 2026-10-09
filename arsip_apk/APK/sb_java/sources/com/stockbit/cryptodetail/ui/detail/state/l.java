package com.stockbit.cryptodetail.ui.detail.state;

import com.stockbit.cryptodetail.ui.detail.B0;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final B0 f79745a;

    /* renamed from: b, reason: collision with root package name */
    public final int f79746b;

    static {
    }

    public l(B0 r2, int r3) {
        p.l(r2, "tableData");
        this.f79745a = r2;
        this.f79746b = r3;
    }

    public static /* synthetic */ l b(l r02, B0 r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f79745a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f79746b;
    L9:
        return r02.a(r1, r2);
    }

    public final l a(B0 r2, int r3) {
        p.l(r2, "tableData");
        return new l(r2, r3);
    }

    public final int c() {
        return this.f79746b;
    }

    public final B0 d() {
        return this.f79745a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (p.g(this.f79745a, r52.f79745a) == true) goto L12;
        return false;
    L12:
        if (this.f79746b == r52.f79746b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f79745a.hashCode() * 31) + Integer.hashCode(this.f79746b);
    }

    public String toString() {
        return "CryptoSeasonalityUIData(tableData=" + this.f79745a + ", selectedBackYear=" + this.f79746b + ')';
    }
}
