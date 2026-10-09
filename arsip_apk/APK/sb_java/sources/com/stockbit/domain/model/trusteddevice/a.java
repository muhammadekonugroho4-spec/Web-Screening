package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86114a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86115b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86116c;
    public final String d;

    public a(String r2, String r3, String r4, String r5) {
        p.l(r2, "token");
        p.l(r3, "promptToken");
        p.l(r4, "deviceName");
        p.l(r5, "nextAttemptTime");
        this.f86114a = r2;
        this.f86115b = r3;
        this.f86116c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f86116c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f86115b;
    }

    public final String d() {
        return this.f86114a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f86114a, r52.f86114a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86115b, r52.f86115b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86116c, r52.f86116c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f86114a.hashCode() * 31) + this.f86115b.hashCode()) * 31) + this.f86116c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ChallengeChangeTrustedDeviceEntity(token=" + this.f86114a + ", promptToken=" + this.f86115b + ", deviceName=" + this.f86116c + ", nextAttemptTime=" + this.d + ")";
    }
}
