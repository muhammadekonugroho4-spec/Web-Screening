package org.minidns.dnsqueryresult;

import java.net.InetAddress;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: classes3.dex */
public class c extends DnsQueryResult {
    public final InetAddress d;

    /* renamed from: e, reason: collision with root package name */
    public final int f182714e;

    public c(InetAddress r1, int r2, DnsQueryResult.QueryMethod r3, DnsMessage r4, DnsMessage r5) {
        super(r3, r4, r5);
        this.d = r1;
        this.f182714e = r2;
    }
}
