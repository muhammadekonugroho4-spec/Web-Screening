package com.stockbit.domain.model.tradingpin;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86084a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86085b;

    public a(String r2, String r3) {
        p.l(r2, "channel");
        p.l(r3, "target");
        this.f86084a = r2;
        this.f86085b = r3;
    }

    public final String a() {
        return this.f86084a;
    }

    public final String b() {
        return this.f86085b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f86084a, r52.f86084a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86085b, r52.f86085b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86084a.hashCode() * 31) + this.f86085b.hashCode();
    }

    public String toString() {
        return "ChangePinChannelEntity(channel=" + this.f86084a + ", target=" + this.f86085b + ")";
    }
}
