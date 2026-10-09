package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzzn {
    private final byte[] zza;

    private zzzn(byte[] r2, int r3, int r4) {
        byte[] r32 = new byte[r4];
        this.zza = r32;
        System.arraycopy(r2, 0, r32, 0, r4);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zzzn) == true) goto L7;
        return false;
    L7:
        return Arrays.equals(((zzzn) r2).zza, this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return "Bytes(" + zzza.zza(this.zza) + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzb() {
        byte[] r02 = this.zza;
        byte[] r1 = new byte[r02.length];
        System.arraycopy(r02, 0, r1, 0, r02.length);
        return r1;
    }

    public static zzzn zza(byte[] r3) {
        if (r3 == null) goto L9;
        int r02 = r3.length;
        if (r02 <= r3.length) goto L7;
        r02 = r3.length;
    L7:
        return new zzzn(r3, 0, r02);
    L9:
        throw new NullPointerException("data must be non-null");
    }
}
