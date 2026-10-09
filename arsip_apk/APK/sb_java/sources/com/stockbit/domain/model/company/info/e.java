package com.stockbit.domain.model.company.info;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f81624a;

    /* renamed from: b, reason: collision with root package name */
    public String f81625b;

    /* renamed from: c, reason: collision with root package name */
    public final f f81626c;

    public e(String r2, String r3, f r4) {
        p.l(r2, "notationCode");
        p.l(r3, "notationDesc");
        p.l(r4, "iconUrl");
        this.f81624a = r2;
        this.f81625b = r3;
        this.f81626c = r4;
    }

    public final String a() {
        return this.f81624a;
    }

    public final String b() {
        return this.f81625b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f81624a, r52.f81624a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81625b, r52.f81625b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81626c, r52.f81626c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81624a.hashCode() * 31) + this.f81625b.hashCode()) * 31) + this.f81626c.hashCode();
    }

    public String toString() {
        return "CompanyNotationEntity(notationCode=" + this.f81624a + ", notationDesc=" + this.f81625b + ", iconUrl=" + this.f81626c + ")";
    }
}
