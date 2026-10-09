package com.google.android.gms.internal.time;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes5.dex */
public enum zzej extends Enum {
    public static final zzej zza = null;
    public static final zzej zzb = null;
    public static final zzej zzc = null;
    public static final zzej zzd = null;
    public static final zzej zze = null;
    public static final zzej zzf = null;
    public static final zzej zzg = null;
    public static final zzej zzh = null;
    public static final zzej zzi = null;
    public static final zzej zzj = null;
    private static final zzej[] zzk = null;
    private static final /* synthetic */ zzej[] zzl = null;
    private final char zzm;
    private final zzel zzn;
    private final int zzo;
    private final String zzp;

    static {
        zzej r02 = new zzej("STRING", 0, 's', zzel.zza, "-#", true);
        zza = r02;
        zzej r1 = new zzej("BOOLEAN", 1, Constants.INAPP_POSITION_BOTTOM, zzel.zzb, "-", true);
        zzb = r1;
        zzej r2 = new zzej("CHAR", 2, Constants.INAPP_POSITION_CENTER, zzel.zzc, "-", true);
        zzc = r2;
        zzel r8 = zzel.zzd;
        zzej r3 = new zzej("DECIMAL", 3, 'd', r8, "-0+ ,(", false);
        zzd = r3;
        zzej r4 = new zzej("OCTAL", 4, 'o', r8, "-#0(", false);
        zze = r4;
        zzej r42 = new zzej("HEX", 5, 'x', r8, "-#0(", true);
        zzf = r42;
        zzel r16 = zzel.zze;
        zzej r6 = new zzej("FLOAT", 6, 'f', r16, "-#0+ ,(", false);
        zzg = r6;
        zzej r7 = new zzej("EXPONENT", 7, 'e', r16, "-#0+ (", true);
        zzh = r7;
        zzej r82 = new zzej("GENERAL", 8, 'g', r16, "-0+ ,(", true);
        zzi = r82;
        zzej r9 = new zzej("EXPONENT_HEX", 9, 'a', r16, "-#0+ ", true);
        zzj = r9;
        zzl = new zzej[]{r02, r1, r2, r3, r4, r42, r6, r7, r82, r9};
        zzk = new zzej[26];
        zzej[] r03 = values();
        int r12 = r03.length;
        int r22 = 0;
    L3:
        if (r22 >= r12) goto L5;
        zzej r32 = r03[r22];
        int r43 = zzf(r32.zzm);
        zzk[r43] = r32;
        r22 = r22 + 1;
        goto L3
    }

    zzej(String r1, int r2, char r3, zzel r4, String r5, boolean r6) {
        this.zzm = r3;
        this.zzn = r4;
        this.zzo = zzek.zzd(r5, r6);
        this.zzp = "%" + r3;
    }

    public static zzej[] values() {
        return (zzej[]) zzl.clone();
    }

    public static zzej zzc(char r2) {
        zzej r02 = zzk[zzf(r2)];
        if ((r2 & ' ') != 0) goto L10;
        if (r02 != null) goto L6;
        return null;
    L6:
        if ((r02.zzo & 128) == 0) goto L11;
        return r02;
    L11:
        return null;
    L10:
        return r02;
    }

    private static int zzf(char r02) {
        return (r02 | ' ') - 97;
    }

    public final char zza() {
        return this.zzm;
    }

    public final int zzb() {
        return this.zzo;
    }

    public final zzel zzd() {
        return this.zzn;
    }

    public final String zze() {
        return this.zzp;
    }
}
