package com.stockbit.navigation.deeplink.model;

import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f122462a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122463b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122464c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f122465e;

    public d(String r2, String r3, String r4, String r5, Map r6) {
        p.l(r2, "fullUrl");
        p.l(r3, "scheme");
        p.l(r4, "authority");
        p.l(r5, "path");
        p.l(r6, "queryParameterValues");
        this.f122462a = r2;
        this.f122463b = r3;
        this.f122464c = r4;
        this.d = r5;
        this.f122465e = r6;
    }

    public static /* synthetic */ d b(d r02, String r1, String r2, String r3, String r4, Map r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.f122462a;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.f122463b;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.f122464c;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.f122465e;
    L17:
        String r62 = r4;
        Map r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72);
    }

    public final d a(String r8, String r9, String r10, String r11, Map r12) {
        p.l(r8, "fullUrl");
        p.l(r9, "scheme");
        p.l(r10, "authority");
        p.l(r11, "path");
        p.l(r12, "queryParameterValues");
        return new d(r8, r9, r10, r11, r12);
    }

    public final String c() {
        return this.f122464c;
    }

    public final String d() {
        return this.f122462a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f122462a, r52.f122462a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122463b, r52.f122463b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122464c, r52.f122464c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f122465e, r52.f122465e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final Map f() {
        return this.f122465e;
    }

    public final String g() {
        return this.f122463b;
    }

    public int hashCode() {
        return (((((((this.f122462a.hashCode() * 31) + this.f122463b.hashCode()) * 31) + this.f122464c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f122465e.hashCode();
    }

    public String toString() {
        return this.f122462a;
    }
}
