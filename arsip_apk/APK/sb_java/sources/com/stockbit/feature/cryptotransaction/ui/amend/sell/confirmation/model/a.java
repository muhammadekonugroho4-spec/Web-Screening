package com.stockbit.feature.cryptotransaction.ui.amend.sell.confirmation.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f95307a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95308b;

    /* renamed from: c, reason: collision with root package name */
    public final String f95309c;
    public final String d;

    static {
    }

    public a(boolean r2, String r3, String r4, String r5) {
        p.l(r3, "orderId");
        p.l(r4, "newPrice");
        p.l(r5, "newQuantity");
        this.f95307a = r2;
        this.f95308b = r3;
        this.f95309c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f95309c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f95308b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f95307a == r52.f95307a) goto L12;
        return false;
    L12:
        if (p.g(this.f95308b, r52.f95308b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f95309c, r52.f95309c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f95307a) * 31) + this.f95308b.hashCode()) * 31) + this.f95309c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CryptoAmendSellConfirmationUIState(isLoading=" + this.f95307a + ", orderId=" + this.f95308b + ", newPrice=" + this.f95309c + ", newQuantity=" + this.d + ')';
    }

    public /* synthetic */ a(boolean r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
