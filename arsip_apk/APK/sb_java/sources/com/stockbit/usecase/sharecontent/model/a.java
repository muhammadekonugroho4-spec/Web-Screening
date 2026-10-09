package com.stockbit.usecase.sharecontent.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f162820a;

    /* renamed from: b, reason: collision with root package name */
    public final String f162821b;

    /* renamed from: c, reason: collision with root package name */
    public final String f162822c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f162823e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f162824f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f162825g;

    public a(int r2, String r3, String r4, String r5, boolean r6, boolean r7, boolean r8) {
        p.l(r3, "username");
        p.l(r4, "shortName");
        p.l(r5, "avatar");
        this.f162820a = r2;
        this.f162821b = r3;
        this.f162822c = r4;
        this.d = r5;
        this.f162823e = r6;
        this.f162824f = r7;
        this.f162825g = r8;
    }

    public static /* synthetic */ a g(a r02, int r1, String r2, String r3, String r4, boolean r5, boolean r6, boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.f162820a;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.f162821b;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.f162822c;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.f162823e;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.f162824f;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.f162825g;
    L23:
        boolean r82 = r6;
        boolean r92 = r7;
        String r62 = r4;
        boolean r72 = r5;
        String r52 = r3;
        int r32 = r1;
        return r02.f(r32, r2, r52, r62, r72, r82, r92);
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public boolean a() {
        return this.f162824f;
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public String b() {
        return this.f162822c;
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public boolean c() {
        return this.f162823e;
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public String d() {
        return this.d;
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public boolean e() {
        return this.f162825g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f162820a == r52.f162820a) goto L12;
        return false;
    L12:
        if (p.g(this.f162821b, r52.f162821b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f162822c, r52.f162822c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f162823e == r52.f162823e) goto L24;
        return false;
    L24:
        if (this.f162824f == r52.f162824f) goto L27;
        return false;
    L27:
        if (this.f162825g == r52.f162825g) goto L29;
        return false;
    L29:
        return true;
    }

    public final a f(int r10, String r11, String r12, String r13, boolean r14, boolean r15, boolean r16) {
        p.l(r11, "username");
        p.l(r12, "shortName");
        p.l(r13, "avatar");
        return new a(r10, r11, r12, r13, r14, r15, r16);
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public int getId() {
        return this.f162820a;
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public String getUsername() {
        return this.f162821b;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f162820a) * 31) + this.f162821b.hashCode()) * 31) + this.f162822c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f162823e)) * 31) + Boolean.hashCode(this.f162824f)) * 31) + Boolean.hashCode(this.f162825g);
    }

    public String toString() {
        return "ShareGroupUIState(id=" + this.f162820a + ", username=" + this.f162821b + ", shortName=" + this.f162822c + ", avatar=" + this.d + ", isVerified=" + this.f162823e + ", isSelected=" + this.f162824f + ", isShareable=" + this.f162825g + ")";
    }

    public /* synthetic */ a(int r3, String r4, String r5, String r6, boolean r7, boolean r8, boolean r9, int r10, i r11) {
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
        r6 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = false;
    L21:
        if ((r10 & 64) == 0) goto L23;
        r9 = true;
    L23:
        boolean r102 = r9;
        boolean r92 = r8;
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102);
    }
}
