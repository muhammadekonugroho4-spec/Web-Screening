package com.stockbit.usecase.linkeddevice.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f158216a;

    public c(String r2) {
        p.l(r2, "message");
        this.f158216a = r2;
    }

    public final String a() {
        return this.f158216a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f158216a, ((c) r4).f158216a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f158216a.hashCode();
    }

    public String toString() {
        return "ConfirmationError(message=" + this.f158216a + ")";
    }
}
