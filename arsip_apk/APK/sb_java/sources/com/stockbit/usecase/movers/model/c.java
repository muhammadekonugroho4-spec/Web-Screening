package com.stockbit.usecase.movers.model;

import com.stockbit.usecase.movers.model.type.MoversParamType;
import com.stockbit.usecase.movers.model.type.MoversTabType;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f158519a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f158520b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158521c;
    public final MoversTabType d;

    /* renamed from: e, reason: collision with root package name */
    public final MoversParamType f158522e;

    public c(List r2, boolean r3, String r4, MoversTabType r5, MoversParamType r6) {
        p.l(r2, "movers");
        p.l(r4, "netForeignUpdatedAt");
        p.l(r5, "moversTabType");
        p.l(r6, "moversParamType");
        this.f158519a = r2;
        this.f158520b = r3;
        this.f158521c = r4;
        this.d = r5;
        this.f158522e = r6;
    }

    public final List a() {
        return this.f158519a;
    }

    public final MoversParamType b() {
        return this.f158522e;
    }

    public final MoversTabType c() {
        return this.d;
    }

    public final String d() {
        return this.f158521c;
    }

    public final boolean e() {
        return this.f158520b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f158519a, r52.f158519a) == true) goto L12;
        return false;
    L12:
        if (this.f158520b == r52.f158520b) goto L15;
        return false;
    L15:
        if (p.g(this.f158521c, r52.f158521c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f158522e == r52.f158522e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f158519a.hashCode() * 31) + Boolean.hashCode(this.f158520b)) * 31) + this.f158521c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f158522e.hashCode();
    }

    public String toString() {
        return "MoversListUIState(movers=" + this.f158519a + ", isShowNetForeign=" + this.f158520b + ", netForeignUpdatedAt=" + this.f158521c + ", moversTabType=" + this.d + ", moversParamType=" + this.f158522e + ")";
    }
}
