package com.stockbit.networktroubleshoot.listener;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f122664a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122665b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122666c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f122667e;

    public n(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "endpoint");
        p.l(r3, "gateway");
        p.l(r4, "failureType");
        p.l(r5, "exceptionName");
        p.l(r6, "causeChain");
        this.f122664a = r2;
        this.f122665b = r3;
        this.f122666c = r4;
        this.d = r5;
        this.f122667e = r6;
    }

    public final String a() {
        return this.f122667e;
    }

    public final String b() {
        return this.f122664a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f122666c;
    }

    public final String e() {
        return this.f122665b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f122664a, r52.f122664a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122665b, r52.f122665b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122666c, r52.f122666c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f122667e, r52.f122667e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f122664a.hashCode() * 31) + this.f122665b.hashCode()) * 31) + this.f122666c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f122667e.hashCode();
    }

    public String toString() {
        return "NetworkFailureLog(endpoint=" + this.f122664a + ", gateway=" + this.f122665b + ", failureType=" + this.f122666c + ", exceptionName=" + this.d + ", causeChain=" + this.f122667e + ')';
    }
}
