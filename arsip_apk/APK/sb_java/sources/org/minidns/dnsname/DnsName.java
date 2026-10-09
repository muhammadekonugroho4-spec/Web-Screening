package org.minidns.dnsname;

import com.google.firebase.perf.util.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.minidns.dnslabel.DnsLabel;
import org.minidns.dnsname.InvalidDnsNameException;
import org.minidns.idna.c;
import org.minidns.util.g;

/* loaded from: classes3.dex */
public final class DnsName extends g implements Serializable, Comparable<DnsName> {

    /* renamed from: h, reason: collision with root package name */
    public static final DnsName f182700h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final DnsName f182701i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final DnsName f182702j = null;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f182703k = false;
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public transient byte[] f182704a;
    public final String ace;

    /* renamed from: b, reason: collision with root package name */
    public transient String f182705b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f182706c;
    public transient DnsLabel[] d;

    /* renamed from: e, reason: collision with root package name */
    public transient DnsLabel[] f182707e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f182708f;

    /* renamed from: g, reason: collision with root package name */
    public transient String f182709g;
    private final String rawAce;
    private int size;

    static {
        f182700h = new DnsName(".");
        f182701i = new DnsName("in-addr.arpa");
        f182702j = new DnsName("ip6.arpa");
        f182703k = true;
    }

    public DnsName(String r2) {
        this(r2, true);
    }

    public static DnsName c(CharSequence r02) {
        return d(r02.toString());
    }

    public static DnsName d(String r2) {
        return new DnsName(r2, false);
    }

    public static DnsName e(DnsLabel r5, DnsName r6) {
        r6.w();
        DnsLabel[] r02 = r6.f182707e;
        DnsLabel[] r1 = new DnsLabel[r02.length + 1];
        System.arraycopy(r02, 0, r1, 0, r02.length);
        r1[r6.f182707e.length] = r5;
        return new DnsName(r1, true);
    }

    public static DnsName g(DnsName r4, DnsName r5) {
        r4.w();
        r5.w();
        int r02 = r4.f182707e.length;
        DnsLabel[] r1 = r5.f182707e;
        DnsLabel[] r03 = new DnsLabel[r02 + r1.length];
        System.arraycopy(r1, 0, r03, 0, r1.length);
        DnsLabel[] r42 = r4.f182707e;
        System.arraycopy(r42, 0, r03, r5.f182707e.length, r42.length);
        return new DnsName(r03, true);
    }

    public static DnsLabel[] k(String r5) {
        String[] r02 = r5.split("[.。．｡]", 128);
        int r1 = 0;
    L4:
        if (r1 >= (r02.length / 2)) goto L11;
        String r2 = r02[r1];
        int r3 = (r02.length - r1) - 1;
        r02[r1] = r02[r3];
        r02[r3] = r2;
        r1 = r1 + 1;
        goto L4
    L11:
        return DnsLabel.i(r02);
    L8:
        e = move-exception;
        throw new InvalidDnsNameException.LabelTooLongException(r5, e.label);
    }

    public static String r(DnsLabel[] r2, int r3) {
        StringBuilder r02 = new StringBuilder(r3);
        int r32 = r2.length - 1;
    L3:
        if (r32 < 0) goto L5;
        r02.append(r2[r32]);
        r02.append('.');
        r32 = r32 - 1;
        goto L3
    L5:
        r02.setLength(r02.length() - 1);
        return r02.toString();
    }

    public static DnsName s(DataInputStream r3, byte[] r4) {
        int r02 = r3.readUnsignedByte();
        if ((r02 & 192) != 192) goto L6;
        int r03 = ((r02 & 63) << 8) + r3.readUnsignedByte();
        HashSet r32 = new HashSet();
        r32.add(Integer.valueOf(r03));
        return t(r4, r03, r32);
    L6:
        if (r02 == 0) goto L8;
        byte[] r04 = new byte[r02];
        r3.readFully(r04);
        return g(new DnsName(new String(r04, StandardCharsets.US_ASCII)), s(r3, r4));
    L8:
        return f182700h;
    }

    public static DnsName t(byte[] r4, int r5, HashSet r6) {
        int r02 = r4[r5];
        int r1 = r02 & Constants.MAX_HOST_LENGTH;
        if ((r02 & 192) != 192) goto L10;
        int r03 = ((r02 & 63) << 8) + (r4[r5 + 1] & Constants.MAX_HOST_LENGTH);
        if (r6.contains(Integer.valueOf(r03)) == true) goto L9;
        r6.add(Integer.valueOf(r03));
        return t(r4, r03, r6);
    L9:
        throw new IllegalStateException("Cyclic offsets detected.");
    L10:
        if (r1 == 0) goto L12;
        int r52 = r5 + 1;
        return g(new DnsName(new String(r4, r52, r1, StandardCharsets.US_ASCII)), t(r4, r52 + r1, r6));
    L12:
        return f182700h;
    }

    private void u() {
        if (this.f182704a == null) goto L5;
        return;
    L5:
        w();
        this.f182704a = z(this.d);
    }

