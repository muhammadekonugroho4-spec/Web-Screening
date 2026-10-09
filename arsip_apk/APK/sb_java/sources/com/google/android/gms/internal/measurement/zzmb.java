package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public enum zzmb extends Enum<zzmb> {
    public static final zzmb zza = null;
    public static final zzmb zzb = null;
    public static final zzmb zzc = null;
    private static final /* synthetic */ zzmb[] zzd = null;

    static {
        zzmb r02 = new zzmb("PROTO2", 0);
        zza = r02;
        zzmb r1 = new zzmb("PROTO3", 1);
        zzb = r1;
        zzmb r2 = new zzmb("EDITIONS", 2);
        zzc = r2;
        zzd = new zzmb[]{r02, r1, r2};
    }

    zzmb(String r1, int r2) {
    }

    public static zzmb[] values() {
        return (zzmb[]) zzd.clone();
    }
}
