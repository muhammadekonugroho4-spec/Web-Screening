package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public enum zzcl extends Enum<zzcl> implements zzki {
    public static final zzcl zza = null;
    public static final zzcl zzb = null;
    public static final zzcl zzc = null;
    private static final zzcl zzd = null;
    private static final zzcl zze = null;
    private static final zzcl zzf = null;
    private static final zzcl zzg = null;
    private static final zzcl zzh = null;
    private static final zzcl zzi = null;
    private static final /* synthetic */ zzcl[] zzj = null;
    private final int zzk;

    static {
        zzcl r02 = new zzcl("UNSPECIFIED_TYPE", 0, 0);
        zzd = r02;
        zzcl r1 = new zzcl("RAW_FILE_IO_TYPE", 1, 1);
        zza = r1;
        zzcl r2 = new zzcl("MOBSTORE_TYPE", 2, 2);
        zze = r2;
        zzcl r3 = new zzcl("SQLITE_OPEN_HELPER_TYPE", 3, 3);
        zzb = r3;
        zzcl r4 = new zzcl("LEVEL_DB_TYPE", 4, 5);
        zzf = r4;
        zzcl r5 = new zzcl("ROOM_TYPE", 5, 6);
        zzg = r5;
        zzcl r6 = new zzcl("SHARED_PREFS_TYPE", 6, 7);
        zzc = r6;
        zzcl r7 = new zzcl("PROTO_DATA_STORE_TYPE", 7, 8);
        zzh = r7;
        zzcl r8 = new zzcl("UNRECOGNIZED", 8, -1);
        zzi = r8;
        zzj = new zzcl[]{r02, r1, r2, r3, r4, r5, r6, r7, r8};
    }

    zzcl(String r1, int r2, int r3) {
        this.zzk = r3;
    }

    public static zzcl[] values() {
        return (zzcl[]) zzj.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder r02 = new StringBuilder("<");
        r02.append(zzcl.class.getName());
        r02.append('@');
        r02.append(Integer.toHexString(System.identityHashCode(this)));
        if (this == zzi) goto L5;
        r02.append(" number=");
        r02.append(zza());
    L5:
        r02.append(" name=");
        r02.append(name());
        r02.append('>');
        return r02.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final int zza() {
        if (this == zzi) goto L7;
        return this.zzk;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
