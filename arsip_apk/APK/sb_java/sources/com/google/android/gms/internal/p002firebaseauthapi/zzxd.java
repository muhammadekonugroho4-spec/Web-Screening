package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzxd extends Enum<zzxd> implements zzakl {
    public static final zzxd zza = null;
    public static final zzxd zzb = null;
    public static final zzxd zzc = null;
    public static final zzxd zzd = null;
    public static final zzxd zze = null;
    public static final zzxd zzf = null;
    private static final /* synthetic */ zzxd[] zzg = null;
    private final int zzh;

    static {
        zzxd r02 = new zzxd("UNKNOWN_PREFIX", 0, 0);
        zza = r02;
        zzxd r1 = new zzxd("TINK", 1, 1);
        zzb = r1;
        zzxd r2 = new zzxd("LEGACY", 2, 2);
        zzc = r2;
        zzxd r3 = new zzxd("RAW", 3, 3);
        zzd = r3;
        zzxd r4 = new zzxd("CRUNCHY", 4, 4);
        zze = r4;
        zzxd r5 = new zzxd("UNRECOGNIZED", 5, -1);
        zzf = r5;
        zzg = new zzxd[]{r02, r1, r2, r3, r4, r5};
    }

    zzxd(String r1, int r2, int r3) {
        this.zzh = r3;
    }

    public static zzxd[] values() {
        return (zzxd[]) zzg.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder r02 = new StringBuilder("<");
        r02.append(zzxd.class.getName());
        r02.append('@');
        r02.append(Integer.toHexString(System.identityHashCode(this)));
        if (this == zzf) goto L5;
        r02.append(" number=");
        r02.append(zza());
    L5:
        r02.append(" name=");
        r02.append(name());
        r02.append('>');
        return r02.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakl
    public final int zza() {
        if (this == zzf) goto L7;
        return this.zzh;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzxd zza(int r1) {
        if (r1 == 0) goto L22;
        if (r1 == 1) goto L20;
        if (r1 == 2) goto L18;
        if (r1 == 3) goto L16;
        if (r1 == 4) goto L14;
        return null;
    L14:
        return zze;
    L16:
        return zzd;
    L18:
        return zzc;
    L20:
        return zzb;
    L22:
        return zza;
    }
}
