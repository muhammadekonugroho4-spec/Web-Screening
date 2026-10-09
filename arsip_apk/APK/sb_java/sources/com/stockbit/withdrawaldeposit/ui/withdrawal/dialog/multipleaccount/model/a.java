package com.stockbit.withdrawaldeposit.ui.withdrawal.dialog.multipleaccount.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f173086a;

    /* renamed from: b, reason: collision with root package name */
    public final String f173087b;

    /* renamed from: c, reason: collision with root package name */
    public final double f173088c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f173089e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f173090f;

    static {
    }

    public a(String r2, String r3, double r4, double r6, boolean r8, boolean r9) {
        p.l(r2, "accountName");
        p.l(r3, "accountNumber");
        this.f173086a = r2;
        this.f173087b = r3;
        this.f173088c = r4;
        this.d = r6;
        this.f173089e = r8;
        this.f173090f = r9;
    }

    public static /* synthetic */ a b(a r02, String r1, String r2, double r3, double r5, boolean r7, boolean r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r02.f173086a;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r02.f173087b;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r02.f173088c;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = r02.d;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = r02.f173089e;
    L18:
        if ((r9 & 32) == 0) goto L20;
        r8 = r02.f173090f;
    L20:
        double r72 = r5;
        double r52 = r3;
        String r32 = r1;
        String r4 = r2;
        return r02.a(r32, r4, r52, r72, r7, r8);
    }

    public final a a(String r11, String r12, double r13, double r15, boolean r17, boolean r18) {
        p.l(r11, "accountName");
        p.l(r12, "accountNumber");
        return new a(r11, r12, r13, r15, r17, r18);
    }

    public final String c() {
        return this.f173086a;
    }

    public final String d() {
        return this.f173087b;
    }

    public final double e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f173086a, r82.f173086a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f173087b, r82.f173087b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f173088c, r82.f173088c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (this.f173089e == r82.f173089e) goto L24;
        return false;
    L24:
        if (this.f173090f == r82.f173090f) goto L26;
        return false;
    L26:
        return true;
    }

    public final double f() {
        return this.f173088c;
    }

    public final boolean g() {
        return this.f173090f;
    }

    public final boolean h() {
        return this.f173089e;
    }

    public int hashCode() {
        return (((((((((this.f173086a.hashCode() * 31) + this.f173087b.hashCode()) * 31) + Double.hashCode(this.f173088c)) * 31) + Double.hashCode(this.d)) * 31) + Boolean.hashCode(this.f173089e)) * 31) + Boolean.hashCode(this.f173090f);
    }

    public String toString() {
        return "AccountUiState(accountName=" + this.f173086a + ", accountNumber=" + this.f173087b + ", value=" + this.f173088c + ", limit=" + this.d + ", isOverLimit=" + this.f173089e + ", isLocked=" + this.f173090f + ')';
    }
}
