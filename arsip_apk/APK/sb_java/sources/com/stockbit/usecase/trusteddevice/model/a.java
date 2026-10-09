package com.stockbit.usecase.trusteddevice.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f164184a;

    /* renamed from: b, reason: collision with root package name */
    public final String f164185b;

    /* renamed from: c, reason: collision with root package name */
    public final String f164186c;
    public final long d;

    public a(String r2, String r3, String r4, long r5) {
        p.l(r2, "token");
        p.l(r3, "promptToken");
        p.l(r4, "deviceName");
        this.f164184a = r2;
        this.f164185b = r3;
        this.f164186c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f164186c;
    }

    public final String b() {
        return this.f164185b;
    }

    public final long c() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f164184a, r82.f164184a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f164185b, r82.f164185b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f164186c, r82.f164186c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f164184a.hashCode() * 31) + this.f164185b.hashCode()) * 31) + this.f164186c.hashCode()) * 31) + Long.hashCode(this.d);
    }

    public String toString() {
        return "ChangeTrustedDeviceRequestUIState(token=" + this.f164184a + ", promptToken=" + this.f164185b + ", deviceName=" + this.f164186c + ", resendTimeLeft=" + this.d + ')';
    }
}
