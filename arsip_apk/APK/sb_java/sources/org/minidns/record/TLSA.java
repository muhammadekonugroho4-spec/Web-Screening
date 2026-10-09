package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class TLSA extends h {

    /* renamed from: j, reason: collision with root package name */
    public static final Map f182832j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final Map f182833k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final Map f182834l = null;

    /* renamed from: c, reason: collision with root package name */
    public final byte f182835c;
    public final CertUsage d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f182836e;

    /* renamed from: f, reason: collision with root package name */
    public final Selector f182837f;

    /* renamed from: g, reason: collision with root package name */
    public final byte f182838g;

    /* renamed from: h, reason: collision with root package name */
    public final MatchingType f182839h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f182840i;

    public enum CertUsage extends Enum<CertUsage> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ CertUsage[] f182841a = null;
        public static final CertUsage caConstraint = null;
        public static final CertUsage domainIssuedCertificate = null;
        public static final CertUsage serviceCertificateConstraint = null;
        public static final CertUsage trustAnchorAssertion = null;
        public final byte byteValue;

        static {
            caConstraint = new CertUsage("caConstraint", 0, (byte) 0);
            serviceCertificateConstraint = new CertUsage("serviceCertificateConstraint", 1, (byte) 1);
            trustAnchorAssertion = new CertUsage("trustAnchorAssertion", 2, (byte) 2);
            domainIssuedCertificate = new CertUsage("domainIssuedCertificate", 3, (byte) 3);
            f182841a = a();
        }

        CertUsage(String r1, int r2, byte r3) {
            this.byteValue = r3;
            TLSA.h().put(Byte.valueOf(r3), this);
        }

        public static /* synthetic */ CertUsage[] a() {
            return new CertUsage[]{caConstraint, serviceCertificateConstraint, trustAnchorAssertion, domainIssuedCertificate};
        }

        public static CertUsage valueOf(String r1) {
            return (CertUsage) Enum.valueOf(CertUsage.class, r1);
        }

        public static CertUsage[] values() {
            return (CertUsage[]) f182841a.clone();
        }
    }

    public enum MatchingType extends Enum<MatchingType> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ MatchingType[] f182842a = null;
        public static final MatchingType noHash = null;
        public static final MatchingType sha256 = null;
        public static final MatchingType sha512 = null;
        public final byte byteValue;

        static {
            noHash = new MatchingType("noHash", 0, (byte) 0);
            sha256 = new MatchingType("sha256", 1, (byte) 1);
            sha512 = new MatchingType("sha512", 2, (byte) 2);
            f182842a = a();
        }

        MatchingType(String r1, int r2, byte r3) {
            this.byteValue = r3;
            TLSA.i().put(Byte.valueOf(r3), this);
        }

        public static /* synthetic */ MatchingType[] a() {
            return new MatchingType[]{noHash, sha256, sha512};
        }

        public static MatchingType valueOf(String r1) {
            return (MatchingType) Enum.valueOf(MatchingType.class, r1);
        }

        public static MatchingType[] values() {
            return (MatchingType[]) f182842a.clone();
        }
    }

    public enum Selector extends Enum<Selector> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Selector[] f182843a = null;
        public static final Selector fullCertificate = null;
        public static final Selector subjectPublicKeyInfo = null;
        public final byte byteValue;

        static {
            fullCertificate = new Selector("fullCertificate", 0, (byte) 0);
            subjectPublicKeyInfo = new Selector("subjectPublicKeyInfo", 1, (byte) 1);
            f182843a = a();
        }

        Selector(String r1, int r2, byte r3) {
            this.byteValue = r3;
            TLSA.j().put(Byte.valueOf(r3), this);
        }

        public static /* synthetic */ Selector[] a() {
            return new Selector[]{fullCertificate, subjectPublicKeyInfo};
        }

        public static Selector valueOf(String r1) {
            return (Selector) Enum.valueOf(Selector.class, r1);
        }

        public static Selector[] values() {
            return (Selector[]) f182843a.clone();
        }
    }

    static {
        f182832j = new HashMap();
        f182833k = new HashMap();
        f182834l = new HashMap();
        CertUsage.values();
        Selector.values();
        MatchingType.values();
    }

    public TLSA(byte r2, byte r3, byte r4, byte[] r5) {
        this.f182835c = r2;
        this.d = (CertUsage) f182832j.get(Byte.valueOf(r2));
        this.f182836e = r3;
        this.f182837f = (Selector) f182833k.get(Byte.valueOf(r3));
        this.f182838g = r4;
        this.f182839h = (MatchingType) f182834l.get(Byte.valueOf(r4));
        this.f182840i = r5;
    }

    public static /* bridge */ /* synthetic */ Map h() {
        return f182832j;
    }

    public static /* bridge */ /* synthetic */ Map i() {
        return f182834l;
    }

    public static /* bridge */ /* synthetic */ Map j() {
        return f182833k;
    }

    public static TLSA k(DataInputStream r4, int r5) {
        byte r02 = r4.readByte();
        byte r1 = r4.readByte();
        byte r2 = r4.readByte();
        int r52 = r5 - 3;
        byte[] r3 = new byte[r52];
        if (r4.read(r3) != r52) goto L7;
        return new TLSA(r02, r1, r2, r3);
    L7:
        throw new IOException();
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r2) {
        r2.writeByte(this.f182835c);
        r2.writeByte(this.f182836e);
        r2.writeByte(this.f182838g);
        r2.write(this.f182840i);
    }

    public String toString() {
        return this.f182835c + ' ' + this.f182836e + ' ' + this.f182838g + ' ' + new BigInteger(1, this.f182840i).toString(16);
    }
}
