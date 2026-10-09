package com.stockbit.usecase.sharecontent.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f162833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f162834b;

    /* renamed from: c, reason: collision with root package name */
    public final String f162835c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f162836e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f162837f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f162838g;

    public f(int r2, String r3, String r4, String r5, boolean r6, boolean r7, boolean r8) {
        p.l(r3, "username");
        p.l(r4, "shortName");
        p.l(r5, "avatar");
        this.f162833a = r2;
        this.f162834b = r3;
        this.f162835c = r4;
        this.d = r5;
        this.f162836e = r6;
        this.f162837f = r7;
        this.f162838g = r8;
    }

    public static /* synthetic */ f g(f r02, int r1, String r2, String r3, String r4, boolean r5, boolean r6, boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.f162833a;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.f162834b;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.f162835c;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.f162836e;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.f162837f;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.f162838g;
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
        return this.f162837f;
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public String b() {
        return this.f162835c;
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public boolean c() {
        return this.f162836e;
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public String d() {
        return this.d;
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public boolean e() {
        return this.f162838g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f162833a == r52.f162833a) goto L12;
        return false;
    L12:
        if (p.g(this.f162834b, r52.f162834b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f162835c, r52.f162835c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f162836e == r52.f162836e) goto L24;
        return false;
    L24:
        if (this.f162837f == r52.f162837f) goto L27;
        return false;
    L27:
        if (this.f162838g == r52.f162838g) goto L29;
        return false;
    L29:
        return true;
    }

    public final f f(int r10, String r11, String r12, String r13, boolean r14, boolean r15, boolean r16) {
        p.l(r11, "username");
        p.l(r12, "shortName");
        p.l(r13, "avatar");
        return new f(r10, r11, r12, r13, r14, r15, r16);
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public int getId() {
        return this.f162833a;
    }

    @Override // com.stockbit.usecase.sharecontent.model.d
    public String getUsername() {
        return this.f162834b;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f162833a) * 31) + this.f162834b.hashCode()) * 31) + this.f162835c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f162836e)) * 31) + Boolean.hashCode(this.f162837f)) * 31) + Boolean.hashCode(this.f162838g);
    }

    public String toString() {
        return "ShareUserUIState(id=" + this.f162833a + ", username=" + this.f162834b + ", shortName=" + this.f162835c + ", avatar=" + this.d + ", isVerified=" + this.f162836e + ", isSelected=" + this.f162837f + ", isShareable=" + this.f162838g + ")";
    }

    public /* synthetic */ f(int r3, String r4, String r5, String r6, boolean r7, boolean r8, boolean r9, int r10, i r11) {
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
