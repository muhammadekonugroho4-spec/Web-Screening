package com.stockbit.domain.model.stream.upload;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f85870a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85871b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85872c;
    public final String d;

    public b(List r2, String r3, String r4, String r5) {
        p.l(r2, "fields");
        p.l(r3, "prefix");
        p.l(r4, "url");
        p.l(r5, "viewUrl");
        this.f85870a = r2;
        this.f85871b = r3;
        this.f85872c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.f85870a;
    }

    public final String b() {
        return this.f85871b;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f85870a, r52.f85870a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85871b, r52.f85871b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85872c, r52.f85872c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f85870a.hashCode() * 31) + this.f85871b.hashCode()) * 31) + this.f85872c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "UploadTokenEntity(fields=" + this.f85870a + ", prefix=" + this.f85871b + ", url=" + this.f85872c + ", viewUrl=" + this.d + ")";
    }
}
