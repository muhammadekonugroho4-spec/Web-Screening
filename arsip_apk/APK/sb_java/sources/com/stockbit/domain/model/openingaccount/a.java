package com.stockbit.domain.model.openingaccount;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84518a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84519b;

    public a(String r2, String r3) {
        p.l(r2, "url");
        p.l(r3, "exit");
        this.f84518a = r2;
        this.f84519b = r3;
    }

    public final String a() {
        return this.f84519b;
    }

    public final String b() {
        return this.f84518a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84518a, r52.f84518a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84519b, r52.f84519b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84518a.hashCode() * 31) + this.f84519b.hashCode();
    }

    public String toString() {
        return "BibitAccountAccessEntity(url=" + this.f84518a + ", exit=" + this.f84519b + ")";
    }
}
