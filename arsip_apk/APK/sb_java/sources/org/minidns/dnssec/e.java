package org.minidns.dnssec;

import com.google.common.primitives.UnsignedBytes;
import java.util.Collections;
import java.util.List;
import org.minidns.constants.DnssecConstants;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* loaded from: classes3.dex */
public abstract class e {

    public static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final int f182738a;

        /* renamed from: b, reason: collision with root package name */
        public final String f182739b;

        /* renamed from: c, reason: collision with root package name */
        public final Exception f182740c;
        public final Record d;

        public a(DnssecConstants.DigestAlgorithm r1, String r2, Record r3, Exception r4) {
            this.f182738a = r1.value;
            this.f182739b = r2;
            this.d = r3;
            this.f182740c = r4;
        }

        @Override // org.minidns.dnssec.e
        public String a() {
            return this.f182739b + " algorithm " + this.f182738a + " threw exception while verifying " + String.valueOf(this.d.f182818a) + ": " + String.valueOf(this.f182740c);
        }
    }

    public static class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public final String f182741a;

        /* renamed from: b, reason: collision with root package name */
        public final Record.TYPE f182742b;

        /* renamed from: c, reason: collision with root package name */
        public final Record f182743c;

        public b(byte r1, Record.TYPE r2, Record r3) {
            this.f182741a = Integer.toString(r1 & UnsignedBytes.MAX_VALUE);
            this.f182742b = r2;
            this.f182743c = r3;
        }

        @Override // org.minidns.dnssec.e
        public String a() {
            return this.f182742b.name() + " algorithm " + this.f182741a + " required to verify " + String.valueOf(this.f182743c.f182818a) + " is unknown or not supported by platform";
        }
    }

    public static class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Record f182744a;

        public c(Record r1) {
            this.f182744a = r1;
        }

        @Override // org.minidns.dnssec.e
        public String a() {
            return "Zone " + this.f182744a.f182818a.ace + " is in list of known SEPs, but DNSKEY from response mismatches!";
        }
    }

    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final org.minidns.dnsmessage.b f182745a;

        /* renamed from: b, reason: collision with root package name */
        public final Record f182746b;

        public d(org.minidns.dnsmessage.b r1, Record r2) {
            this.f182745a = r1;
            this.f182746b = r2;
        }

        @Override // org.minidns.dnssec.e
        public String a() {
            return "NSEC " + String.valueOf(this.f182746b.f182818a) + " does nat match question for " + String.valueOf(this.f182745a.f182697b) + " at " + String.valueOf(this.f182745a.f182696a);
        }
    }

    /* renamed from: org.minidns.dnssec.e$e, reason: collision with other inner class name */
    public static class C1937e extends e {

        /* renamed from: a, reason: collision with root package name */
        public final org.minidns.dnsmessage.b f182747a;

        /* renamed from: b, reason: collision with root package name */
        public final List f182748b;

        static {
        }

        public C1937e(org.minidns.dnsmessage.b r1, List r2) {
            this.f182747a = r1;
            this.f182748b = Collections.unmodifiableList(r2);
        }

        @Override // org.minidns.dnssec.e
        public String a() {
            return "No currently active signatures were attached to answer on question for " + String.valueOf(this.f182747a.f182697b) + " at " + String.valueOf(this.f182747a.f182696a);
        }
    }

    public static class f extends e {
        public f() {
        }

        @Override // org.minidns.dnssec.e
        public String a() {
            return "No secure entry point was found for the root zone (\"Did you forget to configure a root SEP?\")";
        }
    }

    public static class g extends e {

        /* renamed from: a, reason: collision with root package name */
        public final DnsName f182749a;

        public g(DnsName r1) {
            this.f182749a = r1;
        }

        @Override // org.minidns.dnssec.e
        public String a() {
            return "No secure entry point was found for zone " + String.valueOf(this.f182749a);
        }
    }

    public static class h extends e {

        /* renamed from: a, reason: collision with root package name */
        public final org.minidns.dnsmessage.b f182750a;

        public h(org.minidns.dnsmessage.b r1) {
            this.f182750a = r1;
        }

        @Override // org.minidns.dnssec.e
        public String a() {
            return "No signatures were attached to answer on question for " + String.valueOf(this.f182750a.f182697b) + " at " + String.valueOf(this.f182750a.f182696a);
        }
    }

    public static class i extends e {

        /* renamed from: a, reason: collision with root package name */
        public final DnsName f182751a;

        public i(DnsName r1) {
            this.f182751a = r1;
        }

        @Override // org.minidns.dnssec.e
        public String a() {
            return "No trust anchor was found for zone " + String.valueOf(this.f182751a) + ". Try enabling DLV";
        }
    }

    public e() {
    }

    public abstract String a();

    public boolean equals(Object r2) {
        if ((r2 instanceof e) == true) goto L5;
        return false;
    L5:
        if (((e) r2).a().equals(a()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a();
    }
}
