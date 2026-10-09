package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class zzkd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    public zzkd(String r10, char[] r11) {
        byte[] r1 = new byte[128];
        Arrays.fill(r1, (byte) -1);
        int r4 = 0;
    L4:
        if (r4 >= r11.length) goto L14;
        char r5 = r11[r4];
        boolean r6 = true;
        if (r5 >= 128) goto L8;
        boolean r7 = true;
    L9:
        zzjf.zzc(r7, "Non-ASCII character: %s", r5);
        if (r1[r5] == (-1)) goto L13;
        r6 = false;
    L13:
        zzjf.zzc(r6, "Duplicate character: %s", r5);
        r1[r5] = (byte) r4;
        r4 = r4 + 1;
        goto L4
    L8:
        r7 = false;
        goto L9
    L14:
        this(r10, r11, r1, false);
    }

    public static /* bridge */ /* synthetic */ char[] zze(zzkd r02) {
        return r02.zzf;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof zzkd) == false) goto L8;
        zzkd r32 = (zzkd) r3;
        boolean r02 = r32.zzi;
        if (Arrays.equals(this.zzf, r32.zzf) == false) goto L8;
        return true;
    L8:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int r2) {
        return this.zzf[r2];
    }

    public final int zzb(char r5) throws zzkf {
        if (r5 > 127) goto L16;
        byte r2 = this.zzg[r5];
        if (r2 == (-1)) goto L7;
        return r2;
    L7:
        if (r5 <= ' ') goto L13;
        if (r5 == 127) goto L13;
        throw new zzkf("Unrecognized character: " + r5);
    L13:
        throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(r5))));
    L16:
        throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(r5))));
    }

    public final boolean zzc(int r3) {
        int r02 = this.zzc;
        return this.zzh[r3 % r02];
    }

    public final boolean zzd(char r2) {
        if (this.zzg[61] == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    private zzkd(String r4, char[] r5, byte[] r6, boolean r7) {
        this.zze = r4;
        r5.getClass();
        this.zzf = r5;
        int r42 = r5.length;     // Catch: ArithmeticException -> L10
        int r72 = zzkj.zzb(r42, RoundingMode.UNNECESSARY);     // Catch: ArithmeticException -> L10
        this.zzb = r72;     // Catch: ArithmeticException -> L10
        int r52 = Integer.numberOfTrailingZeros(r72);
        int r02 = 1 << (3 - r52);
        this.zzc = r02;
        this.zzd = r72 >> r52;
        this.zza = r42 - 1;
        this.zzg = r6;
        boolean[] r43 = new boolean[r02];
        int r62 = 0;
    L6:
        if (r62 >= this.zzd) goto L8;
        r43[zzkj.zza(r62 * 8, this.zzb, RoundingMode.CEILING)] = true;
        r62 = r62 + 1;
        goto L6
    L8:
        this.zzh = r43;
        this.zzi = false;
        return;
    L10:
        e = move-exception;
        throw new IllegalArgumentException("Illegal alphabet length " + r5.length, e);
    }
}
