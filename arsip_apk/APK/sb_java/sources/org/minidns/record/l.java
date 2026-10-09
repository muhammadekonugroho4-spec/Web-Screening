package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.minidns.dnsname.DnsName;

/* loaded from: classes3.dex */
public class l extends h {

    /* renamed from: c, reason: collision with root package name */
    public final int f182862c;
    public final DnsName d;

    /* renamed from: e, reason: collision with root package name */
    public final DnsName f182863e;

    public l(int r1, DnsName r2) {
        this.f182862c = r1;
        this.d = r2;
        this.f182863e = r2;
    }

    public static l h(DataInputStream r1, byte[] r2) {
        return new l(r1.readUnsignedShort(), DnsName.s(r1, r2));
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r2) {
        r2.writeShort(this.f182862c);
        this.d.B(r2);
    }

    public String toString() {
        return this.f182862c + " " + String.valueOf(this.d) + ".";
    }
}
