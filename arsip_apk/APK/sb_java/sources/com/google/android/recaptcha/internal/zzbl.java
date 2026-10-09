package com.google.android.recaptcha.internal;

import com.google.android.gms.location.GeofenceStatusCodes;

/* loaded from: classes5.dex */
public final class zzbl {
    public static final zzbl zza = null;
    public static final zzbl zzb = null;
    public static final zzbl zzc = null;
    public static final zzbl zzd = null;
    public static final zzbl zze = null;
    public static final zzbl zzf = null;
    public static final zzbl zzg = null;
    public static final zzbl zzh = null;
    private final int zzi;

    static {
        zza = new zzbl(9999);
        zzb = new zzbl(1004);
        zzc = new zzbl(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
        zzd = new zzbl(1006);
        zze = new zzbl(1007);
        zzf = new zzbl(1008);
        zzg = new zzbl(1009);
        zzh = new zzbl(1010);
    }

    private zzbl(int r1) {
        this.zzi = r1;
    }

    public final int zza() {
        return this.zzi;
    }
}
