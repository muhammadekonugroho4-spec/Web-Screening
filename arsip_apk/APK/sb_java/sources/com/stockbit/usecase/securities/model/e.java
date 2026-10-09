package com.stockbit.usecase.securities.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f160542a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160543b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f160544c;

    public e(String r2, String r3, boolean r4) {
        p.l(r2, "sessionId");
        p.l(r3, "verificationToken");
        this.f160542a = r2;
        this.f160543b = r3;
        this.f160544c = r4;
    }

    public final boolean a() {
        return this.f160544c;
    }

    public final String b() {
        return this.f160542a;
    }

    public final String c() {
        return this.f160543b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f160542a, r52.f160542a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160543b, r52.f160543b) == true) goto L15;
        return false;
    L15:
        if (this.f160544c == r52.f160544c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f160542a.hashCode() * 31) + this.f160543b.hashCode()) * 31) + Boolean.hashCode(this.f160544c);
    }

    public String toString() {
        return "InitializeSecuritiesVerificationUIState(sessionId=" + this.f160542a + ", verificationToken=" + this.f160543b + ", goAhead=" + this.f160544c + ")";
    }
}
