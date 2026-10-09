package org.minidns.idna;

import java.net.IDN;
import org.minidns.dnsname.DnsName;

/* loaded from: classes3.dex */
public class a implements b {
    public a() {
    }

    @Override // org.minidns.idna.b
    public String a(String r3) {
        DnsName r02 = DnsName.f182700h;
        if (r02.ace.equals(r3) == false) goto L7;
        return r02.ace;
    L7:
        return IDN.toASCII(r3);
    }

    @Override // org.minidns.idna.b
    public String b(String r1) {
        return IDN.toUnicode(r1);
    }
}
