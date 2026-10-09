package org.minidns.record;

import java.io.DataInputStream;
import org.minidns.dnsname.DnsName;

/* loaded from: classes3.dex */
public class e extends t {
    public e(DnsName r1) {
        super(r1);
    }

    public static e h(DataInputStream r02, byte[] r1) {
        return new e(DnsName.s(r02, r1));
    }
}
