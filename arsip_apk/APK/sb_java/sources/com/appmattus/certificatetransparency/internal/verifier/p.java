package com.appmattus.certificatetransparency.internal.verifier;

import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public final class p extends com.appmattus.certificatetransparency.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f32295a;

    /* renamed from: b, reason: collision with root package name */
    public final NoSuchAlgorithmException f32296b;

    public /* synthetic */ p(String r1, NoSuchAlgorithmException r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }

    public NoSuchAlgorithmException a() {
        return this.f32296b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f32295a, r52.f32295a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f32296b, r52.f32296b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f32295a.hashCode() * 31;
        NoSuchAlgorithmException r1 = this.f32296b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        if (a() == null) goto L7;
        return "Unsupported signature algorithm " + this.f32295a + " with: " + com.appmattus.certificatetransparency.internal.utils.c.a(a());
    L7:
        return "Unsupported signature algorithm " + this.f32295a;
    }

    public p(String r2, NoSuchAlgorithmException r3) {
        kotlin.jvm.internal.p.l(r2, "algorithm");
        this.f32295a = r2;
        this.f32296b = r3;
    }
}
