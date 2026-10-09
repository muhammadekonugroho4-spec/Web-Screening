package org.minidns.dnsname;

/* loaded from: classes3.dex */
public abstract class InvalidDnsNameException extends IllegalStateException {
    private static final long serialVersionUID = 1;
    protected final String ace;

    public static class DNSNameTooLongException extends InvalidDnsNameException {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        public DNSNameTooLongException(String r1, byte[] r2) {
            super(r1);
            this.bytes = r2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "The DNS name '" + this.ace + "' exceeds the maximum name length of 255 octets by " + (this.bytes.length - 255) + " octets.";
        }
    }

    public static class LabelTooLongException extends InvalidDnsNameException {
        private static final long serialVersionUID = 1;
        private final String label;

        public LabelTooLongException(String r1, String r2) {
            super(r1);
            this.label = r2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String r02 = this.ace;
            String r1 = this.label;
            return "The DNS name '" + r02 + "' contains the label '" + r1 + "' which exceeds the maximum label length of 63 octets by " + (r1.length() - 63) + " octets.";
        }
    }

    public InvalidDnsNameException(String r1) {
        this.ace = r1;
    }
}
