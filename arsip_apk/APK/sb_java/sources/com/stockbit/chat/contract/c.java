package com.stockbit.chat.contract;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f53045a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53046b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53047c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53048e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f53049f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f53050g;

    /* renamed from: h, reason: collision with root package name */
    public final String f53051h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f53052i;

    public c(int r2, String r3, String r4, boolean r5, boolean r6, boolean r7, boolean r8, String r9, boolean r10) {
        p.l(r3, "username");
        p.l(r4, "avatar");
        this.f53045a = r2;
        this.f53046b = r3;
        this.f53047c = r4;
        this.d = r5;
        this.f53048e = r6;
        this.f53049f = r7;
        this.f53050g = r8;
        this.f53051h = r9;
        this.f53052i = r10;
    }

    public final String a() {
        return this.f53047c;
    }

    public final int b() {
        return this.f53045a;
    }

    public final String c() {
        return this.f53051h;
    }

    public final String d() {
        return this.f53046b;
    }

    public final boolean e() {
        return this.f53048e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f53045a == r52.f53045a) goto L12;
        return false;
    L12:
        if (p.g(this.f53046b, r52.f53046b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f53047c, r52.f53047c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f53048e == r52.f53048e) goto L24;
        return false;
    L24:
        if (this.f53049f == r52.f53049f) goto L27;
        return false;
    L27:
        if (this.f53050g == r52.f53050g) goto L30;
        return false;
    L30:
        if (p.g(this.f53051h, r52.f53051h) == true) goto L33;
        return false;
    L33:
        if (this.f53052i == r52.f53052i) goto L35;
        return false;
    L35:
        return true;
    }

    public final boolean f() {
        return this.f53049f;
    }

    public final boolean g() {
        return this.f53050g;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        int r02 = ((((((((((((Integer.hashCode(this.f53045a) * 31) + this.f53046b.hashCode()) * 31) + this.f53047c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f53048e)) * 31) + Boolean.hashCode(this.f53049f)) * 31) + Boolean.hashCode(this.f53050g)) * 31;
        String r1 = this.f53051h;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.f53052i);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PersonalRoomIdNavParam(roomId=" + this.f53045a + ", username=" + this.f53046b + ", avatar=" + this.f53047c + ", isVerified=" + this.d + ", isBlocked=" + this.f53048e + ", isDeactivated=" + this.f53049f + ", isDeeplink=" + this.f53050g + ", sourcePage=" + this.f53051h + ", isMessageRequest=" + this.f53052i + ')';
    }

    public /* synthetic */ c(int r3, String r4, String r5, boolean r6, boolean r7, boolean r8, boolean r9, String r10, boolean r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = false;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = false;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = false;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = null;
    L27:
        if ((r12 & 256) == 0) goto L30;
        boolean r122 = false;
    L29:
        String r112 = r10;
        boolean r102 = r9;
        boolean r92 = r8;
        boolean r82 = r7;
        boolean r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122);
        return;
    L30:
        r122 = r11;
        goto L29
    }
}
