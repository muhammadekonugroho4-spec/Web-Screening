package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzvc extends Enum<zzvc> implements zzakl {
    public static final zzvc zza = null;
    public static final zzvc zzb = null;
    public static final zzvc zzc = null;
    public static final zzvc zzd = null;
    public static final zzvc zze = null;
    public static final zzvc zzf = null;
    private static final zzvc zzg = null;
    private static final /* synthetic */ zzvc[] zzh = null;
    private final int zzi;

    static {
        zzvc r02 = new zzvc("UNKNOWN_HASH", 0, 0);
        zzg = r02;
        zzvc r1 = new zzvc("SHA1", 1, 1);
        zza = r1;
        zzvc r2 = new zzvc("SHA384", 2, 2);
        zzb = r2;
        zzvc r3 = new zzvc("SHA256", 3, 3);
        zzc = r3;
        zzvc r4 = new zzvc("SHA512", 4, 4);
        zzd = r4;
        zzvc r5 = new zzvc("SHA224", 5, 5);
        zze = r5;
        zzvc r6 = new zzvc("UNRECOGNIZED", 6, -1);
        zzf = r6;
        zzh = new zzvc[]{r02, r1, r2, r3, r4, r5, r6};
    }

    zzvc(String r1, int r2, int r3) {
        this.zzi = r3;
    }

    public static zzvc[] values() {
        return (zzvc[]) zzh.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder r02 = new StringBuilder("<");
        r02.append(zzvc.class.getName());
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
        return this.zzi;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzvc zza(int r1) {
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L22;
        if (r1 == 3) goto L20;
        if (r1 == 4) goto L18;
        if (r1 == 5) goto L16;
        return null;
    L16:
        return zze;
    L18:
        return zzd;
    L20:
        return zzc;
    L22:
        return zzb;
    L24:
        return zza;
    L26:
        return zzg;
    }
}
