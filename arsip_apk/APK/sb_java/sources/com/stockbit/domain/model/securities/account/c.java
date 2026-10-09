package com.stockbit.domain.model.securities.account;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85014a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85015b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f85016c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f85017e;

    public c(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5) {
        this.f85014a = r1;
        this.f85015b = r2;
        this.f85016c = r3;
        this.d = r4;
        this.f85017e = r5;
    }

    public final boolean a() {
        return this.f85016c;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.f85014a;
    }

    public final boolean d() {
        return this.f85015b;
    }

    public final boolean e() {
        return this.f85017e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f85014a == r52.f85014a) goto L12;
        return false;
    L12:
        if (this.f85015b == r52.f85015b) goto L15;
        return false;
    L15:
        if (this.f85016c == r52.f85016c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f85017e == r52.f85017e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f85014a) * 31) + Boolean.hashCode(this.f85015b)) * 31) + Boolean.hashCode(this.f85016c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f85017e);
    }

    public String toString() {
        return "IFAPermissionEntity(stockTransferIn=" + this.f85014a + ", stockTransferOut=" + this.f85015b + ", cashTransferIn=" + this.f85016c + ", cashTransferOut=" + this.d + ", withdrawal=" + this.f85017e + ")";
    }

    public /* synthetic */ c(boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = true;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = true;
    L15:
        if ((r7 & 16) == 0) goto L18;
        boolean r72 = true;
    L17:
        boolean r62 = r5;
        boolean r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
