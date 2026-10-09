package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzmq {
    private static final byte[][] zza = null;

    static {
        zza = new byte[][]{new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, Ascii.SYN, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, Ascii.SYN, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, Ascii.FS, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.DEL}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.DEL}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.DEL}};
    }

    public static void zza(long[] r24, byte[] r25, byte[] r26) throws InvalidKeyException {
        int r3 = 32;
        if (r26.length != 32) goto L25;
        byte[] r2 = Arrays.copyOf(r26, r26.length);
        r2[31] = (byte) (r2[31] & Ascii.DEL);
        int r4 = 0;
        int r5 = 0;
    L5:
        byte[][] r6 = zza;
        if (r5 >= r6.length) goto L12;
        if (MessageDigest.isEqual(r6[r5], r2) == true) goto L11;
        r5 = r5 + 1;
        goto L5
    L11:
        throw new InvalidKeyException("Banned public key: " + zzza.zza(r6[r5]));
    L12:
        long[] r22 = zzmw.zza(r2);
        long[] r62 = new long[19];
        long[] r7 = new long[19];
        r7[0] = 1;
        long[] r10 = new long[19];
        r10[0] = 1;
        long[] r11 = new long[19];
        long[] r12 = new long[19];
        long[] r13 = new long[19];
        r13[0] = 1;
        long[] r14 = new long[19];
        long[] r15 = new long[19];
        r15[0] = 1;
        int r8 = 10;
        System.arraycopy(r22, 0, r62, 0, 10);
        int r9 = 0;
    L13:
        if (r9 >= r3) goto L19;
        int r32 = r25[31 - r9] & UnsignedBytes.MAX_VALUE;
    L16:
        if (r4 >= 8) goto L18;
        int r52 = (r32 >> (7 - r4)) & 1;
        zza(r10, r62, r52);
        zza(r11, r7, r52);
        long[] r1 = Arrays.copyOf(r10, r8);
        int r17 = r32;
        long[] r33 = new long[19];
        int r18 = r4;
        long[] r42 = new long[19];
        int r19 = r9;
        long[] r92 = new long[19];
        long[] r02 = new long[19];
        long[] r53 = new long[19];
        long[] r21 = r15;
        long[] r152 = new long[19];
        long[] r34 = new long[19];
        zzmw.zzd(r10, r11);
        zzmw.zzc(r11, r1);
        long[] r82 = Arrays.copyOf(r62, 10);
        zzmw.zzd(r62, r7);
        zzmw.zzc(r7, r82);
        zzmw.zzb(r02, r62, r11);
        zzmw.zzb(r53, r10, r7);
        zzmw.zzb(r02);
        zzmw.zza(r02);
        zzmw.zzb(r53);
        zzmw.zza(r53);
        long[] r23 = r62;
        System.arraycopy(r02, 0, r82, 0, 10);
        zzmw.zzd(r02, r53);
        zzmw.zzc(r53, r82);
        zzmw.zzb(r34, r02);
        zzmw.zzb(r152, r53);
        zzmw.zzb(r53, r152, r22);
        zzmw.zzb(r53);
        zzmw.zza(r53);
        System.arraycopy(r34, 0, r12, 0, 10);
        System.arraycopy(r53, 0, r13, 0, 10);
        zzmw.zzb(r42, r10);
        zzmw.zzb(r92, r11);
        zzmw.zzb(r14, r42, r92);
        zzmw.zzb(r14);
        zzmw.zza(r14);
        zzmw.zzc(r92, r42);
        Arrays.fill(r33, 10, 18, 0);
        zzmw.zza(r33, r92, 121665);
        zzmw.zza(r33);
        zzmw.zzd(r33, r42);
        zzmw.zzb(r21, r92, r33);
        zzmw.zzb(r21);
        zzmw.zza(r21);
        zza(r14, r12, r52);
        zza(r21, r13, r52);
        r4 = r18 + 1;
        long[] r16 = r13;
        r13 = r7;
        r7 = r16;
        long[] r110 = r14;
        r14 = r10;
        r10 = r110;
        r15 = r11;
        r11 = r21;
        r62 = r12;
        r32 = r17;
        r9 = r19;
        r12 = r23;
        r8 = 10;
        goto L16
    L18:
        r9 = r9 + 1;
        r3 = 32;
        r4 = 0;
        r8 = 10;
        goto L13
    L19:
        int r111 = r8;
        long[] r03 = new long[r111];
        zzmw.zza(r03, r11);
        zzmw.zza(r24, r10, r03);
        long[] r04 = new long[r111];
        long[] r43 = new long[r111];
        long[] r83 = new long[11];
        long[] r93 = new long[11];
        long[] r54 = new long[11];
        zzmw.zza(r04, r22, r24);
        zzmw.zzd(r43, r22, r24);
        long[] r112 = new long[r111];
        r112[0] = 486662;
        zzmw.zzd(r93, r43, r112);
        zzmw.zza(r93, r93, r7);
        zzmw.zzd(r93, r62);
        zzmw.zza(r93, r93, r04);
        zzmw.zza(r93, r93, r62);
        zzmw.zza(r83, r93, 4);
        zzmw.zza(r83);
        zzmw.zza(r93, r04, r7);
        zzmw.zzc(r93, r93, r7);
        zzmw.zza(r54, r43, r62);
        zzmw.zzd(r93, r93, r54);
        zzmw.zzb(r93, r93);
        if (MessageDigest.isEqual(zzmw.zzc(r83), zzmw.zzc(r93)) == false) goto L23;
        return;
    L23:
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + zzza.zza(r26));
    L25:
        throw new InvalidKeyException("Public key length is not 32-byte");
    }

    private static void zza(long[] r6, long[] r7, int r8) {
        int r82 = -r8;
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L6;
        int r3 = (((int) r6[r02]) ^ ((int) r7[r02])) & r82;
        r6[r02] = ((int) r1) ^ r3;
        r7[r02] = ((int) r7[r02]) ^ r3;
        r02 = r02 + 1;
        goto L4
    }
}
