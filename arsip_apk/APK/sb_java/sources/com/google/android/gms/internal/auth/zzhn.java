package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
public enum zzhn extends Enum {
    public static final zzhn zza = null;
    public static final zzhn zzb = null;
    public static final zzhn zzc = null;
    public static final zzhn zzd = null;
    public static final zzhn zze = null;
    public static final zzhn zzf = null;
    public static final zzhn zzg = null;
    public static final zzhn zzh = null;
    public static final zzhn zzi = null;
    public static final zzhn zzj = null;
    public static final zzhn zzk = null;
    public static final zzhn zzl = null;
    public static final zzhn zzm = null;
    public static final zzhn zzn = null;
    public static final zzhn zzo = null;
    public static final zzhn zzp = null;
    public static final zzhn zzq = null;
    public static final zzhn zzr = null;
    private static final /* synthetic */ zzhn[] zzs = null;
    private final zzho zzt;

    static {
        zzhn r1 = new zzhn("DOUBLE", 0, zzho.zzd, 1);
        zza = r1;
        zzhn r2 = new zzhn("FLOAT", 1, zzho.zzc, 5);
        zzb = r2;
        zzho r5 = zzho.zzb;
        zzhn r02 = new zzhn("INT64", 2, r5, 0);
        zzc = r02;
        zzhn r7 = new zzhn("UINT64", 3, r5, 0);
        zzd = r7;
        zzho r11 = zzho.zza;
        zzhn r9 = new zzhn("INT32", 4, r11, 0);
        zze = r9;
        zzhn r12 = new zzhn("FIXED64", 5, r5, 1);
        zzf = r12;
        zzhn r72 = new zzhn("FIXED32", 6, r11, 5);
        zzg = r72;
        zzhn r14 = new zzhn("BOOL", 7, zzho.zze, 0);
        zzh = r14;
        zzhn r92 = new zzhn("STRING", 8, zzho.zzf, 2);
        zzi = r92;
        zzho r6 = zzho.zzi;
        zzhn r3 = new zzhn("GROUP", 9, r6, 3);
        zzj = r3;
        zzhn r8 = new zzhn("MESSAGE", 10, r6, 2);
        zzk = r8;
        zzhn r122 = new zzhn("BYTES", 11, zzho.zzg, 2);
        zzl = r122;
        zzhn r13 = new zzhn("UINT32", 12, r11, 0);
        zzm = r13;
        zzhn r142 = new zzhn("ENUM", 13, zzho.zzh, 0);
        zzn = r142;
        zzhn r15 = new zzhn("SFIXED32", 14, r11, 5);
        zzo = r15;
        zzhn r03 = new zzhn("SFIXED64", 15, r5, 1);
        zzp = r03;
        zzhn r16 = new zzhn("SINT32", 16, r11, 0);
        zzq = r16;
        zzhn r22 = new zzhn("SINT64", 17, r5, 0);
        zzr = r22;
        zzs = new zzhn[]{r1, r2, r02, r7, r9, r12, r72, r14, r92, r3, r8, r122, r13, r142, r15, r03, r16, r22};
    }

    zzhn(String r1, int r2, zzho r3, int r4) {
        this.zzt = r3;
    }

    public static zzhn[] values() {
        return (zzhn[]) zzs.clone();
    }

    public final zzho zza() {
        return this.zzt;
    }
}
