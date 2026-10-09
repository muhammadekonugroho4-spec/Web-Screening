package com.stockbit.usecase.linkeddevice.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f158204a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158205b;

    /* renamed from: c, reason: collision with root package name */
    public final List f158206c;
    public final a d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f158207e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f158208f;

    public b(int r2, String r3, List r4, a r5, boolean r6, boolean r7) {
        p.l(r3, "nextCursor");
        p.l(r4, "devices");
        this.f158204a = r2;
        this.f158205b = r3;
        this.f158206c = r4;
        this.d = r5;
        this.f158207e = r6;
        this.f158208f = r7;
    }

    public final List a() {
        return this.f158206c;
    }

    public final String b() {
        return this.f158205b;
    }

    public final int c() {
        return this.f158204a;
    }

    public final a d() {
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
        if (this.f158204a == r52.f158204a) goto L12;
        return false;
    L12:
        if (p.g(this.f158205b, r52.f158205b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158206c, r52.f158206c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f158207e == r52.f158207e) goto L24;
        return false;
    L24:
        if (this.f158208f == r52.f158208f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r02 = ((((Integer.hashCode(this.f158204a) * 31) + this.f158205b.hashCode()) * 31) + this.f158206c.hashCode()) * 31;
        a r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((r02 + r12) * 31) + Boolean.hashCode(this.f158207e)) * 31) + Boolean.hashCode(this.f158208f);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "LinkedDeviceListUIState(total=" + this.f158204a + ", nextCursor=" + this.f158205b + ", devices=" + this.f158206c + ", trustedDevice=" + this.d + ", hasTrustedDevice=" + this.f158207e + ", isTrustedDevice=" + this.f158208f + ")";
    }
}
