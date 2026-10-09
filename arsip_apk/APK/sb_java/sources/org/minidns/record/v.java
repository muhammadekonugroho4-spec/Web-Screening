package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.minidns.dnsname.DnsName;

/* loaded from: classes3.dex */
public class v extends t implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f182890e;

    /* renamed from: f, reason: collision with root package name */
    public final int f182891f;

    /* renamed from: g, reason: collision with root package name */
    public final int f182892g;

    public v(int r1, int r2, int r3, DnsName r4) {
        super(r4);
        this.f182890e = r1;
        this.f182891f = r2;
        this.f182892g = r3;
    }

    public static v i(DataInputStream r3, byte[] r4) {
        return new v(r3.readUnsignedShort(), r3.readUnsignedShort(), r3.readUnsignedShort(), DnsName.s(r3, r4));
    }

    @Override // org.minidns.record.t, org.minidns.record.h
    public void c(DataOutputStream r2) {
        r2.writeShort(this.f182890e);
        r2.writeShort(this.f182891f);
        r2.writeShort(this.f182892g);
        super.c(r2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return h((v) r1);
    }

    public int h(v r3) {
        int r02 = r3.f182890e - this.f182890e;
        if (r02 == 0) goto L5;
        return r02;
    L5:
        return this.f182891f - r3.f182891f;
    }

    @Override // org.minidns.record.t
    public String toString() {
        return this.f182890e + " " + this.f182891f + " " + this.f182892g + " " + String.valueOf(this.f182883c) + ".";
    }
}
