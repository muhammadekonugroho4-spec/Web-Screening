package org.minidns.dnsmessage;

import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.edns.Edns;
import org.minidns.record.Record;

/* loaded from: classes3.dex */
public class DnsMessage {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f182654w = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f182655a;

    /* renamed from: b, reason: collision with root package name */
    public final OPCODE f182656b;

    /* renamed from: c, reason: collision with root package name */
    public final RESPONSE_CODE f182657c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f182658e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f182659f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f182660g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f182661h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f182662i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f182663j;

    /* renamed from: k, reason: collision with root package name */
    public final List f182664k;

    /* renamed from: l, reason: collision with root package name */
    public final List f182665l;

    /* renamed from: m, reason: collision with root package name */
    public final List f182666m;

    /* renamed from: n, reason: collision with root package name */
    public final List f182667n;

    /* renamed from: o, reason: collision with root package name */
    public final int f182668o;

    /* renamed from: p, reason: collision with root package name */
    public Edns f182669p;

    /* renamed from: q, reason: collision with root package name */
    public final long f182670q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f182671r;

    /* renamed from: s, reason: collision with root package name */
    public String f182672s;

    /* renamed from: t, reason: collision with root package name */
    public long f182673t;

    /* renamed from: u, reason: collision with root package name */
    public DnsMessage f182674u;

    /* renamed from: v, reason: collision with root package name */
    public transient Integer f182675v;

    public enum OPCODE extends Enum<OPCODE> {
        public static final OPCODE INVERSE_QUERY = null;
        public static final OPCODE NOTIFY = null;
        public static final OPCODE QUERY = null;
        public static final OPCODE STATUS = null;
        public static final OPCODE UNASSIGNED3 = null;
        public static final OPCODE UPDATE = null;

        /* renamed from: a, reason: collision with root package name */
        public static final OPCODE[] f182676a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ OPCODE[] f182677b = null;
        private final byte value;

        static {
            int r2 = 0;
            QUERY = new OPCODE("QUERY", 0);
            INVERSE_QUERY = new OPCODE("INVERSE_QUERY", 1);
            STATUS = new OPCODE("STATUS", 2);
            UNASSIGNED3 = new OPCODE("UNASSIGNED3", 3);
            NOTIFY = new OPCODE("NOTIFY", 4);
            UPDATE = new OPCODE("UPDATE", 5);
            f182677b = a();
            f182676a = new OPCODE[values().length];
            OPCODE[] r02 = values();
            int r1 = r02.length;
        L3:
            if (r2 >= r1) goto L9;
            OPCODE r3 = r02[r2];
            OPCODE[] r4 = f182676a;
            if (r4[r3.getValue()] != null) goto L8;
            r4[r3.getValue()] = r3;
            r2 = r2 + 1;
            goto L3
        L8:
            throw new IllegalStateException();
        }

        OPCODE(String r1, int r2) {
            this.value = (byte) ordinal();
        }

        public static /* synthetic */ OPCODE[] a() {
            return new OPCODE[]{QUERY, INVERSE_QUERY, STATUS, UNASSIGNED3, NOTIFY, UPDATE};
        }

        public static OPCODE getOpcode(int r2) throws IllegalArgumentException {
            if (r2 < 0) goto L12;
            if (r2 > 15) goto L12;
            OPCODE[] r02 = f182676a;
            if (r2 < r02.length) goto L10;
            return null;
        L10:
            return r02[r2];
        L12:
            throw new IllegalArgumentException();
        }

        public static OPCODE valueOf(String r1) {
            return (OPCODE) Enum.valueOf(OPCODE.class, r1);
        }

        public static OPCODE[] values() {
            return (OPCODE[]) f182677b.clone();
        }

        public byte getValue() {
            return this.value;
        }
    }

