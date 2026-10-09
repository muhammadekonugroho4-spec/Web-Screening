package androidx.glance.appwidget.protobuf;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class Utf8 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25032a = null;

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
            throw InvalidProtocolBufferException.d();
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
            throw InvalidProtocolBufferException.d();
        }

        public static void k(byte r1, byte r2, char[] r3, int r4) {
            if (r1 < (-62)) goto L9;
            if (m(r2) == true) goto L9;
            r3[r4] = (char) (((r1 & Ascii.US) << 6) | r(r2));
            return;
        L9:
            throw InvalidProtocolBufferException.d();
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

        public abstract int b(String r1, byte[] r2, int r3, int r4);
    }

    public static final class c extends b {
        public c() {
        }

        @Override // androidx.glance.appwidget.protobuf.Utf8.b
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
            throw InvalidProtocolBufferException.d();
        L30:
            if (r12 >= (r02 - 1)) goto L33;
            int r32 = r9 + 2;
            r9 = r9 + 3;
            a.g(r13, r8[r12], r8[r32], r5, r6);
            r6 = r6 + 1;
            goto L11
        L33:
            throw InvalidProtocolBufferException.d();
        L23:
            if (r12 >= r02) goto L26;
            r9 = r9 + 2;
            a.e(r13, r8[r12], r5, r6);
            r6 = r6 + 1;
            goto L11
        L26:
            throw InvalidProtocolBufferException.d();
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

        @Override // androidx.glance.appwidget.protobuf.Utf8.b
        public int b(String r8, byte[] r9, int r10, int r11) {
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
    }

    public static final class d extends b {
        public d() {
        }

        public static boolean c() {
            if (e0.B() == true) goto L5;
            return false;
        L5:
            if (e0.C() == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // androidx.glance.appwidget.protobuf.Utf8.b
        public String a(byte[] r4, int r5, int r6) {
            Charset r1 = AbstractC3997u.f25114b;
            String r02 = new String(r4, r5, r6, r1);
            if (r02.indexOf(65533) >= 0) goto L6;
        L7:
            return r02;
        L6:
            if (Arrays.equals(r02.getBytes(r1), Arrays.copyOfRange(r4, r5, r6 + r5)) == true) goto L7;
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.glance.appwidget.protobuf.Utf8.b
        public int b(String r24, byte[] r25, int r26, int r27) {
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
            e0.H(r25, r4, (byte) r13);
            r2 = r2 + 1;
            r4 = 1 + r4;
        L12:
            if (r2 == r8) goto L14;
        L15:
            if (r2 >= r8) goto L56;
            char r132 = r24.charAt(r2);
            if (r132 >= 128) goto L22;
            if (r4 >= r6) goto L22;
            e0.H(r25, r4, (byte) r132);
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
            e0.H(r25, r4, (byte) ((r23 >>> 18) | 240));
            e0.H(r25, r4 + r262, (byte) (((r23 >>> 12) & 63) | 128));
            long r62 = r4 + 3;
            e0.H(r25, r4 + 2, (byte) (((r23 >>> 6) & 63) | 128));
            r4 = r4 + 4;
            e0.H(r25, r62, (byte) ((r23 & 63) | 128));
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
            e0.H(r25, r4, (byte) ((r132 >>> '\f') | 480));
            long r14 = r4 + 2;
            r19 = r6;
            e0.H(r25, r4 + r262, (byte) (((r132 >>> 6) & 63) | 128));
            r4 = r4 + 3;
            e0.H(r25, r14, (byte) ((r132 & '?') | 128));
            goto L41
        L24:
            if (r4 > (r6 - 2)) goto L26;
            r262 = r11;
            long r113 = r4 + r262;
            e0.H(r25, r4, (byte) ((r132 >>> 6) | 960));
            r4 = r4 + 2;
            e0.H(r25, r113, (byte) ((r132 & '?') | 128));
            r19 = r6;
            goto L41
        L56:
            return (int) r4;
        L14:
            return (int) r4;
        L58:
            throw new ArrayIndexOutOfBoundsException("Failed writing " + r24.charAt(r8 - 1) + " at index " + (r26 + r27));
        }
    }

    static {
        if (d.c() == true) goto L5;
    L7:
        b r02 = new c();
    L8:
        f25032a = r02;
        return;
    L5:
        if (AbstractC3981d.c() == true) goto L7;
        r02 = new d();
        goto L8
    }

    public static String a(byte[] r1, int r2, int r3) {
        return f25032a.a(r1, r2, r3);
    }

    public static int b(String r1, byte[] r2, int r3, int r4) {
        return f25032a.b(r1, r2, r3, r4);
    }

    public static int c(String r5) {
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
        r2 = r2 + d(r5, r1);
    L13:
        if (r2 < r02) goto L16;
        return r2;
    L16:
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (r2 + 4294967296L));
    }

    public static int d(String r4, int r5) {
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
}
