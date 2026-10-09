package com.stockbit.lib.trackerwrapper.sentry.metrics.model;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f120663a;

    /* renamed from: b, reason: collision with root package name */
    public final long f120664b;

    /* renamed from: c, reason: collision with root package name */
    public final long f120665c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f120666e;

    /* renamed from: f, reason: collision with root package name */
    public final long f120667f;

    /* renamed from: g, reason: collision with root package name */
    public final long f120668g;

    /* renamed from: h, reason: collision with root package name */
    public final String f120669h;

    /* renamed from: i, reason: collision with root package name */
    public final String f120670i;

    public a(int r1, long r2, long r4, long r6, long r8, long r10, long r12, String r14, String r15) {
        this.f120663a = r1;
        this.f120664b = r2;
        this.f120665c = r4;
        this.d = r6;
        this.f120666e = r8;
        this.f120667f = r10;
        this.f120668g = r12;
        this.f120669h = r14;
        this.f120670i = r15;
    }

    public final String a() {
        return this.f120669h;
    }

    public final long b() {
        return this.f120664b;
    }

    public final String c() {
        return this.f120670i;
    }

    public final int d() {
        return this.f120663a;
    }

    public final long e() {
        return this.f120665c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (this.f120663a == r82.f120663a) goto L12;
        return false;
    L12:
        if (this.f120664b == r82.f120664b) goto L15;
        return false;
    L15:
        if (this.f120665c == r82.f120665c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f120666e == r82.f120666e) goto L24;
        return false;
    L24:
        if (this.f120667f == r82.f120667f) goto L27;
        return false;
    L27:
        if (this.f120668g == r82.f120668g) goto L30;
        return false;
    L30:
        if (p.g(this.f120669h, r82.f120669h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f120670i, r82.f120670i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final long f() {
        return this.d;
    }

    public final long g() {
        return this.f120667f;
    }

    public final long h() {
        return this.f120666e;
    }

    public int hashCode() {
        int r02 = ((((((((((((Integer.hashCode(this.f120663a) * 31) + Long.hashCode(this.f120664b)) * 31) + Long.hashCode(this.f120665c)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.f120666e)) * 31) + Long.hashCode(this.f120667f)) * 31) + Long.hashCode(this.f120668g)) * 31;
        String r1 = this.f120669h;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f120670i;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CdnTrace(httpStatus=" + this.f120663a + ", dnsResolutionTime=" + this.f120664b + ", tcpConnectionTime=" + this.f120665c + ", tlsHandshakeTime=" + this.d + ", ttfb=" + this.f120666e + ", totalTime=" + this.f120667f + ", responseSizeByte=" + this.f120668g + ", cdnColo=" + this.f120669h + ", failedPhase=" + this.f120670i + ')';
    }
}
