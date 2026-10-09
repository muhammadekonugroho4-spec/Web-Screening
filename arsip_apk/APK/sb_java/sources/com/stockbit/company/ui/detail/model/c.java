package com.stockbit.company.ui.detail.model;

import java.util.ArrayList;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f65691a;

    /* renamed from: b, reason: collision with root package name */
    public final String f65692b;

    /* renamed from: c, reason: collision with root package name */
    public final String f65693c;
    public final boolean d;

    static {
    }

    public c(ArrayList r2, String r3, String r4, boolean r5) {
        p.l(r2, "notations");
        p.l(r3, "companySymbol");
        p.l(r4, "companyName");
        this.f65691a = r2;
        this.f65692b = r3;
        this.f65693c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f65693c;
    }

    public final String b() {
        return this.f65692b;
    }

    public final ArrayList c() {
        return this.f65691a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f65691a, r52.f65691a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f65692b, r52.f65692b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f65693c, r52.f65693c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f65691a.hashCode() * 31) + this.f65692b.hashCode()) * 31) + this.f65693c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "CompanyNotationDataHolder(notations=" + this.f65691a + ", companySymbol=" + this.f65692b + ", companyName=" + this.f65693c + ", companyUma=" + this.d + ')';
    }
}
