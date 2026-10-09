package com.appmattus.certificatetransparency.internal.utils.asn1.header;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f32154a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32155b;

    public a(int r1, int r2) {
        this.f32154a = r1;
        this.f32155b = r2;
    }

    public final int a() {
        return this.f32154a;
    }

    public final int b() {
        return this.f32155b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f32154a == r52.f32154a) goto L12;
        return false;
    L12:
        if (this.f32155b == r52.f32155b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f32154a) * 31) + Integer.hashCode(this.f32155b);
    }

    public String toString() {
        return "ASN1HeaderLength(length=" + this.f32154a + ", offset=" + this.f32155b + ')';
    }
}
