package com.stockbit.usecase.bonds.model;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f154632a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154633b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154634c;

    public j(String r2, String r3, String r4) {
        p.l(r2, "productId");
        p.l(r3, "productName");
        p.l(r4, "productIcon");
        this.f154632a = r2;
        this.f154633b = r3;
        this.f154634c = r4;
    }

    public final String a() {
        return this.f154634c;
    }

    public final String b() {
        return this.f154632a;
    }

    public final String c() {
        return this.f154633b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f154632a, r52.f154632a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154633b, r52.f154633b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154634c, r52.f154634c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f154632a.hashCode() * 31) + this.f154633b.hashCode()) * 31) + this.f154634c.hashCode();
    }

    public String toString() {
        return "BondProductInfoUIState(productId=" + this.f154632a + ", productName=" + this.f154633b + ", productIcon=" + this.f154634c + ")";
    }

    public /* synthetic */ j(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
