package com.stockbit.usecase.search.model;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final String f159941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159942b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159943c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f159944e;

    public A(String r2, String r3, String r4, String r5, boolean r6) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "iconUrl");
        kotlin.jvm.internal.p.l(r4, "username");
        kotlin.jvm.internal.p.l(r5, "url");
        this.f159941a = r2;
        this.f159942b = r3;
        this.f159943c = r4;
        this.d = r5;
        this.f159944e = r6;
    }

    public final String a() {
        return this.f159942b;
    }

    public final String b() {
        return this.f159941a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f159943c;
    }

    public final boolean e() {
        return this.f159944e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof A) == true) goto L8;
        return false;
    L8:
        A r52 = (A) r5;
        if (kotlin.jvm.internal.p.g(this.f159941a, r52.f159941a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f159942b, r52.f159942b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f159943c, r52.f159943c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f159944e == r52.f159944e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f159941a.hashCode() * 31) + this.f159942b.hashCode()) * 31) + this.f159943c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f159944e);
    }

    public String toString() {
        return "SearchPeople(id=" + this.f159941a + ", iconUrl=" + this.f159942b + ", username=" + this.f159943c + ", url=" + this.d + ", isVerified=" + this.f159944e + ")";
    }
}
