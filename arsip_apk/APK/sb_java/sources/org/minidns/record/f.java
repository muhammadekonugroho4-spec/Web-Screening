package org.minidns.record;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Arrays;
import org.minidns.constants.DnssecConstants;

/* loaded from: classes3.dex */
public class f extends h {

    /* renamed from: c, reason: collision with root package name */
    public final short f182844c;
    public final byte d;

    /* renamed from: e, reason: collision with root package name */
    public final DnssecConstants.SignatureAlgorithm f182845e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f182846f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f182847g;

    /* renamed from: h, reason: collision with root package name */
    public transient Integer f182848h;

    static {
    }

    public f(short r1, byte r2, DnssecConstants.SignatureAlgorithm r3, byte r4, byte[] r5) {
        this.f182844c = r1;
        this.d = r2;
        this.f182846f = r4;
        if (r3 != null) goto L6;
        r3 = DnssecConstants.SignatureAlgorithm.forByte(r4);
    L6:
        this.f182845e = r3;
        this.f182847g = r5;
    }

    public static f m(DataInputStream r3, int r4) {
        short r02 = r3.readShort();
        byte r1 = r3.readByte();
        byte r2 = r3.readByte();
        byte[] r42 = new byte[r4 - 4];
        r3.readFully(r42);
        return new f(r02, r1, r2, r42);
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r2) {
        r2.writeShort(this.f182844c);
        r2.writeByte(this.d);
        r2.writeByte(this.f182846f);
        r2.write(this.f182847g);
    }

    public byte[] h() {
        return (byte[]) this.f182847g.clone();
    }

    public DataInputStream i() {
        return new DataInputStream(new ByteArrayInputStream(this.f182847g));
    }

    public int j() {
        return this.f182847g.length;
    }

    public int k() {
        if (this.f182848h != null) goto L14;
        byte[] r02 = e();
        long r1 = 0;
        int r3 = 0;
    L6:
        if (r3 >= r02.length) goto L12;
        if ((r3 & 1) <= 0) goto L10;
        long r4 = r02[r3] & 255;
    L11:
        r1 = r1 + r4;
        r3 = r3 + 1;
        goto L6
    L10:
        r4 = (r02[r3] & 255) << 8;
        goto L11
    L12:
        this.f182848h = Integer.valueOf((int) ((r1 + ((r1 >> 16) & 65535)) & 65535));
    L14:
        return this.f182848h.intValue();
    }

    public boolean l(byte[] r2) {
        return Arrays.equals(this.f182847g, r2);
    }

    public String toString() {
        return this.f182844c + ' ' + this.d + ' ' + this.f182845e + ' ' + org.minidns.util.b.a(this.f182847g);
    }

    public f(short r7, byte r8, byte r9, byte[] r10) {
        this(r7, r8, DnssecConstants.SignatureAlgorithm.forByte(r9), r9, r10);
    }
}
