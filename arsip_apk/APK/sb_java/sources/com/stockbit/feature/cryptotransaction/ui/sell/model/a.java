package com.stockbit.feature.cryptotransaction.ui.sell.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f96057a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96058b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96059c;

    static {
    }

    public a(b r2, boolean r3, long r4) {
        p.l(r2, "orderPreview");
        this.f96057a = r2;
        this.f96058b = r3;
        this.f96059c = r4;
    }

    public final b a() {
        return this.f96057a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f96057a, r82.f96057a) == true) goto L12;
        return false;
    L12:
        if (this.f96058b == r82.f96058b) goto L15;
        return false;
    L15:
        if (this.f96059c == r82.f96059c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f96057a.hashCode() * 31) + Boolean.hashCode(this.f96058b)) * 31) + Long.hashCode(this.f96059c);
    }

    public String toString() {
        return "CryptoSellOrderPreviewSession(orderPreview=" + this.f96057a + ", isFormulaAvailable=" + this.f96058b + ", nonce=" + this.f96059c + ')';
    }

    public /* synthetic */ a(b r1, boolean r2, long r3, int r5, i r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = true;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r3 = System.nanoTime();
    L8:
        this(r1, r2, r3);
    }
}
