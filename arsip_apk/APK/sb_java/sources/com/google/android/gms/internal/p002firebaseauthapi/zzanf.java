package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.base.Ascii;

/* loaded from: classes5.dex */
final class zzanf extends zzanc {
    public zzanf() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final int zza(String r8, byte[] r9, int r10, int r11) {
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
        throw new zzane(r1 - 1, r02);
    L41:
        if (55296 > r32) goto L50;
        if (r32 > 57343) goto L50;
        int r92 = r1 + 1;
        if (r92 == r8.length()) goto L48;
        if (Character.isSurrogatePair(r32, r8.charAt(r92)) == true) goto L50;
    L48:
        throw new zzane(r1, r02);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final int zza(int r8, byte[] r9, int r10, int r11) {
    L2:
        if (r10 >= r11) goto L7;
        if (r9[r10] < 0) goto L7;
        r10 = r10 + 1;
    L7:
        if (r10 < r11) goto L9;
        return 0;
    L9:
        if (r10 >= r11) goto L10;
        int r02 = r10 + 1;
        byte r1 = r9[r10];
        if (r1 < 0) goto L14;
        r10 = r02;
        goto L9
    L14:
        if (r1 < (-32)) goto L15;
        if (r1 < (-16)) goto L25;
        if (r02 >= (r11 - 2)) goto L42;
        int r2 = r10 + 2;
        byte r03 = r9[r02];
        if (r03 > (-65)) goto L51;
        if ((((r1 << Ascii.FS) + (r03 + 112)) >> 30) != 0) goto L51;
        int r04 = r10 + 3;
        if (r9[r2] > (-65)) goto L51;
        r10 = r10 + 4;
        if (r9[r04] <= (-65)) goto L9;
    L51:
        return -1;
    L42:
        return zzanb.zza(r9, r02, r11);
    L25:
        if (r02 >= (r11 - 1)) goto L27;
        int r5 = r10 + 2;
        byte r05 = r9[r02];
        if (r05 > (-65)) goto L38;
        if (r1 != (-32)) goto L34;
        if (r05 < (-96)) goto L38;
    L34:
        if (r1 != (-19)) goto L36;
        if (r05 >= (-96)) goto L38;
    L36:
        r10 = r10 + 3;
        if (r9[r5] <= (-65)) goto L9;
    L38:
        return -1;
    L27:
        return zzanb.zza(r9, r02, r11);
    L15:
        if (r02 >= r11) goto L16;
        if (r1 < (-62)) goto L21;
        r10 = r10 + 2;
        if (r9[r02] <= (-65)) goto L9;
    L21:
        return -1;
    L16:
        return r1;
    L10:
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc
    public final String zza(byte[] r8, int r9, int r10) throws zzakm {
        if (((r9 | r10) | ((r8.length - r9) - r10)) < 0) goto L40;
        int r02 = r9 + r10;
        char[] r5 = new char[r10];
        int r1 = 0;
    L5:
        if (r9 >= r02) goto L9;
        byte r2 = r8[r9];
        if (r2 < 0) goto L9;
        r9 = r9 + 1;
        zzand.zza(r2, r5, r1);
        r1 = r1 + 1;
    L9:
        int r6 = r1;
    L10:
        if (r9 >= r02) goto L38;
        int r12 = r9 + 1;
        byte r13 = r8[r9];
        if (r13 >= 0) goto L13;
        if (r13 < (-32)) goto L21;
        if (r13 < (-16)) goto L28;
        if (r12 >= (r02 - 2)) goto L36;
        byte r22 = r8[r12];
        int r4 = r9 + 3;
        byte r3 = r8[r9 + 2];
        r9 = r9 + 4;
        zzand.zza(r13, r22, r3, r8[r4], r5, r6);
        r6 = r6 + 2;
        goto L10
    L36:
        throw zzakm.zzd();
    L28:
        if (r12 >= (r02 - 1)) goto L31;
        int r32 = r9 + 2;
        r9 = r9 + 3;
        zzand.zza(r13, r8[r12], r8[r32], r5, r6);
        r6 = r6 + 1;
        goto L10
    L31:
        throw zzakm.zzd();
    L21:
        if (r12 >= r02) goto L24;
        r9 = r9 + 2;
        zzand.zza(r13, r8[r12], r5, r6);
        r6 = r6 + 1;
        goto L10
    L24:
        throw zzakm.zzd();
    L13:
        int r92 = r6 + 1;
        zzand.zza(r13, r5, r6);
        int r14 = r12;
    L14:
        if (r14 >= r02) goto L18;
        byte r23 = r8[r14];
        if (r23 < 0) goto L18;
        r14 = r14 + 1;
        zzand.zza(r23, r5, r92);
        r92 = r92 + 1;
    L18:
        r6 = r92;
        r9 = r14;
        goto L10
    L38:
        return new String(r5, 0, r6);
    L40:
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(r8.length), Integer.valueOf(r9), Integer.valueOf(r10)}));
    }
}
