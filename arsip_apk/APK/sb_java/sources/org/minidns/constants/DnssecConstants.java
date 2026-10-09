package org.minidns.constants;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class DnssecConstants {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f182642a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f182643b = null;

    public enum DigestAlgorithm extends Enum<DigestAlgorithm> {
        public static final DigestAlgorithm GOST = null;
        public static final DigestAlgorithm SHA1 = null;
        public static final DigestAlgorithm SHA256 = null;
        public static final DigestAlgorithm SHA384 = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ DigestAlgorithm[] f182644a = null;
        public final String description;
        public final byte value;

        static {
            SHA1 = new DigestAlgorithm("SHA1", 0, 1, "SHA-1");
            SHA256 = new DigestAlgorithm("SHA256", 1, 2, "SHA-256");
            GOST = new DigestAlgorithm("GOST", 2, 3, "GOST R 34.11-94");
            SHA384 = new DigestAlgorithm("SHA384", 3, 4, "SHA-384");
            f182644a = a();
        }

        DigestAlgorithm(String r1, int r2, int r3, String r4) {
            if (r3 < 0) goto L9;
            if (r3 > 255) goto L9;
            byte r12 = (byte) r3;
            this.value = r12;
            this.description = r4;
            DnssecConstants.a().put(Byte.valueOf(r12), this);
            return;
        L9:
            throw new IllegalArgumentException();
        }

        public static /* synthetic */ DigestAlgorithm[] a() {
            return new DigestAlgorithm[]{SHA1, SHA256, GOST, SHA384};
        }

        public static DigestAlgorithm forByte(byte r1) {
            return (DigestAlgorithm) DnssecConstants.a().get(Byte.valueOf(r1));
        }

        public static DigestAlgorithm valueOf(String r1) {
            return (DigestAlgorithm) Enum.valueOf(DigestAlgorithm.class, r1);
        }

        public static DigestAlgorithm[] values() {
            return (DigestAlgorithm[]) f182644a.clone();
        }
    }

    public enum SignatureAlgorithm extends Enum<SignatureAlgorithm> {
        public static final SignatureAlgorithm DH = null;
        public static final SignatureAlgorithm DSA = null;
        public static final SignatureAlgorithm DSA_NSEC3_SHA1 = null;
        public static final SignatureAlgorithm ECC_GOST = null;
        public static final SignatureAlgorithm ECDSAP256SHA256 = null;
        public static final SignatureAlgorithm ECDSAP384SHA384 = null;
        public static final SignatureAlgorithm INDIRECT = null;
        public static final SignatureAlgorithm PRIVATEDNS = null;
        public static final SignatureAlgorithm PRIVATEOID = null;

        @Deprecated
        public static final SignatureAlgorithm RSAMD5 = null;
        public static final SignatureAlgorithm RSASHA1 = null;
        public static final SignatureAlgorithm RSASHA1_NSEC3_SHA1 = null;
        public static final SignatureAlgorithm RSASHA256 = null;
        public static final SignatureAlgorithm RSASHA512 = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ SignatureAlgorithm[] f182645a = null;
        public final String description;
        public final byte number;

        static {
            RSAMD5 = new SignatureAlgorithm("RSAMD5", 0, 1, "RSA/MD5");
            DH = new SignatureAlgorithm("DH", 1, 2, "Diffie-Hellman");
            DSA = new SignatureAlgorithm("DSA", 2, 3, "DSA/SHA1");
            RSASHA1 = new SignatureAlgorithm("RSASHA1", 3, 5, "RSA/SHA-1");
            DSA_NSEC3_SHA1 = new SignatureAlgorithm("DSA_NSEC3_SHA1", 4, 6, "DSA_NSEC3-SHA1");
            RSASHA1_NSEC3_SHA1 = new SignatureAlgorithm("RSASHA1_NSEC3_SHA1", 5, 7, "RSASHA1-NSEC3-SHA1");
            RSASHA256 = new SignatureAlgorithm("RSASHA256", 6, 8, "RSA/SHA-256");
            RSASHA512 = new SignatureAlgorithm("RSASHA512", 7, 10, "RSA/SHA-512");
            ECC_GOST = new SignatureAlgorithm("ECC_GOST", 8, 12, "GOST R 34.10-2001");
            ECDSAP256SHA256 = new SignatureAlgorithm("ECDSAP256SHA256", 9, 13, "ECDSA Curve P-256 with SHA-256");
            ECDSAP384SHA384 = new SignatureAlgorithm("ECDSAP384SHA384", 10, 14, "ECDSA Curve P-384 with SHA-384");
            INDIRECT = new SignatureAlgorithm("INDIRECT", 11, 252, "Reserved for Indirect Keys");
            PRIVATEDNS = new SignatureAlgorithm("PRIVATEDNS", 12, 253, "private algorithm");
            PRIVATEOID = new SignatureAlgorithm("PRIVATEOID", 13, 254, "private algorithm oid");
            f182645a = a();
        }

        SignatureAlgorithm(String r1, int r2, int r3, String r4) {
            if (r3 < 0) goto L9;
            if (r3 > 255) goto L9;
            byte r12 = (byte) r3;
            this.number = r12;
            this.description = r4;
            DnssecConstants.b().put(Byte.valueOf(r12), this);
            return;
        L9:
            throw new IllegalArgumentException();
        }

        public static /* synthetic */ SignatureAlgorithm[] a() {
            return new SignatureAlgorithm[]{RSAMD5, DH, DSA, RSASHA1, DSA_NSEC3_SHA1, RSASHA1_NSEC3_SHA1, RSASHA256, RSASHA512, ECC_GOST, ECDSAP256SHA256, ECDSAP384SHA384, INDIRECT, PRIVATEDNS, PRIVATEOID};
        }

        public static SignatureAlgorithm forByte(byte r1) {
            return (SignatureAlgorithm) DnssecConstants.b().get(Byte.valueOf(r1));
        }

        public static SignatureAlgorithm valueOf(String r1) {
            return (SignatureAlgorithm) Enum.valueOf(SignatureAlgorithm.class, r1);
        }

        public static SignatureAlgorithm[] values() {
            return (SignatureAlgorithm[]) f182645a.clone();
        }
    }

    static {
        f182642a = new HashMap();
        f182643b = new HashMap();
    }

    public static /* bridge */ /* synthetic */ Map a() {
        return f182643b;
    }

    public static /* bridge */ /* synthetic */ Map b() {
        return f182642a;
    }
}
