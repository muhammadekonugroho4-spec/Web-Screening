package com.stockbit.domain.model.movers;

import java.util.List;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final List f84383a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84384b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84385c;
    public final String d;

    public j(List r2, boolean r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "movers");
        kotlin.jvm.internal.p.l(r4, "netForeignUpdatedAt");
        kotlin.jvm.internal.p.l(r5, "type");
        this.f84383a = r2;
        this.f84384b = r3;
        this.f84385c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.f84383a;
    }

    public final String b() {
        return this.f84385c;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.f84384b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f84383a, r52.f84383a) == true) goto L12;
        return false;
    L12:
        if (this.f84384b == r52.f84384b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84385c, r52.f84385c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84383a.hashCode() * 31) + Boolean.hashCode(this.f84384b)) * 31) + this.f84385c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MoversListEntity(movers=" + this.f84383a + ", isShowNetForeign=" + this.f84384b + ", netForeignUpdatedAt=" + this.f84385c + ", type=" + this.d + ")";
    }
}
