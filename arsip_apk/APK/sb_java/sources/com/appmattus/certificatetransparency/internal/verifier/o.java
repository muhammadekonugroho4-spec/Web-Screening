package com.appmattus.certificatetransparency.internal.verifier;

import java.security.SignatureException;

/* loaded from: classes4.dex */
public final class o extends com.appmattus.certificatetransparency.i {

    /* renamed from: a, reason: collision with root package name */
    public final SignatureException f32294a;

    public o(SignatureException r2) {
        kotlin.jvm.internal.p.l(r2, "exception");
        this.f32294a = r2;
    }

    public SignatureException a() {
        return this.f32294a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof o) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f32294a, ((o) r4).f32294a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f32294a.hashCode();
    }

    public String toString() {
        return "Signature object not properly initialized or signature from SCT is improperly encoded with: " + com.appmattus.certificatetransparency.internal.utils.c.a(a());
    }
}
