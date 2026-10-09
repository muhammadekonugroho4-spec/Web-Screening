package com.stockbit.usecase.securities.account.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f160185a;

    /* renamed from: b, reason: collision with root package name */
    public final b f160186b;

    public a(boolean r2, b r3) {
        p.l(r3, "ocr");
        this.f160185a = r2;
        this.f160186b = r3;
    }

    public final b a() {
        return this.f160186b;
    }

    public final boolean b() {
        return this.f160185a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f160185a == r52.f160185a) goto L12;
        return false;
    L12:
        if (p.g(this.f160186b, r52.f160186b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f160185a) * 31) + this.f160186b.hashCode();
    }

    public String toString() {
        return "BibitRegistrationStatusUIState(isRegistered=" + this.f160185a + ", ocr=" + this.f160186b + ")";
    }
}
