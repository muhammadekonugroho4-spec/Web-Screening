package com.appmattus.certificatetransparency.internal.utils.asn1;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.appmattus.certificatetransparency.internal.utils.asn1.header.c f32141a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32142b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32143c;

    public d(com.appmattus.certificatetransparency.internal.utils.asn1.header.c r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r2, "tag");
        this.f32141a = r2;
        this.f32142b = r3;
        this.f32143c = r4;
    }

    public final int a() {
        return this.f32142b;
    }

    public final com.appmattus.certificatetransparency.internal.utils.asn1.header.c b() {
        return this.f32141a;
    }

    public final int c() {
        return this.f32142b + this.f32143c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f32141a, r52.f32141a) == true) goto L12;
        return false;
    L12:
        if (this.f32142b == r52.f32142b) goto L15;
        return false;
    L15:
        if (this.f32143c == r52.f32143c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f32141a.hashCode() * 31) + Integer.hashCode(this.f32142b)) * 31) + Integer.hashCode(this.f32143c);
    }

    public String toString() {
        return "ASN1Header(tag=" + this.f32141a + ", headerLength=" + this.f32142b + ", dataLength=" + this.f32143c + ')';
    }
}
