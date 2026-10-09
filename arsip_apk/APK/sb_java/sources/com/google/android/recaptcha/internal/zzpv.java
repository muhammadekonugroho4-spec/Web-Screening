package com.google.android.recaptcha.internal;

import com.google.common.base.Ascii;

/* loaded from: classes5.dex */
final class zzpv {
    static {
        if (zzps.zzx() == true) goto L5;
        return;
    L5:
        if (zzps.zzy() == false) goto L9;
        int r02 = zzks.zza;
        return;
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] r5, int r6, int r7) {
        int r72 = r7 - r6;
        byte r02 = r5[r6 - 1];
        if (r72 != 0) goto L5;
        if (r02 > (-12)) goto L29;
        return r02;
    L29:
        return -1;
    L5:
        if (r72 != 1) goto L7;
        byte r52 = r5[r6];
        if (r02 > (-12)) goto L28;
        if (r52 <= (-65)) goto L22;
        return -1;
    L22:
        return (r52 << 8) ^ r02;
    L28:
        return -1;
    L7:
        if (r72 != 2) goto L16;
        byte r73 = r5[r6];
        byte r53 = r5[r6 + 1];
        if (r02 > (-12)) goto L25;
        if (r73 > (-65)) goto L27;
        if (r53 <= (-65)) goto L14;
        return -1;
    L14:
        return (r53 << Ascii.DLE) ^ ((r73 << 8) ^ r02);
    L27:
        return -1;
    L25:
        return -1;
    L16:
        throw new AssertionError();
    }

    public static int zzb(String r8, byte[] r9, int r10, int r11) {
        int r02 = r8.length();
        int r1 = 0;
    L3:
        int r2 = r10 + r11;
        if (r1 >= r02) goto L10;
        int r4 = r1 + r10;
        if (r4 >= r2) goto L10;
        char r5 = r8.charAt(r1);
        if (r5 >= 128) goto L10;
        r9[r4] = (byte) r5;
        r1 = r1 + 1;
    L10:
        if (r1 == r02) goto L12;
        int r102 = r10 + r1;
    L14:
        if (r1 >= r02) goto L51;
        char r112 = r8.charAt(r1);
        if (r112 >= 128) goto L20;
        if (r102 >= r2) goto L20;
        r9[r102] = (byte) r112;
        r102 = r102 + 1;
    L37:
        r1 = r1 + 1;
    L20:
        if (r112 >= 2048) goto L25;
        if (r102 > (r2 - 2)) goto L25;
        r9[r102] = (byte) ((r112 >>> 6) | 960);
        r9[r102 + 1] = (byte) ((r112 & '?') | 128);
        r102 = r102 + 2;
    L25:
        if (r112 < 55296) goto L28;
        if (r112 > 57343) goto L28;
    L31:
        if (r102 > (r2 - 4)) goto L41;
        int r42 = r1 + 1;
        if (r42 == r8.length()) goto L40;
        char r12 = r8.charAt(r42);
        if (Character.isSurrogatePair(r112, r12) == false) goto L38;
        int r7 = r102 + 3;
        int r113 = Character.toCodePoint(r112, r12);
        r9[r102] = (byte) ((r113 >>> 18) | 240);
        r9[r102 + 1] = (byte) (((r113 >>> 12) & 63) | 128);
        r9[r102 + 2] = (byte) (((r113 >>> 6) & 63) | 128);
        r102 = r102 + 4;
        r9[r7] = (byte) ((r113 & 63) | 128);
        r1 = r42;
        goto L37
    L38:
        r1 = r42;
    L40:
        throw new zzpu(r1 - 1, r02);
    L41:
        if (r112 < 55296) goto L50;
        if (r112 > 57343) goto L50;
        int r92 = r1 + 1;
        if (r92 == r8.length()) goto L48;
        if (Character.isSurrogatePair(r112, r8.charAt(r92)) == true) goto L50;
    L48:
        throw new zzpu(r1, r02);
    L50:
        throw new ArrayIndexOutOfBoundsException("Failed writing " + r112 + " at index " + r102);
    L28:
        if (r102 > (r2 - 3)) goto L31;
        r9[r102] = (byte) ((r112 >>> '\f') | 480);
        r9[r102 + 1] = (byte) (((r112 >>> 6) & 63) | 128);
        r9[r102 + 2] = (byte) ((r112 & '?') | 128);
        r102 = r102 + 3;
        goto L37
    L51:
        return r102;
    L12:
        return r10 + r02;
    }

    public static int zzc(String r8) {
        int r02 = r8.length();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L7;
        if (r8.charAt(r2) >= 128) goto L7;
        r2 = r2 + 1;
    L7:
        int r3 = r02;
    L8:
        if (r2 >= r02) goto L28;
        char r4 = r8.charAt(r2);
        if (r4 >= 2048) goto L12;
        r3 = r3 + ((127 - r4) >>> 31);
        r2 = r2 + 1;
        goto L8
    L12:
        int r42 = r8.length();
    L13:
        if (r2 >= r42) goto L27;
        char r6 = r8.charAt(r2);
        if (r6 >= 2048) goto L17;
        r1 = r1 + ((127 - r6) >>> 31);
    L26:
        r2 = r2 + 1;
        goto L13
    L17:
        r1 = r1 + 2;
        if (r6 < 55296) goto L26;
        if (r6 > 57343) goto L26;
        if (Character.codePointAt(r8, r2) < 65536) goto L25;
        r2 = r2 + 1;
        goto L26
    L25:
        throw new zzpu(r2, r42);
    L27:
        r3 = r3 + r1;
    L28:
        if (r3 < r02) goto L31;
        return r3;
    L31:
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (r3 + 4294967296L));
    }

    public static String zzd(byte[] r7, int r8, int r9) throws zznn {
        int r02 = r7.length;
        if ((((r02 - r8) - r9) | (r8 | r9)) < 0) goto L40;
        int r03 = r8 + r9;
        char[] r5 = new char[r9];
        int r1 = 0;
    L5:
        if (r8 >= r03) goto L9;
        byte r2 = r7[r8];
        if (zzpt.zzd(r2) == false) goto L9;
        r8 = r8 + 1;
        r5[r1] = (char) r2;
        r1 = r1 + 1;
    L9:
        int r6 = r1;
    L10:
        if (r8 >= r03) goto L38;
        int r12 = r8 + 1;
        byte r13 = r7[r8];
        if (zzpt.zzd(r13) == true) goto L13;
        if (r13 < (-32)) goto L20;
        if (r13 < (-16)) goto L28;
        if (r12 >= (r03 - 2)) goto L36;
        byte r22 = r7[r12];
        int r4 = r8 + 3;
        byte r3 = r7[r8 + 2];
        r8 = r8 + 4;
        zzpt.zza(r13, r22, r3, r7[r4], r5, r6);
        r6 = r6 + 2;
        goto L10
    L36:
        throw new zznn("Protocol message had invalid UTF-8.");
    L28:
        if (r12 >= (r03 - 1)) goto L31;
        int r32 = r6 + 1;
        int r42 = r8 + 2;
        r8 = r8 + 3;
        zzpt.zzb(r13, r7[r12], r7[r42], r5, r6);
    L22:
        r6 = r32;
        goto L10
    L31:
        throw new zznn("Protocol message had invalid UTF-8.");
    L20:
        if (r12 >= r03) goto L24;
        r32 = r6 + 1;
        r8 = r8 + 2;
        zzpt.zzc(r13, r7[r12], r5, r6);
        goto L22
    L24:
        throw new zznn("Protocol message had invalid UTF-8.");
    L13:
        r5[r6] = (char) r13;
        r6 = r6 + 1;
        r8 = r12;
    L14:
        if (r8 >= r03) goto L10;
        byte r14 = r7[r8];
        if (zzpt.zzd(r14) == false) goto L10;
        r8 = r8 + 1;
        r5[r6] = (char) r14;
        r6 = r6 + 1;
        goto L14
    L38:
        return new String(r5, 0, r6);
    L40:
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(r02), Integer.valueOf(r8), Integer.valueOf(r9)}));
    }

    public static boolean zze(byte[] r6, int r7, int r8) {
    L2:
        if (r7 >= r8) goto L6;
        if (r6[r7] < 0) goto L6;
        r7 = r7 + 1;
    L6:
        if (r7 >= r8) goto L92;
    L8:
        if (r7 >= r8) goto L93;
        int r02 = r7 + 1;
        int r1 = r6[r7];
        if (r1 < 0) goto L12;
        r7 = r02;
        goto L8
    L12:
        if (r1 < (-32)) goto L13;
        if (r1 < (-16)) goto L23;
        if (r02 >= (r8 - 2)) goto L38;
        int r2 = r7 + 2;
        int r03 = r6[r02];
        if (r03 > (-65)) goto L88;
        if ((((r1 << 28) + (r03 + 112)) >> 30) != 0) goto L89;
        int r04 = r7 + 3;
        if (r6[r2] > 65471) goto L90;
        r7 = r7 + 4;
        if (r6[r04] <= 65471) goto L8;
        return false;
    L90:
        return false;
    L89:
        return false;
    L88:
        return false;
    L38:
        r1 = zza(r6, r02, r8);
    L39:
        if (r1 != 0) goto L50;
        return true;
    L50:
        return false;
    L23:
        if (r02 >= (r8 - 1)) goto L24;
        int r4 = r7 + 2;
        char r05 = r6[r02];
        if (r05 > 65471) goto L86;
        if (r1 != (-32)) goto L31;
        if (r05 >= 65440) goto L31;
        return false;
    L31:
        if (r1 != (-19)) goto L33;
        if (r05 < 65440) goto L33;
        return false;
    L33:
        r7 = r7 + 3;
        if (r6[r4] <= 65471) goto L8;
        return false;
    L86:
        return false;
    L24:
        r1 = zza(r6, r02, r8);
        goto L39
    L13:
        if (r02 >= r8) goto L39;
        if (r1 < (-62)) goto L82;
        r7 = r7 + 2;
        if (r6[r02] <= 65471) goto L8;
        return false;
    L82:
        return false;
    L93:
        return true;
    L92:
        return true;
    }
}
