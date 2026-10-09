package com.stockbit.networktroubleshoot.data.dto;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f122595a;

    /* renamed from: b, reason: collision with root package name */
    public final long f122596b;

    /* renamed from: c, reason: collision with root package name */
    public final long f122597c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f122598e;

    /* renamed from: f, reason: collision with root package name */
    public final long f122599f;

    /* renamed from: g, reason: collision with root package name */
    public final long f122600g;

    /* renamed from: h, reason: collision with root package name */
    public final String f122601h;

    /* renamed from: i, reason: collision with root package name */
    public final String f122602i;

    public b(int r1, long r2, long r4, long r6, long r8, long r10, long r12, String r14, String r15) {
        this.f122595a = r1;
        this.f122596b = r2;
        this.f122597c = r4;
        this.d = r6;
        this.f122598e = r8;
        this.f122599f = r10;
        this.f122600g = r12;
        this.f122601h = r14;
        this.f122602i = r15;
    }

    public final String a() {
        return this.f122601h;
    }

    public final long b() {
        return this.f122596b;
    }

    public final String c() {
        return this.f122602i;
    }

    public final int d() {
        return this.f122595a;
    }

    public final long e() {
        return this.f122600g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f122595a == r82.f122595a) goto L12;
        return false;
    L12:
        if (this.f122596b == r82.f122596b) goto L15;
        return false;
    L15:
        if (this.f122597c == r82.f122597c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f122598e == r82.f122598e) goto L24;
        return false;
    L24:
        if (this.f122599f == r82.f122599f) goto L27;
        return false;
    L27:
        if (this.f122600g == r82.f122600g) goto L30;
        return false;
    L30:
        if (p.g(this.f122601h, r82.f122601h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f122602i, r82.f122602i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final long f() {
        return this.f122597c;
    }

    public final long g() {
        return this.d;
    }

    public final long h() {
        return this.f122599f;
    }

    public int hashCode() {
        int r02 = ((((((((((((Integer.hashCode(this.f122595a) * 31) + Long.hashCode(this.f122596b)) * 31) + Long.hashCode(this.f122597c)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.f122598e)) * 31) + Long.hashCode(this.f122599f)) * 31) + Long.hashCode(this.f122600g)) * 31;
        String r1 = this.f122601h;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f122602i;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final long i() {
        return this.f122598e;
    }

    public String toString() {
        return "CdnTraceDTO(httpStatus=" + this.f122595a + ", dnsResolutionTime=" + this.f122596b + ", tcpConnectionTime=" + this.f122597c + ", tlsHandshakeTime=" + this.d + ", ttfb=" + this.f122598e + ", totalTime=" + this.f122599f + ", responseSizeByte=" + this.f122600g + ", cdnColo=" + this.f122601h + ", failedPhase=" + this.f122602i + ')';
    }

    public /* synthetic */ b(int r17, long r18, long r20, long r22, long r24, long r26, long r28, String r30, String r31, int r32, i r33) {
        if ((r32 & 1) == 0) goto L5;
        int r1 = 0;
    L6:
        long r3 = 0;
        if ((r32 & 2) == 0) goto L9;
        long r5 = 0;
    L11:
        if ((r32 & 4) == 0) goto L13;
        long r7 = 0;
    L15:
        if ((r32 & 8) == 0) goto L17;
        long r9 = 0;
    L19:
        if ((r32 & 16) == 0) goto L21;
        long r11 = 0;
    L23:
        if ((r32 & 32) == 0) goto L25;
        long r13 = 0;
    L27:
        if ((r32 & 64) != 0) goto L31;
        r3 = r28;
    L31:
        if ((r32 & 128) == 0) goto L33;
        String r2 = null;
    L35:
        if ((r32 & 256) == 0) goto L38;
        String r322 = null;
    L39:
        this(r1, r5, r7, r9, r11, r13, r3, r2, r322);
        return;
    L38:
        r322 = r31;
        goto L39
    L33:
        r2 = r30;
        goto L35
    L25:
        r13 = r26;
        goto L27
    L21:
        r11 = r24;
        goto L23
    L17:
        r9 = r22;
        goto L19
    L13:
        r7 = r20;
        goto L15
    L9:
        r5 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L6
    }
}
