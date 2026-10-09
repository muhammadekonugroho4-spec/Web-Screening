package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
public enum zztv extends Enum implements zznf {
    public static final zztv zza = null;
    public static final zztv zzb = null;
    public static final zztv zzc = null;
    public static final zztv zzd = null;
    public static final zztv zze = null;
    public static final zztv zzf = null;

    @Deprecated
    public static final zztv zzg = null;
    public static final zztv zzh = null;
    public static final zztv zzi = null;
    public static final zztv zzj = null;
    public static final zztv zzk = null;
    private static final /* synthetic */ zztv[] zzl = null;
    private final int zzm;

    static {
        zztv r02 = new zztv("JS_CODE_UNSPECIFIED", 0, 0);
        zza = r02;
        zztv r1 = new zztv("JS_CODE_SUCCESS", 1, 1);
        zzb = r1;
        zztv r2 = new zztv("JS_NETWORK_ERROR", 2, 2);
        zzc = r2;
        zztv r3 = new zztv("JS_INTERNAL_ERROR", 3, 3);
        zzd = r3;
        zztv r4 = new zztv("JS_INVALID_SITE_KEY", 4, 4);
        zze = r4;
        zztv r5 = new zztv("JS_INVALID_SITE_KEY_TYPE", 5, 5);
        zzf = r5;
        zztv r6 = new zztv("JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED", 6, 6);
        zzg = r6;
        zztv r7 = new zztv("JS_INVALID_ACTION", 7, 7);
        zzh = r7;
        zztv r8 = new zztv("JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED", 8, 8);
        zzi = r8;
        zztv r9 = new zztv("JS_PROGRAM_ERROR", 9, 9);
        zzj = r9;
        zztv r10 = new zztv("UNRECOGNIZED", 10, -1);
        zzk = r10;
        zzl = new zztv[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
    }

    zztv(String r1, int r2, int r3) {
        this.zzm = r3;
    }

    public static zztv[] values() {
        return (zztv[]) zzl.clone();
    }

    public static zztv zzb(int r02) {
        switch(r02) {
            case 0: goto L24;
            case 1: goto L22;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L16;
            case 5: goto L14;
            case 6: goto L12;
            case 7: goto L10;
            case 8: goto L8;
            case 9: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return zzj;
    L8:
        return zzi;
    L10:
        return zzh;
    L12:
        return zzg;
    L14:
        return zzf;
    L16:
        return zze;
    L18:
        return zzd;
    L20:
        return zzc;
    L22:
        return zzb;
    L24:
        return zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.recaptcha.internal.zznf
    public final int zza() {
        if (this == zzk) goto L7;
        return this.zzm;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
