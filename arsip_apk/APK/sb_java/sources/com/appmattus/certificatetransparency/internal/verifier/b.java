package com.appmattus.certificatetransparency.internal.verifier;

/* loaded from: classes4.dex */
public final class b extends com.appmattus.certificatetransparency.i {

    /* renamed from: a, reason: collision with root package name */
    public final Exception f32262a;

    public b(Exception r2) {
        kotlin.jvm.internal.p.l(r2, "exception");
        this.f32262a = r2;
    }

    public Exception a() {
        return this.f32262a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f32262a, ((b) r4).f32262a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f32262a.hashCode();
    }

    public String toString() {
        return "Certificate could not be encoded with: " + com.appmattus.certificatetransparency.internal.utils.c.a(a());
    }
}
