package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.common.base.Ascii;

/* loaded from: classes3.dex */
public abstract class t {
    public static int a(int r1) {
        if (r1 <= (-12)) goto L6;
        return -1;
    L6:
        return r1;
    }

    public static int b(int r1, int r2) {
        if (r1 <= (-12)) goto L5;
        return -1;
    L5:
        if (r2 <= (-65)) goto L8;
        return -1;
    L8:
        return r1 ^ (r2 << 8);
    }

    public static int c(int r1, int r2, int r3) {
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

    public static int d(byte[] r3, int r4, int r5) {
        byte r02 = r3[r4 - 1];
        int r52 = r5 - r4;
        if (r52 == 0) goto L15;
        if (r52 == 1) goto L13;
        if (r52 != 2) goto L11;
        return c(r02, r3[r4], r3[r4 + 1]);
    L11:
        throw new AssertionError();
    L13:
        return b(r02, r3[r4]);
    L15:
        return a(r02);
    }

    public static boolean e(byte[] r2) {
        return f(r2, 0, r2.length);
    }

    public static boolean f(byte[] r02, int r1, int r2) {
        if (h(r02, r1, r2) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static int g(int r6, byte[] r7, int r8, int r9) {
        if (r6 == 0) goto L55;
        if (r8 < r9) goto L5;
        return r6;
    L5:
        byte r02 = (byte) r6;
        if (r02 >= (-32)) goto L15;
        if (r02 < (-62)) goto L13;
        int r62 = r8 + 1;
        if (r7[r8] > (-65)) goto L13;
    L12:
        r8 = r62;
    L13:
        return -1;
    L15:
        if (r02 >= (-16)) goto L33;
        byte r63 = (byte) (~(r6 >> 8));
        if (r63 != 0) goto L23;
        int r64 = r8 + 1;
        byte r82 = r7[r8];
        if (r64 >= r9) goto L21;
        r8 = r64;
        r63 = r82;
        goto L23
    L21:
        return b(r02, r82);
    L23:
        if (r63 <= (-65)) goto L25;
    L32:
        return -1;
    L25:
        if (r02 != (-32)) goto L28;
        if (r63 < (-96)) goto L32;
    L28:
        if (r02 != (-19)) goto L30;
        if (r63 >= (-96)) goto L32;
    L30:
        r62 = r8 + 1;
        if (r7[r8] <= (-65)) goto L12;
    L33:
        byte r1 = (byte) (~(r6 >> 8));
        if (r1 != 0) goto L40;
        int r65 = r8 + 1;
        r1 = r7[r8];
        if (r65 >= r9) goto L38;
        byte r83 = 0;
    L41:
        if (r83 != 0) goto L47;
        int r84 = r65 + 1;
        byte r66 = r7[r65];
        if (r84 >= r9) goto L45;
        r83 = r66;
        r65 = r84;
        goto L47
    L45:
        return c(r02, r1, r66);
    L47:
        if (r1 <= (-65)) goto L49;
    L53:
        return -1;
    L49:
        if ((((r02 << Ascii.FS) + (r1 + 112)) >> 30) != 0) goto L53;
        if (r83 > (-65)) goto L53;
        r8 = r65 + 1;
        if (r7[r65] <= (-65)) goto L55;
    L38:
        return b(r02, r1);
    L40:
        r83 = (byte) (r6 >> 16);
        r65 = r8;
    L55:
        return h(r7, r8, r9);
    }

    public static int h(byte[] r1, int r2, int r3) {
    L2:
        if (r2 >= r3) goto L6;
        if (r1[r2] < 0) goto L6;
        r2 = r2 + 1;
    L6:
        if (r2 < r3) goto L10;
        return 0;
    L10:
        return i(r1, r2, r3);
    }

    public static int i(byte[] r7, int r8, int r9) {
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
        return d(r7, r02, r9);
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
        return d(r7, r02, r9);
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
}
