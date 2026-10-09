package com.appmattus.certificatetransparency.internal.verifier.model;

import java.util.Arrays;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f32288a;

    public b(byte[] r2) {
        p.l(r2, "keyId");
        this.f32288a = r2;
    }

    public final byte[] a() {
        return this.f32288a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L5;
        return true;
    L5:
        if (r4 == null) goto L7;
        Class<?> r1 = r4.getClass();
    L9:
        if (p.g(b.class, r1) == true) goto L11;
        return false;
    L11:
        p.j(r4, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.verifier.model.LogId");
        if (Arrays.equals(this.f32288a, ((b) r4).f32288a) == true) goto L14;
        return false;
    L14:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    public int hashCode() {
        return Arrays.hashCode(this.f32288a);
    }

    public String toString() {
        return "LogId(keyId=" + Arrays.toString(this.f32288a) + ')';
    }
}
