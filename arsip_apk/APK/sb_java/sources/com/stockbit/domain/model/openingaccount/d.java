package com.stockbit.domain.model.openingaccount;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84527a;

    /* renamed from: b, reason: collision with root package name */
    public final f f84528b;

    public d(boolean r2, f r3) {
        p.l(r3, "ocr");
        this.f84527a = r2;
        this.f84528b = r3;
    }

    public final f a() {
        return this.f84528b;
    }

    public final boolean b() {
        return this.f84527a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f84527a == r52.f84527a) goto L12;
        return false;
    L12:
        if (p.g(this.f84528b, r52.f84528b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f84527a) * 31) + this.f84528b.hashCode();
    }

    public String toString() {
        return "OABibitStatusEntity(isRegistered=" + this.f84527a + ", ocr=" + this.f84528b + ")";
    }
}
