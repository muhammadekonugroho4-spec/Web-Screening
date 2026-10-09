package com.stockbit.domain.model.livestream;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f84259a;

    public b(String r2) {
        p.l(r2, "href");
        this.f84259a = r2;
    }

    public final String a() {
        return this.f84259a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f84259a, ((b) r4).f84259a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f84259a.hashCode();
    }

    public String toString() {
        return "LivestreamHtmlMetaDataAttributeEntity(href=" + this.f84259a + ")";
    }
}
