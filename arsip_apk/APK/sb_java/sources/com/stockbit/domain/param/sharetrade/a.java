package com.stockbit.domain.param.sharetrade;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f87593a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87594b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87595c;
    public final boolean d;

    public a(int r2, String r3, boolean r4, boolean r5) {
        p.l(r3, "type");
        this.f87593a = r2;
        this.f87594b = r3;
        this.f87595c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f87593a;
    }

    public final String b() {
        return this.f87594b;
    }

    public final boolean c() {
        return this.f87595c;
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
        if (this.f87593a == r52.f87593a) goto L12;
        return false;
    L12:
        if (p.g(this.f87594b, r52.f87594b) == true) goto L15;
        return false;
    L15:
        if (this.f87595c == r52.f87595c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f87593a) * 31) + this.f87594b.hashCode()) * 31) + Boolean.hashCode(this.f87595c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "AutoShareTargetDomainParam(id=" + this.f87593a + ", type=" + this.f87594b + ", isSelected=" + this.f87595c + ", isShareValue=" + this.d + ")";
    }
}
