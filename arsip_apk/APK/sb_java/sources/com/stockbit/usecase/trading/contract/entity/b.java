package com.stockbit.usecase.trading.contract.entity;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f163327a;

    /* renamed from: b, reason: collision with root package name */
    public final List f163328b;

    public b(String r2, List r3) {
        p.l(r2, "url");
        p.l(r3, "fields");
        this.f163327a = r2;
        this.f163328b = r3;
    }

    public final List a() {
        return this.f163328b;
    }

    public final String b() {
        return this.f163327a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f163327a, r52.f163327a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163328b, r52.f163328b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f163327a.hashCode() * 31) + this.f163328b.hashCode();
    }

    public String toString() {
        return "UploadTokenEntity(url=" + this.f163327a + ", fields=" + this.f163328b + ")";
    }
}
