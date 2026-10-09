package com.google.android.recaptcha.internal;

import android.util.Base64;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.perf.util.Constants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public final class zzqc {
    protected static final Charset zza = null;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zzd;
    private byte[] zze;
    private byte[] zzf;
    private int zzg;

    static {
        zza = StandardCharsets.UTF_16;
    }

    public zzqc() {
        this.zzd = new int[]{511133343, 1277647508, 107287496, 338123662};
    }

    public static int zza(int r1, int r2) {
        if ((r1 % 2) != 0) goto L7;
        int r02 = (~r2) & r1;
        return ((~r1) & r2) | r02;
    L7:
        return (r1 | r2) - (r1 & r2);
    }

    public static String zze(String r4, byte[] r5, zzqd r6) {
        byte[] r42 = Base64.decode(r4, 0);
        byte[] r1 = new byte[12];
        int r2 = r42.length - 12;
        byte[] r3 = new byte[r2];
        System.arraycopy(r42, 0, r1, 0, 12);
        System.arraycopy(r42, 12, r3, 0, r2);
        return new String(new zzqc(r5, r1).zzd(r3), zza);
    }

    public static String zzf(String r3, byte[] r4, zzqd r5) {
        byte[] r02 = new byte[12];
        new SecureRandom().nextBytes(r02);
        byte[] r32 = new zzqc(r4, r02).zzd(r3.getBytes(zza));
        int r42 = r32.length;
        byte[] r1 = new byte[r42 + 12];
        System.arraycopy(r02, 0, r1, 0, 12);
        System.arraycopy(r32, 0, r1, 12, r42);
        return Base64.encodeToString(r1, 2);
    }

    private static final int zzg(byte[] r3, int r4) {
        int r02 = r3[r4] & UnsignedBytes.MAX_VALUE;
        int r1 = r3[r4 + 1] & UnsignedBytes.MAX_VALUE;
        int r2 = r3[r4 + 2] & UnsignedBytes.MAX_VALUE;
        int r32 = r3[r4 + 3] & UnsignedBytes.MAX_VALUE;
        int r33 = r32 << 24;
        return r33 | (((r1 << 8) | r02) | (r2 << 16));
    }

    public final void zzb(int r2, int r3, int r4, int r5) {
        zzc(r2, r3, r5, 16);
        zzc(r4, r5, r3, 12);
        zzc(r2, r3, r5, 8);
        zzc(r4, r5, r3, 7);
    }

    public final void zzc(int r3, int r4, int r5, int r6) {
        int[] r02 = this.zzb;
        int r1 = r02[r3] + r02[r4];
        r02[r3] = r1;
        int r32 = zza(r02[r5], r1);
        r02[r5] = r32;
        int r42 = r32 >>> (32 - r6);
        r02[r5] = (r32 << r6) | r42;
    }

    public final byte[] zzd(byte[] r17) {
        if (this.zzg != 1) goto L20;
        int r2 = r17.length;
        byte[] r4 = new byte[r2];
        int r6 = 0;
    L5:
        if (r2 <= 0) goto L18;
        int[] r7 = this.zzc;
        int[] r8 = this.zzb;
        int r9 = r7.length;
        System.arraycopy(r7, 0, r8, 0, 16);
        this.zzb[12] = this.zzg;
        int r72 = 0;
    L8:
        if (r72 >= 10) goto L10;
        zzb(0, 4, 8, 12);
        zzb(1, 5, 9, 13);
        zzb(2, 6, 10, 14);
        zzb(3, 7, 11, 15);
        zzb(0, 5, 10, 15);
        zzb(1, 6, 11, 12);
        zzb(2, 7, 8, 13);
        zzb(3, 4, 9, 14);
        r72 = r72 + 1;
        goto L8
    L10:
        byte[] r92 = new byte[64];
        int r11 = 0;
    L11:
        if (r11 >= 16) goto L13;
        int r12 = this.zzb[r11];
        int r13 = r11 * 4;
        r92[r13] = (byte) (r12 & Constants.MAX_HOST_LENGTH);
        r92[r13 + 1] = (byte) ((r12 >> 8) & Constants.MAX_HOST_LENGTH);
        r92[r13 + 2] = (byte) ((r12 >> 16) & Constants.MAX_HOST_LENGTH);
        r92[r13 + 3] = (byte) ((r12 >> 24) & Constants.MAX_HOST_LENGTH);
        r11 = r11 + 1;
        goto L11
    L13:
        int r82 = 0;
    L15:
        if (r82 >= Math.min(64, r2)) goto L17;
        int r10 = r6 + r82;
        r4[r10] = (byte) zza(r92[r82], r17[r10]);
        r82 = r82 + 1;
        goto L15
    L17:
        this.zzg++;
        r2 = r2 - 64;
        r6 = r6 + 64;
        goto L5
    L18:
        return r4;
    L20:
        throw new IllegalStateException();
    }

    public zzqc(byte[] r6, byte[] r7) {
        this.zzd = new int[]{511133343, 1277647508, 107287496, 338123662};
        if (r6.length != 32) goto L18;
        this.zze = r6;
        this.zzg = 1;
        this.zzf = r7;
        this.zzb = new int[16];
        int r02 = 0;
    L6:
        if (r02 >= 4) goto L8;
        this.zzb[r02] = zza(this.zzd[r02], 2131181306);
        r02 = r02 + 1;
        goto L6
    L8:
        int r03 = 4;
    L10:
        if (r03 >= 12) goto L12;
        this.zzb[r03] = zzg(this.zze, (r03 - 4) * 4);
        r03 = r03 + 1;
        goto L10
    L12:
        this.zzb[12] = this.zzg;
        int r04 = 13;
    L13:
        if (r04 >= 16) goto L15;
        this.zzb[r04] = zzg(this.zzf, (r04 - 13) * 4);
        r04 = r04 + 1;
        goto L13
    L15:
        int[] r05 = new int[16];
        this.zzc = r05;
        int[] r1 = this.zzb;
        int r2 = r1.length;
        System.arraycopy(r1, 0, r05, 0, 16);
        return;
    L18:
        throw new IllegalArgumentException();
    }
}
