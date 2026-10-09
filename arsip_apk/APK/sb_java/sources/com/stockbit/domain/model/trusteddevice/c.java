package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f86119a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86120b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86121c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86122e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86123f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86124g;

    /* renamed from: h, reason: collision with root package name */
    public final String f86125h;

    public c(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, "token");
        p.l(r3, "fullName");
        p.l(r4, "username");
        p.l(r5, "deviceName");
        p.l(r6, "loginMethod");
        p.l(r7, "city");
        p.l(r8, "country");
        p.l(r9, "requestedAt");
        this.f86119a = r2;
        this.f86120b = r3;
        this.f86121c = r4;
        this.d = r5;
        this.f86122e = r6;
        this.f86123f = r7;
        this.f86124g = r8;
        this.f86125h = r9;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f86119a, r52.f86119a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86120b, r52.f86120b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86121c, r52.f86121c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f86122e, r52.f86122e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f86123f, r52.f86123f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f86124g, r52.f86124g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f86125h, r52.f86125h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        return (((((((((((((this.f86119a.hashCode() * 31) + this.f86120b.hashCode()) * 31) + this.f86121c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f86122e.hashCode()) * 31) + this.f86123f.hashCode()) * 31) + this.f86124g.hashCode()) * 31) + this.f86125h.hashCode();
    }

    public String toString() {
        return "LoginRequesterDetailEntity(token=" + this.f86119a + ", fullName=" + this.f86120b + ", username=" + this.f86121c + ", deviceName=" + this.d + ", loginMethod=" + this.f86122e + ", city=" + this.f86123f + ", country=" + this.f86124g + ", requestedAt=" + this.f86125h + ")";
    }
}
