package com.stockbit.networktroubleshoot.model;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f122669a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122670b;

    public a(String r2, String r3) {
        p.l(r2, "host");
        p.l(r3, "result");
        this.f122669a = r2;
        this.f122670b = r3;
    }

    public final String a() {
        return this.f122669a;
    }

    public final String b() {
        return this.f122670b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f122669a, r52.f122669a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122670b, r52.f122670b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f122669a.hashCode() * 31) + this.f122670b.hashCode();
    }

    public String toString() {
        return "NetworkTroubleshootHostResult(host=" + this.f122669a + ", result=" + this.f122670b + ')';
    }
}
