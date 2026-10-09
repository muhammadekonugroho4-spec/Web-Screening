package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
enum zzakf extends Enum<zzakf> {
    public static final zzakf zza = null;
    public static final zzakf zzb = null;
    public static final zzakf zzc = null;
    public static final zzakf zzd = null;
    private static final /* synthetic */ zzakf[] zze = null;

    static {
        zzakf r02 = new zzakf("SCALAR", 0, false);
        zza = r02;
        zzakf r1 = new zzakf("VECTOR", 1, true);
        zzb = r1;
        zzakf r3 = new zzakf("PACKED_VECTOR", 2, true);
        zzc = r3;
        zzakf r4 = new zzakf("MAP", 3, false);
        zzd = r4;
        zze = new zzakf[]{r02, r1, r3, r4};
    }

    zzakf(String r1, int r2, boolean r3) {
    }

    public static zzakf[] values() {
        return (zzakf[]) zze.clone();
    }
}
