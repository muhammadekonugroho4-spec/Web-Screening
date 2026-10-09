package com.appmattus.certificatetransparency.internal.verifier;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class a extends com.appmattus.certificatetransparency.i {

    /* renamed from: a, reason: collision with root package name */
    public final IOException f32261a;

    public a(IOException r2) {
        kotlin.jvm.internal.p.l(r2, "exception");
        this.f32261a = r2;
    }

    public IOException a() {
        return this.f32261a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f32261a, ((a) r4).f32261a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f32261a.hashCode();
    }

    public String toString() {
        return "Error during ASN.1 parsing of certificate with: " + com.appmattus.certificatetransparency.internal.utils.c.a(a());
    }
}
