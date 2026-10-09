package org.minidns.record;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.minidns.constants.DnssecConstants;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* loaded from: classes3.dex */
public class s extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Record.TYPE f182873c;
    public final DnssecConstants.SignatureAlgorithm d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f182874e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f182875f;

    /* renamed from: g, reason: collision with root package name */
    public final long f182876g;

    /* renamed from: h, reason: collision with root package name */
    public final Date f182877h;

    /* renamed from: i, reason: collision with root package name */
    public final Date f182878i;

    /* renamed from: j, reason: collision with root package name */
    public final int f182879j;

    /* renamed from: k, reason: collision with root package name */
    public final DnsName f182880k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f182881l;

    /* renamed from: m, reason: collision with root package name */
    public transient String f182882m;

    static {
    }

    public s(Record.TYPE r1, DnssecConstants.SignatureAlgorithm r2, byte r3, byte r4, long r5, Date r7, Date r8, int r9, DnsName r10, byte[] r11) {
        this.f182873c = r1;
        this.f182874e = r3;
        if (r2 != null) goto L6;
        r2 = DnssecConstants.SignatureAlgorithm.forByte(r3);
    L6:
        this.d = r2;
        this.f182875f = r4;
        this.f182876g = r5;
        this.f182877h = r7;
        this.f182878i = r8;
        this.f182879j = r9;
        this.f182880k = r10;
        this.f182881l = r11;
    }

    public static s k(DataInputStream r15, byte[] r16, int r17) {
        Record.TYPE r2 = Record.TYPE.getType(r15.readUnsignedShort());
        byte r4 = r15.readByte();
        byte r5 = r15.readByte();
        long r02 = r15.readInt() & 4294967295L;
        Date r8 = new Date((r15.readInt() & 4294967295L) * 1000);
        Date r9 = new Date((4294967295L & r15.readInt()) * 1000);
        int r10 = r15.readUnsignedShort();
        DnsName r11 = DnsName.s(r15, r16);
        int r3 = (r17 - r11.x()) - 18;
        byte[] r12 = new byte[r3];
        if (r15.read(r12) != r3) goto L7;
        return new s(r2, null, r4, r5, r02, r8, r9, r10, r11, r12);
    L7:
        throw new IOException();
    }

    @Override // org.minidns.record.h
    public Record.TYPE a() {
        return Record.TYPE.RRSIG;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r2) {
        l(r2);
        r2.write(this.f182881l);
    }

    public byte[] h() {
        return (byte[]) this.f182881l.clone();
    }

    public DataInputStream i() {
        return new DataInputStream(new ByteArrayInputStream(this.f182881l));
    }

    public String j() {
        if (this.f182882m != null) goto L6;
        this.f182882m = org.minidns.util.b.a(this.f182881l);
    L6:
        return this.f182882m;
    }

    public void l(DataOutputStream r5) {
        r5.writeShort(this.f182873c.getValue());
        r5.writeByte(this.f182874e);
        r5.writeByte(this.f182875f);
        r5.writeInt((int) this.f182876g);
        r5.writeInt((int) (this.f182877h.getTime() / 1000));
        r5.writeInt((int) (this.f182878i.getTime() / 1000));
        r5.writeShort(this.f182879j);
        this.f182880k.B(r5);
    }

    public String toString() {
        SimpleDateFormat r02 = new SimpleDateFormat("yyyyMMddHHmmss");
        r02.setTimeZone(TimeZone.getTimeZone("UTC"));
        return this.f182873c + ' ' + this.d + ' ' + this.f182875f + ' ' + this.f182876g + ' ' + r02.format(this.f182877h) + ' ' + r02.format(this.f182878i) + ' ' + this.f182879j + ' ' + this.f182880k + ". " + j();
    }
}
