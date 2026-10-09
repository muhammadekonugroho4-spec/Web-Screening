package com.stockbit.lib.trackerwrapper.data;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f120539a;

    /* renamed from: b, reason: collision with root package name */
    public final long f120540b;

    /* renamed from: c, reason: collision with root package name */
    public final long f120541c;
    public final long d;

    public a(String r2, long r3, long r5, long r7) {
        p.l(r2, "screen");
        this.f120539a = r2;
        this.f120540b = r3;
        this.f120541c = r5;
        this.d = r7;
    }

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.f120541c;
    }

    public final long c() {
        return this.f120540b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f120539a, r82.f120539a) == true) goto L12;
        return false;
    L12:
        if (this.f120540b == r82.f120540b) goto L15;
        return false;
    L15:
        if (this.f120541c == r82.f120541c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f120539a.hashCode() * 31) + Long.hashCode(this.f120540b)) * 31) + Long.hashCode(this.f120541c)) * 31) + Long.hashCode(this.d);
    }

    public String toString() {
        return "ScreenFramesData(screen=" + this.f120539a + ", totalFrames=" + this.f120540b + ", slowFrames=" + this.f120541c + ", frozenFrames=" + this.d + ')';
    }

    public /* synthetic */ a(String r3, long r4, long r6, long r8, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r6 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        long r102 = 0;
    L16:
        this(r3, r4, r6, r102);
        return;
    L15:
        r102 = r8;
        goto L16
    }
}
