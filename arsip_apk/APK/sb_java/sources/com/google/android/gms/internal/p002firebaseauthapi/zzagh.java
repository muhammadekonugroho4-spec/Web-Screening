package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzagh extends Enum<zzagh> {
    public static final zzagh zza = null;
    private static final zzagh zzb = null;
    private static final /* synthetic */ zzagh[] zzc = null;
    private final String zzd;

    static {
        zzagh r02 = new zzagh("ACCESS_TOKEN", 0, "ACCESS_TOKEN");
        zza = r02;
        zzagh r1 = new zzagh("ID_TOKEN", 1, "idToken");
        zzb = r1;
        zzc = new zzagh[]{r02, r1};
    }

    zzagh(String r1, int r2, String r3) {
        this.zzd = r3;
    }

    public static zzagh[] values() {
        return (zzagh[]) zzc.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
