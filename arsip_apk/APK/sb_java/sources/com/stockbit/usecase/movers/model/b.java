package com.stockbit.usecase.movers.model;

import kotlin.jvm.internal.i;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f158513a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f158514b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f158515c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f158516e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f158517f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f158518g;

    public b(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7) {
        this.f158513a = r1;
        this.f158514b = r2;
        this.f158515c = r3;
        this.d = r4;
        this.f158516e = r5;
        this.f158517f = r6;
        this.f158518g = r7;
    }

    public final b a(boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        return new b(r9, r10, r11, r12, r13, r14, r15);
    }

    public final boolean b() {
        return this.f158515c;
    }

    public final boolean c() {
        return this.f158514b;
    }

    public final boolean d() {
        return this.f158513a;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f158513a == r52.f158513a) goto L12;
        return false;
    L12:
        if (this.f158514b == r52.f158514b) goto L15;
        return false;
    L15:
        if (this.f158515c == r52.f158515c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f158516e == r52.f158516e) goto L24;
        return false;
    L24:
        if (this.f158517f == r52.f158517f) goto L27;
        return false;
    L27:
        if (this.f158518g == r52.f158518g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f158518g;
    }

    public final boolean g() {
        return this.f158516e;
    }

    public final boolean h() {
        return this.f158517f;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f158513a) * 31) + Boolean.hashCode(this.f158514b)) * 31) + Boolean.hashCode(this.f158515c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f158516e)) * 31) + Boolean.hashCode(this.f158517f)) * 31) + Boolean.hashCode(this.f158518g);
    }

    public String toString() {
        return "MoversFilterUIState(isBoardMainChecked=" + this.f158513a + ", isBoardDevelopmentChecked=" + this.f158514b + ", isBoardAccelerationChecked=" + this.f158515c + ", isBoardNewEconomicChecked=" + this.d + ", isSpecialMonitoringChecked=" + this.f158516e + ", isWarrantOrRightChecked=" + this.f158517f + ", isShariaOnlyChecked=" + this.f158518g + ")";
    }

    public /* synthetic */ b(boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = true;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = true;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = false;
    L21:
        if ((r9 & 64) == 0) goto L24;
        boolean r92 = false;
    L23:
        boolean r82 = r7;
        boolean r72 = r6;
        boolean r62 = r5;
        boolean r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
