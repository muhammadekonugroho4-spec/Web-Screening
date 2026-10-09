package org.minidns.record;

import java.io.DataInputStream;
import org.minidns.dnsname.DnsName;

/* loaded from: classes3.dex */
public class c extends t {
    public c(DnsName r1) {
        super(r1);
    }

    public static c h(DataInputStream r02, byte[] r1) {
        return new c(DnsName.s(r02, r1));
    }
}
