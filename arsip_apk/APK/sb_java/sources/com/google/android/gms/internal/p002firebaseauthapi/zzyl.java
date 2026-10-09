package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzyl extends Enum<zzyl> {
    public static final zzyl zza = null;
    public static final zzyl zzb = null;
    public static final zzyl zzc = null;
    private static final /* synthetic */ zzyl[] zzd = null;

    static {
        zzyl r02 = new zzyl("NIST_P256", 0);
        zza = r02;
        zzyl r1 = new zzyl("NIST_P384", 1);
        zzb = r1;
        zzyl r2 = new zzyl("NIST_P521", 2);
        zzc = r2;
        zzd = new zzyl[]{r02, r1, r2};
    }

    zzyl(String r1, int r2) {
    }

    public static zzyl[] values() {
        return (zzyl[]) zzd.clone();
    }
}
