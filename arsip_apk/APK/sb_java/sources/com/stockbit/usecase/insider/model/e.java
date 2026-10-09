package com.stockbit.usecase.insider.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f158110a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158111b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f158112c;

    public e(String r2, String r3, boolean r4) {
        p.l(r2, "symbol");
        p.l(r3, "companyName");
        this.f158110a = r2;
        this.f158111b = r3;
        this.f158112c = r4;
    }

    public static /* synthetic */ e b(e r02, String r1, String r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f158110a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f158111b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f158112c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final e a(String r2, String r3, boolean r4) {
        p.l(r2, "symbol");
        p.l(r3, "companyName");
        return new e(r2, r3, r4);
    }

    public final String c() {
        return this.f158111b;
    }

    public final String d() {
        return this.f158110a;
    }

    public final boolean e() {
        return this.f158112c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f158110a, r52.f158110a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158111b, r52.f158111b) == true) goto L15;
        return false;
    L15:
        if (this.f158112c == r52.f158112c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f158110a.hashCode() * 31) + this.f158111b.hashCode()) * 31) + Boolean.hashCode(this.f158112c);
    }

    public String toString() {
        return "InsiderDetailHeaderUIState(symbol=" + this.f158110a + ", companyName=" + this.f158111b + ", isExpand=" + this.f158112c + ")";
    }

    public /* synthetic */ e(String r1, String r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = false;
    L5:
        this(r1, r2, r3);
    }
}
