package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f27145a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f27146b = null;

    static {
        f27145a = new byte[]{112, 114, 111, 0};
        f27146b = new byte[]{112, 114, 109, 0};
    }

    public static void A(byte[] r1, int r2, int r3, d r4) {
        int r22 = m(r2, r3, r4.f27133g);
        int r32 = r22 / 8;
        int r23 = 1 << (r22 % 8);
        r1[r32] = (byte) (r23 | r1[r32]);
    }

    public static void B(InputStream r2) {
        e.h(r2);
        int r02 = e.j(r2);
        if (r02 != 6) goto L6;
        return;
    L6:
        if (r02 == 7) goto L16;
    L8:
        if (r02 <= 0) goto L17;
        e.j(r2);
        int r1 = e.j(r2);
    L10:
        if (r1 <= 0) goto L12;
        e.h(r2);
        r1 = r1 - 1;
        goto L10
    L12:
        r02 = r02 - 1;
        goto L8
    L17:
        return;
    }

    public static boolean C(OutputStream r2, byte[] r3, d[] r4) {
        if (Arrays.equals(r3, m.f27156a) == false) goto L7;
        P(r2, r4);
        return true;
    L7:
        if (Arrays.equals(r3, m.f27157b) == false) goto L11;
        O(r2, r4);
        return true;
    L11:
        if (Arrays.equals(r3, m.d) == false) goto L15;
        M(r2, r4);
        return true;
    L15:
        if (Arrays.equals(r3, m.f27158c) == false) goto L19;
        N(r2, r4);
        return true;
    L19:
        if (Arrays.equals(r3, m.f27159e) == false) goto L22;
        L(r2, r4);
        return true;
    L22:
        return false;
    }

    public static void D(OutputStream r4, d r5) {
        int[] r52 = r5.f27134h;
        int r02 = r52.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r02) goto L5;
        int r3 = r52[r1];
        e.p(r4, r3 - r2);
        r1 = r1 + 1;
        r2 = r3;
        goto L3
    }

    public static n E(d[] r7) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        e.p(r02, r7.length);     // Catch: Throwable -> L7
        int r2 = 2;
        int r3 = 0;
    L5:
        if (r3 >= r7.length) goto L9;
        d r4 = r7[r3];     // Catch: Throwable -> L7
        e.q(r02, r4.f27130c);     // Catch: Throwable -> L7
        e.q(r02, r4.d);     // Catch: Throwable -> L7
        e.q(r02, r4.f27133g);     // Catch: Throwable -> L7
        String r42 = j(r4.f27128a, r4.f27129b, m.f27156a);     // Catch: Throwable -> L7
        int r5 = e.k(r42);     // Catch: Throwable -> L7
        e.p(r02, r5);     // Catch: Throwable -> L7
        r2 = (r2 + 14) + r5;     // Catch: Throwable -> L7
        e.n(r02, r42);     // Catch: Throwable -> L7
        r3 = r3 + 1;     // Catch: Throwable -> L7
        goto L5
    L9:
        byte[] r72 = r02.toByteArray();     // Catch: Throwable -> L7
        if (r2 != r72.length) goto L15;
        n r32 = new n(FileSectionType.DEX_FILES, r2, r72, false);     // Catch: Throwable -> L7
        r02.close();
        return r32;
    L15:
        throw e.c("Expected size " + r2 + ", does not match actual size " + r72.length);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L18
    L20:
        throw th;
    L18:
        th = move-exception;
        th.addSuppressed(th);
        goto L20
    }

    public static void F(OutputStream r1, byte[] r2) {
        r1.write(f27145a);
        r1.write(r2);
    }

    public static void G(OutputStream r02, d r1) {
        K(r02, r1);
        D(r02, r1);
        I(r02, r1);
    }

    public static void H(OutputStream r2, d r3, String r4) {
        e.p(r2, e.k(r4));
        e.p(r2, r3.f27131e);
        e.q(r2, r3.f27132f);
        e.q(r2, r3.f27130c);
        e.q(r2, r3.f27133g);
        e.n(r2, r4);
    }

    public static void I(OutputStream r5, d r6) {
        byte[] r02 = new byte[k(r6.f27133g)];
        Iterator r1 = r6.f27135i.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L11;
        Map.Entry r2 = (Map.Entry) r1.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        int r22 = ((Integer) r2.getValue()).intValue();
        if ((r22 & 2) == 0) goto L9;
        A(r02, 2, r3, r6);
    L9:
        if ((r22 & 4) == 0) goto L4;
        A(r02, 4, r3, r6);
        goto L4
    L11:
        r5.write(r02);
    }

    public static void J(OutputStream r10, int r11, d r12) {
        byte[] r02 = new byte[l(r11, r12.f27133g)];
        Iterator r1 = r12.f27135i.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L17;
        Map.Entry r2 = (Map.Entry) r1.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        int r22 = ((Integer) r2.getValue()).intValue();
        int r5 = 0;
        int r6 = 1;
    L7:
        if (r6 > 4) goto L4;
        if (r6 == 1) goto L9;
        if ((r6 & r11) == 0) goto L9;
        if ((r6 & r22) != r6) goto L16;
        int r7 = (r12.f27133g * r5) + r3;
        int r8 = r7 / 8;
        r02[r8] = (byte) ((1 << (r7 % 8)) | r02[r8]);
    L16:
        r5 = r5 + 1;
    L9:
        r6 = r6 << 1;
        goto L7
    L17:
        r10.write(r02);
    }

    public static void K(OutputStream r4, d r5) {
        Iterator r52 = r5.f27135i.entrySet().iterator();
        int r1 = 0;
    L4:
        if (r52.hasNext() == false) goto L9;
        Map.Entry r2 = (Map.Entry) r52.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        if ((((Integer) r2.getValue()).intValue() & 1) == 0) goto L4;
        e.p(r4, r3 - r1);
        e.p(r4, 0);
        r1 = r3;
        goto L4
    }

    public static void L(OutputStream r7, d[] r8) {
        e.p(r7, r8.length);
        int r02 = r8.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L12;
        d r3 = r8[r2];
        String r4 = j(r3.f27128a, r3.f27129b, m.f27159e);
        e.p(r7, e.k(r4));
        e.p(r7, r3.f27135i.size());
        e.p(r7, r3.f27134h.length);
        e.q(r7, r3.f27130c);
        e.n(r7, r4);
        Iterator r42 = r3.f27135i.keySet().iterator();
    L6:
        if (r42.hasNext() == false) goto L8;
        e.p(r7, ((Integer) r42.next()).intValue());
        goto L6
    L8:
        int[] r32 = r3.f27134h;
        int r43 = r32.length;
        int r5 = 0;
    L9:
        if (r5 >= r43) goto L11;
        e.p(r7, r32[r5]);
        r5 = r5 + 1;
        goto L9
    L11:
        r2 = r2 + 1;
        goto L3
    }

    public static void M(OutputStream r8, d[] r9) {
        e.r(r8, r9.length);
        int r02 = r9.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L12;
        d r3 = r9[r2];
        int r4 = r3.f27135i.size() * 4;
        String r5 = j(r3.f27128a, r3.f27129b, m.d);
        e.p(r8, e.k(r5));
        e.p(r8, r3.f27134h.length);
        e.q(r8, r4);
        e.q(r8, r3.f27130c);
        e.n(r8, r5);
        Iterator r42 = r3.f27135i.keySet().iterator();
    L6:
        if (r42.hasNext() == false) goto L8;
        e.p(r8, ((Integer) r42.next()).intValue());
        e.p(r8, 0);
        goto L6
    L8:
        int[] r32 = r3.f27134h;
        int r43 = r32.length;
        int r52 = 0;
    L9:
        if (r52 >= r43) goto L11;
        e.p(r8, r32[r52]);
        r52 = r52 + 1;
        goto L9
    L11:
        r2 = r2 + 1;
        goto L3
    }

    public static void N(OutputStream r1, d[] r2) {
        byte[] r02 = b(r2, m.f27158c);
        e.r(r1, r2.length);
        e.m(r1, r02);
    }

    public static void O(OutputStream r1, d[] r2) {
        byte[] r02 = b(r2, m.f27157b);
        e.r(r1, r2.length);
        e.m(r1, r02);
    }

    public static void P(OutputStream r02, d[] r1) {
        Q(r02, r1);
    }

    public static void Q(OutputStream r10, d[] r11) {
        ArrayList r02 = new ArrayList(3);
        ArrayList r2 = new ArrayList(3);
        r02.add(E(r11));
        r02.add(c(r11));
        r02.add(d(r11));
        long r3 = ((m.f27156a.length + f27145a.length) + 4) + (r02.size() * 16);
        e.q(r10, r02.size());
        int r112 = 0;
        int r1 = 0;
    L4:
        if (r1 >= r02.size()) goto L12;
        n r5 = (n) r02.get(r1);
        e.q(r10, r5.f27162a.getValue());
        e.q(r10, r3);
        if (r5.d == false) goto L9;
        byte[] r52 = r5.f27164c;
        long r6 = r52.length;
        byte[] r53 = e.b(r52);
        r2.add(r53);
        e.q(r10, r53.length);
        e.q(r10, r6);
        int r54 = r53.length;
    L8:
        r3 = r3 + r54;
        r1 = r1 + 1;
        goto L4
    L9:
        r2.add(r5.f27164c);
        e.q(r10, r5.f27164c.length);
        e.q(r10, 0);
        r54 = r5.f27164c.length;
    L12:
        if (r112 >= r2.size()) goto L14;
        r10.write((byte[]) r2.get(r112));
        r112 = r112 + 1;
        goto L12
    }

    public static int a(d r2) {
        Iterator r22 = r2.f27135i.entrySet().iterator();
        int r02 = 0;
    L4:
        if (r22.hasNext() == false) goto L6;
        r02 = r02 | ((Integer) ((Map.Entry) r22.next()).getValue()).intValue();
        goto L4
    L6:
        return r02;
    }

    public static byte[] b(d[] r8, byte[] r9) {
        int r02 = r8.length;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L5;
        d r4 = r8[r2];
        r3 = r3 + ((((e.k(j(r4.f27128a, r4.f27129b, r9)) + 16) + (r4.f27131e * 2)) + r4.f27132f) + k(r4.f27133g));
        r2 = r2 + 1;
        goto L3
    L5:
        ByteArrayOutputStream r03 = new ByteArrayOutputStream(r3);
        if (Arrays.equals(r9, m.f27158c) == false) goto L10;
        int r22 = r8.length;
    L8:
        if (r1 >= r22) goto L17;
        d r42 = r8[r1];
        H(r03, r42, j(r42.f27128a, r42.f27129b, r9));
        G(r03, r42);
        r1 = r1 + 1;
    L17:
        if (r03.size() != r3) goto L21;
        return r03.toByteArray();
    L21:
        throw e.c("The bytes saved do not match expectation. actual=" + r03.size() + " expected=" + r3);
    L10:
        int r23 = r8.length;
        int r43 = 0;
    L11:
        if (r43 >= r23) goto L13;
        d r5 = r8[r43];
        H(r03, r5, j(r5.f27128a, r5.f27129b, r9));
        r43 = r43 + 1;
        goto L11
    L13:
        int r92 = r8.length;
    L14:
        if (r1 >= r92) goto L17;
        G(r03, r8[r1]);
        r1 = r1 + 1;
        goto L14
    }

    public static n c(d[] r5) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        int r1 = 0;
        int r2 = 0;
    L20:
    L6:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
    L4:
        if (r1 >= r5.length) goto L8;
        d r3 = r5[r1];     // Catch: Throwable -> L6
        e.p(r02, r1);     // Catch: Throwable -> L6
        e.p(r02, r3.f27131e);     // Catch: Throwable -> L6
        r2 = (r2 + 4) + (r3.f27131e * 2);     // Catch: Throwable -> L6
        D(r02, r3);     // Catch: Throwable -> L6
        r1 = r1 + 1;     // Catch: Throwable -> L6
        goto L20
    L8:
        byte[] r52 = r02.toByteArray();     // Catch: Throwable -> L6
        if (r2 != r52.length) goto L14;
        n r12 = new n(FileSectionType.CLASSES, r2, r52, true);     // Catch: Throwable -> L6
        r02.close();
        return r12;
    L14:
        throw e.c("Expected size " + r2 + ", does not match actual size " + r52.length);     // Catch: Throwable -> L6
    }

    public static n d(d[] r9) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        int r1 = 0;
        int r2 = 0;
    L20:
    L6:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
    L4:
        if (r1 >= r9.length) goto L8;
        d r3 = r9[r1];     // Catch: Throwable -> L6
        int r4 = a(r3);     // Catch: Throwable -> L6
        byte[] r5 = e(r4, r3);     // Catch: Throwable -> L6
        byte[] r32 = f(r3);     // Catch: Throwable -> L6
        e.p(r02, r1);     // Catch: Throwable -> L6
        int r6 = (r5.length + 2) + r32.length;     // Catch: Throwable -> L6
        e.q(r02, r6);     // Catch: Throwable -> L6
        e.p(r02, r4);     // Catch: Throwable -> L6
        r02.write(r5);     // Catch: Throwable -> L6
        r02.write(r32);     // Catch: Throwable -> L6
        r2 = (r2 + 6) + r6;     // Catch: Throwable -> L6
        r1 = r1 + 1;     // Catch: Throwable -> L6
        goto L20
    L8:
        byte[] r92 = r02.toByteArray();     // Catch: Throwable -> L6
        if (r2 != r92.length) goto L14;
        n r12 = new n(FileSectionType.METHODS, r2, r92, true);     // Catch: Throwable -> L6
        r02.close();
        return r12;
    L14:
        throw e.c("Expected size " + r2 + ", does not match actual size " + r92.length);     // Catch: Throwable -> L6
    }

    public static byte[] e(int r1, d r2) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        J(r02, r1, r2);     // Catch: Throwable -> L6
        byte[] r12 = r02.toByteArray();     // Catch: Throwable -> L6
        r02.close();
        return r12;
    L6:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    public static byte[] f(d r1) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        K(r02, r1);     // Catch: Throwable -> L6
        byte[] r12 = r02.toByteArray();     // Catch: Throwable -> L6
        r02.close();
        return r12;
    L6:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    public static String g(String r3, String r4) {
        if ("!".equals(r4) == false) goto L7;
        return r3.replace(":", "!");
    L7:
        if (":".equals(r4) == true) goto L9;
        return r3;
    L9:
        return r3.replace("!", ":");
    }

    public static String h(String r1) {
        int r02 = r1.indexOf("!");
        if (r02 >= 0) goto L5;
        r02 = r1.indexOf(":");
    L5:
        if (r02 > 0) goto L7;
        return r1;
    L7:
        return r1.substring(r02 + 1);
    }

    public static d i(d[] r3, String r4) {
        if (r3.length > 0) goto L5;
        return null;
    L5:
        String r42 = h(r4);
        int r02 = 0;
    L7:
        if (r02 >= r3.length) goto L13;
        if (r3[r02].f27129b.equals(r42) == true) goto L11;
        r02 = r02 + 1;
        goto L7
    L11:
        return r3[r02];
    L13:
        return null;
    }

    public static String j(String r2, String r3, byte[] r4) {
        String r02 = m.a(r4);
        if (r2.length() > 0) goto L7;
        return g(r3, r02);
    L7:
        if (r3.equals("classes.dex") == false) goto L10;
        return r2;
    L10:
        if (r3.contains("!") == true) goto L20;
        if (r3.contains(":") == true) goto L20;
        if (r3.endsWith(".apk") == false) goto L18;
        return r3;
    L18:
        return r2 + m.a(r4) + r3;
    L20:
        return g(r3, r02);
    }

    public static int k(int r02) {
        return z(r02 * 2) / 8;
    }

    public static int l(int r02, int r1) {
        return z(Integer.bitCount(r02 & (-2)) * r1) / 8;
    }

    public static int m(int r1, int r2, int r3) {
        if (r1 == 1) goto L14;
        if (r1 != 2) goto L7;
        return r2;
    L7:
        if (r1 != 4) goto L11;
        return r2 + r3;
    L11:
        throw e.c("Unexpected flag: " + r1);
    L14:
        throw e.c("HOT methods are not stored in the bitmap");
    }

    public static int[] n(InputStream r4, int r5) {
        int[] r02 = new int[r5];
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r5) goto L5;
        r2 = r2 + e.h(r4);
        r02[r1] = r2;
        r1 = r1 + 1;
        goto L3
    L5:
        return r02;
    }

    public static int o(BitSet r2, int r3, int r4) {
        int r02 = 2;
        if (r2.get(m(2, r3, r4)) == true) goto L7;
        r02 = 0;
    L7:
        if (r2.get(m(4, r3, r4)) == true) goto L9;
        return r02;
    L9:
        return r02 | 4;
    }

    public static byte[] p(InputStream r1, byte[] r2) {
        if (Arrays.equals(r2, e.d(r1, r2.length)) == false) goto L7;
        return e.d(r1, m.f27157b.length);
    L7:
        throw e.c("Invalid magic");
    }

    public static void q(InputStream r5, d r6) {
        int r02 = r5.available() - r6.f27132f;
        int r1 = 0;
    L4:
        if (r5.available() <= r02) goto L9;
        r1 = r1 + e.h(r5);
        r6.f27135i.put(Integer.valueOf(r1), 1);
        int r2 = e.h(r5);
    L6:
        if (r2 <= 0) goto L4;
        B(r5);
        r2 = r2 - 1;
        goto L6
    L9:
        if (r5.available() != r02) goto L12;
        return;
    L12:
        throw e.c("Read too much data during profile line parse");
    }

    public static d[] r(InputStream r1, byte[] r2, byte[] r3, d[] r4) {
        if (Arrays.equals(r2, m.f27160f) == false) goto L11;
        if (Arrays.equals(m.f27156a, r3) == true) goto L9;
        return s(r1, r2, r4);
    L9:
        throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
    L11:
        if (Arrays.equals(r2, m.f27161g) == false) goto L15;
        return u(r1, r3, r4);
    L15:
        throw e.c("Unsupported meta version");
    }

    public static d[] s(InputStream r4, byte[] r5, d[] r6) {
        if (Arrays.equals(r5, m.f27160f) == false) goto L19;
        int r52 = e.j(r4);
        long r02 = e.i(r4);
        byte[] r03 = e.e(r4, (int) e.i(r4), (int) r02);
        if (r4.read() > 0) goto L17;
        ByteArrayInputStream r42 = new ByteArrayInputStream(r03);
        d[] r53 = t(r42, r52, r6);     // Catch: Throwable -> L10
        r42.close();
        return r53;
    L10:
        th = move-exception;
        r42.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L17:
        throw e.c("Content found after the end of file");
    L19:
        throw e.c("Unsupported meta version");
    }

    public static d[] t(InputStream r6, int r7, d[] r8) {
        int r1 = 0;
        if (r6.available() != 0) goto L7;
        return new d[0];
    L7:
        if (r7 != r8.length) goto L19;
        String[] r02 = new String[r7];
        int[] r2 = new int[r7];
        int r3 = 0;
    L9:
        if (r3 >= r7) goto L11;
        int r4 = e.h(r6);
        r2[r3] = e.h(r6);
        r02[r3] = e.f(r6, r4);
        r3 = r3 + 1;
    L11:
        if (r1 >= r7) goto L17;
        d r32 = r8[r1];
        if (r32.f27129b.equals(r02[r1]) == false) goto L16;
        int r42 = r2[r1];
        r32.f27131e = r42;
        r32.f27134h = n(r6, r42);
        r1 = r1 + 1;
        goto L11
    L16:
        throw e.c("Order of dexfiles in metadata did not match baseline");
    L17:
        return r8;
    L19:
        throw e.c("Mismatched number of dex files found in metadata");
    }

    public static d[] u(InputStream r5, byte[] r6, d[] r7) {
        int r02 = e.h(r5);
        long r1 = e.i(r5);
        byte[] r12 = e.e(r5, (int) e.i(r5), (int) r1);
        if (r5.read() > 0) goto L15;
        ByteArrayInputStream r52 = new ByteArrayInputStream(r12);
        d[] r62 = v(r52, r6, r02, r7);     // Catch: Throwable -> L8
        r52.close();
        return r62;
    L8:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L11
    L13:
        throw th;
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    L15:
        throw e.c("Content found after the end of file");
    }

    public static d[] v(InputStream r6, byte[] r7, int r8, d[] r9) {
        int r1 = 0;
        if (r6.available() != 0) goto L7;
        return new d[0];
    L7:
        if (r8 != r9.length) goto L19;
    L8:
        if (r1 >= r8) goto L17;
        e.h(r6);
        String r02 = e.f(r6, e.h(r6));
        long r2 = e.i(r6);
        int r4 = e.h(r6);
        d r5 = i(r9, r02);
        if (r5 == null) goto L16;
        r5.d = r2;
        int[] r03 = n(r6, r4);
        if (Arrays.equals(r7, m.f27159e) == false) goto L14;
        r5.f27131e = r4;
        r5.f27134h = r03;
    L14:
        r1 = r1 + 1;
        goto L8
    L16:
        throw e.c("Missing profile key: " + r02);
    L17:
        return r9;
    L19:
        throw e.c("Mismatched number of dex files found in metadata");
    }

    public static void w(InputStream r6, d r7) {
        BitSet r62 = BitSet.valueOf(e.d(r6, e.a(r7.f27133g * 2)));
        int r1 = 0;
    L3:
        int r2 = r7.f27133g;
        if (r1 >= r2) goto L12;
        int r22 = o(r62, r1, r2);
        if (r22 == 0) goto L11;
        Integer r3 = (Integer) r7.f27135i.get(Integer.valueOf(r1));
        if (r3 != null) goto L10;
        r3 = 0;
    L10:
        r7.f27135i.put(Integer.valueOf(r1), Integer.valueOf(r22 | r3.intValue()));
    L11:
        r1 = r1 + 1;
        goto L3
    }

    public static d[] x(InputStream r4, byte[] r5, String r6) {
        if (Arrays.equals(r5, m.f27157b) == false) goto L19;
        int r52 = e.j(r4);
        long r02 = e.i(r4);
        byte[] r03 = e.e(r4, (int) e.i(r4), (int) r02);
        if (r4.read() > 0) goto L17;
        ByteArrayInputStream r42 = new ByteArrayInputStream(r03);
        d[] r53 = y(r42, r6, r52);     // Catch: Throwable -> L10
        r42.close();
        return r53;
    L10:
        th = move-exception;
        r42.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L17:
        throw e.c("Content found after the end of file");
    L19:
        throw e.c("Unsupported version");
    }

    public static d[] y(InputStream r18, String r19, int r20) {
        int r3 = 0;
        if (r18.available() == 0) goto L5;
        d[] r2 = new d[r20];
        int r4 = 0;
    L7:
        if (r4 >= r20) goto L9;
        int r5 = e.h(r18);
        int r13 = e.h(r18);
        long r6 = e.i(r18);
        r2[r4] = new d(r19, e.f(r18, r5), e.i(r18), 0, r13, (int) r6, (int) e.i(r18), new int[r13], new TreeMap());
        r4 = r4 + 1;
    L9:
        if (r3 >= r20) goto L11;
        d r42 = r2[r3];
        q(r18, r42);
        r42.f27134h = n(r18, r42.f27131e);
        w(r18, r42);
        r3 = r3 + 1;
        goto L9
    L11:
        return r2;
    L5:
        return new d[0];
    }

    public static int z(int r02) {
        return (r02 + 7) & (-8);
    }
}
