package androidx.datastore.preferences.protobuf;

import com.google.common.base.Ascii;

/* loaded from: classes4.dex */
public abstract class Utf8 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23772a = null;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int r3, int r4) {
            super("Unpaired surrogate at index " + r3 + " of " + r4);
        }
    }

    public static class a {
        public static /* synthetic */ void a(byte r02, byte r1, byte r2, byte r3, char[] r4, int r5) {
            h(r02, r1, r2, r3, r4, r5);
        }

        public static /* synthetic */ boolean b(byte r02) {
            return n(r02);
        }

        public static /* synthetic */ void c(byte r02, char[] r1, int r2) {
            i(r02, r1, r2);
        }

        public static /* synthetic */ boolean d(byte r02) {
            return p(r02);
        }

        public static /* synthetic */ void e(byte r02, byte r1, char[] r2, int r3) {
            k(r02, r1, r2, r3);
        }

        public static /* synthetic */ boolean f(byte r02) {
            return o(r02);
        }

        public static /* synthetic */ void g(byte r02, byte r1, byte r2, char[] r3, int r4) {
            j(r02, r1, r2, r3, r4);
        }

        public static void h(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
            if (m(r3) == true) goto L13;
            if ((((r2 << Ascii.FS) + (r3 + 112)) >> 30) != 0) goto L13;
            if (m(r4) == true) goto L13;
            if (m(r5) == true) goto L13;
            int r22 = ((((r2 & 7) << 18) | (r(r3) << 12)) | (r(r4) << 6)) | r(r5);
            r6[r7] = l(r22);
            r6[r7 + 1] = q(r22);
            return;
        L13:
            throw InvalidProtocolBufferException.c();
        }

        public static void i(byte r02, char[] r1, int r2) {
            r1[r2] = (char) r02;
        }

        public static void j(byte r2, byte r3, byte r4, char[] r5, int r6) {
            if (m(r3) == true) goto L15;
            if (r2 != (-32)) goto L8;
            if (r3 < (-96)) goto L15;
        L8:
            if (r2 != (-19)) goto L11;
            if (r3 >= (-96)) goto L15;
        L11:
            if (m(r4) == true) goto L15;
            r5[r6] = (char) ((((r2 & Ascii.SI) << 12) | (r(r3) << 6)) | r(r4));
            return;
        L15:
            throw InvalidProtocolBufferException.c();
        }

        public static void k(byte r1, byte r2, char[] r3, int r4) {
            if (r1 < (-62)) goto L9;
            if (m(r2) == true) goto L9;
            r3[r4] = (char) (((r1 & Ascii.US) << 6) | r(r2));
            return;
        L9:
            throw InvalidProtocolBufferException.c();
        }

        public static char l(int r1) {
            return (char) ((r1 >>> 10) + 55232);
        }

        public static boolean m(byte r1) {
            if (r1 <= (-65)) goto L6;
            return true;
        L6:
            return false;
        }

        public static boolean n(byte r02) {
            if (r02 < 0) goto L5;
            return true;
        L5:
            return false;
        }

        public static boolean o(byte r1) {
            if (r1 >= (-16)) goto L6;
            return true;
        L6:
            return false;
        }

        public static boolean p(byte r1) {
            if (r1 >= (-32)) goto L6;
            return true;
        L6:
            return false;
        }

        public static char q(int r1) {
            return (char) ((r1 & 1023) + 56320);
        }

        public static int r(byte r02) {
            return r02 & 63;
        }
    }

    public static abstract class b {
        public b() {
        }

        public abstract String a(byte[] r1, int r2, int r3);

        public abstract int b(CharSequence r1, byte[] r2, int r3, int r4);

        public final boolean c(byte[] r2, int r3, int r4) {
            if (d(0, r2, r3, r4) != 0) goto L6;
            return true;
        L6:
            return false;
        }

        public abstract int d(int r1, byte[] r2, int r3, int r4);
    }

    public static final class c extends b {
        public c() {
        }

        public static int e(byte[] r1, int r2, int r3) {
        L2:
            if (r2 >= r3) goto L6;
            if (r1[r2] < 0) goto L6;
            r2 = r2 + 1;
        L6:
            if (r2 < r3) goto L10;
            return 0;
        L10:
            return f(r1, r2, r3);
        }

        public static int f(byte[] r7, int r8, int r9) {
        L2:
            if (r8 >= r9) goto L3;
            int r02 = r8 + 1;
            byte r1 = r7[r8];
            if (r1 < 0) goto L8;
            r8 = r02;
            goto L2
        L8:
            if (r1 < (-32)) goto L9;
            if (r1 < (-16)) goto L19;
            if (r02 >= (r9 - 2)) goto L36;
            int r2 = r8 + 2;
            byte r03 = r7[r02];
            if (r03 > (-65)) goto L45;
            if ((((r1 << Ascii.FS) + (r03 + 112)) >> 30) != 0) goto L45;
            int r04 = r8 + 3;
            if (r7[r2] > (-65)) goto L45;
            r8 = r8 + 4;
            if (r7[r04] <= (-65)) goto L2;
        L45:
            return -1;
        L36:
            return Utf8.c(r7, r02, r9);
        L19:
            if (r02 >= (r9 - 1)) goto L21;
            int r5 = r8 + 2;
            byte r05 = r7[r02];
            if (r05 > (-65)) goto L32;
            if (r1 != (-32)) goto L28;
            if (r05 < (-96)) goto L32;
        L28:
            if (r1 != (-19)) goto L30;
            if (r05 >= (-96)) goto L32;
        L30:
            r8 = r8 + 3;
            if (r7[r5] <= (-65)) goto L2;
        L32:
            return -1;
        L21:
            return Utf8.c(r7, r02, r9);
        L9:
            if (r02 >= r9) goto L10;
            if (r1 < (-62)) goto L15;
            r8 = r8 + 2;
            if (r7[r02] <= (-65)) goto L2;
        L15:
            return -1;
        L10:
            return r1;
        L3:
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public String a(byte[] r8, int r9, int r10) {
            if (((r9 | r10) | ((r8.length - r9) - r10)) < 0) goto L42;
            int r02 = r9 + r10;
            char[] r5 = new char[r10];
            int r1 = 0;
        L5:
            if (r9 >= r02) goto L10;
            byte r2 = r8[r9];
            if (a.b(r2) == false) goto L10;
            r9 = r9 + 1;
            a.c(r2, r5, r1);
            r1 = r1 + 1;
        L10:
            int r6 = r1;
        L11:
            if (r9 >= r02) goto L40;
            int r12 = r9 + 1;
            byte r13 = r8[r9];
            if (a.b(r13) == true) goto L14;
            if (a.d(r13) == true) goto L23;
            if (a.f(r13) == true) goto L30;
            if (r12 >= (r02 - 2)) goto L38;
            byte r22 = r8[r12];
            int r4 = r9 + 3;
            byte r3 = r8[r9 + 2];
            r9 = r9 + 4;
            a.a(r13, r22, r3, r8[r4], r5, r6);
            r6 = r6 + 2;
            goto L11
        L38:
            throw InvalidProtocolBufferException.c();
        L30:
            if (r12 >= (r02 - 1)) goto L33;
            int r32 = r9 + 2;
            r9 = r9 + 3;
            a.g(r13, r8[r12], r8[r32], r5, r6);
            r6 = r6 + 1;
            goto L11
        L33:
            throw InvalidProtocolBufferException.c();
        L23:
            if (r12 >= r02) goto L26;
            r9 = r9 + 2;
            a.e(r13, r8[r12], r5, r6);
            r6 = r6 + 1;
            goto L11
        L26:
            throw InvalidProtocolBufferException.c();
        L14:
            int r92 = r6 + 1;
            a.c(r13, r5, r6);
            int r14 = r12;
        L15:
            if (r14 >= r02) goto L20;
            byte r23 = r8[r14];
            if (a.b(r23) == false) goto L20;
            r14 = r14 + 1;
            a.c(r23, r5, r92);
            r92 = r92 + 1;
        L20:
            r6 = r92;
            r9 = r14;
            goto L11
        L40:
            return new String(r5, 0, r6);
        L42:
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(r8.length), Integer.valueOf(r9), Integer.valueOf(r10)}));
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public int b(CharSequence r8, byte[] r9, int r10, int r11) {
            int r02 = r8.length();
            int r112 = r11 + r10;
            int r1 = 0;
        L4:
            if (r1 >= r02) goto L10;
            int r3 = r1 + r10;
            if (r3 >= r112) goto L10;
            char r4 = r8.charAt(r1);
            if (r4 >= 128) goto L10;
            r9[r3] = (byte) r4;
            r1 = r1 + 1;
        L10:
            if (r1 == r02) goto L12;
            int r102 = r10 + r1;
        L14:
            if (r1 >= r02) goto L51;
            char r32 = r8.charAt(r1);
            if (r32 >= 128) goto L20;
            if (r102 >= r112) goto L20;
            r9[r102] = (byte) r32;
            r102 = r102 + 1;
        L37:
            r1 = r1 + 1;
        L20:
            if (r32 >= 2048) goto L25;
            if (r102 > (r112 - 2)) goto L25;
            int r42 = r102 + 1;
            r9[r102] = (byte) ((r32 >>> 6) | 960);
            r102 = r102 + 2;
            r9[r42] = (byte) ((r32 & '?') | 128);
        L25:
            if (r32 < 55296) goto L28;
            if (57343 < r32) goto L28;
        L31:
            if (r102 > (r112 - 4)) goto L41;
            int r43 = r1 + 1;
            if (r43 == r8.length()) goto L40;
            char r12 = r8.charAt(r43);
            if (Character.isSurrogatePair(r32, r12) == false) goto L38;
            int r13 = Character.toCodePoint(r32, r12);
            r9[r102] = (byte) ((r13 >>> 18) | 240);
            r9[r102 + 1] = (byte) (((r13 >>> 12) & 63) | 128);
            int r33 = r102 + 3;
            r9[r102 + 2] = (byte) (((r13 >>> 6) & 63) | 128);
            r102 = r102 + 4;
            r9[r33] = (byte) ((r13 & 63) | 128);
            r1 = r43;
            goto L37
        L38:
            r1 = r43;
        L40:
            throw new UnpairedSurrogateException(r1 - 1, r02);
        L41:
            if (55296 > r32) goto L50;
            if (r32 > 57343) goto L50;
            int r92 = r1 + 1;
            if (r92 == r8.length()) goto L48;
            if (Character.isSurrogatePair(r32, r8.charAt(r92)) == true) goto L50;
        L48:
            throw new UnpairedSurrogateException(r1, r02);
        L50:
            throw new ArrayIndexOutOfBoundsException("Failed writing " + r32 + " at index " + r102);
        L28:
            if (r102 > (r112 - 3)) goto L31;
            r9[r102] = (byte) ((r32 >>> '\f') | 480);
            int r5 = r102 + 2;
            r9[r102 + 1] = (byte) (((r32 >>> 6) & 63) | 128);
            r102 = r102 + 3;
            r9[r5] = (byte) ((r32 & '?') | 128);
            goto L37
        L51:
            return r102;
        L12:
            return r10 + r02;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public int d(int r7, byte[] r8, int r9, int r10) {
            if (r7 == 0) goto L55;
            if (r9 < r10) goto L5;
            return r7;
        L5:
            byte r02 = (byte) r7;
            if (r02 >= (-32)) goto L15;
            if (r02 < (-62)) goto L13;
            int r72 = r9 + 1;
            if (r8[r9] > (-65)) goto L13;
        L12:
            r9 = r72;
        L13:
            return -1;
        L15:
            if (r02 >= (-16)) goto L33;
            byte r73 = (byte) (~(r7 >> 8));
            if (r73 != 0) goto L23;
            int r74 = r9 + 1;
            byte r92 = r8[r9];
            if (r74 >= r10) goto L21;
            r9 = r74;
            r73 = r92;
            goto L23
        L21:
            return Utf8.a(r02, r92);
        L23:
            if (r73 <= (-65)) goto L25;
        L32:
            return -1;
        L25:
            if (r02 != (-32)) goto L28;
            if (r73 < (-96)) goto L32;
        L28:
            if (r02 != (-19)) goto L30;
            if (r73 >= (-96)) goto L32;
        L30:
            r72 = r9 + 1;
            if (r8[r9] <= (-65)) goto L12;
        L33:
            byte r1 = (byte) (~(r7 >> 8));
            if (r1 != 0) goto L40;
            int r75 = r9 + 1;
            r1 = r8[r9];
            if (r75 >= r10) goto L38;
            byte r93 = 0;
        L41:
            if (r93 != 0) goto L47;
            int r94 = r75 + 1;
            byte r76 = r8[r75];
            if (r94 >= r10) goto L45;
            r93 = r76;
            r75 = r94;
            goto L47
        L45:
            return Utf8.b(r02, r1, r76);
        L47:
            if (r1 <= (-65)) goto L49;
        L53:
            return -1;
        L49:
            if ((((r02 << Ascii.FS) + (r1 + 112)) >> 30) != 0) goto L53;
            if (r93 > (-65)) goto L53;
            r9 = r75 + 1;
            if (r8[r75] <= (-65)) goto L55;
        L38:
            return Utf8.a(r02, r1);
        L40:
            r93 = (byte) (r7 >> 16);
            r75 = r9;
        L55:
            return e(r8, r9, r10);
        }
    }

    public static final class d extends b {
        public d() {
        }

        public static boolean e() {
            if (g0.C() == true) goto L5;
            return false;
        L5:
            if (g0.D() == false) goto L10;
            return true;
        L10:
            return false;
        }

        public static int f(byte[] r10, long r11, int r13) {
            int r02 = g(r10, r11, r13);
            int r132 = r13 - r02;
            long r112 = r11 + r02;
        L3:
            byte r1 = 0;
        L5:
            if (r132 <= 0) goto L10;
            long r4 = r112 + 1;
            r1 = g0.s(r10, r112);
            if (r1 < 0) goto L9;
            r132 = r132 - 1;
            r112 = r4;
            goto L5
        L9:
            r112 = r4;
        L10:
            if (r132 == 0) goto L11;
            int r03 = r132 - 1;
            if (r1 < (-32)) goto L14;
            if (r1 < (-16)) goto L26;
            if (r03 < 3) goto L43;
            r132 = r132 - 4;
            long r2 = 1 + r112;
            byte r04 = g0.s(r10, r112);
            if (r04 > (-65)) goto L52;
            if ((((r1 << Ascii.FS) + (r04 + 112)) >> 30) != 0) goto L52;
            long r8 = 2 + r112;
            if (g0.s(r10, r2) > (-65)) goto L52;
            r112 = r112 + 3;
            if (g0.s(r10, r8) <= (-65)) goto L3;
        L52:
            return -1;
        L43:
            return h(r10, r1, r112, r03);
        L26:
            if (r03 < 2) goto L28;
            r132 = r132 - 3;
            long r22 = 1 + r112;
            byte r05 = g0.s(r10, r112);
            if (r05 > (-65)) goto L39;
            if (r1 != (-32)) goto L35;
            if (r05 < (-96)) goto L39;
        L35:
            if (r1 != (-19)) goto L37;
            if (r05 >= (-96)) goto L39;
        L37:
            r112 = r112 + 2;
            if (g0.s(r10, r22) <= (-65)) goto L3;
        L39:
            return -1;
        L28:
            return h(r10, r1, r112, r03);
        L14:
            if (r03 == 0) goto L15;
            r132 = r132 - 2;
            if (r1 < (-62)) goto L22;
            long r23 = 1 + r112;
            if (g0.s(r10, r112) > (-65)) goto L22;
            r112 = r23;
        L22:
            return -1;
        L15:
            return r1;
        L11:
            return 0;
        }

        public static int g(byte[] r4, long r5, int r7) {
            int r1 = 0;
            if (r7 >= 16) goto L5;
            return 0;
        L5:
            if (r1 >= r7) goto L10;
            long r2 = 1 + r5;
            if (g0.s(r4, r5) < 0) goto L8;
            r1 = r1 + 1;
            r5 = r2;
            goto L5
        L8:
            return r1;
        L10:
            return r7;
        }

        public static int h(byte[] r2, int r3, long r4, int r6) {
            if (r6 == 0) goto L14;
            if (r6 == 1) goto L12;
            if (r6 != 2) goto L10;
            return Utf8.b(r3, g0.s(r2, r4), g0.s(r2, r4 + 1));
        L10:
            throw new AssertionError();
        L12:
            return Utf8.a(r3, g0.s(r2, r4));
        L14:
            return Utf8.d(r3);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public String a(byte[] r11, int r12, int r13) {
            if (((r12 | r13) | ((r11.length - r12) - r13)) < 0) goto L42;
            int r02 = r12 + r13;
            char[] r5 = new char[r13];
            int r1 = 0;
        L5:
            if (r12 >= r02) goto L10;
            byte r2 = g0.s(r11, r12);
            if (a.b(r2) == false) goto L10;
            r12 = r12 + 1;
            a.c(r2, r5, r1);
            r1 = r1 + 1;
        L10:
            int r6 = r1;
        L11:
            if (r12 >= r02) goto L40;
            int r14 = r12 + 1;
            byte r22 = g0.s(r11, r12);
            if (a.b(r22) == true) goto L14;
            if (a.d(r22) == true) goto L23;
            if (a.f(r22) == true) goto L30;
            if (r14 >= (r02 - 2)) goto L38;
            byte r15 = g0.s(r11, r14);
            int r4 = r12 + 3;
            byte r3 = g0.s(r11, r12 + 2);
            r12 = r12 + 4;
            a.a(r22, r15, r3, g0.s(r11, r4), r5, r6);
            r6 = r6 + 2;
            goto L11
        L38:
            throw InvalidProtocolBufferException.c();
        L30:
            if (r14 >= (r02 - 1)) goto L33;
            int r32 = r12 + 2;
            r12 = r12 + 3;
            a.g(r22, g0.s(r11, r14), g0.s(r11, r32), r5, r6);
            r6 = r6 + 1;
            goto L11
        L33:
            throw InvalidProtocolBufferException.c();
        L23:
            if (r14 >= r02) goto L26;
            r12 = r12 + 2;
            a.e(r22, g0.s(r11, r14), r5, r6);
            r6 = r6 + 1;
            goto L11
        L26:
            throw InvalidProtocolBufferException.c();
        L14:
            int r122 = r6 + 1;
            a.c(r22, r5, r6);
        L15:
            if (r14 >= r02) goto L20;
            byte r23 = g0.s(r11, r14);
            if (a.b(r23) == false) goto L20;
            r14 = r14 + 1;
            a.c(r23, r5, r122);
            r122 = r122 + 1;
        L20:
            r6 = r122;
            r12 = r14;
            goto L11
        L40:
            return new String(r5, 0, r6);
        L42:
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(r11.length), Integer.valueOf(r12), Integer.valueOf(r13)}));
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public int b(CharSequence r24, byte[] r25, int r26, int r27) {
            long r4 = r26;
            long r6 = r27 + r4;
            int r8 = r24.length();
            if (r8 > r27) goto L58;
            if ((r25.length - r27) < r26) goto L58;
            int r2 = 0;
        L7:
            long r11 = 1;
            if (r2 >= r8) goto L12;
            char r13 = r24.charAt(r2);
            if (r13 >= 128) goto L12;
            g0.H(r25, r4, (byte) r13);
            r2 = r2 + 1;
            r4 = 1 + r4;
        L12:
            if (r2 == r8) goto L14;
        L15:
            if (r2 >= r8) goto L56;
            char r132 = r24.charAt(r2);
            if (r132 >= 128) goto L22;
            if (r4 >= r6) goto L22;
            g0.H(r25, r4, (byte) r132);
            long r19 = r6;
            long r262 = r11;
            r4 = r4 + r11;
        L41:
            r2 = r2 + 1;
            r11 = r262;
            r6 = r19;
        L22:
            if (r132 < 2048) goto L24;
        L26:
            r262 = r11;
            if (r132 < 55296) goto L32;
            if (57343 < r132) goto L32;
        L30:
            r19 = r6;
            if (r4 > (r19 - 4)) goto L45;
            int r112 = r2 + 1;
            if (r112 == r8) goto L44;
            char r22 = r24.charAt(r112);
            if (Character.isSurrogatePair(r132, r22) == false) goto L42;
            int r23 = Character.toCodePoint(r132, r22);
            g0.H(r25, r4, (byte) ((r23 >>> 18) | 240));
            g0.H(r25, r4 + r262, (byte) (((r23 >>> 12) & 63) | 128));
            long r62 = r4 + 3;
            g0.H(r25, r4 + 2, (byte) (((r23 >>> 6) & 63) | 128));
            r4 = r4 + 4;
            g0.H(r25, r62, (byte) ((r23 & 63) | 128));
            r2 = r112;
            goto L41
        L42:
            r2 = r112;
        L44:
            throw new UnpairedSurrogateException(r2 - 1, r8);
        L45:
            if (55296 > r132) goto L54;
            if (r132 > 57343) goto L54;
            int r1 = r2 + 1;
            if (r1 == r8) goto L52;
            if (Character.isSurrogatePair(r132, r24.charAt(r1)) == true) goto L54;
        L52:
            throw new UnpairedSurrogateException(r2, r8);
        L54:
            throw new ArrayIndexOutOfBoundsException("Failed writing " + r132 + " at index " + r4);
        L32:
            if (r4 > (r6 - 3)) goto L30;
            g0.H(r25, r4, (byte) ((r132 >>> '\f') | 480));
            long r14 = r4 + 2;
            r19 = r6;
            g0.H(r25, r4 + r262, (byte) (((r132 >>> 6) & 63) | 128));
            r4 = r4 + 3;
            g0.H(r25, r14, (byte) ((r132 & '?') | 128));
            goto L41
        L24:
            if (r4 > (r6 - 2)) goto L26;
            r262 = r11;
            long r113 = r4 + r262;
            g0.H(r25, r4, (byte) ((r132 >>> 6) | 960));
            r4 = r4 + 2;
            g0.H(r25, r113, (byte) ((r132 & '?') | 128));
            r19 = r6;
            goto L41
        L56:
            return (int) r4;
        L14:
            return (int) r4;
        L58:
            throw new ArrayIndexOutOfBoundsException("Failed writing " + r24.charAt(r8 - 1) + " at index " + (r26 + r27));
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public int d(int r11, byte[] r12, int r13, int r14) {
            if (((r13 | r14) | (r12.length - r14)) < 0) goto L63;
            long r02 = r13;
            long r132 = r14;
            if (r11 == 0) goto L61;
            if (r02 < r132) goto L9;
            return r11;
        L9:
            byte r2 = (byte) r11;
            if (r2 >= (-32)) goto L19;
            if (r2 < (-62)) goto L17;
            long r6 = 1 + r02;
            if (g0.s(r12, r02) > (-65)) goto L17;
            r02 = r6;
        L17:
            return -1;
        L19:
            if (r2 >= (-16)) goto L39;
            byte r112 = (byte) (~(r11 >> 8));
            if (r112 != 0) goto L27;
            long r8 = r02 + 1;
            r112 = g0.s(r12, r02);
            if (r8 >= r132) goto L25;
            r02 = r8;
            goto L27
        L25:
            return Utf8.a(r2, r112);
        L27:
            if (r112 <= (-65)) goto L29;
        L38:
            return -1;
        L29:
            if (r2 != (-32)) goto L32;
            if (r112 < (-96)) goto L38;
        L32:
            if (r2 != (-19)) goto L34;
            if (r112 >= (-96)) goto L38;
        L34:
            long r22 = r02 + 1;
            if (g0.s(r12, r02) > (-65)) goto L38;
        L37:
            r02 = r22;
            goto L61
        L39:
            byte r3 = (byte) (~(r11 >> 8));
            if (r3 != 0) goto L46;
            long r82 = r02 + 1;
            r3 = g0.s(r12, r02);
            if (r82 >= r132) goto L44;
            byte r113 = 0;
            r02 = r82;
        L47:
            if (r113 != 0) goto L53;
            long r83 = r02 + 1;
            r113 = g0.s(r12, r02);
            if (r83 >= r132) goto L51;
            r02 = r83;
            goto L53
        L51:
            return Utf8.b(r2, r3, r113);
        L53:
            if (r3 <= (-65)) goto L55;
        L59:
            return -1;
        L55:
            if ((((r2 << Ascii.FS) + (r3 + 112)) >> 30) != 0) goto L59;
            if (r113 > (-65)) goto L59;
            r22 = r02 + 1;
            if (g0.s(r12, r02) <= (-65)) goto L37;
        L44:
            return Utf8.a(r2, r3);
        L46:
            r113 = (byte) (r11 >> 16);
        L61:
            return f(r12, r02, (int) (r132 - r02));
        L63:
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(r12.length), Integer.valueOf(r13), Integer.valueOf(r14)}));
        }
    }

    static {
        if (d.e() == true) goto L5;
    L7:
        b r02 = new c();
    L8:
        f23772a = r02;
        return;
    L5:
        if (AbstractC3914d.c() == true) goto L7;
        r02 = new d();
        goto L8
    }

    public static /* synthetic */ int a(int r02, int r1) {
        return j(r02, r1);
    }

    public static /* synthetic */ int b(int r02, int r1, int r2) {
        return k(r02, r1, r2);
    }

    public static /* synthetic */ int c(byte[] r02, int r1, int r2) {
        return l(r02, r1, r2);
    }

    public static /* synthetic */ int d(int r02) {
        return i(r02);
    }

    public static String e(byte[] r1, int r2, int r3) {
        return f23772a.a(r1, r2, r3);
    }

    public static int f(CharSequence r1, byte[] r2, int r3, int r4) {
        return f23772a.b(r1, r2, r3, r4);
    }

    public static int g(CharSequence r5) {
        int r02 = r5.length();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L7;
        if (r5.charAt(r1) >= 128) goto L7;
        r1 = r1 + 1;
    L7:
        int r2 = r02;
    L8:
        if (r1 >= r02) goto L13;
        char r3 = r5.charAt(r1);
        if (r3 >= 2048) goto L12;
        r2 = r2 + ((127 - r3) >>> 31);
        r1 = r1 + 1;
        goto L8
    L12:
        r2 = r2 + h(r5, r1);
    L13:
        if (r2 < r02) goto L16;
        return r2;
    L16:
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (r2 + 4294967296L));
    }

    public static int h(CharSequence r4, int r5) {
        int r02 = r4.length();
        int r1 = 0;
    L3:
        if (r5 >= r02) goto L17;
        char r2 = r4.charAt(r5);
        if (r2 >= 2048) goto L7;
        r1 = r1 + ((127 - r2) >>> 31);
    L16:
        r5 = r5 + 1;
        goto L3
    L7:
        r1 = r1 + 2;
        if (55296 > r2) goto L16;
        if (r2 > 57343) goto L16;
        if (Character.codePointAt(r4, r5) < 65536) goto L15;
        r5 = r5 + 1;
        goto L16
    L15:
        throw new UnpairedSurrogateException(r5, r02);
    L17:
        return r1;
    }

    public static int i(int r1) {
        if (r1 <= (-12)) goto L6;
        return -1;
    L6:
        return r1;
    }

    public static int j(int r1, int r2) {
        if (r1 <= (-12)) goto L5;
        return -1;
    L5:
        if (r2 <= (-65)) goto L8;
        return -1;
    L8:
        return r1 ^ (r2 << 8);
    }

    public static int k(int r1, int r2, int r3) {
        if (r1 <= (-12)) goto L5;
        return -1;
    L5:
        if (r2 > (-65)) goto L12;
        if (r3 <= (-65)) goto L9;
        return -1;
    L9:
        return (r1 ^ (r2 << 8)) ^ (r3 << 16);
    L12:
        return -1;
    }

    public static int l(byte[] r3, int r4, int r5) {
        byte r02 = r3[r4 - 1];
        int r52 = r5 - r4;
        if (r52 == 0) goto L15;
        if (r52 == 1) goto L13;
        if (r52 != 2) goto L11;
        return k(r02, r3[r4], r3[r4 + 1]);
    L11:
        throw new AssertionError();
    L13:
        return j(r02, r3[r4]);
    L15:
        return i(r02);
    }

    public static boolean m(byte[] r3) {
        return f23772a.c(r3, 0, r3.length);
    }

    public static boolean n(byte[] r1, int r2, int r3) {
        return f23772a.c(r1, r2, r3);
    }
}
