package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzmw {
    private static final int[] zza = null;
    private static final int[] zzb = null;
    private static final int[] zzc = null;
    private static final int[] zzd = null;

    static {
        zza = new int[]{0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
        zzb = new int[]{0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
        zzc = new int[]{67108863, 33554431};
        zzd = new int[]{26, 25};
    }

    public static void zza(long[] r11, long[] r12) {
        long[] r1 = new long[10];
        long[] r2 = new long[10];
        long[] r3 = new long[10];
        long[] r4 = new long[10];
        long[] r5 = new long[10];
        long[] r6 = new long[10];
        long[] r7 = new long[10];
        long[] r8 = new long[10];
        long[] r9 = new long[10];
        long[] r10 = new long[10];
        zzb(r1, r12);
        zzb(r10, r1);
        zzb(r9, r10);
        zza(r2, r9, r12);
        zza(r3, r2, r1);
        zzb(r9, r3);
        zza(r4, r9, r2);
        zzb(r9, r4);
        zzb(r10, r9);
        zzb(r9, r10);
        zzb(r10, r9);
        zzb(r9, r10);
        zza(r5, r9, r4);
        zzb(r9, r5);
        zzb(r10, r9);
        int r122 = 2;
        int r13 = 2;
    L3:
        if (r13 >= 10) goto L5;
        zzb(r9, r10);
        zzb(r10, r9);
        r13 = r13 + 2;
        goto L3
    L5:
        zza(r6, r10, r5);
        zzb(r9, r6);
        zzb(r10, r9);
        int r14 = 2;
    L7:
        if (r14 >= 20) goto L9;
        zzb(r9, r10);
        zzb(r10, r9);
        r14 = r14 + 2;
        goto L7
    L9:
        zza(r9, r10, r6);
        zzb(r10, r9);
        zzb(r9, r10);
        int r15 = 2;
    L10:
        if (r15 >= 10) goto L12;
        zzb(r10, r9);
        zzb(r9, r10);
        r15 = r15 + 2;
        goto L10
    L12:
        zza(r7, r9, r5);
        zzb(r9, r7);
        zzb(r10, r9);
        int r02 = 2;
    L14:
        if (r02 >= 50) goto L16;
        zzb(r9, r10);
        zzb(r10, r9);
        r02 = r02 + 2;
        goto L14
    L16:
        zza(r8, r10, r7);
        zzb(r10, r8);
        zzb(r9, r10);
        int r03 = 2;
    L18:
        if (r03 >= 100) goto L20;
        zzb(r10, r9);
        zzb(r9, r10);
        r03 = r03 + 2;
        goto L18
    L20:
        zza(r10, r9, r8);
        zzb(r9, r10);
        zzb(r10, r9);
    L21:
        if (r122 >= 50) goto L23;
        zzb(r9, r10);
        zzb(r10, r9);
        r122 = r122 + 2;
        goto L21
    L23:
        zza(r9, r10, r7);
        zzb(r10, r9);
        zzb(r9, r10);
        zzb(r10, r9);
        zzb(r9, r10);
        zzb(r10, r9);
        zza(r11, r10, r3);
    }

    public static void zzb(long[] r44, long[] r45, long[] r46) {
        r44[0] = r45[0] * r46[0];
        long r1 = r45[0];
        long r4 = r46[1] * r1;
        long r6 = r45[1];
        long r8 = r46[0];
        r44[1] = r4 + (r6 * r8);
        long r42 = r45[1];
        long r12 = r46[1];
        r44[2] = (((r42 * 2) * r12) + (r46[2] * r1)) + (r45[2] * r8);
        long r10 = r46[2];
        long r16 = r45[2];
        r44[3] = (((r42 * r10) + (r16 * r12)) + (r46[3] * r1)) + (r45[3] * r8);
        long r18 = r46[3];
        long r22 = r45[3];
        r44[4] = (((r16 * r10) + (((r42 * r18) + (r22 * r12)) * 2)) + (r46[4] * r1)) + (r45[4] * r8);
        long r14 = (r16 * r18) + (r22 * r10);
        long r20 = r46[4];
        long r142 = r14 + (r42 * r20);
        long r24 = r45[4];
        r44[5] = ((r142 + (r24 * r12)) + (r46[5] * r1)) + (r45[5] * r8);
        long r26 = r46[5];
        long r143 = (r22 * r18) + (r42 * r26);
        long r28 = r45[5];
        r44[6] = (((((r143 + (r28 * r12)) * 2) + (r16 * r20)) + (r24 * r10)) + (r46[6] * r1)) + (r45[6] * r8);
        long r144 = (((r22 * r20) + (r24 * r18)) + (r16 * r26)) + (r28 * r10);
        long r30 = r46[6];
        long r145 = r144 + (r42 * r30);
        long r32 = r45[6];
        r44[7] = ((r145 + (r32 * r12)) + (r46[7] * r1)) + (r45[7] * r8);
        long r34 = (r22 * r26) + (r28 * r18);
        long r36 = r46[7];
        long r342 = r34 + (r42 * r36);
        long r38 = r45[7];
        r44[8] = (((((r24 * r20) + ((r342 + (r38 * r12)) * 2)) + (r16 * r30)) + (r32 * r10)) + (r46[8] * r1)) + (r45[8] * r8);
        long r146 = (((((r24 * r26) + (r28 * r20)) + (r22 * r30)) + (r32 * r18)) + (r16 * r36)) + (r38 * r10);
        long r343 = r46[8];
        long r147 = r146 + (r42 * r343);
        long r40 = r45[8];
        r44[9] = ((r147 + (r40 * r12)) + (r1 * r46[9])) + (r45[9] * r8);
        long r13 = ((r28 * r26) + (r22 * r36)) + (r38 * r18);
        long r82 = r46[9];
        long r3 = r45[9];
        r44[10] = ((((((r13 + (r42 * r82)) + (r12 * r3)) * 2) + (r24 * r30)) + (r32 * r20)) + (r16 * r343)) + (r40 * r10);
        r44[11] = (((((((r28 * r30) + (r32 * r26)) + (r24 * r36)) + (r38 * r20)) + (r22 * r343)) + (r40 * r18)) + (r16 * r82)) + (r10 * r3);
        r44[12] = (((r32 * r30) + (((((r28 * r36) + (r38 * r26)) + (r22 * r82)) + (r18 * r3)) * 2)) + (r24 * r343)) + (r40 * r20);
        r44[13] = (((((r32 * r36) + (r38 * r30)) + (r28 * r343)) + (r40 * r26)) + (r24 * r82)) + (r20 * r3);
        r44[14] = (((((r38 * r36) + (r28 * r82)) + (r26 * r3)) * 2) + (r32 * r343)) + (r40 * r30);
        r44[15] = (((r38 * r343) + (r40 * r36)) + (r32 * r82)) + (r30 * r3);
        r44[16] = (r40 * r343) + (((r38 * r82) + (r36 * r3)) * 2);
        r44[17] = (r40 * r82) + (r343 * r3);
        r44[18] = (r3 * 2) * r82;
    }

    public static void zzc(long[] r02, long[] r1) {
        zzc(r02, r1, r02);
    }

    public static void zzd(long[] r02, long[] r1) {
        zzd(r02, r02, r1);
    }

    private static void zze(long[] r3, long[] r4) {
        if (r3.length == 19) goto L6;
        long[] r02 = new long[19];
        System.arraycopy(r3, 0, r02, 0, r3.length);
        r3 = r02;
    L6:
        zzb(r3);
        zza(r3);
        System.arraycopy(r3, 0, r4, 0, 10);
    }

    public static void zzc(long[] r5, long[] r6, long[] r7) {
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L6;
        r5[r02] = r6[r02] - r7[r02];
        r02 = r02 + 1;
        goto L4
    }

    public static void zzd(long[] r5, long[] r6, long[] r7) {
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L6;
        r5[r02] = r6[r02] + r7[r02];
        r02 = r02 + 1;
        goto L4
    }

    public static byte[] zzc(long[] r17) {
        long[] r1 = Arrays.copyOf(r17, 10);
        int r2 = 0;
        int r3 = 0;
    L3:
        int r9 = 2;
        if (r3 >= 2) goto L9;
        int r92 = 0;
    L6:
        if (r92 >= 9) goto L8;
        long r10 = r1[r92];
        int r12 = -((int) (((r10 >> 31) & r10) >> zzd[r92 & 1]));
        r1[r92] = r10 + (r12 << r14);
        r92 = r92 + 1;
        r1[r92] = r1[r92] - r12;
        goto L6
    L8:
        long r93 = r1[9];
        r1[9] = r93 + (r6 << 25);
        r1[0] = r1[0] - ((-((int) (((r93 >> 31) & r93) >> 25))) * 19);
        r3 = r3 + 1;
        goto L3
    L9:
        long r102 = r1[0];
        r1[0] = r102 + (r3 << 26);
        r1[1] = r1[1] - (-((int) (((r102 >> 31) & r102) >> 26)));
        int r32 = 0;
    L10:
        if (r32 >= 2) goto L15;
        int r11 = r2;
    L12:
        if (r11 >= 9) goto L14;
        long r122 = r1[r11];
        int r172 = r2;
        int r22 = (int) (r122 >> zzd[r11 & 1]);
        r1[r11] = r122 & zzc[r15];
        r11 = r11 + 1;
        r1[r11] = r1[r11] + r22;
        r2 = r172;
        r32 = r32;
        goto L12
    L14:
        r32 = r32 + 1;
        goto L10
    L15:
        int r173 = r2;
        long r23 = r1[9];
        r1[9] = r23 & 33554431;
        long r24 = r1[r173] + (((int) (r23 >> 25)) * 19);
        r1[r173] = r24;
        int r25 = ~((((int) r24) - 67108845) >> 31);
        int r4 = 1;
    L16:
        if (r4 >= 10) goto L18;
        int r5 = ~(((int) r1[r4]) ^ zzc[r4 & 1]);
        int r52 = r5 & (r5 << 16);
        int r53 = r52 & (r52 << 8);
        int r54 = r53 & (r53 << 4);
        int r55 = r54 & (r54 << 2);
        r25 = r25 & ((r55 & (r55 << 1)) >> 31);
        r4 = r4 + 1;
        goto L16
    L18:
        r1[r173] = r1[r173] - (67108845 & r25);
        long r56 = 33554431 & r25;
        r1[1] = r1[1] - r56;
    L19:
        if (r9 >= 10) goto L21;
        r1[r9] = r1[r9] - (67108863 & r25);
        int r33 = r9 + 1;
        r1[r33] = r1[r33] - r56;
        r9 = r9 + 2;
        goto L19
    L21:
        int r26 = r173;
    L22:
        if (r26 >= 10) goto L24;
        r1[r26] = r1[r26] << zzb[r26];
        r26 = r26 + 1;
        goto L22
    L24:
        byte[] r27 = new byte[32];
        int r34 = r173;
    L25:
        if (r34 >= 10) goto L27;
        int r42 = zza[r34];
        long r57 = r27[r42];
        long r7 = r1[r34];
        r27[r42] = (byte) (r57 | (r7 & 255));
        r27[r42 + 1] = (byte) (r27[r5] | ((r7 >> 8) & 255));
        r27[r42 + 2] = (byte) (r27[r5] | ((r7 >> 16) & 255));
        r27[r42 + 3] = (byte) (r27[r4] | ((r7 >> 24) & 255));
        r34 = r34 + 1;
        goto L25
    L27:
        return r27;
    }

    public static void zzb(long[] r9) {
        long r1 = r9[8];
        long r3 = r9[18];
        long r12 = r1 + (r3 << 4);
        r9[8] = r12;
        long r13 = r12 + (r3 << 1);
        r9[8] = r13;
        r9[8] = r13 + r3;
        long r14 = r9[7];
        long r32 = r9[17];
        long r15 = r14 + (r32 << 4);
        r9[7] = r15;
        long r16 = r15 + (r32 << 1);
        r9[7] = r16;
        r9[7] = r16 + r32;
        long r17 = r9[6];
        long r33 = r9[16];
        long r18 = r17 + (r33 << 4);
        r9[6] = r18;
        long r19 = r18 + (r33 << 1);
        r9[6] = r19;
        r9[6] = r19 + r33;
        long r110 = r9[5];
        long r34 = r9[15];
        long r111 = r110 + (r34 << 4);
        r9[5] = r111;
        long r112 = r111 + (r34 << 1);
        r9[5] = r112;
        r9[5] = r112 + r34;
        long r02 = r9[4];
        long r2 = r9[14];
        long r03 = r02 + (r2 << 4);
        r9[4] = r03;
        long r04 = r03 + (r2 << 1);
        r9[4] = r04;
        r9[4] = r04 + r2;
        long r113 = r9[3];
        long r35 = r9[13];
        long r114 = r113 + (r35 << 4);
        r9[3] = r114;
        long r115 = r114 + (r35 << 1);
        r9[3] = r115;
        r9[3] = r115 + r35;
        long r116 = r9[2];
        long r36 = r9[12];
        long r117 = r116 + (r36 << 4);
        r9[2] = r117;
        long r118 = r117 + (r36 << 1);
        r9[2] = r118;
        r9[2] = r118 + r36;
        long r05 = r9[1];
        long r22 = r9[11];
        long r06 = r05 + (r22 << 4);
        r9[1] = r06;
        long r07 = r06 + (r22 << 1);
        r9[1] = r07;
        r9[1] = r07 + r22;
        long r119 = r9[0];
        long r37 = r9[10];
        long r120 = r119 + (r37 << 4);
        r9[0] = r120;
        long r121 = r120 + (r37 << 1);
        r9[0] = r121;
        r9[0] = r121 + r37;
    }

    public static void zzb(long[] r58, long[] r59) {
        long r1 = r59[0];
        long r10 = r59[1];
        long r15 = r59[2];
        long r20 = r59[3];
        long r29 = r59[4];
        long r32 = r59[5];
        long r37 = r59[6];
        long r42 = r59[7];
        long r49 = r59[8];
        long r52 = r59[9];
        zze(new long[]{r1 * r1, (r1 * 2) * r10, ((r10 * r10) + (r1 * r15)) * 2, ((r10 * r15) + (r1 * r20)) * 2, ((r15 * r15) + ((r10 * 4) * r20)) + ((r1 * 2) * r29), (((r15 * r20) + (r10 * r29)) + (r1 * r32)) * 2, ((((r20 * r20) + (r15 * r29)) + (r1 * r37)) + ((r10 * 2) * r32)) * 2, ((((r20 * r29) + (r15 * r32)) + (r10 * r37)) + (r1 * r42)) * 2, (r29 * r29) + ((((r15 * r37) + (r1 * r49)) + (((r10 * r42) + (r20 * r32)) * 2)) * 2), (((((r29 * r32) + (r20 * r37)) + (r15 * r42)) + (r10 * r49)) + (r1 * r52)) * 2, ((((r32 * r32) + (r29 * r37)) + (r15 * r49)) + (((r20 * r42) + (r10 * r52)) * 2)) * 2, ((((r32 * r37) + (r29 * r42)) + (r20 * r49)) + (r15 * r52)) * 2, (r37 * r37) + (((r29 * r49) + (((r32 * r42) + (r20 * r52)) * 2)) * 2), (((r37 * r42) + (r32 * r49)) + (r29 * r52)) * 2, (((r42 * r42) + (r37 * r49)) + ((r32 * 2) * r52)) * 2, ((r42 * r49) + (r37 * r52)) * 2, (r49 * r49) + ((r42 * 4) * r52), (r49 * 2) * r52, (2 * r52) * r52}, r58);
    }

    public static void zza(long[] r1, long[] r2, long[] r3) {
        long[] r02 = new long[19];
        zzb(r02, r2, r3);
        zze(r02, r1);
    }

    public static void zza(long[] r14) {
        r14[10] = 0;
        int r4 = 0;
    L4:
        if (r4 >= 10) goto L6;
        long r8 = r14[r4];
        long r6 = r8 / 67108864;
        r14[r4] = r8 - (r6 << 26);
        int r5 = r4 + 1;
        long r82 = r14[r5] + r6;
        r14[r5] = r82;
        long r62 = r82 / 33554432;
        r14[r5] = r82 - (r62 << 25);
        r4 = r4 + 2;
        r14[r4] = r14[r4] + r62;
        goto L4
    L6:
        long r83 = r14[0];
        long r10 = r14[10];
        long r84 = r83 + (r10 << 4);
        r14[0] = r84;
        long r85 = r84 + (r10 << 1);
        r14[0] = r85;
        long r86 = r85 + r10;
        r14[0] = r86;
        r14[10] = 0;
        long r02 = r86 / 67108864;
        r14[0] = r86 - (r02 << 26);
        r14[1] = r14[1] + r02;
    }

    public static void zza(long[] r3, long[] r4, long r5) {
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L6;
        r3[r02] = r4[r02] * r5;
        r02 = r02 + 1;
        goto L4
    }

    public static long[] zza(byte[] r9) {
        long[] r1 = new long[10];
        int r2 = 0;
    L3:
        if (r2 >= 10) goto L5;
        int r3 = zza[r2];
        r1[r2] = (((((r9[r3] & UnsignedBytes.MAX_VALUE) | ((r9[r3 + 1] & UnsignedBytes.MAX_VALUE) << 8)) | ((r9[r3 + 2] & UnsignedBytes.MAX_VALUE) << 16)) | ((r9[r3 + 3] & UnsignedBytes.MAX_VALUE) << 24)) >> zzb[r2]) & zzc[r2 & 1];
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }
}
