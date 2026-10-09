package com.stockbit.chat.contract;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f53053a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53054b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53055c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53056e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f53057f;

    /* renamed from: g, reason: collision with root package name */
    public final String f53058g;

    /* renamed from: h, reason: collision with root package name */
    public final String f53059h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f53060i;

    public d(int r2, String r3, String r4, boolean r5, boolean r6, boolean r7, String r8, String r9, boolean r10) {
        p.l(r3, "username");
        p.l(r4, "avatar");
        this.f53053a = r2;
        this.f53054b = r3;
        this.f53055c = r4;
        this.d = r5;
        this.f53056e = r6;
        this.f53057f = r7;
        this.f53058g = r8;
        this.f53059h = r9;
        this.f53060i = r10;
    }

    public final String a() {
        return this.f53055c;
    }

    public final String b() {
        return this.f53059h;
    }

    public final String c() {
        return this.f53058g;
    }

    public final int d() {
        return this.f53053a;
    }

    public final String e() {
        return this.f53054b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f53053a == r52.f53053a) goto L12;
        return false;
    L12:
        if (p.g(this.f53054b, r52.f53054b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f53055c, r52.f53055c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f53056e == r52.f53056e) goto L24;
        return false;
    L24:
        if (this.f53057f == r52.f53057f) goto L27;
        return false;
    L27:
        if (p.g(this.f53058g, r52.f53058g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f53059h, r52.f53059h) == true) goto L33;
        return false;
    L33:
        if (this.f53060i == r52.f53060i) goto L35;
        return false;
    L35:
        return true;
    }

    public final boolean f() {
        return this.f53056e;
    }

    public final boolean g() {
        return this.f53060i;
    }

    public final boolean h() {
        return this.f53057f;
    }

    public int hashCode() {
        int r02 = ((((((((((Integer.hashCode(this.f53053a) * 31) + this.f53054b.hashCode()) * 31) + this.f53055c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f53056e)) * 31) + Boolean.hashCode(this.f53057f)) * 31;
        String r1 = this.f53058g;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f53059h;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((r03 + r2) * 31) + Boolean.hashCode(this.f53060i);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final boolean i() {
        return this.d;
    }

    public String toString() {
        return "PersonalUserIdNavParam(userId=" + this.f53053a + ", username=" + this.f53054b + ", avatar=" + this.f53055c + ", isVerified=" + this.d + ", isBlocked=" + this.f53056e + ", isDeactivated=" + this.f53057f + ", sourcePage=" + this.f53058g + ", chatId=" + this.f53059h + ", isChatEnabled=" + this.f53060i + ')';
    }

    public /* synthetic */ d(int r3, String r4, String r5, boolean r6, boolean r7, boolean r8, String r9, String r10, boolean r11, int r12, i r13) {
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
        r9 = null;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = null;
    L27:
        if ((r12 & 256) == 0) goto L29;
        r11 = true;
    L29:
        boolean r122 = r11;
        String r112 = r10;
        String r102 = r9;
        boolean r92 = r8;
        boolean r82 = r7;
        boolean r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122);
    }
}
