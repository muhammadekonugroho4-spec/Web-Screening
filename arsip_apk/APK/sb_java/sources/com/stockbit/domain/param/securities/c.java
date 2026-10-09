package com.stockbit.domain.param.securities;

import java.util.List;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f87463a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87464b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87465c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87466e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87467f;

    public c(String r2, List r3, String r4, String r5, String r6, String r7) {
        kotlin.jvm.internal.p.l(r2, "period");
        this.f87463a = r2;
        this.f87464b = r3;
        this.f87465c = r4;
        this.d = r5;
        this.f87466e = r6;
        this.f87467f = r7;
    }

    public final String a() {
        return this.f87466e;
    }

    public final String b() {
        return this.f87463a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f87465c;
    }

    public final String e() {
        return this.f87467f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (kotlin.jvm.internal.p.g(this.f87463a, r52.f87463a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87464b, r52.f87464b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87465c, r52.f87465c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87466e, r52.f87466e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87467f, r52.f87467f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final List f() {
        return this.f87464b;
    }

    public int hashCode() {
        int r02 = this.f87463a.hashCode() * 31;
        List r1 = this.f87464b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f87465c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f87466e;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.f87467f;
        if (r19 == null) goto L23;
        r2 = r19.hashCode();
    L23:
        return r06 + r2;
    L17:
        r18 = r17.hashCode();
        goto L18
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
        return "GetRealizedTradingHistoryDomainParam(period=" + this.f87463a + ", transactionTypes=" + this.f87464b + ", periodStart=" + this.f87465c + ", periodEnd=" + this.d + ", cursor=" + this.f87466e + ", stockCode=" + this.f87467f + ")";
    }

    public /* synthetic */ c(String r2, List r3, String r4, String r5, String r6, String r7, int r8, kotlin.jvm.internal.i r9) {
        if ((r8 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r8 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r8 & 8) == 0) goto L12;
        r5 = null;
    L12:
        if ((r8 & 16) == 0) goto L15;
        r6 = null;
    L15:
        if ((r8 & 32) == 0) goto L18;
        String r82 = null;
    L17:
        String r72 = r6;
        String r62 = r5;
        this(r2, r3, r4, r62, r72, r82);
        return;
    L18:
        r82 = r7;
        goto L17
    }
}
