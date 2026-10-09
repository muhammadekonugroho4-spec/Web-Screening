package com.stockbit.domain.model.tradingpin;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f86093a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86094b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86095c;
    public final int d;

    public e(String r2, String r3, String r4, int r5) {
        p.l(r2, "sessionToken");
        p.l(r3, "channel");
        p.l(r4, "target");
        this.f86093a = r2;
        this.f86094b = r3;
        this.f86095c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.f86093a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f86093a, r52.f86093a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86094b, r52.f86094b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86095c, r52.f86095c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f86093a.hashCode() * 31) + this.f86094b.hashCode()) * 31) + this.f86095c.hashCode()) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ChangePinOtpEntity(sessionToken=" + this.f86093a + ", channel=" + this.f86094b + ", target=" + this.f86095c + ", nextAttemptIn=" + this.d + ")";
    }
}
