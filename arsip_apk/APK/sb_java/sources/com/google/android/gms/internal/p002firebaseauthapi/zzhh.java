package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class zzhh {
    private static final int[] zza = null;

    static {
        zza = zza(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    }

    private static int zza(int r1, int r2) {
        int r02 = r1 << r2;
        return (r1 >>> (-r2)) | r02;
    }

    public static int[] zzb(int[] r4, int[] r5) {
        int[] r02 = new int[16];
        zza(r02, r4);
        r02[12] = r5[0];
        r02[13] = r5[1];
        r02[14] = r5[2];
        r02[15] = r5[3];
        zza(r02);
        r02[4] = r02[12];
        r02[5] = r02[13];
        r02[6] = r02[14];
        r02[7] = r02[15];
        return Arrays.copyOf(r02, 8);
    }

    private static void zza(int[] r2, int r3, int r4, int r5, int r6) {
        int r02 = r2[r3] + r2[r4];
        r2[r3] = r02;
        int r03 = zza(r02 ^ r2[r6], 16);
        r2[r6] = r03;
        int r1 = r2[r5] + r03;
        r2[r5] = r1;
        int r04 = zza(r2[r4] ^ r1, 12);
        r2[r4] = r04;
        int r12 = r2[r3] + r04;
        r2[r3] = r12;
        int r32 = zza(r2[r6] ^ r12, 8);
        r2[r6] = r32;
        int r62 = r2[r5] + r32;
        r2[r5] = r62;
        r2[r4] = zza(r2[r4] ^ r62, 7);
    }

    public static void zza(int[] r3, int[] r4) {
        int[] r02 = zza;
        System.arraycopy(r02, 0, r3, 0, r02.length);
        System.arraycopy(r4, 0, r3, r02.length, 8);
    }

    public static void zza(int[] r16) {
        int r2 = 0;
    L4:
        if (r2 >= 10) goto L6;
        zza(r16, 0, 4, 8, 12);
        zza(r16, 1, 5, 9, 13);
        zza(r16, 2, 6, 10, 14);
        zza(r16, 3, 7, 11, 15);
        zza(r16, 0, 5, 10, 15);
        zza(r16, 1, 6, 11, 12);
        zza(r16, 2, 7, 8, 13);
        zza(r16, 3, 4, 9, 14);
        r2 = r2 + 1;
        goto L4
    }

    public static byte[] zza(byte[] r1, byte[] r2) {
        int[] r12 = zzb(zza(r1), zza(r2));
        ByteBuffer r22 = ByteBuffer.allocate(r12.length << 2).order(ByteOrder.LITTLE_ENDIAN);
        r22.asIntBuffer().put(r12);
        return r22.array();
    }

    public static int[] zza(byte[] r1) {
        if ((r1.length % 4) != 0) goto L7;
        IntBuffer r12 = ByteBuffer.wrap(r1).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] r02 = new int[r12.remaining()];
        r12.get(r02);
        return r02;
    L7:
        throw new IllegalArgumentException("invalid input length");
    }
}
