package com.stockbit.domain.model.search;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f84927a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84928b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84929c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84930e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84931f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84932g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84933h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84934i;

    /* renamed from: j, reason: collision with root package name */
    public final long f84935j;

    /* renamed from: k, reason: collision with root package name */
    public final String f84936k;

    /* renamed from: l, reason: collision with root package name */
    public final String f84937l;

    /* renamed from: m, reason: collision with root package name */
    public final String f84938m;

    /* renamed from: n, reason: collision with root package name */
    public final String f84939n;

    public d(long r12, String r14, boolean r15, String r16, String r17, String r18, String r19, String r20, String r21, long r22, String r24, String r25, String r26, String r27) {
        p.l(r14, "iconUrl");
        p.l(r16, "img");
        p.l(r17, "keyword");
        p.l(r18, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r19, "market");
        p.l(r20, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r21, "permalink");
        p.l(r24, "symbol");
        p.l(r25, "symbol2");
        p.l(r26, "type");
        p.l(r27, "url");
        this.f84927a = r12;
        this.f84928b = r14;
        this.f84929c = r15;
        this.d = r16;
        this.f84930e = r17;
        this.f84931f = r18;
        this.f84932g = r19;
        this.f84933h = r20;
        this.f84934i = r21;
        this.f84935j = r22;
        this.f84936k = r24;
        this.f84937l = r25;
        this.f84938m = r26;
        this.f84939n = r27;
    }

    public final String a() {
        return this.f84928b;
    }

    public final long b() {
        return this.f84927a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f84930e;
    }

    public final String e() {
        return this.f84932g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (this.f84927a == r82.f84927a) goto L12;
        return false;
    L12:
        if (p.g(this.f84928b, r82.f84928b) == true) goto L15;
        return false;
    L15:
        if (this.f84929c == r82.f84929c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84930e, r82.f84930e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84931f, r82.f84931f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84932g, r82.f84932g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84933h, r82.f84933h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84934i, r82.f84934i) == true) goto L36;
        return false;
    L36:
        if (this.f84935j == r82.f84935j) goto L39;
        return false;
    L39:
        if (p.g(this.f84936k, r82.f84936k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f84937l, r82.f84937l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f84938m, r82.f84938m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f84939n, r82.f84939n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f84933h;
    }

    public final long g() {
        return this.f84935j;
    }

    public final String h() {
        return this.f84936k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Long.hashCode(this.f84927a) * 31) + this.f84928b.hashCode()) * 31) + Boolean.hashCode(this.f84929c)) * 31) + this.d.hashCode()) * 31) + this.f84930e.hashCode()) * 31) + this.f84931f.hashCode()) * 31) + this.f84932g.hashCode()) * 31) + this.f84933h.hashCode()) * 31) + this.f84934i.hashCode()) * 31) + Long.hashCode(this.f84935j)) * 31) + this.f84936k.hashCode()) * 31) + this.f84937l.hashCode()) * 31) + this.f84938m.hashCode()) * 31) + this.f84939n.hashCode();
    }

    public final String i() {
        return this.f84937l;
    }

    public final String j() {
        return this.f84938m;
    }

    public final String k() {
        return this.f84939n;
    }

    public final boolean l() {
        return this.f84929c;
    }

    public String toString() {
        return "RecentSearchEntity(id=" + this.f84927a + ", iconUrl=" + this.f84928b + ", isVerified=" + this.f84929c + ", img=" + this.d + ", keyword=" + this.f84930e + ", label=" + this.f84931f + ", market=" + this.f84932g + ", name=" + this.f84933h + ", permalink=" + this.f84934i + ", searchId=" + this.f84935j + ", symbol=" + this.f84936k + ", symbol2=" + this.f84937l + ", type=" + this.f84938m + ", url=" + this.f84939n + ")";
    }
}
