package com.stockbit.watchlist.ui.mainv2.screen;

/* loaded from: classes2.dex */
public final class N1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f170286a;

    /* renamed from: b, reason: collision with root package name */
    public final long f170287b;

    /* renamed from: c, reason: collision with root package name */
    public final long f170288c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f170289e;

    /* renamed from: f, reason: collision with root package name */
    public final long f170290f;

    /* renamed from: g, reason: collision with root package name */
    public final long f170291g;

    static {
    }

    public /* synthetic */ N1(long r1, long r3, long r5, long r7, long r9, long r11, long r13, kotlin.jvm.internal.i r15) {
        this(r1, r3, r5, r7, r9, r11, r13);
    }

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.f170288c;
    }

    public final long c() {
        return this.f170287b;
    }

    public final long d() {
        return this.f170290f;
    }

    public final long e() {
        return this.f170291g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof N1) == true) goto L8;
        return false;
    L8:
        N1 r82 = (N1) r8;
        if (androidx.compose.ui.unit.v.e(this.f170286a, r82.f170286a) == true) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.unit.v.e(this.f170287b, r82.f170287b) == true) goto L15;
        return false;
    L15:
        if (androidx.compose.ui.unit.v.e(this.f170288c, r82.f170288c) == true) goto L18;
        return false;
    L18:
        if (androidx.compose.ui.unit.v.e(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (androidx.compose.ui.unit.v.e(this.f170289e, r82.f170289e) == true) goto L24;
        return false;
    L24:
        if (androidx.compose.ui.unit.v.e(this.f170290f, r82.f170290f) == true) goto L27;
        return false;
    L27:
        if (androidx.compose.ui.unit.v.e(this.f170291g, r82.f170291g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final long f() {
        return this.f170289e;
    }

    public final long g() {
        return this.f170286a;
    }

    public int hashCode() {
        return (((((((((((androidx.compose.ui.unit.v.i(this.f170286a) * 31) + androidx.compose.ui.unit.v.i(this.f170287b)) * 31) + androidx.compose.ui.unit.v.i(this.f170288c)) * 31) + androidx.compose.ui.unit.v.i(this.d)) * 31) + androidx.compose.ui.unit.v.i(this.f170289e)) * 31) + androidx.compose.ui.unit.v.i(this.f170290f)) * 31) + androidx.compose.ui.unit.v.i(this.f170291g);
    }

    public String toString() {
        return "WatchlistMainRowTextSizes(symbol=" + androidx.compose.ui.unit.v.l(this.f170286a) + ", name=" + androidx.compose.ui.unit.v.l(this.f170287b) + ", lastPrice=" + androidx.compose.ui.unit.v.l(this.f170288c) + ", change=" + androidx.compose.ui.unit.v.l(this.d) + ", statusBadge=" + androidx.compose.ui.unit.v.l(this.f170289e) + ", orderbookLabel=" + androidx.compose.ui.unit.v.l(this.f170290f) + ", orderbookValue=" + androidx.compose.ui.unit.v.l(this.f170291g) + ')';
    }

    public N1(long r1, long r3, long r5, long r7, long r9, long r11, long r13) {
        this.f170286a = r1;
        this.f170287b = r3;
        this.f170288c = r5;
        this.d = r7;
        this.f170289e = r9;
        this.f170290f = r11;
        this.f170291g = r13;
    }
}
