package com.stockbit.domain.model.eipo;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f82097a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82098b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82099c;

    public a(String r2, boolean r3, boolean r4) {
        p.l(r2, "cashOnHand");
        this.f82097a = r2;
        this.f82098b = r3;
        this.f82099c = r4;
    }

    public final a a(String r2, boolean r3, boolean r4) {
        p.l(r2, "cashOnHand");
        return new a(r2, r3, r4);
    }

    public final String b() {
        return this.f82097a;
    }

    public final boolean c() {
        return this.f82098b;
    }

    public final boolean d() {
        return this.f82099c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f82097a, r52.f82097a) == true) goto L12;
        return false;
    L12:
        if (this.f82098b == r52.f82098b) goto L15;
        return false;
    L15:
        if (this.f82099c == r52.f82099c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f82097a.hashCode() * 31) + Boolean.hashCode(this.f82098b)) * 31) + Boolean.hashCode(this.f82099c);
    }

    public String toString() {
        return "EIpoCashOnHandUIState(cashOnHand=" + this.f82097a + ", isError=" + this.f82098b + ", isNotLoggedInSekuritas=" + this.f82099c + ")";
    }

    public /* synthetic */ a(String r1, boolean r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "0";
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = false;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = true;
    L11:
        this(r1, r2, r3);
    }
}
