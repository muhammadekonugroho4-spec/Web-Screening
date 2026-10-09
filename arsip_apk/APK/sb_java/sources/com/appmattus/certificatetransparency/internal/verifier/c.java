package com.appmattus.certificatetransparency.internal.verifier;

import java.security.cert.CertificateParsingException;

/* loaded from: classes4.dex */
public final class c extends com.appmattus.certificatetransparency.i {

    /* renamed from: a, reason: collision with root package name */
    public final CertificateParsingException f32263a;

    public c(CertificateParsingException r2) {
        kotlin.jvm.internal.p.l(r2, "exception");
        this.f32263a = r2;
    }

    public CertificateParsingException a() {
        return this.f32263a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f32263a, ((c) r4).f32263a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f32263a.hashCode();
    }

    public String toString() {
        return "Error parsing cert with: " + com.appmattus.certificatetransparency.internal.utils.c.a(a());
    }
}
