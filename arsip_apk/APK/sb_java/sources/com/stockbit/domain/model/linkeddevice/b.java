package com.stockbit.domain.model.linkeddevice;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f84219a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84220b;

    /* renamed from: c, reason: collision with root package name */
    public final List f84221c;
    public final d d;

    public b(int r2, String r3, List r4, d r5) {
        p.l(r3, "nextCursor");
        p.l(r4, "deviceSessions");
        this.f84219a = r2;
        this.f84220b = r3;
        this.f84221c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.f84221c;
    }

    public final String b() {
        return this.f84220b;
    }

    public final int c() {
        return this.f84219a;
    }

    public final d d() {
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
        if (this.f84219a == r52.f84219a) goto L12;
        return false;
    L12:
        if (p.g(this.f84220b, r52.f84220b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84221c, r52.f84221c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((Integer.hashCode(this.f84219a) * 31) + this.f84220b.hashCode()) * 31) + this.f84221c.hashCode()) * 31;
        d r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "DeviceListEntity(total=" + this.f84219a + ", nextCursor=" + this.f84220b + ", deviceSessions=" + this.f84221c + ", trustedDevice=" + this.d + ")";
    }
}
