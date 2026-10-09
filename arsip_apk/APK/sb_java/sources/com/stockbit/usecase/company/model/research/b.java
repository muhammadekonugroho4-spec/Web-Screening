package com.stockbit.usecase.company.model.research;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final MaskedTextType f156562a;

    /* renamed from: b, reason: collision with root package name */
    public final c f156563b;

    public b(MaskedTextType r2, c r3) {
        p.l(r2, "type");
        p.l(r3, "ref");
        this.f156562a = r2;
        this.f156563b = r3;
    }

    public final c a() {
        return this.f156563b;
    }

    public final MaskedTextType b() {
        return this.f156562a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f156562a == r52.f156562a) goto L12;
        return false;
    L12:
        if (p.g(this.f156563b, r52.f156563b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156562a.hashCode() * 31) + this.f156563b.hashCode();
    }

    public String toString() {
        return "MaskedTextLinkUIState(type=" + this.f156562a + ", ref=" + this.f156563b + ")";
    }
}
