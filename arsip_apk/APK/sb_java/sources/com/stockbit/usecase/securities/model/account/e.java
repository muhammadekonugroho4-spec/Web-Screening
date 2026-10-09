package com.stockbit.usecase.securities.model.account;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f160380a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f160381b;

    public e(List r2, boolean r3) {
        p.l(r2, "accounts");
        this.f160380a = r2;
        this.f160381b = r3;
    }

    public List a() {
        return this.f160380a;
    }

    public boolean b() {
        return this.f160381b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f160380a, r52.f160380a) == true) goto L12;
        return false;
    L12:
        if (this.f160381b == r52.f160381b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f160380a.hashCode() * 31) + Boolean.hashCode(this.f160381b);
    }

    public String toString() {
        return "Margin(accounts=" + this.f160380a + ", isAvailableToAddAccount=" + this.f160381b + ")";
    }
}
