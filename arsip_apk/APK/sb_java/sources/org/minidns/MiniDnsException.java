package org.minidns;

import java.io.IOException;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: classes3.dex */
public abstract class MiniDnsException extends IOException {
    private static final long serialVersionUID = 1;

    public static class ErrorResponseException extends MiniDnsException {
        private static final long serialVersionUID = 1;
        private final DnsMessage request;
        private final DnsQueryResult result;

        public ErrorResponseException(DnsMessage r5, DnsQueryResult r6) {
            super("Received " + String.valueOf(r6.f182712c.f182657c) + " error response\n" + String.valueOf(r6));
            this.request = r5;
            this.result = r6;
        }
    }

    public static class IdMismatch extends MiniDnsException {
        private static final long serialVersionUID = 1;
        private final DnsMessage request;
        private final DnsMessage response;

        static {
        }

        public IdMismatch(DnsMessage r2, DnsMessage r3) {
            super(a(r2, r3));
            this.request = r2;
            this.response = r3;
        }

        public static String a(DnsMessage r2, DnsMessage r3) {
            return "The response's ID doesn't matches the request ID. Request: " + r2.f182655a + ". Response: " + r3.f182655a;
        }
    }

    public static class NoQueryPossibleException extends MiniDnsException {
        private static final long serialVersionUID = 1;
        private final DnsMessage request;

        public NoQueryPossibleException(DnsMessage r2) {
            super("No DNS server could be queried");
            this.request = r2;
        }
    }

    public static class NullResultException extends MiniDnsException {
        private static final long serialVersionUID = 1;
        private final DnsMessage request;

        public NullResultException(DnsMessage r2) {
            super("The request yielded a 'null' result while resolving.");
            this.request = r2;
        }
    }

    public MiniDnsException(String r1) {
        super(r1);
    }
}
