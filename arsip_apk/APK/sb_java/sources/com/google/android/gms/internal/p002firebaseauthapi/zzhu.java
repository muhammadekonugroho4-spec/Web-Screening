package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzhu {
    private static long zza(byte[] r2, int r3, int r4) {
        return (zza(r2, r3) >> r4) & 67108863;
    }

    private static long zza(byte[] r2, int r3) {
        int r02 = ((r2[r3] & UnsignedBytes.MAX_VALUE) | ((r2[r3 + 1] & UnsignedBytes.MAX_VALUE) << 8)) | ((r2[r3 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        return (((r2[r3 + 3] & UnsignedBytes.MAX_VALUE) << 24) | r02) & 4294967295L;
    }

    private static void zza(byte[] r4, long r5, int r7) {
        int r02 = 0;
    L4:
        if (r02 >= 4) goto L6;
        r4[r7 + r02] = (byte) (255 & r5);
        r02 = r02 + 1;
        r5 = r5 >> 8;
        goto L4
    }

    public static byte[] zza(byte[] r57, byte[] r58) {
        if (r57.length != 32) goto L14;
        long r4 = zza(r57, 0, 0) & 67108863;
        long r10 = zza(r57, 3, 2) & 67108611;
        long r14 = zza(r57, 6, 4) & 67092735;
        long r17 = zza(r57, 9, 6) & 66076671;
        long r21 = zza(r57, 12, 8) & 1048575;
        long r25 = r10 * 5;
        long r27 = r14 * 5;
        long r29 = r17 * 5;
        long r31 = r21 * 5;
        int r6 = 17;
        byte[] r7 = new byte[17];
        long r35 = 0;
        int r3 = 0;
        long r37 = 0;
        long r39 = 0;
        long r41 = 0;
        long r43 = 0;
    L6:
        if (r3 >= r58.length) goto L11;
        int r12 = Math.min(16, r58.length - r3);
        System.arraycopy(r58, r3, r7, 0, r12);
        r7[r12] = 1;
        if (r12 == 16) goto L10;
        Arrays.fill(r7, r12 + 1, r6, (byte) 0);
    L10:
        long r432 = r43 + zza(r7, 0, 0);
        long r352 = r35 + zza(r7, 3, 2);
        long r372 = r37 + zza(r7, 6, 4);
        long r392 = r39 + zza(r7, 9, 6);
        long r412 = r41 + (zza(r7, 12, 8) | (r7[16] << Ascii.CAN));
        long r122 = ((((r432 * r4) + (r352 * r31)) + (r372 * r29)) + (r392 * r27)) + (r412 * r25);
        long r49 = ((((r432 * r10) + (r352 * r4)) + (r372 * r31)) + (r392 * r29)) + (r412 * r27);
        long r51 = ((((r432 * r14) + (r352 * r10)) + (r372 * r4)) + (r392 * r31)) + (r412 * r29);
        long r53 = ((((r432 * r17) + (r352 * r14)) + (r372 * r10)) + (r392 * r4)) + (r412 * r31);
        long r433 = ((((r432 * r21) + (r352 * r17)) + (r372 * r14)) + (r392 * r10)) + (r412 * r4);
        long r492 = r49 + (r122 >> 26);
        long r512 = r51 + (r492 >> 26);
        long r532 = r53 + (r512 >> 26);
        long r434 = r433 + (r532 >> 26);
        long r123 = (r122 & 67108863) + ((r434 >> 26) * 5);
        r35 = (r492 & 67108863) + (r123 >> 26);
        r3 = r3 + 16;
        r37 = r512 & 67108863;
        r39 = r532 & 67108863;
        r41 = r434 & 67108863;
        r6 = 17;
        r43 = r123 & 67108863;
        goto L6
    L11:
        long r373 = r37 + (r35 >> 26);
        long r72 = r373 & 67108863;
        long r393 = r39 + (r373 >> 26);
        long r9 = r393 & 67108863;
        long r413 = r41 + (r393 >> 26);
        long r11 = r413 & 67108863;
        long r435 = r43 + ((r413 >> 26) * 5);
        long r142 = r435 & 67108863;
        long r5 = (r35 & 67108863) + (r435 >> 26);
        long r23 = r142 + 5;
        long r172 = r23 & 67108863;
        long r32 = (r23 >> 26) + r5;
        long r212 = r72 + (r32 >> 26);
        long r232 = r9 + (r212 >> 26);
        long r252 = (r11 + (r232 >> 26)) - 67108864;
        long r2 = r252 >> 63;
        long r1 = ~r2;
        long r143 = (r142 & r2) | (r172 & r1);
        long r33 = (r5 & r2) | ((r32 & 67108863) & r1);
        long r52 = (r72 & r2) | ((r212 & 67108863) & r1);
        long r73 = (r9 & r2) | ((r232 & 67108863) & r1);
        long r92 = ((r33 << 26) | r143) & 4294967295L;
        long r34 = ((r33 >> 6) | (r52 << 20)) & 4294967295L;
        long r54 = ((r52 >> 12) | (r73 << 14)) & 4294967295L;
        long r13 = ((((r252 & r1) | (r11 & r2)) << 8) | (r73 >> 18)) & 4294967295L;
        long r93 = r92 + zza(r57, 16);
        long r74 = r93 & 4294967295L;
        long r36 = (r34 + zza(r57, 20)) + (r93 >> 32);
        long r94 = r36 & 4294967295L;
        long r55 = (r54 + zza(r57, 24)) + (r36 >> 32);
        long r02 = ((r13 + zza(r57, 28)) + (r55 >> 32)) & 4294967295L;
        byte[] r22 = new byte[16];
        zza(r22, r74, 0);
        zza(r22, r94, 4);
        zza(r22, r55 & 4294967295L, 8);
        zza(r22, r02, 12);
        return r22;
    L14:
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
