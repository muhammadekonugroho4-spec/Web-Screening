package com.stockbit.usecase.trading.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f163337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163338b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163339c;

    public c(boolean r2, String r3, String r4) {
        p.l(r3, "titleMessage");
        p.l(r4, "subTitleMessage");
        this.f163337a = r2;
        this.f163338b = r3;
        this.f163339c = r4;
    }

    public final String a() {
        return this.f163339c;
    }

    public final String b() {
        return this.f163338b;
    }

    public final boolean c() {
        return this.f163337a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f163337a == r52.f163337a) goto L12;
        return false;
    L12:
        if (p.g(this.f163338b, r52.f163338b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163339c, r52.f163339c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f163337a) * 31) + this.f163338b.hashCode()) * 31) + this.f163339c.hashCode();
    }

    public String toString() {
        return "ValidateRegistrationImageUIData(isWarning=" + this.f163337a + ", titleMessage=" + this.f163338b + ", subTitleMessage=" + this.f163339c + ")";
    }
}
