package org.minidns.source;

import java.net.InetAddress;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: org.minidns.source.a$a, reason: collision with other inner class name */
    public interface InterfaceC1941a {
        void a(DnsMessage r1, DnsQueryResult r2);
    }

    DnsQueryResult a(DnsMessage r1, InetAddress r2, int r3);

    int b();
}
