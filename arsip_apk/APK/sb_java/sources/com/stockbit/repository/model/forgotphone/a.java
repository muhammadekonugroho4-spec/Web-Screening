package com.stockbit.repository.model.forgotphone;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f130219a;

    /* renamed from: b, reason: collision with root package name */
    public final b f130220b;

    public a(String r2, b r3) {
        p.l(r2, "token");
        this.f130219a = r2;
        this.f130220b = r3;
    }

    public final b a() {
        return this.f130220b;
    }

    public final String b() {
        return this.f130219a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f130219a, r52.f130219a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f130220b, r52.f130220b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f130219a.hashCode() * 31;
        b r1 = this.f130220b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ForgotPhoneEntity(token=" + this.f130219a + ", nextState=" + this.f130220b + ")";
    }
}
