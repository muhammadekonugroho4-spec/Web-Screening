package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Locale;
import org.minidns.record.NSEC3;

/* loaded from: classes3.dex */
public class n extends h {

    /* renamed from: c, reason: collision with root package name */
    public final NSEC3.HashAlgorithm f182864c;
    public final byte d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f182865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f182866f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f182867g;

    static {
    }

    public n(NSEC3.HashAlgorithm r1, byte r2, byte r3, int r4, byte[] r5) {
        this.d = r2;
        if (r1 != null) goto L6;
        r1 = NSEC3.HashAlgorithm.forByte(r2);
    L6:
        this.f182864c = r1;
        this.f182865e = r3;
        this.f182866f = r4;
        this.f182867g = r5;
    }

    public static n h(DataInputStream r5) {
        byte r02 = r5.readByte();
        byte r1 = r5.readByte();
        int r2 = r5.readUnsignedShort();
        int r3 = r5.readUnsignedByte();
        byte[] r4 = new byte[r3];
        if (r5.read(r4) == r3) goto L9;
        if (r3 == 0) goto L9;
        throw new IOException();
    L9:
        return new n(r02, r1, r2, r4);
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r2) {
        r2.writeByte(this.d);
        r2.writeByte(this.f182865e);
        r2.writeShort(this.f182866f);
        r2.writeByte(this.f182867g.length);
        r2.write(this.f182867g);
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(this.f182864c);
        r02.append(' ');
        r02.append(this.f182865e);
        r02.append(' ');
        r02.append(this.f182866f);
        r02.append(' ');
        if (this.f182867g.length != 0) goto L5;
        String r1 = "-";
    L6:
        r02.append(r1);
        return r02.toString();
    L5:
        r1 = new BigInteger(1, this.f182867g).toString(16).toUpperCase(Locale.ROOT);
        goto L6
    }

    public n(byte r7, byte r8, int r9, byte[] r10) {
        this(null, r7, r8, r9, r10);
    }
}
