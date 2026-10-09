package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzvn extends Enum<zzvn> implements zzakl {
    public static final zzvn zza = null;
    public static final zzvn zzb = null;
    public static final zzvn zzc = null;
    public static final zzvn zzd = null;
    private static final zzvn zze = null;
    private static final /* synthetic */ zzvn[] zzf = null;
    private final int zzg;

    static {
        zzvn r02 = new zzvn("KDF_UNKNOWN", 0, 0);
        zze = r02;
        zzvn r1 = new zzvn("HKDF_SHA256", 1, 1);
        zza = r1;
        zzvn r2 = new zzvn("HKDF_SHA384", 2, 2);
        zzb = r2;
        zzvn r3 = new zzvn("HKDF_SHA512", 3, 3);
        zzc = r3;
        zzvn r4 = new zzvn("UNRECOGNIZED", 4, -1);
        zzd = r4;
        zzf = new zzvn[]{r02, r1, r2, r3, r4};
    }

    zzvn(String r1, int r2, int r3) {
        this.zzg = r3;
    }

    public static zzvn[] values() {
        return (zzvn[]) zzf.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder r02 = new StringBuilder("<");
        r02.append(zzvn.class.getName());
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

    public static zzvn zza(int r1) {
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
