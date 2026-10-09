package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f86152a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86153b;

    public l(String r2, String r3) {
        p.l(r2, "removalToken");
        p.l(r3, "verificationToken");
        this.f86152a = r2;
        this.f86153b = r3;
    }

    public final String a() {
        return this.f86152a;
    }

    public final String b() {
        return this.f86153b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (p.g(this.f86152a, r52.f86152a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86153b, r52.f86153b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86152a.hashCode() * 31) + this.f86153b.hashCode();
    }

    public String toString() {
        return "TrustedDeviceRemovalInitiationEntity(removalToken=" + this.f86152a + ", verificationToken=" + this.f86153b + ")";
    }
}