    public enum RESPONSE_CODE extends Enum<RESPONSE_CODE> {
        public static final RESPONSE_CODE BADALG = null;
        public static final RESPONSE_CODE BADCOOKIE = null;
        public static final RESPONSE_CODE BADKEY = null;
        public static final RESPONSE_CODE BADMODE = null;
        public static final RESPONSE_CODE BADNAME = null;
        public static final RESPONSE_CODE BADTIME = null;
        public static final RESPONSE_CODE BADTRUNC = null;
        public static final RESPONSE_CODE BADVERS_BADSIG = null;
        public static final RESPONSE_CODE FORMAT_ERR = null;
        public static final RESPONSE_CODE NOT_AUTH = null;
        public static final RESPONSE_CODE NOT_ZONE = null;
        public static final RESPONSE_CODE NO_ERROR = null;
        public static final RESPONSE_CODE NO_IMP = null;
        public static final RESPONSE_CODE NXRRSET = null;
        public static final RESPONSE_CODE NX_DOMAIN = null;
        public static final RESPONSE_CODE REFUSED = null;
        public static final RESPONSE_CODE SERVER_FAIL = null;
        public static final RESPONSE_CODE YXDOMAIN = null;
        public static final RESPONSE_CODE YXRRSET = null;

        /* renamed from: a, reason: collision with root package name */
        public static final Map f182678a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ RESPONSE_CODE[] f182679b = null;
        private final byte value;

        static {
            int r2 = 0;
            NO_ERROR = new RESPONSE_CODE("NO_ERROR", 0, 0);
            FORMAT_ERR = new RESPONSE_CODE("FORMAT_ERR", 1, 1);
            SERVER_FAIL = new RESPONSE_CODE("SERVER_FAIL", 2, 2);
            NX_DOMAIN = new RESPONSE_CODE("NX_DOMAIN", 3, 3);
            NO_IMP = new RESPONSE_CODE("NO_IMP", 4, 4);
            REFUSED = new RESPONSE_CODE("REFUSED", 5, 5);
            YXDOMAIN = new RESPONSE_CODE("YXDOMAIN", 6, 6);
            YXRRSET = new RESPONSE_CODE("YXRRSET", 7, 7);
            NXRRSET = new RESPONSE_CODE("NXRRSET", 8, 8);
            NOT_AUTH = new RESPONSE_CODE("NOT_AUTH", 9, 9);
            NOT_ZONE = new RESPONSE_CODE("NOT_ZONE", 10, 10);
            BADVERS_BADSIG = new RESPONSE_CODE("BADVERS_BADSIG", 11, 16);
            BADKEY = new RESPONSE_CODE("BADKEY", 12, 17);
            BADTIME = new RESPONSE_CODE("BADTIME", 13, 18);
            BADMODE = new RESPONSE_CODE("BADMODE", 14, 19);
            BADNAME = new RESPONSE_CODE("BADNAME", 15, 20);
            BADALG = new RESPONSE_CODE("BADALG", 16, 21);
            BADTRUNC = new RESPONSE_CODE("BADTRUNC", 17, 22);
            BADCOOKIE = new RESPONSE_CODE("BADCOOKIE", 18, 23);
            f182679b = a();
            f182678a = new HashMap(values().length);
            RESPONSE_CODE[] r02 = values();
            int r1 = r02.length;
        L3:
            if (r2 >= r1) goto L5;
            RESPONSE_CODE r3 = r02[r2];
            f182678a.put(Integer.valueOf(r3.value), r3);
            r2 = r2 + 1;
            goto L3
        }

        RESPONSE_CODE(String r1, int r2, int r3) {
            this.value = (byte) r3;
        }

        public static /* synthetic */ RESPONSE_CODE[] a() {
            return new RESPONSE_CODE[]{NO_ERROR, FORMAT_ERR, SERVER_FAIL, NX_DOMAIN, NO_IMP, REFUSED, YXDOMAIN, YXRRSET, NXRRSET, NOT_AUTH, NOT_ZONE, BADVERS_BADSIG, BADKEY, BADTIME, BADMODE, BADNAME, BADALG, BADTRUNC, BADCOOKIE};
        }

        public static RESPONSE_CODE getResponseCode(int r1) throws IllegalArgumentException {
            if (r1 < 0) goto L8;
            if (r1 > 65535) goto L8;
            return (RESPONSE_CODE) f182678a.get(Integer.valueOf(r1));
        L8:
            throw new IllegalArgumentException();
        }

