package org.minidns.dnssec;

import java.util.Collections;
import java.util.Set;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final DnsMessage f182735a;

    /* renamed from: b, reason: collision with root package name */
    public final DnsQueryResult f182736b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f182737c;
    public final Set d;

    public d(DnsMessage r1, DnsQueryResult r2, Set r3, Set r4) {
        this.f182735a = r1;
        this.f182736b = r2;
        this.f182737c = Collections.unmodifiableSet(r3);
        if (r4 != null) goto L6;
        this.d = Collections.EMPTY_SET;
        return;
    L6:
        this.d = Collections.unmodifiableSet(r4);
    }

    public Set a() {
        return this.d;
    }

    public boolean b() {
        return this.d.isEmpty();
    }
}
