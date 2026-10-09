package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzagi extends Enum<zzagi> {
    public static final zzagi zza = null;
    private static final zzagi zzb = null;
    private static final /* synthetic */ zzagi[] zzc = null;
    private final String zzd;

    static {
        zzagi r02 = new zzagi("REFRESH_TOKEN", 0, "refresh_token");
        zza = r02;
        zzagi r1 = new zzagi("AUTHORIZATION_CODE", 1, "authorization_code");
        zzb = r1;
        zzc = new zzagi[]{r02, r1};
    }

    zzagi(String r1, int r2, String r3) {
        this.zzd = r3;
    }

    public static zzagi[] values() {
        return (zzagi[]) zzc.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