        public static RESPONSE_CODE valueOf(String r1) {
            return (RESPONSE_CODE) Enum.valueOf(RESPONSE_CODE.class, r1);
        }

        public static RESPONSE_CODE[] values() {
            return (RESPONSE_CODE[]) f182679b.clone();
        }

        public byte getValue() {
            return this.value;
        }
    }

    public enum SectionName extends Enum<SectionName> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ SectionName[] f182680a = null;
        public static final SectionName additional = null;
        public static final SectionName answer = null;
        public static final SectionName authority = null;

        static {
            answer = new SectionName("answer", 0);
            authority = new SectionName("authority", 1);
            additional = new SectionName("additional", 2);
            f182680a = a();
        }

        SectionName(String r1, int r2) {
        }

        public static /* synthetic */ SectionName[] a() {
            return new SectionName[]{answer, authority, additional};
        }

        public static SectionName valueOf(String r1) {
            return (SectionName) Enum.valueOf(SectionName.class, r1);
        }

        public static SectionName[] values() {
            return (SectionName[]) f182680a.clone();
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f182681a;

        /* renamed from: b, reason: collision with root package name */
        public OPCODE f182682b;

        /* renamed from: c, reason: collision with root package name */
        public RESPONSE_CODE f182683c;
        public boolean d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f182684e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f182685f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f182686g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f182687h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f182688i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f182689j;

        /* renamed from: k, reason: collision with root package name */
        public long f182690k;

        /* renamed from: l, reason: collision with root package name */
        public List f182691l;

        /* renamed from: m, reason: collision with root package name */
        public List f182692m;

        /* renamed from: n, reason: collision with root package name */
        public List f182693n;

        /* renamed from: o, reason: collision with root package name */
        public List f182694o;

        /* renamed from: p, reason: collision with root package name */
        public Edns.a f182695p;

        public /* synthetic */ a(org.minidns.dnsmessage.a r1) {
            this();
        }

        public static /* bridge */ /* synthetic */ List a(a r02) {
            return r02.f182694o;
        }

        public static /* bridge */ /* synthetic */ List b(a r02) {
            return r02.f182692m;
        }

        public static /* bridge */ /* synthetic */ boolean c(a r02) {
            return r02.f182688i;
        }

        public static /* bridge */ /* synthetic */ boolean d(a r02) {
            return r02.f182684e;
        }

        public static /* bridge */ /* synthetic */ List e(a r02) {
            return r02.f182693n;
        }

        public static /* bridge */ /* synthetic */ boolean f(a r02) {
            return r02.f182689j;
        }

        public static /* bridge */ /* synthetic */ Edns.a g(a r02) {
            return r02.f182695p;
        }

        public static /* bridge */ /* synthetic */ int h(a r02) {
            return r02.f182681a;
        }

        public static /* bridge */ /* synthetic */ OPCODE i(a r02) {
            return r02.f182682b;
        }

        public static /* bridge */ /* synthetic */ boolean j(a r02) {
            return r02.d;
        }

        public static /* bridge */ /* synthetic */ List k(a r02) {
            return r02.f182691l;
        }

        public static /* bridge */ /* synthetic */ long l(a r2) {
            return r2.f182690k;
        }

        public static /* bridge */ /* synthetic */ boolean m(a r02) {
            return r02.f182687h;
        }

        public static /* bridge */ /* synthetic */ boolean n(a r02) {
            return r02.f182686g;
        }

        public static /* bridge */ /* synthetic */ RESPONSE_CODE o(a r02) {
            return r02.f182683c;
        }

        public static /* bridge */ /* synthetic */ boolean p(a r02) {
            return r02.f182685f;
        }

        public static /* bridge */ /* synthetic */ void q(a r02, StringBuilder r1) {
            r02.B(r1);
        }

        public a A(boolean r1) {
            this.f182686g = r1;
            return this;
        }

        public final void B(StringBuilder r5) {
            r5.append('(');
            r5.append(this.f182681a);
            r5.append(' ');
            r5.append(this.f182682b);
            r5.append(' ');
            r5.append(this.f182683c);
            r5.append(' ');
            if (this.d == false) goto L5;
            r5.append("resp[qr=1]");
        L7:
            if (this.f182684e == false) goto L10;
            r5.append(" aa");
        L10:
            if (this.f182685f == false) goto L13;
            r5.append(" tr");
        L13:
            if (this.f182686g == false) goto L16;
            r5.append(" rd");
        L16:
            if (this.f182687h == false) goto L19;
            r5.append(" ra");
        L19:
            if (this.f182688i == false) goto L22;
            r5.append(" ad");
        L22:
            if (this.f182689j == false) goto L24;
            r5.append(" cd");
        L24:
            r5.append(")\n");
            List r02 = this.f182691l;
            if (r02 == null) goto L30;
            Iterator r03 = r02.iterator();
        L28:
            if (r03.hasNext() == false) goto L30;
            Object r2 = (b) r03.next();
            r5.append("[Q: ");
            r5.append(r2);
            r5.append("]\n");
        L30:
            List r04 = this.f182692m;
            if (r04 == null) goto L36;
            Iterator r05 = r04.iterator();
        L34:
            if (r05.hasNext() == false) goto L36;
            Object r22 = (Record) r05.next();
            r5.append("[A: ");
            r5.append(r22);
            r5.append("]\n");
        L36:
            List r06 = this.f182693n;
            if (r06 == null) goto L42;
            Iterator r07 = r06.iterator();
        L40:
            if (r07.hasNext() == false) goto L42;
            Object r23 = (Record) r07.next();
            r5.append("[N: ");
            r5.append(r23);
            r5.append("]\n");
        L42:
            List r08 = this.f182694o;
            if (r08 == null) goto L53;
            Iterator r09 = r08.iterator();
        L46:
            if (r09.hasNext() == false) goto L53;
            Record r24 = (Record) r09.next();
            r5.append("[X: ");
            Edns r3 = Edns.d(r24);
            if (r3 == null) goto L50;
            r5.append(r3.toString());
        L51:
            r5.append("]\n");
            goto L46
        L50:
            r5.append(r24);
        L53:
            if (r5.charAt(r5.length() - 1) != '\n') goto L62;
            r5.setLength(r5.length() - 1);
            return;
        L62:
            return;
        L5:
            r5.append("query[qr=0]");
            goto L7
        }

        public DnsMessage r() {
            return new DnsMessage(this);
        }

        public Edns.a s() {
            if (this.f182695p != null) goto L6;
            this.f182695p = Edns.c();
        L6:
            return this.f182695p;
        }

        public a t(Collection r3) {
            ArrayList r02 = new ArrayList(r3.size());
            this.f182694o = r02;
            r02.addAll(r3);
            return this;
        }

        public String toString() {
            StringBuilder r02 = new StringBuilder("Builder of DnsMessage");
            B(r02);
            return r02.toString();
        }

        public a u(Collection r3) {
            ArrayList r02 = new ArrayList(r3.size());
            this.f182692m = r02;
            r02.addAll(r3);
            return this;
        }

        public a v(boolean r1) {
            this.f182688i = r1;
            return this;
        }

        public a w(boolean r1) {
            this.f182689j = r1;
            return this;
        }

        public a x(int r2) {
            this.f182681a = r2 & 65535;
            return this;
        }

        public a y(Collection r3) {
            ArrayList r02 = new ArrayList(r3.size());
            this.f182693n = r02;
            r02.addAll(r3);
            return this;
        }

        public a z(b r3) {
            ArrayList r02 = new ArrayList(1);
            this.f182691l = r02;
            r02.add(r3);
            return this;
        }

        public /* synthetic */ a(DnsMessage r1, org.minidns.dnsmessage.a r2) {
            this(r1);
        }

        public a() {
            this.f182682b = OPCODE.QUERY;
            this.f182683c = RESPONSE_CODE.NO_ERROR;
            this.f182690k = -1;
        }

        public a(DnsMessage r3) {
            this.f182682b = OPCODE.QUERY;
            this.f182683c = RESPONSE_CODE.NO_ERROR;
            this.f182690k = -1;
            this.f182681a = r3.f182655a;
            this.f182682b = r3.f182656b;
            this.f182683c = r3.f182657c;
            this.d = r3.d;
            this.f182684e = r3.f182658e;
            this.f182685f = r3.f182659f;
            this.f182686g = r3.f182660g;
            this.f182687h = r3.f182661h;
            this.f182688i = r3.f182662i;
            this.f182689j = r3.f182663j;
            this.f182690k = r3.f182670q;
            ArrayList r02 = new ArrayList(r3.f182664k.size());
            this.f182691l = r02;
            r02.addAll(r3.f182664k);
            ArrayList r03 = new ArrayList(r3.f182665l.size());
            this.f182692m = r03;
            r03.addAll(r3.f182665l);
            ArrayList r04 = new ArrayList(r3.f182666m.size());
            this.f182693n = r04;
            r04.addAll(r3.f182666m);
            ArrayList r05 = new ArrayList(r3.f182667n.size());
            this.f182694o = r05;
            r05.addAll(r3.f182667n);
        }
    }

