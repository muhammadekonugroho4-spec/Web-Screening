package com.appmattus.certificatetransparency.internal.loglist;

import com.appmattus.certificatetransparency.loglist.i;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class g extends i.a {

    /* renamed from: a, reason: collision with root package name */
    public final Exception f32104a;

    public g(Exception r2) {
        p.l(r2, "exception");
        this.f32104a = r2;
    }

    public final Exception a() {
        return this.f32104a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f32104a, ((g) r4).f32104a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f32104a.hashCode();
    }

    public String toString() {
        return "log-list.zip failed to load with " + com.appmattus.certificatetransparency.internal.utils.c.a(this.f32104a);
    }
}
