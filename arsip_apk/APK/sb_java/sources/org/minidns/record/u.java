package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.minidns.dnsname.DnsName;

/* loaded from: classes3.dex */
public class u extends h {

    /* renamed from: c, reason: collision with root package name */
    public final DnsName f182884c;
    public final DnsName d;

    /* renamed from: e, reason: collision with root package name */
    public final long f182885e;

    /* renamed from: f, reason: collision with root package name */
    public final int f182886f;

    /* renamed from: g, reason: collision with root package name */
    public final int f182887g;

    /* renamed from: h, reason: collision with root package name */
    public final int f182888h;

    /* renamed from: i, reason: collision with root package name */
    public final long f182889i;

    public u(DnsName r1, DnsName r2, long r3, int r5, int r6, int r7, long r8) {
        this.f182884c = r1;
        this.d = r2;
        this.f182885e = r3;
        this.f182886f = r5;
        this.f182887g = r6;
        this.f182888h = r7;
        this.f182889i = r8;
    }

    public static u h(DataInputStream r10, byte[] r11) {
        return new u(DnsName.s(r10, r11), DnsName.s(r10, r11), r10.readInt() & 4294967295L, r10.readInt(), r10.readInt(), r10.readInt(), 4294967295L & r10.readInt());
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r3) {
        this.f182884c.B(r3);
        this.d.B(r3);
        r3.writeInt((int) this.f182885e);
        r3.writeInt(this.f182886f);
        r3.writeInt(this.f182887g);
        r3.writeInt(this.f182888h);
        r3.writeInt((int) this.f182889i);
    }

    public String toString() {
        return this.f182884c + ". " + this.d + ". " + this.f182885e + ' ' + this.f182886f + ' ' + this.f182887g + ' ' + this.f182888h + ' ' + this.f182889i;
    }
}
