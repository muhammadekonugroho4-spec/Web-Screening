package com.stockbit.usecase.sharetrade.param;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f162922a;

    /* renamed from: b, reason: collision with root package name */
    public final String f162923b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f162924c;
    public final boolean d;

    public a(int r2, String r3, boolean r4, boolean r5) {
        p.l(r3, "type");
        this.f162922a = r2;
        this.f162923b = r3;
        this.f162924c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f162922a;
    }

    public final String b() {
        return this.f162923b;
    }

    public final boolean c() {
        return this.f162924c;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f162922a == r52.f162922a) goto L12;
        return false;
    L12:
        if (p.g(this.f162923b, r52.f162923b) == true) goto L15;
        return false;
    L15:
        if (this.f162924c == r52.f162924c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f162922a) * 31) + this.f162923b.hashCode()) * 31) + Boolean.hashCode(this.f162924c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "AutoShareTargetParam(id=" + this.f162922a + ", type=" + this.f162923b + ", isSelected=" + this.f162924c + ", isShareValue=" + this.d + ")";
    }
}
