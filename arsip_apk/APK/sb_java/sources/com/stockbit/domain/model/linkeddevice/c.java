package com.stockbit.domain.model.linkeddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84222a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84223b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84224c;

    public c(String r2, String r3, String r4) {
        p.l(r2, "type");
        p.l(r3, "createdAt");
        p.l(r4, "updatedAt");
        this.f84222a = r2;
        this.f84223b = r3;
        this.f84224c = r4;
    }

    public final String a() {
        return this.f84223b;
    }

    public final String b() {
        return this.f84222a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f84222a, r52.f84222a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84223b, r52.f84223b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84224c, r52.f84224c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84222a.hashCode() * 31) + this.f84223b.hashCode()) * 31) + this.f84224c.hashCode();
    }

    public String toString() {
        return "DeviceLoginEntity(type=" + this.f84222a + ", createdAt=" + this.f84223b + ", updatedAt=" + this.f84224c + ")";
    }
}
