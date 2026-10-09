package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public final class zzbq {
    public static final zzbq zza = null;
    public static final zzbq zzb = null;
    public static final zzbq zzc = null;
    private final String zzd;

    static {
        zza = new zzbq("ENABLED");
        zzb = new zzbq("DISABLED");
        zzc = new zzbq("DESTROYED");
    }

    private zzbq(String r1) {
        this.zzd = r1;
    }

    public final String toString() {
        return this.zzd;
    }
}
