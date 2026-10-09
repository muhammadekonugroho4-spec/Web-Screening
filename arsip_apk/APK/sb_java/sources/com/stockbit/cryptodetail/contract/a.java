package com.stockbit.cryptodetail.contract;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f79141a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79142b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79143c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f79144e;

    public a(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "symbol");
        this.f79141a = r2;
        this.f79142b = r3;
        this.f79143c = r4;
        this.d = r5;
        this.f79144e = r6;
    }

    public final String a() {
        return this.f79144e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f79143c;
    }

    public final String d() {
        return this.f79142b;
    }

    public final String e() {
        return this.f79141a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f79141a, r52.f79141a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f79142b, r52.f79142b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f79143c, r52.f79143c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f79144e, r52.f79144e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = this.f79141a.hashCode() * 31;
        String r1 = this.f79142b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f79143c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f79144e;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return r05 + r2;
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CryptoDetailContractArgs(symbol=" + this.f79141a + ", name=" + this.f79142b + ", logo=" + this.f79143c + ", lastPrice=" + this.d + ", chartFilterTime=" + this.f79144e + ')';
    }

    public /* synthetic */ a(String r2, String r3, String r4, String r5, String r6, int r7, i r8) {
        if ((r7 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r7 & 8) == 0) goto L12;
        r5 = null;
    L12:
        if ((r7 & 16) == 0) goto L15;
        String r72 = null;
    L14:
        String r62 = r5;
        this(r2, r3, r4, r62, r72);
        return;
    L15:
        r72 = r6;
        goto L14
    }
}
