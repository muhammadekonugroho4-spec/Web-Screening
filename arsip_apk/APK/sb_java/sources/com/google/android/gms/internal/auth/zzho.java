package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
public enum zzho extends Enum {
    public static final zzho zza = null;
    public static final zzho zzb = null;
    public static final zzho zzc = null;
    public static final zzho zzd = null;
    public static final zzho zze = null;
    public static final zzho zzf = null;
    public static final zzho zzg = null;
    public static final zzho zzh = null;
    public static final zzho zzi = null;
    private static final /* synthetic */ zzho[] zzj = null;
    private final Object zzk;

    static {
        zzho r02 = new zzho("INT", 0, 0);
        zza = r02;
        zzho r1 = new zzho("LONG", 1, 0L);
        zzb = r1;
        zzho r2 = new zzho("FLOAT", 2, Float.valueOf(0.0f));
        zzc = r2;
        zzho r3 = new zzho("DOUBLE", 3, Double.valueOf(0.0d));
        zzd = r3;
        zzho r4 = new zzho("BOOLEAN", 4, Boolean.FALSE);
        zze = r4;
        zzho r5 = new zzho("STRING", 5, "");
        zzf = r5;
        zzho r6 = new zzho("BYTE_STRING", 6, zzee.zzb);
        zzg = r6;
        zzho r7 = new zzho("ENUM", 7, null);
        zzh = r7;
        zzho r8 = new zzho("MESSAGE", 8, null);
        zzi = r8;
        zzj = new zzho[]{r02, r1, r2, r3, r4, r5, r6, r7, r8};
    }

    zzho(String r1, int r2, Object r3) {
        this.zzk = r3;
    }

    public static zzho[] values() {
        return (zzho[]) zzj.clone();
    }
}
