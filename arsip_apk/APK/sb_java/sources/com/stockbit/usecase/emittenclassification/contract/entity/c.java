package com.stockbit.usecase.emittenclassification.contract.entity;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f157562a;

    /* renamed from: b, reason: collision with root package name */
    public final f f157563b;

    public c(List r2, f r3) {
        p.l(r2, "companies");
        p.l(r3, "pagination");
        this.f157562a = r2;
        this.f157563b = r3;
    }

    public final List a() {
        return this.f157562a;
    }

    public final f b() {
        return this.f157563b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f157562a, r52.f157562a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157563b, r52.f157563b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f157562a.hashCode() * 31) + this.f157563b.hashCode();
    }

    public String toString() {
        return "EmittenClassificationGroupEntity(companies=" + this.f157562a + ", pagination=" + this.f157563b + ")";
    }
}
