package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzuw extends Enum<zzuw> implements zzakl {
    public static final zzuw zza = null;
    public static final zzuw zzb = null;
    public static final zzuw zzc = null;
    public static final zzuw zzd = null;
    public static final zzuw zze = null;
    private static final zzuw zzf = null;
    private static final /* synthetic */ zzuw[] zzg = null;
    private final int zzh;

    static {
        zzuw r02 = new zzuw("UNKNOWN_CURVE", 0, 0);
        zzf = r02;
        zzuw r1 = new zzuw("NIST_P256", 1, 2);
        zza = r1;
        zzuw r2 = new zzuw("NIST_P384", 2, 3);
        zzb = r2;
        zzuw r3 = new zzuw("NIST_P521", 3, 4);
        zzc = r3;
        zzuw r4 = new zzuw("CURVE25519", 4, 5);
        zzd = r4;
        zzuw r5 = new zzuw("UNRECOGNIZED", 5, -1);
        zze = r5;
        zzg = new zzuw[]{r02, r1, r2, r3, r4, r5};
    }

    zzuw(String r1, int r2, int r3) {
        this.zzh = r3;
    }

    public static zzuw[] values() {
        return (zzuw[]) zzg.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder r02 = new StringBuilder("<");
        r02.append(zzuw.class.getName());
        r02.append('@');
        r02.append(Integer.toHexString(System.identityHashCode(this)));
        if (this == zze) goto L5;
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
        if (this == zze) goto L7;
        return this.zzh;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzuw zza(int r1) {
        if (r1 == 0) goto L22;
        if (r1 == 2) goto L20;
        if (r1 == 3) goto L18;
        if (r1 == 4) goto L16;
        if (r1 == 5) goto L14;
        return null;
    L14:
        return zzd;
    L16:
        return zzc;
    L18:
        return zzb;
    L20:
        return zza;
    L22:
        return zzf;
    }
}
