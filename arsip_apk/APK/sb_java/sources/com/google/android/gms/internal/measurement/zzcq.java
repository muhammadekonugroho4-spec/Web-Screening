package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
enum zzcq extends Enum<zzcq> {
    public static final zzcq zza = null;
    public static final zzcq zzb = null;
    public static final zzcq zzc = null;
    private static final zzcq zzd = null;
    private static final /* synthetic */ zzcq[] zze = null;

    static {
        zzcq r02 = new zzcq("ALL_CHECKS", 0);
        zza = r02;
        zzcq r1 = new zzcq("SKIP_COMPLIANCE_CHECK", 1);
        zzb = r1;
        zzcq r2 = new zzcq("SKIP_SECURITY_CHECK", 2);
        zzd = r2;
        zzcq r3 = new zzcq("NO_CHECKS", 3);
        zzc = r3;
        zze = new zzcq[]{r02, r1, r2, r3};
    }

    zzcq(String r1, int r2) {
    }

    public static zzcq[] values() {
        return (zzcq[]) zze.clone();
    }
}
