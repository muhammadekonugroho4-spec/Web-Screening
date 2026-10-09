package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
enum zzgr extends Enum {
    public static final zzgr zza = null;
    public static final zzgr zzb = null;
    public static final zzgr zzc = null;
    public static final zzgr zzd = null;
    private static final /* synthetic */ zzgr[] zze = null;

    static {
        zzgr r02 = new zzgr("BOOLEAN", 0);
        zza = r02;
        zzgr r1 = new zzgr("STRING", 1);
        zzb = r1;
        zzgr r2 = new zzgr("LONG", 2);
        zzc = r2;
        zzgr r3 = new zzgr("DOUBLE", 3);
        zzd = r3;
        zze = new zzgr[]{r02, r1, r2, r3};
    }

    zzgr(String r1, int r2) {
    }

    public static zzgr[] values() {
        return (zzgr[]) zze.clone();
    }

    public static /* bridge */ /* synthetic */ zzgr zza(Object r2) {
        if ((r2 instanceof String) == false) goto L7;
        return zzb;
    L7:
        if ((r2 instanceof Boolean) == false) goto L11;
        return zza;
    L11:
        if ((r2 instanceof Long) == false) goto L15;
        return zzc;
    L15:
        if ((r2 instanceof Double) == false) goto L19;
        return zzd;
    L19:
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(r2.getClass())));
    }
}
