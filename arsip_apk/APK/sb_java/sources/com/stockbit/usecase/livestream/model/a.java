package com.stockbit.usecase.livestream.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158258a;

    public a(String r2) {
        p.l(r2, "href");
        this.f158258a = r2;
    }

    public final String a() {
        return this.f158258a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f158258a, ((a) r4).f158258a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f158258a.hashCode();
    }

    public String toString() {
        return "LivestreamHtmlMetaDataAttributeUIState(href=" + this.f158258a + ")";
    }
}
