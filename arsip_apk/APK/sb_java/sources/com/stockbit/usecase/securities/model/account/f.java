package com.stockbit.usecase.securities.model.account;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f160382a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f160383b;

    /* renamed from: c, reason: collision with root package name */
    public final g f160384c;

    public f(List r2, boolean r3, g r4) {
        p.l(r2, "accounts");
        this.f160382a = r2;
        this.f160383b = r3;
        this.f160384c = r4;
    }

    public List a() {
        return this.f160382a;
    }

    public final g b() {
        return this.f160384c;
    }

    public boolean c() {
        return this.f160383b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f160382a, r52.f160382a) == true) goto L12;
        return false;
    L12:
        if (this.f160383b == r52.f160383b) goto L15;
        return false;
    L15:
        if (p.g(this.f160384c, r52.f160384c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f160382a.hashCode() * 31) + Boolean.hashCode(this.f160383b)) * 31;
        g r1 = this.f160384c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "Regular(accounts=" + this.f160382a + ", isAvailableToAddAccount=" + this.f160383b + ", unavailableAddAccountReason=" + this.f160384c + ")";
    }
}
