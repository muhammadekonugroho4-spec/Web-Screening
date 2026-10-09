package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.minidns.record.Record;

/* loaded from: classes3.dex */
public class NSEC3 extends h {

    /* renamed from: k, reason: collision with root package name */
    public static final Map f182809k = null;

    /* renamed from: c, reason: collision with root package name */
    public final HashAlgorithm f182810c;
    public final byte d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f182811e;

    /* renamed from: f, reason: collision with root package name */
    public final int f182812f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f182813g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f182814h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f182815i;

    /* renamed from: j, reason: collision with root package name */
    public final List f182816j;

    public enum HashAlgorithm extends Enum<HashAlgorithm> {
        public static final HashAlgorithm RESERVED = null;
        public static final HashAlgorithm SHA1 = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ HashAlgorithm[] f182817a = null;
        public final String description;
        public final byte value;

        static {
            RESERVED = new HashAlgorithm("RESERVED", 0, 0, "Reserved");
            SHA1 = new HashAlgorithm("SHA1", 1, 1, "SHA-1");
            f182817a = a();
        }

        HashAlgorithm(String r1, int r2, int r3, String r4) {
            if (r3 < 0) goto L9;
            if (r3 > 255) goto L9;
            byte r12 = (byte) r3;
            this.value = r12;
            this.description = r4;
            NSEC3.h().put(Byte.valueOf(r12), this);
            return;
        L9:
            throw new IllegalArgumentException();
        }

        public static /* synthetic */ HashAlgorithm[] a() {
            return new HashAlgorithm[]{RESERVED, SHA1};
        }

        public static HashAlgorithm forByte(byte r1) {
            return (HashAlgorithm) NSEC3.h().get(Byte.valueOf(r1));
        }

        public static HashAlgorithm valueOf(String r1) {
            return (HashAlgorithm) Enum.valueOf(HashAlgorithm.class, r1);
        }

        public static HashAlgorithm[] values() {
            return (HashAlgorithm[]) f182817a.clone();
        }
    }

    static {
        f182809k = new HashMap();
    }

    public NSEC3(HashAlgorithm r1, byte r2, byte r3, int r4, byte[] r5, byte[] r6, List r7) {
        this.d = r2;
        if (r1 != null) goto L6;
        r1 = HashAlgorithm.forByte(r2);
    L6:
        this.f182810c = r1;
        this.f182811e = r3;
        this.f182812f = r4;
        this.f182813g = r5;
        this.f182814h = r6;
        this.f182816j = r7;
        this.f182815i = o.h(r7);
    }

    public static /* bridge */ /* synthetic */ Map h() {
        return f182809k;
    }

    public static NSEC3 k(DataInputStream r8, int r9) {
        byte r1 = r8.readByte();
        byte r2 = r8.readByte();
        int r3 = r8.readUnsignedShort();
        int r02 = r8.readUnsignedByte();
        byte[] r4 = new byte[r02];
        if (r8.read(r4) != r02) goto L15;
        int r5 = r8.readUnsignedByte();
        byte[] r52 = new byte[r5];
        if (r8.read(r52) != r5) goto L13;
        int r92 = r9 - ((r02 + 6) + r5);
        byte[] r03 = new byte[r92];
        if (r8.read(r03) != r92) goto L11;
        return new NSEC3(r1, r2, r3, r4, r52, o.j(r03));
    L11:
        throw new IOException();
    L13:
        throw new IOException();
    L15:
        throw new IOException();
    }

    @Override // org.minidns.record.h
    public Record.TYPE a() {
        return Record.TYPE.NSEC3;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r2) {
        r2.writeByte(this.d);
        r2.writeByte(this.f182811e);
        r2.writeShort(this.f182812f);
        r2.writeByte(this.f182813g.length);
        r2.write(this.f182813g);
        r2.writeByte(this.f182814h.length);
        r2.write(this.f182814h);
        r2.write(this.f182815i);
    }

    public byte[] i() {
        return (byte[]) this.f182814h.clone();
    }

    public byte[] j() {
        return (byte[]) this.f182813g.clone();
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(this.f182810c);
        r02.append(' ');
        r02.append(this.f182811e);
        r02.append(' ');
        r02.append(this.f182812f);
        r02.append(' ');
        if (this.f182813g.length != 0) goto L5;
        String r2 = "-";
    L6:
        r02.append(r2);
        r02.append(' ');
        r02.append(org.minidns.util.a.a(this.f182814h));
        Iterator r22 = this.f182816j.iterator();
    L8:
        if (r22.hasNext() == false) goto L11;
        Record.TYPE r3 = (Record.TYPE) r22.next();
        r02.append(' ');
        r02.append(r3);
        goto L8
    L11:
        return r02.toString();
    L5:
        r2 = new BigInteger(1, this.f182813g).toString(16).toUpperCase(Locale.ROOT);
        goto L6
    }

    public NSEC3(byte r9, byte r10, int r11, byte[] r12, byte[] r13, List r14) {
        this(null, r9, r10, r11, r12, r13, r14);
    }
}
