package org.minidns.record;

import java.io.DataInputStream;
import org.minidns.dnsname.DnsName;

/* loaded from: classes3.dex */
public class r extends t {
    public r(DnsName r1) {
        super(r1);
    }

    public static r h(DataInputStream r02, byte[] r1) {
        return new r(DnsName.s(r02, r1));
    }
}
