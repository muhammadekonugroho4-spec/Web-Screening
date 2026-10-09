package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public enum zzcp extends Enum<zzcp> {
    public static final zzcp zza = null;
    private static final zzcp zzb = null;
    private static final zzcp zzc = null;
    private static final /* synthetic */ zzcp[] zzd = null;

    static {
        zzcp r02 = new zzcp("READ_AND_WRITE", 0);
        zza = r02;
        zzcp r1 = new zzcp("READ_ONLY", 1);
        zzb = r1;
        zzcp r2 = new zzcp("WRITE_ONLY", 2);
        zzc = r2;
        zzd = new zzcp[]{r02, r1, r2};
    }

    zzcp(String r1, int r2) {
    }

    public static zzcp[] values() {
        return (zzcp[]) zzd.clone();
    }
}
