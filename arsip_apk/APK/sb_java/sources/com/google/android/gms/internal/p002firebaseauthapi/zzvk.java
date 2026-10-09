package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzvk extends Enum<zzvk> implements zzakl {
    public static final zzvk zza = null;
    public static final zzvk zzb = null;
    public static final zzvk zzc = null;
    public static final zzvk zzd = null;
    private static final zzvk zze = null;
    private static final /* synthetic */ zzvk[] zzf = null;
    private final int zzg;

    static {
        zzvk r02 = new zzvk("AEAD_UNKNOWN", 0, 0);
        zze = r02;
        zzvk r1 = new zzvk("AES_128_GCM", 1, 1);
        zza = r1;
        zzvk r2 = new zzvk("AES_256_GCM", 2, 2);
        zzb = r2;
        zzvk r3 = new zzvk("CHACHA20_POLY1305", 3, 3);
        zzc = r3;
        zzvk r4 = new zzvk("UNRECOGNIZED", 4, -1);
        zzd = r4;
        zzf = new zzvk[]{r02, r1, r2, r3, r4};
    }

    zzvk(String r1, int r2, int r3) {
        this.zzg = r3;
    }

    public static zzvk[] values() {
        return (zzvk[]) zzf.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder r02 = new StringBuilder("<");
        r02.append(zzvk.class.getName());
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

    public static zzvk zza(int r1) {
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
