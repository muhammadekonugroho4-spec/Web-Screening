package com.appmattus.certificatetransparency.internal.utils.asn1.header;

import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.F;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TagClass f32156a;

    /* renamed from: b, reason: collision with root package name */
    public final TagForm f32157b;

    /* renamed from: c, reason: collision with root package name */
    public final BigInteger f32158c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f32159e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32160a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f32161b = null;

        static {
            int[] r02 = new int[TagClass.values().length];
            r02[TagClass.Universal.ordinal()] = 1;     // Catch: NoSuchFieldError -> L13
        L21:
            r02[TagClass.Application.ordinal()] = 2;     // Catch: NoSuchFieldError -> L14
        L29:
            r02[TagClass.ContextSpecific.ordinal()] = 3;     // Catch: NoSuchFieldError -> L15
        L23:
            r02[TagClass.Private.ordinal()] = 4;     // Catch: NoSuchFieldError -> L16
        L8:
            f32160a = r02;
            int[] r03 = new int[TagForm.values().length];
            r03[TagForm.Primitive.ordinal()] = 1;     // Catch: NoSuchFieldError -> L17
        L25:
            r03[TagForm.Constructed.ordinal()] = 2;     // Catch: NoSuchFieldError -> L18
        L11:
            f32161b = r03;
        }
    }

    public c(TagClass r2, TagForm r3, BigInteger r4, int r5) {
        p.l(r2, "tagClass");
        p.l(r3, "tagForm");
        p.l(r4, "tagNumber");
        this.f32156a = r2;
        this.f32157b = r3;
        this.f32158c = r4;
        this.d = r5;
        BigInteger r22 = BigInteger.valueOf(Long.MAX_VALUE);
        p.k(r22, "valueOf(...)");
        if (r4.compareTo(r22) >= 0) goto L5;
        Long r23 = Long.valueOf(r4.longValue());
    L6:
        this.f32159e = r23;
        return;
    L5:
        r23 = null;
        goto L6
    }

    public static /* synthetic */ boolean g(c r02, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        return r02.f(r1, r2);
    }

    public final int a() {
        return this.d;
    }

    public final byte[] b() {
        int r02 = a.f32160a[this.f32156a.ordinal()];
        boolean r3 = true;
        if (r02 == 1) goto L14;
        if (r02 != 2) goto L6;
        int r03 = 64;
    L15:
        int r5 = a.f32161b[this.f32157b.ordinal()];
        if (r5 == 1) goto L21;
        if (r5 != 2) goto L20;
        int r52 = 32;
    L22:
        Long r6 = this.f32159e;
        if (r6 != null) goto L25;
    L28:
        Long r62 = this.f32159e;
        if (r62 != null) goto L31;
    L34:
        int r04 = (r03 + r52) + 31;
        BigInteger r2 = this.f32158c;
        ArrayList r53 = new ArrayList();
    L36:
        if (p.g(r2, BigInteger.ZERO) == true) goto L42;
        int r63 = r2.intValue() & WorkQueueKt.MASK;
        if (r3 == false) goto L40;
        int r32 = 0;
    L41:
        r53.add(Byte.valueOf((byte) (r63 + r32)));
        r2 = r2.shiftRight(7);
        p.k(r2, "shiftRight(...)");
        r3 = false;
        goto L36
    L40:
        r32 = 128;
        goto L41
    L42:
        r53.add(Byte.valueOf((byte) r04));
        return F.s1(F.c1(r53));
    L31:
        if (r62.longValue() > 127) goto L34;
        return new byte[]{(byte) ((r03 + r52) + 31), (byte) this.f32159e.longValue()};
    L25:
        if (r6.longValue() > 30) goto L28;
        return new byte[]{(byte) ((r03 + r52) + this.f32159e.longValue())};
    L20:
        throw new NoWhenBranchMatchedException();
    L21:
        r52 = 0;
        goto L22
    L6:
        if (r02 != 3) goto L8;
        r03 = 128;
        goto L15
    L8:
        if (r02 != 4) goto L11;
        r03 = 192;
        goto L15
    L11:
        throw new NoWhenBranchMatchedException();
    L14:
        r03 = 0;
        goto L15
    }

    public final TagClass c() {
        return this.f32156a;
    }

    public final TagForm d() {
        return this.f32157b;
    }

    public final BigInteger e() {
        return this.f32158c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f32156a == r52.f32156a) goto L12;
        return false;
    L12:
        if (this.f32157b == r52.f32157b) goto L15;
        return false;
    L15:
        if (p.g(this.f32158c, r52.f32158c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public final boolean f(int r3, boolean r4) {
        if (this.f32156a == TagClass.ContextSpecific) goto L5;
        return false;
    L5:
        if (h(r3) == false) goto L17;
        if (r4 == true) goto L8;
    L9:
        if (r4 == false) goto L11;
        return false;
    L11:
        if (this.f32157b != TagForm.Primitive) goto L19;
        return true;
    L19:
        return false;
    L8:
        if (this.f32157b != TagForm.Constructed) goto L9;
        return true;
    L17:
        return false;
    }

    public final boolean h(int r6) {
        Long r02 = this.f32159e;
        if (r02 == null) goto L11;
        long r1 = r6;
        if (r02 != null) goto L8;
        return false;
    L8:
        if (r02.longValue() != r1) goto L13;
        return true;
    L13:
        return false;
    L11:
        return false;
    }

    public int hashCode() {
        return (((((this.f32156a.hashCode() * 31) + this.f32157b.hashCode()) * 31) + this.f32158c.hashCode()) * 31) + Integer.hashCode(this.d);
    }

    public final boolean i(int r3) {
        if (this.f32156a == TagClass.Universal) goto L5;
        return false;
    L5:
        if (h(r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public String toString() {
        return "ASN1HeaderTag(tagClass=" + this.f32156a + ", tagForm=" + this.f32157b + ", tagNumber=" + this.f32158c + ", readLength=" + this.d + ')';
    }

    public c(TagClass r3, TagForm r4, int r5, int r6) {
        p.l(r3, "tagClass");
        p.l(r4, "tagForm");
        BigInteger r52 = BigInteger.valueOf(r5);
        p.k(r52, "valueOf(...)");
        this(r3, r4, r52, r6);
    }
}
