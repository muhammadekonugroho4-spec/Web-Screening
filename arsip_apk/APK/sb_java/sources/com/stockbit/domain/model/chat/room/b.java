package com.stockbit.domain.model.chat.room;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f81327a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81328b;

    /* renamed from: c, reason: collision with root package name */
    public final g f81329c;
    public final boolean d;

    public b(int r2, String r3, g r4, boolean r5) {
        p.l(r3, "type");
        p.l(r4, "info");
        this.f81327a = r2;
        this.f81328b = r3;
        this.f81329c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f81327a;
    }

    public final g b() {
        return this.f81329c;
    }

    public final String c() {
        return this.f81328b;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f81327a == r52.f81327a) goto L12;
        return false;
    L12:
        if (p.g(this.f81328b, r52.f81328b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81329c, r52.f81329c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f81327a) * 31) + this.f81328b.hashCode()) * 31) + this.f81329c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "ReceiverEntity(id=" + this.f81327a + ", type=" + this.f81328b + ", info=" + this.f81329c + ", isShareable=" + this.d + ")";
    }
}
