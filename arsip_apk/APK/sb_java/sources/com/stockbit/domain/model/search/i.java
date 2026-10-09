package com.stockbit.domain.model.search;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f84970a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84971b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84972c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84973e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84974f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84975g;

    /* renamed from: h, reason: collision with root package name */
    public final List f84976h;

    public i(String r2, boolean r3, String r4, String r5, boolean r6, boolean r7, String r8, List r9) {
        p.l(r2, Constants.KEY_ID);
        p.l(r4, "permalink");
        p.l(r5, "type");
        p.l(r8, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r9, "categories");
        this.f84970a = r2;
        this.f84971b = r3;
        this.f84972c = r4;
        this.d = r5;
        this.f84973e = r6;
        this.f84974f = r7;
        this.f84975g = r8;
        this.f84976h = r9;
    }

    public final String a() {
        return this.f84970a;
    }

    public final String b() {
        return this.f84975g;
    }

    public final String c() {
        return this.f84972c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.f84973e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f84970a, r52.f84970a) == true) goto L12;
        return false;
    L12:
        if (this.f84971b == r52.f84971b) goto L15;
        return false;
    L15:
        if (p.g(this.f84972c, r52.f84972c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f84973e == r52.f84973e) goto L24;
        return false;
    L24:
        if (this.f84974f == r52.f84974f) goto L27;
        return false;
    L27:
        if (p.g(this.f84975g, r52.f84975g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84976h, r52.f84976h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f84974f;
    }

    public final boolean g() {
        return this.f84971b;
    }

    public int hashCode() {
        return (((((((((((((this.f84970a.hashCode() * 31) + Boolean.hashCode(this.f84971b)) * 31) + this.f84972c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f84973e)) * 31) + Boolean.hashCode(this.f84974f)) * 31) + this.f84975g.hashCode()) * 31) + this.f84976h.hashCode();
    }

    public String toString() {
        return "SearchInsiderEntity(id=" + this.f84970a + ", isTradeAble=" + this.f84971b + ", permalink=" + this.f84972c + ", type=" + this.d + ", isFollowed=" + this.f84973e + ", isOfficial=" + this.f84974f + ", label=" + this.f84975g + ", categories=" + this.f84976h + ")";
    }
}
