package com.google.android.gms.measurement.internal;

/* loaded from: classes5.dex */
public enum zzjm extends Enum<zzjm> {
    public static final zzjm zza = null;
    public static final zzjm zzb = null;
    public static final zzjm zzc = null;
    public static final zzjm zzd = null;
    private static final /* synthetic */ zzjm[] zze = null;
    private final String zzf;

    static {
        zzjm r02 = new zzjm("UNINITIALIZED", 0, "uninitialized");
        zza = r02;
        zzjm r1 = new zzjm("POLICY", 1, "eu_consent_policy");
        zzb = r1;
        zzjm r2 = new zzjm("DENIED", 2, "denied");
        zzc = r2;
        zzjm r3 = new zzjm("GRANTED", 3, "granted");
        zzd = r3;
        zze = new zzjm[]{r02, r1, r2, r3};
    }

    zzjm(String r1, int r2, String r3) {
        this.zzf = r3;
    }

    public static zzjm[] values() {
        return (zzjm[]) zze.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzf;
    }
}
