package com.stockbit.canvas.ui.compose.ui.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f51812a;

    /* renamed from: b, reason: collision with root package name */
    public final e f51813b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f51814c;
    public final boolean d;

    static {
    }

    public i(String r2, e r3, boolean r4, boolean r5) {
        p.l(r2, "symbol");
        p.l(r3, "span");
        this.f51812a = r2;
        this.f51813b = r3;
        this.f51814c = r4;
        this.d = r5;
    }

    public final e a() {
        return this.f51813b;
    }

    public final String b() {
        return this.f51812a;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f51814c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f51812a, r52.f51812a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f51813b, r52.f51813b) == true) goto L15;
        return false;
    L15:
        if (this.f51814c == r52.f51814c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f51812a.hashCode() * 31) + this.f51813b.hashCode()) * 31) + Boolean.hashCode(this.f51814c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "CanvasPersistedCard(symbol=" + this.f51812a + ", span=" + this.f51813b + ", isLotChangeEnabled=" + this.f51814c + ", isDoneLotEnabled=" + this.d + ')';
    }

    public /* synthetic */ i(String r2, e r3, boolean r4, boolean r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 4) == 0) goto L6;
        r4 = false;
    L6:
        if ((r6 & 8) == 0) goto L8;
        r5 = false;
    L8:
        this(r2, r3, r4, r5);
    }
}
