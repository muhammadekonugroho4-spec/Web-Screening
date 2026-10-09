package com.stockbit.domain.model.securities.common;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f85084a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85085b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85086c;

    public f(String r2, String r3, String r4) {
        p.l(r2, "sessionType");
        p.l(r3, "sessionPhase");
        p.l(r4, "message");
        this.f85084a = r2;
        this.f85085b = r3;
        this.f85086c = r4;
    }

    public final String a() {
        return this.f85086c;
    }

    public final String b() {
        return this.f85085b;
    }

    public final String c() {
        return this.f85084a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f85084a, r52.f85084a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85085b, r52.f85085b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85086c, r52.f85086c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85084a.hashCode() * 31) + this.f85085b.hashCode()) * 31) + this.f85086c.hashCode();
    }

    public String toString() {
        return "FullCallAuctionCycleEntity(sessionType=" + this.f85084a + ", sessionPhase=" + this.f85085b + ", message=" + this.f85086c + ")";
    }
}
