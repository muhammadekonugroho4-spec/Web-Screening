package com.stockbit.navigation.deeplink.model;

import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f122451a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122452b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122453c;
    public final Map d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f122454e;

    /* renamed from: f, reason: collision with root package name */
    public final String f122455f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f122456g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f122457h;

    public a(String r2, String r3, String r4, Map r5, Map r6, String r7, boolean r8, boolean r9) {
        p.l(r2, "schema");
        p.l(r3, "host");
        p.l(r4, "path");
        p.l(r5, "queries");
        p.l(r6, "dynamicPaths");
        p.l(r7, "fullUrl");
        this.f122451a = r2;
        this.f122452b = r3;
        this.f122453c = r4;
        this.d = r5;
        this.f122454e = r6;
        this.f122455f = r7;
        this.f122456g = r8;
        this.f122457h = r9;
    }

    public final Map a() {
        return this.f122454e;
    }

    public final String b() {
        return this.f122455f;
    }

    public final Map c() {
        return this.d;
    }

    public final String d() {
        return this.f122451a;
    }

    public final boolean e() {
        return this.f122456g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f122451a, r52.f122451a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122452b, r52.f122452b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122453c, r52.f122453c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f122454e, r52.f122454e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f122455f, r52.f122455f) == true) goto L27;
        return false;
    L27:
        if (this.f122456g == r52.f122456g) goto L30;
        return false;
    L30:
        if (this.f122457h == r52.f122457h) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f122457h;
    }

    public int hashCode() {
        return (((((((((((((this.f122451a.hashCode() * 31) + this.f122452b.hashCode()) * 31) + this.f122453c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f122454e.hashCode()) * 31) + this.f122455f.hashCode()) * 31) + Boolean.hashCode(this.f122456g)) * 31) + Boolean.hashCode(this.f122457h);
    }

    public String toString() {
        return "DeeplinkData(schema=" + this.f122451a + ", host=" + this.f122452b + ", path=" + this.f122453c + ", queries=" + this.d + ", dynamicPaths=" + this.f122454e + ", fullUrl=" + this.f122455f + ", isAccessingFromInsideApp=" + this.f122456g + ", isUserLoggedIn=" + this.f122457h + ')';
    }
}
