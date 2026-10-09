package com.stockbit.withdrawaldeposit.ui.withdrawal.dialog.multipleaccount.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f173091a;

    /* renamed from: b, reason: collision with root package name */
    public final String f173092b;

    /* renamed from: c, reason: collision with root package name */
    public final String f173093c;
    public final String d;

    static {
    }

    public b(String r2, String r3, String r4, String r5) {
        p.l(r2, "bankLogo");
        p.l(r3, "bankName");
        p.l(r4, "bankNumber");
        p.l(r5, "bankHolder");
        this.f173091a = r2;
        this.f173092b = r3;
        this.f173093c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f173091a;
    }

    public final String c() {
        return this.f173092b;
    }

    public final String d() {
        return this.f173093c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f173091a, r52.f173091a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f173092b, r52.f173092b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f173093c, r52.f173093c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f173091a.hashCode() * 31) + this.f173092b.hashCode()) * 31) + this.f173093c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BankUiState(bankLogo=" + this.f173091a + ", bankName=" + this.f173092b + ", bankNumber=" + this.f173093c + ", bankHolder=" + this.d + ')';
    }
}
