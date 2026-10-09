package com.stockbit.usecase.chat.model.search;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f155630a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155631b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155632c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f155633e;

    /* renamed from: f, reason: collision with root package name */
    public final int f155634f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f155635g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f155636h;

    public d(String r2, String r3, String r4, String r5, boolean r6, int r7, boolean r8, boolean r9) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "username");
        p.l(r4, "fullname");
        p.l(r5, "avatar");
        this.f155630a = r2;
        this.f155631b = r3;
        this.f155632c = r4;
        this.d = r5;
        this.f155633e = r6;
        this.f155634f = r7;
        this.f155635g = r8;
        this.f155636h = r9;
    }

    public static /* synthetic */ d b(d r02, String r1, String r2, String r3, String r4, boolean r5, int r6, boolean r7, boolean r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r02.f155630a;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r02.f155631b;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r02.f155632c;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r02.f155633e;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r02.f155634f;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r02.f155635g;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r02.f155636h;
    L26:
        boolean r92 = r7;
        boolean r102 = r8;
        boolean r72 = r5;
        int r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82, r92, r102);
    }

    public final d a(String r11, String r12, String r13, String r14, boolean r15, int r16, boolean r17, boolean r18) {
        p.l(r11, Constants.KEY_ID);
        p.l(r12, "username");
        p.l(r13, "fullname");
        p.l(r14, "avatar");
        return new d(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f155632c;
    }

    public final String e() {
        return this.f155630a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f155630a, r52.f155630a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155631b, r52.f155631b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155632c, r52.f155632c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f155633e == r52.f155633e) goto L24;
        return false;
    L24:
        if (this.f155634f == r52.f155634f) goto L27;
        return false;
    L27:
        if (this.f155635g == r52.f155635g) goto L30;
        return false;
    L30:
        if (this.f155636h == r52.f155636h) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f155631b;
    }

    public final boolean g() {
        return this.f155636h;
    }

    public final boolean h() {
        return this.f155633e;
    }

    public int hashCode() {
        return (((((((((((((this.f155630a.hashCode() * 31) + this.f155631b.hashCode()) * 31) + this.f155632c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f155633e)) * 31) + Integer.hashCode(this.f155634f)) * 31) + Boolean.hashCode(this.f155635g)) * 31) + Boolean.hashCode(this.f155636h);
    }

    public String toString() {
        return "SearchPeopleUIState(id=" + this.f155630a + ", username=" + this.f155631b + ", fullname=" + this.f155632c + ", avatar=" + this.d + ", isVerified=" + this.f155633e + ", memberId=" + this.f155634f + ", isAdmin=" + this.f155635g + ", isSelected=" + this.f155636h + ")";
    }

    public /* synthetic */ d(String r2, String r3, String r4, String r5, boolean r6, int r7, boolean r8, boolean r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = false;
    L24:
        if ((r10 & 128) == 0) goto L27;
        boolean r102 = false;
    L26:
        boolean r92 = r8;
        int r82 = r7;
        boolean r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
