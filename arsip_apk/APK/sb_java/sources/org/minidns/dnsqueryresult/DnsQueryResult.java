package org.minidns.dnsqueryresult;

import org.minidns.dnsmessage.DnsMessage;

/* loaded from: classes3.dex */
public abstract class DnsQueryResult {

    /* renamed from: a, reason: collision with root package name */
    public final QueryMethod f182710a;

    /* renamed from: b, reason: collision with root package name */
    public final DnsMessage f182711b;

    /* renamed from: c, reason: collision with root package name */
    public final DnsMessage f182712c;

    public enum QueryMethod extends Enum<QueryMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ QueryMethod[] f182713a = null;
        public static final QueryMethod asyncTcp = null;
        public static final QueryMethod asyncUdp = null;
        public static final QueryMethod cachedDirect = null;
        public static final QueryMethod cachedSynthesized = null;
        public static final QueryMethod tcp = null;
        public static final QueryMethod testWorld = null;
        public static final QueryMethod udp = null;

        static {
            udp = new QueryMethod("udp", 0);
            tcp = new QueryMethod("tcp", 1);
            asyncUdp = new QueryMethod("asyncUdp", 2);
            asyncTcp = new QueryMethod("asyncTcp", 3);
            cachedDirect = new QueryMethod("cachedDirect", 4);
            cachedSynthesized = new QueryMethod("cachedSynthesized", 5);
            testWorld = new QueryMethod("testWorld", 6);
            f182713a = a();
        }

        QueryMethod(String r1, int r2) {
        }

        public static /* synthetic */ QueryMethod[] a() {
            return new QueryMethod[]{udp, tcp, asyncUdp, asyncTcp, cachedDirect, cachedSynthesized, testWorld};
        }

        public static QueryMethod valueOf(String r1) {
            return (QueryMethod) Enum.valueOf(QueryMethod.class, r1);
        }

        public static QueryMethod[] values() {
            return (QueryMethod[]) f182713a.clone();
        }
    }

    static {
    }

    public DnsQueryResult(QueryMethod r1, DnsMessage r2, DnsMessage r3) {
        this.f182710a = r1;
        this.f182711b = r2;
        this.f182712c = r3;
    }

    public String toString() {
        return this.f182712c.toString();
    }
}
