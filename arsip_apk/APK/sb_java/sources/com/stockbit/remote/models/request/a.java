package com.stockbit.remote.models.request;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f129500a;

    public a(List r2) {
        p.l(r2, "types");
        this.f129500a = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f129500a, ((a) r4).f129500a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f129500a.hashCode();
    }

    public String toString() {
        return "NotificationReadRequest(types=" + this.f129500a + ')';
    }
}
