package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f86127a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86128b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86129c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86130e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86131f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86132g;

    /* renamed from: h, reason: collision with root package name */
    public final String f86133h;

    /* renamed from: i, reason: collision with root package name */
    public final String f86134i;

    public e(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r2, "token");
        p.l(r3, "fullName");
        p.l(r4, "username");
        p.l(r5, "deviceName");
        p.l(r6, "loginMethod");
        p.l(r7, "city");
        p.l(r8, "country");
        p.l(r9, "requestedAt");
        p.l(r10, "purpose");
        this.f86127a = r2;
        this.f86128b = r3;
        this.f86129c = r4;
        this.d = r5;
        this.f86130e = r6;
        this.f86131f = r7;
        this.f86132g = r8;
        this.f86133h = r9;
        this.f86134i = r10;
    }

    public final String a() {
        return this.f86131f;
    }

    public final String b() {
        return this.f86132g;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f86134i;
    }

    public final String e() {
        return this.f86133h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f86127a, r52.f86127a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86128b, r52.f86128b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86129c, r52.f86129c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f86130e, r52.f86130e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f86131f, r52.f86131f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f86132g, r52.f86132g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f86133h, r52.f86133h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f86134i, r52.f86134i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f86127a;
    }

    public int hashCode() {
        return (((((((((((((((this.f86127a.hashCode() * 31) + this.f86128b.hashCode()) * 31) + this.f86129c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f86130e.hashCode()) * 31) + this.f86131f.hashCode()) * 31) + this.f86132g.hashCode()) * 31) + this.f86133h.hashCode()) * 31) + this.f86134i.hashCode();
    }

    public String toString() {
        return "PromptDetailTrustedDeviceEntity(token=" + this.f86127a + ", fullName=" + this.f86128b + ", username=" + this.f86129c + ", deviceName=" + this.d + ", loginMethod=" + this.f86130e + ", city=" + this.f86131f + ", country=" + this.f86132g + ", requestedAt=" + this.f86133h + ", purpose=" + this.f86134i + ")";
    }
}