    static {
        f182654w = Logger.getLogger(DnsMessage.class.getName());
    }

    public DnsMessage(a r3) {
        this.f182673t = -1;
        this.f182655a = a.h(r3);
        this.f182656b = a.i(r3);
        this.f182657c = a.o(r3);
        this.f182670q = a.l(r3);
        this.d = a.j(r3);
        this.f182658e = a.d(r3);
        this.f182659f = a.p(r3);
        this.f182660g = a.n(r3);
        this.f182661h = a.m(r3);
        this.f182662i = a.c(r3);
        this.f182663j = a.f(r3);
        if (a.k(r3) != null) goto L5;
        this.f182664k = Collections.EMPTY_LIST;
    L7:
        if (a.b(r3) != null) goto L9;
        this.f182665l = Collections.EMPTY_LIST;
    L11:
        if (a.e(r3) != null) goto L13;
        this.f182666m = Collections.EMPTY_LIST;
    L15:
        if (a.a(r3) != null) goto L20;
        if (a.g(r3) != null) goto L20;
        this.f182667n = Collections.EMPTY_LIST;
    L33:
        int r32 = o(this.f182667n);
        this.f182668o = r32;
        if (r32 == (-1)) goto L42;
    L35:
        r32 = r32 + 1;
        if (r32 >= this.f182667n.size()) goto L46;
        if (((Record) this.f182667n.get(r32)).f182819b != Record.TYPE.OPT) goto L35;
        throw new IllegalArgumentException("There must be only one OPT pseudo RR in the additional section");
    L46:
        return;
    L42:
        return;
    L20:
        if (a.a(r3) == null) goto L22;
        int r02 = a.a(r3).size();
    L24:
        if (a.g(r3) == null) goto L26;
        r02 = r02 + 1;
    L26:
        ArrayList r1 = new ArrayList(r02);
        if (a.a(r3) == null) goto L30;
        r1.addAll(a.a(r3));
    L30:
        if (a.g(r3) == null) goto L32;
        Edns r33 = a.g(r3).f();
        this.f182669p = r33;
        r1.add(r33.a());
    L32:
        this.f182667n = Collections.unmodifiableList(r1);
        goto L33
    L22:
        r02 = 0;
        goto L24
    L13:
        ArrayList r03 = new ArrayList(a.e(r3).size());
        r03.addAll(a.e(r3));
        this.f182666m = Collections.unmodifiableList(r03);
        goto L15
    L9:
        ArrayList r04 = new ArrayList(a.b(r3).size());
        r04.addAll(a.b(r3));
        this.f182665l = Collections.unmodifiableList(r04);
        goto L11
    L5:
        ArrayList r05 = new ArrayList(a.k(r3).size());
        r05.addAll(a.k(r3));
        this.f182664k = Collections.unmodifiableList(r05);
        goto L7
    }

