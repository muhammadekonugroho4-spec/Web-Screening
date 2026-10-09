package org.minidns;

import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsname.DnsName;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: classes3.dex */
public abstract class a {
    public a() {
    }

    public final org.minidns.dnsqueryresult.a a(DnsMessage r1) {
        return b(r1.c());
    }

    public abstract org.minidns.dnsqueryresult.a b(DnsMessage r1);

    public abstract void c(DnsMessage r1, DnsQueryResult r2, DnsName r3);

    public final void d(DnsMessage r1, DnsQueryResult r2) {
        e(r1.c(), r2);
    }

    public abstract void e(DnsMessage r1, DnsQueryResult r2);
}
