package com.stockbit.domain.model.networkdiagnostic;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f84456a;

    /* renamed from: b, reason: collision with root package name */
    public final long f84457b;

    /* renamed from: c, reason: collision with root package name */
    public final long f84458c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f84459e;

    /* renamed from: f, reason: collision with root package name */
    public final long f84460f;

    /* renamed from: g, reason: collision with root package name */
    public final long f84461g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84462h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84463i;

    public b(int r1, long r2, long r4, long r6, long r8, long r10, long r12, String r14, String r15) {
        this.f84456a = r1;
        this.f84457b = r2;
        this.f84458c = r4;
        this.d = r6;
        this.f84459e = r8;
        this.f84460f = r10;
        this.f84461g = r12;
        this.f84462h = r14;
        this.f84463i = r15;
    }

    public final String a() {
        return this.f84462h;
    }

    public final long b() {
        return this.f84457b;
    }

    public final String c() {
        return this.f84463i;
    }

    public final int d() {
        return this.f84456a;
    }

    public final long e() {
        return this.f84461g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f84456a == r82.f84456a) goto L12;
        return false;
    L12:
        if (this.f84457b == r82.f84457b) goto L15;
        return false;
    L15:
        if (this.f84458c == r82.f84458c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f84459e == r82.f84459e) goto L24;
        return false;
    L24:
        if (this.f84460f == r82.f84460f) goto L27;
        return false;
    L27:
        if (this.f84461g == r82.f84461g) goto L30;
        return false;
    L30:
        if (p.g(this.f84462h, r82.f84462h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84463i, r82.f84463i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final long f() {
        return this.f84458c;
    }

    public final long g() {
        return this.d;
    }

    public final long h() {
        return this.f84460f;
    }

    public int hashCode() {
        int r02 = ((((((((((((Integer.hashCode(this.f84456a) * 31) + Long.hashCode(this.f84457b)) * 31) + Long.hashCode(this.f84458c)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.f84459e)) * 31) + Long.hashCode(this.f84460f)) * 31) + Long.hashCode(this.f84461g)) * 31;
        String r1 = this.f84462h;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f84463i;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final long i() {
        return this.f84459e;
    }

    public String toString() {
        return "CdnTraceEntity(httpStatus=" + this.f84456a + ", dnsResolutionTime=" + this.f84457b + ", tcpConnectionTime=" + this.f84458c + ", tlsHandshakeTime=" + this.d + ", ttfb=" + this.f84459e + ", totalTime=" + this.f84460f + ", responseSizeByte=" + this.f84461g + ", cdnColo=" + this.f84462h + ", failedPhase=" + this.f84463i + ")";
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
