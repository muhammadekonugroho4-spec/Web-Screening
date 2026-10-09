package com.stockbit.usecase.company.model.profile;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f156483a;

    /* renamed from: b, reason: collision with root package name */
    public final List f156484b;

    public e(List r2, List r3) {
        p.l(r2, "groupDirectors");
        p.l(r3, "groupCommissioners");
        this.f156483a = r2;
        this.f156484b = r3;
    }

    public final List a() {
        return this.f156484b;
    }

    public final List b() {
        return this.f156483a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f156483a, r52.f156483a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156484b, r52.f156484b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156483a.hashCode() * 31) + this.f156484b.hashCode();
    }

    public String toString() {
        return "CompanyProfileExecutiveUIState(groupDirectors=" + this.f156483a + ", groupCommissioners=" + this.f156484b + ")";
    }
}