    public static byte[] z(DnsLabel[] r3) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream(64);
        int r1 = r3.length - 1;
    L3:
        if (r1 < 0) goto L5;
        r3[r1].o(r02);
        r1 = r1 - 1;
        goto L3
    L5:
        r02.write(0);
        return r02.toByteArray();
    }

    public final void A() {
        u();
        if (this.f182704a.length > 255) goto L6;
        return;
    L6:
        throw new InvalidDnsNameException.DNSNameTooLongException(this.ace, this.f182704a);
    }

    public void B(OutputStream r2) {
        u();
        r2.write(this.f182704a);
    }

    public int b(DnsName r2) {
        return this.ace.compareTo(r2.ace);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(DnsName r1) {
        return b(r1);
    }

    public boolean equals(Object r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        if ((r3 instanceof DnsName) == false) goto L9;
        DnsName r32 = (DnsName) r3;
        u();
        r32.u();
        return Arrays.equals(this.f182704a, r32.f182704a);
    L9:
        return false;
    }

    public byte[] h() {
        u();
        return (byte[]) this.f182704a.clone();
    }

    public int hashCode() {
        if (this.f182708f != 0) goto L8;
        if (q() == true) goto L8;
        u();
        this.f182708f = Arrays.hashCode(this.f182704a);
    L8:
        return this.f182708f;
    }

    public String i() {
        v();
        return this.f182706c;
    }

    public int j() {
        w();
        return this.d.length;
    }

    public DnsName m() {
        if (q() == false) goto L7;
        return f182700h;
    L7:
        return y(j() - 1);
    }

    public String o() {
        return this.rawAce;
    }

    public boolean p(DnsName r5) {
        w();
        r5.w();
        if (this.d.length >= r5.d.length) goto L5;
        return false;
    L5:
        int r02 = 0;
    L6:
        DnsLabel[] r1 = r5.d;
        if (r02 >= r1.length) goto L12;
        if (this.d[r02].equals(r1[r02]) == false) goto L10;
        r02 = r02 + 1;
        goto L6
    L10:
        return false;
    L12:
        return true;
    }

    public boolean q() {
        if (this.ace.isEmpty() == false) goto L5;
        return true;
    L5:
        if (this.ace.equals(".") == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        if (this.f182709g != null) goto L16;
        w();
        if (this.d.length != 0) goto L8;
        return ".";
    L8:
        StringBuilder r02 = new StringBuilder();
        int r1 = this.d.length - 1;
    L9:
        if (r1 < 0) goto L14;
        r02.append(this.d[r1].toString());
        if (r1 == 0) goto L13;
        r02.append('.');
    L13:
        r1 = r1 - 1;
        goto L9
    L14:
        this.f182709g = r02.toString();
    L16:
        return this.f182709g;
    }

    public final void v() {
        if (this.f182706c == null) goto L5;
        return;
    L5:
        String[] r02 = this.ace.split("[.。．｡]", 2);
        this.f182706c = r02[0];
        if (r02.length <= 1) goto L9;
        this.f182705b = r02[1];
        return;
    L9:
        this.f182705b = "";
    }

    public final void w() {
        if (this.d == null) goto L8;
        if (this.f182707e == null) goto L8;
        return;
    L8:
        if (q() == false) goto L11;
        DnsLabel[] r02 = new DnsLabel[0];
        this.d = r02;
        this.f182707e = r02;
        return;
    L11:
        this.d = k(this.ace);
        this.f182707e = k(this.rawAce);
    }

    public int x() {
        if (this.size >= 0) goto L9;
        if (q() == false) goto L7;
        this.size = 1;
        goto L9
    L7:
        this.size = this.ace.length() + 2;
    L9:
        return this.size;
    }

    public DnsName y(int r3) {
        w();
        DnsLabel[] r02 = this.d;
        if (r3 > r02.length) goto L13;
        if (r3 != r02.length) goto L7;
        return this;
    L7:
        if (r3 != 0) goto L11;
        return f182700h;
    L11:
        return new DnsName((DnsLabel[]) Arrays.copyOfRange(this.f182707e, 0, r3), false);
    L13:
        throw new IllegalArgumentException();
    }

    public DnsName(String r4, boolean r5) {
        this.size = -1;
        if (r4.isEmpty() == false) goto L5;
        this.rawAce = f182700h.rawAce;
    L13:
        this.ace = this.rawAce.toLowerCase(Locale.US);
        if (f182703k == true) goto L16;
        return;
    L16:
        A();
        return;
    L5:
        int r02 = r4.length();
        int r1 = r02 - 1;
        if (r02 >= 2) goto L8;
    L10:
        if (r5 == false) goto L12;
        this.rawAce = r4;
        goto L13
    L12:
        this.rawAce = c.a(r4);
        goto L13
    L8:
        if (r4.charAt(r1) != '.') goto L10;
        r4 = r4.subSequence(0, r1).toString();
        goto L10
    }

    public DnsName(DnsLabel[] r5, boolean r6) {
        this.size = -1;
        this.f182707e = r5;
        this.d = new DnsLabel[r5.length];
        int r02 = 0;
        int r1 = 0;
    L4:
        if (r02 >= r5.length) goto L6;
        r1 = r1 + (r5[r02].length() + 1);
        this.d[r02] = r5[r02].b();
        r02 = r02 + 1;
        goto L4
    L6:
        this.rawAce = r(r5, r1);
        this.ace = r(this.d, r1);
        if (r6 == true) goto L9;
        return;
    L9:
        if (f182703k == false) goto L15;
        A();
        return;
    }
}
