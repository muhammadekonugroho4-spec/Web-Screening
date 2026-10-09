package org.minidns.record;

import java.io.DataInputStream;
import org.minidns.dnsname.DnsName;

/* loaded from: classes3.dex */
public class m extends t {
    public m(DnsName r1) {
        super(r1);
    }

    public static m h(DataInputStream r02, byte[] r1) {
        return new m(DnsName.s(r02, r1));
    }
}
