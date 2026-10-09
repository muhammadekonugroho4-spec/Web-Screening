package com.stockbit.domain.model.insider;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84156a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84157b;

    public c(boolean r2, List r3) {
        p.l(r3, "insider");
        this.f84156a = r2;
        this.f84157b = r3;
    }

    public final List a() {
        return this.f84157b;
    }

    public final boolean b() {
        return this.f84156a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f84156a == r52.f84156a) goto L12;
        return false;
    L12:
        if (p.g(this.f84157b, r52.f84157b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f84156a) * 31) + this.f84157b.hashCode();
    }

    public String toString() {
        return "InsiderCompanyEntity(isMore=" + this.f84156a + ", insider=" + this.f84157b + ")";
    }
}
