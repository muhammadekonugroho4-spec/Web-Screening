package com.stockbit.feature.cryptoorder.ui.state;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f94617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94618b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94619c;

    static {
    }

    public i(int r2, String r3, String r4) {
        p.l(r3, "labelBoldSuffix");
        p.l(r4, "value");
        this.f94617a = r2;
        this.f94618b = r3;
        this.f94619c = r4;
    }

    public final String a() {
        return this.f94618b;
    }

    public final int b() {
        return this.f94617a;
    }

    public final String c() {
        return this.f94619c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f94617a == r52.f94617a) goto L12;
        return false;
    L12:
        if (p.g(this.f94618b, r52.f94618b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f94619c, r52.f94619c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f94617a) * 31) + this.f94618b.hashCode()) * 31) + this.f94619c.hashCode();
    }

    public String toString() {
        return "CryptoOrderPortfolioSectionUIData(labelPrefixRes=" + this.f94617a + ", labelBoldSuffix=" + this.f94618b + ", value=" + this.f94619c + ')';
    }
}