    public static a d() {
        return new a(null);
    }

    public static int o(List r3) {
        int r02 = 0;
    L4:
        if (r02 >= r3.size()) goto L9;
        if (((Record) r3.get(r02)).f182819b == Record.TYPE.OPT) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        return r02;
    L9:
        return -1;
    }

    public a a() {
        return new a(this, null);
    }

    public DatagramPacket b(InetAddress r4, int r5) {
        byte[] r02 = r();
        return new DatagramPacket(r02, r02.length, r4, r5);
    }

    public DnsMessage c() {
        if (this.f182674u != null) goto L6;
        this.f182674u = new DnsMessage(this);
    L6:
        return this.f182674u;
    }

    public int e() {
        if (this.d == false) goto L5;
        int r02 = 32768;
    L6:
        OPCODE r1 = this.f182656b;
        if (r1 == null) goto L10;
        r02 = r02 + (r1.getValue() << Ascii.VT);
    L10:
        if (this.f182658e == false) goto L13;
        r02 = r02 + 1024;
    L13:
        if (this.f182659f == false) goto L16;
        r02 = r02 + 512;
    L16:
        if (this.f182660g == false) goto L19;
        r02 = r02 + 256;
    L19:
        if (this.f182661h == false) goto L22;
        r02 = r02 + 128;
    L22:
        if (this.f182662i == false) goto L25;
        r02 = r02 + 32;
    L25:
        if (this.f182663j == false) goto L27;
        r02 = r02 + 16;
    L27:
        RESPONSE_CODE r12 = this.f182657c;
        if (r12 != null) goto L30;
        return r02;
    L30:
        return r02 + r12.getValue();
    L5:
        r02 = 0;
        goto L6
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof DnsMessage) == true) goto L6;
        return false;
    L6:
        if (r2 != this) goto L9;
        return true;
    L9:
        byte[] r22 = ((DnsMessage) r2).r();
        return Arrays.equals(r(), r22);
    }

    public List f() {
        ArrayList r02 = new ArrayList(this.f182665l.size());
        r02.addAll(this.f182665l);
        return r02;
    }

    public List g() {
        ArrayList r02 = new ArrayList(this.f182666m.size());
        r02.addAll(this.f182666m);
        return r02;
    }

    public List h(Class r2) {
        return i(SectionName.answer, r2);
    }

    public int hashCode() {
        if (this.f182675v != null) goto L6;
        this.f182675v = Integer.valueOf(Arrays.hashCode(r()));
    L6:
        return this.f182675v.intValue();
    }

    public final List i(SectionName r2, Class r3) {
        return j(false, r2, r3);
    }

    public final List j(boolean r4, SectionName r5, Class r6) {
        int r02 = r5.ordinal();
        int r1 = 1;
        if (r02 == 0) goto L11;
        if (r02 != 1) goto L6;
        List r52 = this.f182666m;
    L13:
        if (r4 == true) goto L16;
        r1 = r52.size();
    L16:
        ArrayList r03 = new ArrayList(r1);
        Iterator r53 = r52.iterator();
    L18:
        if (r53.hasNext() == false) goto L23;
        Record r12 = ((Record) r53.next()).e(r6);
        if (r12 == null) goto L18;
        r03.add(r12);
        if (r4 == false) goto L18;
    L23:
        return r03;
    L6:
        if (r02 != 2) goto L9;
        r52 = this.f182667n;
        goto L13
    L9:
        throw new AssertionError("Unknown section name " + String.valueOf(r5));
    L11:
        r52 = this.f182665l;
        goto L13
    }

    public Set k(b r9) {
        if (this.f182657c == RESPONSE_CODE.NO_ERROR) goto L6;
        return null;
    L6:
        HashSet r02 = new HashSet(this.f182665l.size());
        Iterator r1 = this.f182665l.iterator();
    L8:
        if (r1.hasNext() == false) goto L15;
        Record r2 = (Record) r1.next();
        if (r2.f(r9) == false) goto L8;
        if (r02.add(r2.d()) == true) goto L8;
        f182654w.log(Level.WARNING, "DnsMessage contains duplicate answers. Record: " + String.valueOf(r2) + "; DnsMessage: " + String.valueOf(this));
        goto L8
    L15:
        return r02;
    }

    public long l() {
        long r02 = this.f182673t;
        if (r02 < 0) goto L5;
        return r02;
    L5:
        this.f182673t = Long.MAX_VALUE;
        Iterator r03 = this.f182665l.iterator();
    L7:
        if (r03.hasNext() == false) goto L10;
        Record r1 = (Record) r03.next();
        this.f182673t = Math.min(this.f182673t, r1.f182821e);
        goto L7
    L10:
        return this.f182673t;
    }

    public Edns m() {
        Edns r02 = this.f182669p;
        if (r02 == null) goto L5;
        return r02;
    L5:
        Record r03 = n();
        if (r03 != null) goto L9;
        return null;
    L9:
        Edns r1 = new Edns(r03);
        this.f182669p = r1;
        return r1;
    }

    public Record n() {
        int r02 = this.f182668o;
        if (r02 != (-1)) goto L7;
        return null;
    L7:
        return (Record) this.f182667n.get(r02);
    }

    public b p() {
        return (b) this.f182664k.get(0);
    }

    public boolean q() {
        Edns r02 = m();
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.f182766f;
    }

    public final byte[] r() {
        byte[] r02 = this.f182671r;
        if (r02 == null) goto L5;
        return r02;
    L5:
        ByteArrayOutputStream r03 = new ByteArrayOutputStream(512);
        DataOutputStream r1 = new DataOutputStream(r03);
        int r2 = e();
        r1.writeShort((short) this.f182655a);     // Catch: IOException -> L9
        r1.writeShort((short) r2);     // Catch: IOException -> L9
        List r22 = this.f182664k;     // Catch: IOException -> L9
        if (r22 != null) goto L11;
        r1.writeShort(0);     // Catch: IOException -> L9
    L12:
        List r23 = this.f182665l;     // Catch: IOException -> L9
        if (r23 != null) goto L15;
        r1.writeShort(0);     // Catch: IOException -> L9
    L16:
        List r24 = this.f182666m;     // Catch: IOException -> L9
        if (r24 != null) goto L19;
        r1.writeShort(0);     // Catch: IOException -> L9
    L20:
        List r25 = this.f182667n;     // Catch: IOException -> L9
        if (r25 != null) goto L23;
        r1.writeShort(0);     // Catch: IOException -> L9
    L24:
        List r26 = this.f182664k;     // Catch: IOException -> L9
        if (r26 == null) goto L30;
        Iterator r27 = r26.iterator();     // Catch: IOException -> L9
    L28:
        if (r27.hasNext() == false) goto L30;
        r1.write(((b) r27.next()).b());     // Catch: IOException -> L9
    L30:
        List r28 = this.f182665l;     // Catch: IOException -> L9
        if (r28 == null) goto L36;
        Iterator r29 = r28.iterator();     // Catch: IOException -> L9
    L34:
        if (r29.hasNext() == false) goto L36;
        r1.write(((Record) r29.next()).h());     // Catch: IOException -> L9
    L36:
        List r210 = this.f182666m;     // Catch: IOException -> L9
        if (r210 == null) goto L42;
        Iterator r211 = r210.iterator();     // Catch: IOException -> L9
    L40:
        if (r211.hasNext() == false) goto L42;
        r1.write(((Record) r211.next()).h());     // Catch: IOException -> L9
    L42:
        List r212 = this.f182667n;     // Catch: IOException -> L9
        if (r212 == null) goto L48;
        Iterator r213 = r212.iterator();     // Catch: IOException -> L9
    L46:
        if (r213.hasNext() == false) goto L48;
        r1.write(((Record) r213.next()).h());     // Catch: IOException -> L9
    L48:
        r1.flush();     // Catch: IOException -> L9
        byte[] r04 = r03.toByteArray();
        this.f182671r = r04;
        return r04;
    L23:
        r1.writeShort((short) r25.size());     // Catch: IOException -> L9
        goto L24
    L19:
        r1.writeShort((short) r24.size());     // Catch: IOException -> L9
        goto L20
    L15:
        r1.writeShort((short) r23.size());     // Catch: IOException -> L9
        goto L16
    L11:
        r1.writeShort((short) r22.size());     // Catch: IOException -> L9
    L9:
        e = move-exception;
        throw new AssertionError(e);
    }

    public void s(OutputStream r2) {
        t(r2, true);
    }

    public void t(OutputStream r3, boolean r4) {
        byte[] r02 = r();
        DataOutputStream r1 = new DataOutputStream(r3);
        if (r4 == false) goto L5;
        r1.writeShort(r02.length);
    L5:
        r1.write(r02);
    }

    public String toString() {
        String r02 = this.f182672s;
        if (r02 == null) goto L5;
        return r02;
    L5:
        StringBuilder r03 = new StringBuilder("DnsMessage");
        a.q(a(), r03);
        String r04 = r03.toString();
        this.f182672s = r04;
        return r04;
    }

    public DnsMessage(byte[] r10) {
        this.f182673t = -1;
        DataInputStream r1 = new DataInputStream(new ByteArrayInputStream(r10));
        this.f182655a = r1.readUnsignedShort();
        int r02 = r1.readUnsignedShort();
        boolean r3 = true;
        int r4 = 0;
        if (((r02 >> 15) & 1) != 1) goto L5;
        boolean r2 = true;
    L6:
        this.d = r2;
        this.f182656b = OPCODE.getOpcode((r02 >> 11) & 15);
        if (((r02 >> 10) & 1) != 1) goto L9;
        boolean r22 = true;
    L10:
        this.f182658e = r22;
        if (((r02 >> 9) & 1) != 1) goto L13;
        boolean r23 = true;
    L14:
        this.f182659f = r23;
        if (((r02 >> 8) & 1) != 1) goto L17;
        boolean r24 = true;
    L18:
        this.f182660g = r24;
        if (((r02 >> 7) & 1) != 1) goto L21;
        boolean r25 = true;
    L22:
        this.f182661h = r25;
        if (((r02 >> 5) & 1) != 1) goto L25;
        boolean r26 = true;
    L26:
        this.f182662i = r26;
        if (((r02 >> 4) & 1) == 1) goto L30;
        r3 = false;
    L30:
        this.f182663j = r3;
        this.f182657c = RESPONSE_CODE.getResponseCode(r02 & 15);
        this.f182670q = System.currentTimeMillis();
        int r03 = r1.readUnsignedShort();
        int r27 = r1.readUnsignedShort();
        int r32 = r1.readUnsignedShort();
        int r5 = r1.readUnsignedShort();
        this.f182664k = new ArrayList(r03);
        int r6 = 0;
    L31:
        if (r6 >= r03) goto L33;
        this.f182664k.add(new b(r1, r10));
        r6 = r6 + 1;
        goto L31
    L33:
        this.f182665l = new ArrayList(r27);
        int r04 = 0;
    L34:
        if (r04 >= r27) goto L36;
        this.f182665l.add(Record.g(r1, r10));
        r04 = r04 + 1;
        goto L34
    L36:
        this.f182666m = new ArrayList(r32);
        int r05 = 0;
    L37:
        if (r05 >= r32) goto L39;
        this.f182666m.add(Record.g(r1, r10));
        r05 = r05 + 1;
        goto L37
    L39:
        this.f182667n = new ArrayList(r5);
    L40:
        if (r4 >= r5) goto L42;
        this.f182667n.add(Record.g(r1, r10));
        r4 = r4 + 1;
        goto L40
    L42:
        this.f182668o = o(this.f182667n);
        return;
    L25:
        r26 = false;
        goto L26
    L21:
        r25 = false;
        goto L22
    L17:
        r24 = false;
        goto L18
    L13:
        r23 = false;
        goto L14
    L9:
        r22 = false;
        goto L10
    L5:
        r2 = false;
        goto L6
    }

    public DnsMessage(DnsMessage r3) {
        this.f182673t = -1;
        this.f182655a = 0;
        this.d = r3.d;
        this.f182656b = r3.f182656b;
        this.f182658e = r3.f182658e;
        this.f182659f = r3.f182659f;
        this.f182660g = r3.f182660g;
        this.f182661h = r3.f182661h;
        this.f182662i = r3.f182662i;
        this.f182663j = r3.f182663j;
        this.f182657c = r3.f182657c;
        this.f182670q = r3.f182670q;
        this.f182664k = r3.f182664k;
        this.f182665l = r3.f182665l;
        this.f182666m = r3.f182666m;
        this.f182667n = r3.f182667n;
        this.f182668o = r3.f182668o;
    }
}
