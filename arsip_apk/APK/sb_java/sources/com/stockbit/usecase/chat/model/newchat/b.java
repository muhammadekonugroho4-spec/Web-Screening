package com.stockbit.usecase.chat.model.newchat;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f155576a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155577b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155578c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f155579e;

    /* renamed from: f, reason: collision with root package name */
    public final int f155580f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f155581g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f155582h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f155583i;

    public b(int r2, String r3, String r4, String r5, boolean r6, int r7, boolean r8, boolean r9, boolean r10) {
        p.l(r3, "username");
        p.l(r4, "fullName");
        p.l(r5, "avatar");
        this.f155576a = r2;
        this.f155577b = r3;
        this.f155578c = r4;
        this.d = r5;
        this.f155579e = r6;
        this.f155580f = r7;
        this.f155581g = r8;
        this.f155582h = r9;
        this.f155583i = r10;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f155578c;
    }

    public final int c() {
        return this.f155580f;
    }

    public final int d() {
        return this.f155576a;
    }

    public final String e() {
        return this.f155577b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f155576a == r52.f155576a) goto L12;
        return false;
    L12:
        if (p.g(this.f155577b, r52.f155577b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155578c, r52.f155578c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f155579e == r52.f155579e) goto L24;
        return false;
    L24:
        if (this.f155580f == r52.f155580f) goto L27;
        return false;
    L27:
        if (this.f155581g == r52.f155581g) goto L30;
        return false;
    L30:
        if (this.f155582h == r52.f155582h) goto L33;
        return false;
    L33:
        if (this.f155583i == r52.f155583i) goto L35;
        return false;
    L35:
        return true;
    }

    public final boolean f() {
        return this.f155582h;
    }

    public final boolean g() {
        return this.f155583i;
    }

    public final boolean h() {
        return this.f155581g;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f155576a) * 31) + this.f155577b.hashCode()) * 31) + this.f155578c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f155579e)) * 31) + Integer.hashCode(this.f155580f)) * 31) + Boolean.hashCode(this.f155581g)) * 31) + Boolean.hashCode(this.f155582h)) * 31) + Boolean.hashCode(this.f155583i);
    }

    public final boolean i() {
        return this.f155579e;
    }

    public String toString() {
        return "MemberUIState(userId=" + this.f155576a + ", username=" + this.f155577b + ", fullName=" + this.f155578c + ", avatar=" + this.d + ", isVerified=" + this.f155579e + ", memberId=" + this.f155580f + ", isMe=" + this.f155581g + ", isAdmin=" + this.f155582h + ", isInviteable=" + this.f155583i + ")";
    }

    public /* synthetic */ b(int r3, String r4, String r5, String r6, boolean r7, int r8, boolean r9, boolean r10, boolean r11, int r12, i r13) {
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
        r6 = "";
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = false;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = false;
    L27:
        if ((r12 & 256) == 0) goto L29;
        r11 = true;
    L29:
        boolean r122 = r11;
        boolean r112 = r10;
        boolean r102 = r9;
        int r92 = r8;
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122);
    }
}
