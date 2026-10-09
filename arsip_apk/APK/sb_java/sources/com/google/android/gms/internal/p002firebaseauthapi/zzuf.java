package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzuf extends Enum<zzuf> implements zzakl {
    public static final zzuf zza = null;
    public static final zzuf zzb = null;
    public static final zzuf zzc = null;
    public static final zzuf zzd = null;
    private static final zzuf zze = null;
    private static final /* synthetic */ zzuf[] zzf = null;
    private final int zzg;

    static {
        zzuf r02 = new zzuf("UNKNOWN_FORMAT", 0, 0);
        zze = r02;
        zzuf r1 = new zzuf("UNCOMPRESSED", 1, 1);
        zza = r1;
        zzuf r2 = new zzuf("COMPRESSED", 2, 2);
        zzb = r2;
        zzuf r3 = new zzuf("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 3, 3);
        zzc = r3;
        zzuf r4 = new zzuf("UNRECOGNIZED", 4, -1);
        zzd = r4;
        zzf = new zzuf[]{r02, r1, r2, r3, r4};
    }

    zzuf(String r1, int r2, int r3) {
        this.zzg = r3;
    }

    public static zzuf[] values() {
        return (zzuf[]) zzf.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder r02 = new StringBuilder("<");
        r02.append(zzuf.class.getName());
        r02.append('@');
        r02.append(Integer.toHexString(System.identityHashCode(this)));
        if (this == zzd) goto L5;
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
        if (this == zzd) goto L7;
        return this.zzg;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzuf zza(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return zzc;
    L14:
        return zzb;
    L16:
        return zza;
    L18:
        return zze;
    }
}
