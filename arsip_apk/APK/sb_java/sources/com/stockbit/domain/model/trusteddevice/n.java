package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f86157a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86158b;

    public n(String r2, String r3) {
        p.l(r2, "token");
        p.l(r3, "next");
        this.f86157a = r2;
        this.f86158b = r3;
    }

    public final String a() {
        return this.f86158b;
    }

    public final String b() {
        return this.f86157a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f86157a, r52.f86157a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86158b, r52.f86158b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86157a.hashCode() * 31) + this.f86158b.hashCode();
    }

    public String toString() {
        return "TrustedDeviceStepEntity(token=" + this.f86157a + ", next=" + this.f86158b + ")";
    }
}
