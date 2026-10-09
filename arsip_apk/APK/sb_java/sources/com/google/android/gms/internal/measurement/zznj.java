package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public enum zznj extends Enum<zznj> {
    public static final zznj zza = null;
    public static final zznj zzb = null;
    public static final zznj zzc = null;
    public static final zznj zzd = null;
    public static final zznj zze = null;
    public static final zznj zzf = null;
    public static final zznj zzg = null;
    public static final zznj zzh = null;
    public static final zznj zzi = null;
    private static final /* synthetic */ zznj[] zzj = null;

    static {
        zznj r02 = new zznj("INT", 0, 0);
        zza = r02;
        zznj r1 = new zznj("LONG", 1, 0L);
        zzb = r1;
        zznj r2 = new zznj("FLOAT", 2, Float.valueOf(0.0f));
        zzc = r2;
        zznj r3 = new zznj("DOUBLE", 3, Double.valueOf(0.0d));
        zzd = r3;
        zznj r4 = new zznj("BOOLEAN", 4, Boolean.FALSE);
        zze = r4;
        zznj r5 = new zznj("STRING", 5, "");
        zzf = r5;
        zznj r6 = new zznj("BYTE_STRING", 6, zziy.zza);
        zzg = r6;
        zznj r7 = new zznj("ENUM", 7, null);
        zzh = r7;
        zznj r8 = new zznj("MESSAGE", 8, null);
        zzi = r8;
        zzj = new zznj[]{r02, r1, r2, r3, r4, r5, r6, r7, r8};
    }

    zznj(String r1, int r2, Object r3) {
    }

    public static zznj[] values() {
        return (zznj[]) zzj.clone();
    }
}
