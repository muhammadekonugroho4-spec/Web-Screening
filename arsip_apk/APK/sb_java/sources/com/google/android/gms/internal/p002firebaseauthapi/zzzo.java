package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public final class zzzo {
    private final zzzn zza;

    private zzzo(zzzn r1) {
        this.zza = r1;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzzo zza(byte[] r02, zzcm r1) {
        if (r1 == null) goto L6;
        return new zzzo(zzzn.zza(r02));
    L6:
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static zzzo zza(int r1) {
        return new zzzo(zzzn.zza(zzpp.zza(r1)));
    }

    public final byte[] zza(zzcm r2) {
        if (r2 == null) goto L6;
        return this.zza.zzb();
    L6:
        throw new NullPointerException("SecretKeyAccess required");
    }
}
