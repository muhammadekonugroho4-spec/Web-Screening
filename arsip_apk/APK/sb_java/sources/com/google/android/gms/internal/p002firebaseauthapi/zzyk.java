package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzyk extends Enum<zzyk> {
    public static final zzyk zza = null;
    public static final zzyk zzb = null;
    public static final zzyk zzc = null;
    private static final /* synthetic */ zzyk[] zzd = null;

    static {
        zzyk r02 = new zzyk("UNCOMPRESSED", 0);
        zza = r02;
        zzyk r1 = new zzyk("COMPRESSED", 1);
        zzb = r1;
        zzyk r2 = new zzyk("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        zzc = r2;
        zzd = new zzyk[]{r02, r1, r2};
    }

    zzyk(String r1, int r2) {
    }

    public static zzyk[] values() {
        return (zzyk[]) zzd.clone();
    }
}
