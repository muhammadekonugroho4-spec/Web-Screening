package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import org.minidns.constants.DnssecConstants;

/* loaded from: classes3.dex */
public abstract class i extends h {

    /* renamed from: c, reason: collision with root package name */
    public final int f182851c;
    public final DnssecConstants.SignatureAlgorithm d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f182852e;

    /* renamed from: f, reason: collision with root package name */
    public final DnssecConstants.DigestAlgorithm f182853f;

    /* renamed from: g, reason: collision with root package name */
    public final byte f182854g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f182855h;

    /* renamed from: i, reason: collision with root package name */
    public transient BigInteger f182856i;

    /* renamed from: j, reason: collision with root package name */
    public transient String f182857j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f182858a;

        /* renamed from: b, reason: collision with root package name */
        public final byte f182859b;

        /* renamed from: c, reason: collision with root package name */
        public final byte f182860c;
        public final byte[] d;

        public /* synthetic */ a(int r1, byte r2, byte r3, byte[] r4, j r5) {
            this(r1, r2, r3, r4);
        }

        public a(int r1, byte r2, byte r3, byte[] r4) {
            this.f182858a = r1;
            this.f182859b = r2;
            this.f182860c = r3;
            this.d = r4;
        }
    }

    static {
    }

    public i(int r1, DnssecConstants.SignatureAlgorithm r2, byte r3, DnssecConstants.DigestAlgorithm r4, byte r5, byte[] r6) {
        this.f182851c = r1;
        this.f182852e = r3;
        if (r2 != null) goto L6;
        r2 = DnssecConstants.SignatureAlgorithm.forByte(r3);
    L6:
        this.d = r2;
        this.f182854g = r5;
        if (r4 != null) goto L10;
        r4 = DnssecConstants.DigestAlgorithm.forByte(r5);
    L10:
        this.f182853f = r4;
        this.f182855h = r6;
    }

    public static a k(DataInputStream r6, int r7) {
        int r1 = r6.readUnsignedShort();
        byte r2 = r6.readByte();
        byte r3 = r6.readByte();
        int r72 = r7 - 4;
        byte[] r4 = new byte[r72];
        if (r6.read(r4) != r72) goto L7;
        return new a(r1, r2, r3, r4, null);
    L7:
        throw new IOException();
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r2) {
        r2.writeShort(this.f182851c);
        r2.writeByte(this.f182852e);
        r2.writeByte(this.f182854g);
        r2.write(this.f182855h);
    }

    public boolean h(byte[] r2) {
        return Arrays.equals(this.f182855h, r2);
    }

    public BigInteger i() {
        if (this.f182856i != null) goto L6;
        this.f182856i = new BigInteger(1, this.f182855h);
    L6:
        return this.f182856i;
    }

    public String j() {
        if (this.f182857j != null) goto L6;
        this.f182857j = i().toString(16).toUpperCase(Locale.ROOT);
    L6:
        return this.f182857j;
    }

    public String toString() {
        return this.f182851c + ' ' + this.d + ' ' + this.f182853f + ' ' + new BigInteger(1, this.f182855h).toString(16).toUpperCase(Locale.ROOT);
    }

    public i(int r8, byte r9, byte r10, byte[] r11) {
        this(r8, null, r9, null, r10, r11);
    }
}
