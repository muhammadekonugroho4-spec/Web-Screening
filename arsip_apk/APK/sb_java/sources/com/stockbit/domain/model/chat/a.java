package com.stockbit.domain.model.chat;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81192b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81193c;
    public final boolean d;

    public a(boolean r2, String r3, boolean r4, boolean r5) {
        p.l(r3, "verifiedStatus");
        this.f81191a = r2;
        this.f81192b = r3;
        this.f81193c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f81192b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.f81193c;
    }

    public final boolean d() {
        return this.f81191a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f81191a == r52.f81191a) goto L12;
        return false;
    L12:
        if (p.g(this.f81192b, r52.f81192b) == true) goto L15;
        return false;
    L15:
        if (this.f81193c == r52.f81193c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f81191a) * 31) + this.f81192b.hashCode()) * 31) + Boolean.hashCode(this.f81193c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "ChatEligibilityEntity(isEligible=" + this.f81191a + ", verifiedStatus=" + this.f81192b + ", isChatEnabled=" + this.f81193c + ", isBlocked=" + this.d + ")";
    }
}
