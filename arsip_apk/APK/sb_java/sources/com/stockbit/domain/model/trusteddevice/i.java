package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f86143a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86144b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86145c;
    public final String d;

    public i(String r2, String r3, String r4, String r5) {
        p.l(r2, "token");
        p.l(r3, "target");
        p.l(r4, "channel");
        p.l(r5, "nextAttemptTime");
        this.f86143a = r2;
        this.f86144b = r3;
        this.f86145c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f86143a, r52.f86143a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86144b, r52.f86144b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86145c, r52.f86145c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f86143a.hashCode() * 31) + this.f86144b.hashCode()) * 31) + this.f86145c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "RecoveryOTPRequestEntity(token=" + this.f86143a + ", target=" + this.f86144b + ", channel=" + this.f86145c + ", nextAttemptTime=" + this.d + ")";
    }
}
