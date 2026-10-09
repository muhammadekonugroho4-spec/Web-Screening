package com.stockbit.networktroubleshoot.listener;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f122642a;

    /* renamed from: b, reason: collision with root package name */
    public final long f122643b;

    /* renamed from: c, reason: collision with root package name */
    public final long f122644c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f122645e;

    /* renamed from: f, reason: collision with root package name */
    public final long f122646f;

    /* renamed from: g, reason: collision with root package name */
    public final String f122647g;

    public b(long r1, long r3, long r5, long r7, long r9, long r11, String r13) {
        this.f122642a = r1;
        this.f122643b = r3;
        this.f122644c = r5;
        this.d = r7;
        this.f122645e = r9;
        this.f122646f = r11;
        this.f122647g = r13;
    }

    public static /* synthetic */ b b(b r13, long r14, long r16, long r18, long r20, long r22, long r24, String r26, int r27, Object r28) {
        if ((r27 & 1) == 0) goto L5;
        long r02 = r13.f122642a;
    L7:
        if ((r27 & 2) == 0) goto L9;
        long r2 = r13.f122643b;
    L11:
        if ((r27 & 4) == 0) goto L13;
        long r4 = r13.f122644c;
    L15:
        if ((r27 & 8) == 0) goto L17;
        long r6 = r13.d;
    L19:
        if ((r27 & 16) == 0) goto L21;
        long r8 = r13.f122645e;
    L23:
        if ((r27 & 32) == 0) goto L25;
        long r10 = r13.f122646f;
    L27:
        if ((r27 & 64) == 0) goto L30;
        String r272 = r13.f122647g;
    L32:
        return r13.a(r02, r2, r4, r6, r8, r10, r272);
    L30:
        r272 = r26;
        goto L32
    L25:
        r10 = r24;
        goto L27
    L21:
        r8 = r22;
        goto L23
    L17:
        r6 = r20;
        goto L19
    L13:
        r4 = r18;
        goto L15
    L9:
        r2 = r16;
        goto L11
    L5:
        r02 = r14;
        goto L7
    }

    public final b a(long r15, long r17, long r19, long r21, long r23, long r25, String r27) {
        return new b(r15, r17, r19, r21, r23, r25, r27);
    }

    public final long c() {
        return this.f122642a;
    }

    public final String d() {
        return this.f122647g;
    }

    public final long e() {
        return this.f122645e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f122642a == r82.f122642a) goto L12;
        return false;
    L12:
        if (this.f122643b == r82.f122643b) goto L15;
        return false;
    L15:
        if (this.f122644c == r82.f122644c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f122645e == r82.f122645e) goto L24;
        return false;
    L24:
        if (this.f122646f == r82.f122646f) goto L27;
        return false;
    L27:
        if (p.g(this.f122647g, r82.f122647g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final long f() {
        return this.f122644c;
    }

    public final long g() {
        return this.f122643b;
    }

    public final long h() {
        return this.f122646f;
    }

    public int hashCode() {
        int r02 = ((((((((((Long.hashCode(this.f122642a) * 31) + Long.hashCode(this.f122643b)) * 31) + Long.hashCode(this.f122644c)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.f122645e)) * 31) + Long.hashCode(this.f122646f)) * 31;
        String r1 = this.f122647g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final long i() {
        return this.d;
    }

    public String toString() {
        return "NetworkDiagnosticCdnTraceResult(dnsResolutionTime=" + this.f122642a + ", tlsConnectTime=" + this.f122643b + ", tcpConnectTime=" + this.f122644c + ", ttfbTime=" + this.d + ", responseSizeByte=" + this.f122645e + ", totalTime=" + this.f122646f + ", failedPhase=" + this.f122647g + ')';
    }

    public /* synthetic */ b(long r12, long r14, long r16, long r18, long r20, long r22, String r24, int r25, kotlin.jvm.internal.i r26) {
        long r1 = 0;
        if ((r25 & 1) == 0) goto L6;
        r12 = 0;
    L6:
        if ((r25 & 2) == 0) goto L8;
        long r3 = 0;
    L10:
        if ((r25 & 4) == 0) goto L12;
        long r5 = 0;
    L14:
        if ((r25 & 8) == 0) goto L16;
        long r7 = 0;
    L18:
        if ((r25 & 16) == 0) goto L20;
        long r9 = 0;
    L22:
        if ((r25 & 32) != 0) goto L26;
        r1 = r22;
    L26:
        if ((r25 & 64) == 0) goto L29;
        String r252 = null;
    L30:
        this(r12, r3, r5, r7, r9, r1, r252);
        return;
    L29:
        r252 = r24;
        goto L30
    L20:
        r9 = r20;
        goto L22
    L16:
        r7 = r18;
        goto L18
    L12:
        r5 = r16;
        goto L14
    L8:
        r3 = r14;
        goto L10
    }
}
