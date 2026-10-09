package com.stockbit.chat.contract;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f53039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53040b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53041c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53042e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f53043f;

    /* renamed from: g, reason: collision with root package name */
    public final String f53044g;

    public a(int r2, String r3, String r4, boolean r5, boolean r6, boolean r7, String r8) {
        p.l(r3, "username");
        p.l(r4, "avatar");
        this.f53039a = r2;
        this.f53040b = r3;
        this.f53041c = r4;
        this.d = r5;
        this.f53042e = r6;
        this.f53043f = r7;
        this.f53044g = r8;
    }

    public final String a() {
        return this.f53041c;
    }

    public final int b() {
        return this.f53039a;
    }

    public final String c() {
        return this.f53044g;
    }

    public final String d() {
        return this.f53040b;
    }

    public final boolean e() {
        return this.f53042e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f53039a == r52.f53039a) goto L12;
        return false;
    L12:
        if (p.g(this.f53040b, r52.f53040b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f53041c, r52.f53041c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f53042e == r52.f53042e) goto L24;
        return false;
    L24:
        if (this.f53043f == r52.f53043f) goto L27;
        return false;
    L27:
        if (p.g(this.f53044g, r52.f53044g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f53043f;
    }

    public final boolean g() {
        return this.d;
    }

    public int hashCode() {
        int r02 = ((((((((((Integer.hashCode(this.f53039a) * 31) + this.f53040b.hashCode()) * 31) + this.f53041c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f53042e)) * 31) + Boolean.hashCode(this.f53043f)) * 31;
        String r1 = this.f53044g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "BroadcastRoomNavParam(roomId=" + this.f53039a + ", username=" + this.f53040b + ", avatar=" + this.f53041c + ", isVerified=" + this.d + ", isBlocked=" + this.f53042e + ", isDeactivated=" + this.f53043f + ", sourcePage=" + this.f53044g + ')';
    }

    public /* synthetic */ a(int r3, String r4, String r5, boolean r6, boolean r7, boolean r8, String r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = false;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = false;
    L21:
        if ((r10 & 64) == 0) goto L23;
        r9 = null;
    L23:
        String r102 = r9;
        boolean r92 = r8;
        boolean r82 = r7;
        boolean r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102);
    }
}
