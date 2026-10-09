package com.stockbit.usecase.ktur.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f158174a;

    /* renamed from: b, reason: collision with root package name */
    public final List f158175b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158176c;

    public a(List r2, List r3, String r4) {
        p.l(r2, "upcoming");
        p.l(r3, "ongoing");
        p.l(r4, "nextCursor");
        this.f158174a = r2;
        this.f158175b = r3;
        this.f158176c = r4;
    }

    public final String a() {
        return this.f158176c;
    }

    public final List b() {
        return this.f158175b;
    }

    public final List c() {
        return this.f158174a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f158174a, r52.f158174a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158175b, r52.f158175b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158176c, r52.f158176c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f158174a.hashCode() * 31) + this.f158175b.hashCode()) * 31) + this.f158176c.hashCode();
    }

    public String toString() {
        return "KTURListUIState(upcoming=" + this.f158174a + ", ongoing=" + this.f158175b + ", nextCursor=" + this.f158176c + ")";
    }
}
