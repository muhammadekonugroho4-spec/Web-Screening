package com.stockbit.datasource.param.securities;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f80081a;

    /* renamed from: b, reason: collision with root package name */
    public final List f80082b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80083c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80084e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80085f;

    public b(String r2, List r3, String r4, String r5, String r6, String r7) {
        p.l(r2, "period");
        this.f80081a = r2;
        this.f80082b = r3;
        this.f80083c = r4;
        this.d = r5;
        this.f80084e = r6;
        this.f80085f = r7;
    }

    public final String a() {
        return this.f80084e;
    }

    public final String b() {
        return this.f80081a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f80083c;
    }

    public final String e() {
        return this.f80085f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f80081a, r52.f80081a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80082b, r52.f80082b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80083c, r52.f80083c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80084e, r52.f80084e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80085f, r52.f80085f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final List f() {
        return this.f80082b;
    }

    public int hashCode() {
        int r02 = this.f80081a.hashCode() * 31;
        List r1 = this.f80082b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f80083c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f80084e;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.f80085f;
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
        return "GetRealizedTradingHistoryParam(period=" + this.f80081a + ", transactionTypes=" + this.f80082b + ", periodStart=" + this.f80083c + ", periodEnd=" + this.d + ", cursor=" + this.f80084e + ", stockCode=" + this.f80085f + ")";
    }
}
