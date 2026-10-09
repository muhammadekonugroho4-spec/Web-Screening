package com.stockbit.feature.cryptotransaction.ui.buy.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f95715a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f95716b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95717c;

    static {
    }

    public a(b r2, boolean r3, long r4) {
        p.l(r2, "orderPreview");
        this.f95715a = r2;
        this.f95716b = r3;
        this.f95717c = r4;
    }

    public final b a() {
        return this.f95715a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f95715a, r82.f95715a) == true) goto L12;
        return false;
    L12:
        if (this.f95716b == r82.f95716b) goto L15;
        return false;
    L15:
        if (this.f95717c == r82.f95717c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f95715a.hashCode() * 31) + Boolean.hashCode(this.f95716b)) * 31) + Long.hashCode(this.f95717c);
    }

    public String toString() {
        return "CryptoBuyOrderPreviewSession(orderPreview=" + this.f95715a + ", isFormulaAvailable=" + this.f95716b + ", nonce=" + this.f95717c + ')';
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
