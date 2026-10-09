package com.stockbit.domain.model.securities.portfolio;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85714a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85715b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85716c;

    public l(boolean r2, String r3, String r4) {
        p.l(r3, "timeServer");
        p.l(r4, "message");
        this.f85714a = r2;
        this.f85715b = r3;
        this.f85716c = r4;
    }

    public final String a() {
        return this.f85716c;
    }

    public final boolean b() {
        return this.f85714a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (this.f85714a == r52.f85714a) goto L12;
        return false;
    L12:
        if (p.g(this.f85715b, r52.f85715b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85716c, r52.f85716c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f85714a) * 31) + this.f85715b.hashCode()) * 31) + this.f85716c.hashCode();
    }

    public String toString() {
        return "TradableStatusEntity(isTradable=" + this.f85714a + ", timeServer=" + this.f85715b + ", message=" + this.f85716c + ")";
    }
}
