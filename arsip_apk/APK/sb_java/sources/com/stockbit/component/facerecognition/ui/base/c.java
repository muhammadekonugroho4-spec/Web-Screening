package com.stockbit.component.facerecognition.ui.base;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f71101a;

    static {
    }

    public c(String r2) {
        p.l(r2, "correlationId");
        this.f71101a = r2;
    }

    public final String a() {
        return this.f71101a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f71101a, ((c) r4).f71101a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f71101a.hashCode();
    }

    public String toString() {
        return "GetSessionResult(correlationId=" + this.f71101a + ')';
    }
}
