package com.appmattus.certificatetransparency.internal.utils.asn1.bytes;

import com.appmattus.certificatetransparency.internal.utils.asn1.bytes.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a implements ByteBuffer {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f32129a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32130b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32131c;

    public a(ByteBuffer r2, int r3, int r4) {
        p.l(r2, "byteBuffer");
        this.f32129a = r2;
        this.f32130b = r3;
        this.f32131c = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f32129a, r52.f32129a) == true) goto L12;
        return false;
    L12:
        if (this.f32130b == r52.f32130b) goto L15;
        return false;
    L15:
        if (this.f32131c == r52.f32131c) goto L17;
        return false;
    L17:
        return true;
    }

    @Override // com.appmattus.certificatetransparency.internal.utils.asn1.bytes.ByteBuffer
    public byte get(int r3) {
        return this.f32129a.get(r3 + this.f32130b);
    }

    @Override // com.appmattus.certificatetransparency.internal.utils.asn1.bytes.ByteBuffer
    public int getSize() {
        return this.f32131c - this.f32130b;
    }

    public int hashCode() {
        return (((this.f32129a.hashCode() * 31) + Integer.hashCode(this.f32130b)) * 31) + Integer.hashCode(this.f32131c);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return ByteBuffer.DefaultImpls.a(this);
    }

    @Override // com.appmattus.certificatetransparency.internal.utils.asn1.bytes.ByteBuffer
    public byte[] p0(int r3, int r4) {
        if (r4 > getSize()) goto L11;
        if ((r4 - r3) < 0) goto L9;
        ByteBuffer r02 = this.f32129a;
        int r1 = this.f32130b;
        return r02.p0(r3 + r1, r4 + r1);
    L9:
        throw new IllegalArgumentException((r3 + " > " + r4).toString());
    L11:
        throw new IllegalArgumentException(("toIndex: " + r4 + ", size: " + getSize()).toString());
    }

    public String toString() {
        return "BasicByteBuffer(byteBuffer=" + this.f32129a + ", startIndex=" + this.f32130b + ", endIndex=" + this.f32131c + ')';
    }

    @Override // com.appmattus.certificatetransparency.internal.utils.asn1.bytes.ByteBuffer
    public ByteBuffer x(int r4, int r5) {
        if (r5 > getSize()) goto L11;
        if ((r5 - r4) < 0) goto L9;
        ByteBuffer r1 = this.f32129a;
        int r2 = this.f32130b;
        return new a(r1, r4 + r2, r5 + r2);
    L9:
        throw new IllegalArgumentException((r4 + " > " + r5).toString());
    L11:
        throw new IllegalArgumentException(("toIndex: " + r5 + ", size: " + getSize()).toString());
    }
}
