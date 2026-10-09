package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f86117a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86118b;

    public b(String r2, String r3) {
        p.l(r2, "token");
        p.l(r3, "next");
        this.f86117a = r2;
        this.f86118b = r3;
    }

    public final String a() {
        return this.f86118b;
    }

    public final String b() {
        return this.f86117a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f86117a, r52.f86117a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86118b, r52.f86118b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86117a.hashCode() * 31) + this.f86118b.hashCode();
    }

    public String toString() {
        return "ChangeTrustedDevicePromptEntity(token=" + this.f86117a + ", next=" + this.f86118b + ")";
    }
}
