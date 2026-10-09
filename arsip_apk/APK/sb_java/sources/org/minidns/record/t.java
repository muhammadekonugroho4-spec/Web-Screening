package org.minidns.record;

import java.io.DataOutputStream;
import org.minidns.dnsname.DnsName;

/* loaded from: classes3.dex */
public abstract class t extends h {

    /* renamed from: c, reason: collision with root package name */
    public final DnsName f182883c;
    public final DnsName d;

    public t(DnsName r1) {
        this.f182883c = r1;
        this.d = r1;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r2) {
        this.f182883c.B(r2);
    }

    public String toString() {
        return String.valueOf(this.f182883c) + ".";
    }
}
