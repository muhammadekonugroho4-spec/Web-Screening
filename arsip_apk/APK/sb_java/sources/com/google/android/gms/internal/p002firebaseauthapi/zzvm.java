package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzvm extends Enum<zzvm> implements zzakl {
    public static final zzvm zza = null;
    public static final zzvm zzb = null;
    public static final zzvm zzc = null;
    public static final zzvm zzd = null;
    public static final zzvm zze = null;
    private static final zzvm zzf = null;
    private static final /* synthetic */ zzvm[] zzg = null;
    private final int zzh;

    static {
        zzvm r02 = new zzvm("KEM_UNKNOWN", 0, 0);
        zzf = r02;
        zzvm r1 = new zzvm("DHKEM_X25519_HKDF_SHA256", 1, 1);
        zza = r1;
        zzvm r2 = new zzvm("DHKEM_P256_HKDF_SHA256", 2, 2);
        zzb = r2;
        zzvm r3 = new zzvm("DHKEM_P384_HKDF_SHA384", 3, 3);
        zzc = r3;
        zzvm r4 = new zzvm("DHKEM_P521_HKDF_SHA512", 4, 4);
        zzd = r4;
        zzvm r5 = new zzvm("UNRECOGNIZED", 5, -1);
        zze = r5;
        zzg = new zzvm[]{r02, r1, r2, r3, r4, r5};
    }

    zzvm(String r1, int r2, int r3) {
        this.zzh = r3;
    }

    public static zzvm[] values() {
        return (zzvm[]) zzg.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder r02 = new StringBuilder("<");
        r02.append(zzvm.class.getName());
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

    public static zzvm zza(int r1) {
        if (r1 == 0) goto L22;
        if (r1 == 1) goto L20;
        if (r1 == 2) goto L18;
        if (r1 == 3) goto L16;
        if (r1 == 4) goto L14;
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
