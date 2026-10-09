package org.minidns.dnsqueryresult;

import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: classes3.dex */
public abstract class a extends DnsQueryResult {
    public final DnsQueryResult d;

    public a(DnsMessage r3, DnsQueryResult r4) {
        super(DnsQueryResult.QueryMethod.cachedDirect, r3, r4.f182712c);
        this.d = r4;
    }
}
