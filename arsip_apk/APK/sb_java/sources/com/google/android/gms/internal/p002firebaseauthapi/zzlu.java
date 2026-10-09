package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzlu {
    public static final byte[] zza = null;
    public static final byte[] zzb = null;
    public static final byte[] zzc = null;
    public static final byte[] zzd = null;
    public static final byte[] zze = null;
    public static final byte[] zzf = null;
    public static final byte[] zzg = null;
    public static final byte[] zzh = null;
    public static final byte[] zzi = null;
    public static final byte[] zzj = null;
    public static final byte[] zzk = null;
    public static final byte[] zzl = null;
    private static final byte[] zzm = null;
    private static final byte[] zzn = null;
    private static final byte[] zzo = null;

    static {
        zza = zza(1, 0);
        zza(1, 2);
        zzb = zza(2, 32);
        zzc = zza(2, 16);
        zzd = zza(2, 17);
        zze = zza(2, 18);
        zzf = zza(2, 1);
        zzg = zza(2, 2);
        zzh = zza(2, 3);
        zzi = zza(2, 1);
        zzj = zza(2, 2);
        zzk = zza(2, 3);
        zzl = new byte[0];
        Charset r02 = zzpy.zza;
        zzm = "KEM".getBytes(r02);
        zzn = "HPKE".getBytes(r02);
        zzo = "HPKE-v1".getBytes(r02);
    }

    public static int zza(zzju.zzd r2) throws GeneralSecurityException {
        if (r2 != zzju.zzd.zzd) goto L6;
        return 32;
    L6:
        if (r2 != zzju.zzd.zza) goto L9;
        return 32;
    L9:
        if (r2 != zzju.zzd.zzb) goto L13;
        return 48;
    L13:
        if (r2 != zzju.zzd.zzc) goto L17;
        return 66;
    L17:
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static int zzb(zzju.zzd r1) throws GeneralSecurityException {
        if (r1 != zzju.zzd.zzd) goto L7;
        return 32;
    L7:
        if (r1 != zzju.zzd.zza) goto L11;
        return 65;
    L11:
        if (r1 != zzju.zzd.zzb) goto L15;
        return 97;
    L15:
        if (r1 != zzju.zzd.zzc) goto L19;
        return 133;
    L19:
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static zzyl zzc(zzju.zzd r1) throws GeneralSecurityException {
        if (r1 != zzju.zzd.zza) goto L7;
        return zzyl.zza;
    L7:
        if (r1 != zzju.zzd.zzb) goto L11;
        return zzyl.zzb;
    L11:
        if (r1 != zzju.zzd.zzc) goto L15;
        return zzyl.zzc;
    L15:
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }

    public static byte[] zza(byte[] r1, byte[] r2, byte[] r3) throws GeneralSecurityException {
        return zzyc.zza(new byte[][]{zzn, r1, r2, r3});
    }

    private static byte[] zza(int r4, int r5) {
        if (r4 > 4) goto L17;
        if (r4 < 0) goto L17;
        if (r5 < 0) goto L15;
        if (r4 < 4) goto L9;
    L10:
        byte[] r02 = new byte[r4];
        int r2 = 0;
    L11:
        if (r2 >= r4) goto L13;
        r02[r2] = (byte) (r5 >> (((r4 - r2) - 1) * 8));
        r2 = r2 + 1;
        goto L11
    L13:
        return r02;
    L9:
        if (r5 < (1 << (r4 << 3))) goto L10;
    L15:
        throw new IllegalArgumentException("value too large");
    L17:
        throw new IllegalArgumentException("capacity must be between 0 and 4");
    }

    public static byte[] zza(byte[] r1) throws GeneralSecurityException {
        return zzyc.zza(new byte[][]{zzm, r1});
    }

    public static byte[] zza(String r2, byte[] r3, byte[] r4) throws GeneralSecurityException {
        return zzyc.zza(new byte[][]{zzo, r4, r2.getBytes(zzpy.zza), r3});
    }

    public static byte[] zza(String r2, byte[] r3, byte[] r4, int r5) throws GeneralSecurityException {
        return zzyc.zza(new byte[][]{zza(2, r5), zzo, r4, r2.getBytes(zzpy.zza), r3});
    }
}
