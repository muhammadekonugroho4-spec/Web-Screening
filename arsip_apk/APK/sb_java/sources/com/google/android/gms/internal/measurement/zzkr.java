package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public enum zzkr extends Enum<zzkr> {
    public static final zzkr zza = null;
    public static final zzkr zzb = null;
    public static final zzkr zzc = null;
    public static final zzkr zzd = null;
    public static final zzkr zze = null;
    public static final zzkr zzf = null;
    public static final zzkr zzg = null;
    public static final zzkr zzh = null;
    public static final zzkr zzi = null;
    public static final zzkr zzj = null;
    private static final /* synthetic */ zzkr[] zzk = null;
    private final Class<?> zzl;

    static {
        zzkr r02 = new zzkr("VOID", 0, Void.class, Void.class, null);
        zza = r02;
        Class r4 = Integer.TYPE;
        zzkr r1 = new zzkr("INT", 1, r4, Integer.class, 0);
        zzb = r1;
        zzkr r2 = new zzkr("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = r2;
        Float r10 = Float.valueOf(0.0f);
        zzkr r3 = new zzkr("FLOAT", 3, Float.TYPE, Float.class, r10);
        zzd = r3;
        Double r102 = Double.valueOf(0.0d);
        zzkr r5 = new zzkr("DOUBLE", 4, Double.TYPE, Double.class, r102);
        zze = r5;
        Boolean r11 = Boolean.FALSE;
        zzkr r6 = new zzkr("BOOLEAN", 5, Boolean.TYPE, Boolean.class, r11);
        zzf = r6;
        zzkr r7 = new zzkr("STRING", 6, String.class, String.class, "");
        zzg = r7;
        zzkr r72 = new zzkr("BYTE_STRING", 7, zziy.class, zziy.class, zziy.zza);
        zzh = r72;
        zzkr r73 = new zzkr("ENUM", 8, r4, Integer.class, null);
        zzi = r73;
        zzkr r9 = new zzkr("MESSAGE", 9, Object.class, Object.class, null);
        zzj = r9;
        zzk = new zzkr[]{r02, r1, r2, r3, r5, r6, r7, r72, r73, r9};
    }

    zzkr(String r1, int r2, Class r3, Class r4, Object r5) {
        this.zzl = r4;
    }

    public static zzkr[] values() {
        return (zzkr[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
