package com.stockbit.domain.model.entity.securities;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f83492a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83493b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83494c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f83495e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83496f;

    public f(String r2, String r3, String r4, boolean r5, boolean r6, String r7) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "companyName");
        kotlin.jvm.internal.p.l(r4, "logo");
        kotlin.jvm.internal.p.l(r7, "badgeText");
        this.f83492a = r2;
        this.f83493b = r3;
        this.f83494c = r4;
        this.d = r5;
        this.f83495e = r6;
        this.f83496f = r7;
    }

    public final String a() {
        return this.f83496f;
    }

    public final String b() {
        return this.f83493b;
    }

    public final String c() {
        return this.f83494c;
    }

    public final String d() {
        return this.f83492a;
    }

    public final boolean e() {
        return this.f83495e;
    }

    public final boolean f() {
        return this.d;
    }
}
