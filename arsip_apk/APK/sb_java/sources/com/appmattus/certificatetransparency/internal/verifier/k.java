package com.appmattus.certificatetransparency.internal.verifier;

import java.security.InvalidKeyException;

/* loaded from: classes4.dex */
public final class k extends com.appmattus.certificatetransparency.i {

    /* renamed from: a, reason: collision with root package name */
    public final InvalidKeyException f32272a;

    public k(InvalidKeyException r2) {
        kotlin.jvm.internal.p.l(r2, "exception");
        this.f32272a = r2;
    }

    public InvalidKeyException a() {
        return this.f32272a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof k) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f32272a, ((k) r4).f32272a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f32272a.hashCode();
    }

    public String toString() {
        return "Log's public key cannot be used with " + com.appmattus.certificatetransparency.internal.utils.c.a(a());
    }
}
