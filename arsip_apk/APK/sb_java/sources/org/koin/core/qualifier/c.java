package org.koin.core.qualifier;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f182589a;

    public c(String r2) {
        p.l(r2, "value");
        this.f182589a = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(getValue(), ((c) r4).getValue()) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // org.koin.core.qualifier.a
    public String getValue() {
        return this.f182589a;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue();
    }
}
