package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzft extends zzcr {
    private final zza zza;
    private final int zzb;

    public static final class zza {
        public static final zza zza = null;
        public static final zza zzb = null;
        private final String zzc;

        static {
            zza = new zza("TINK");
            zzb = new zza("NO_PREFIX");
        }

        private zza(String r1) {
            this.zzc = r1;
        }

        public final String toString() {
            return this.zzc;
        }
    }

    private zzft(zza r1, int r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public static zzft zza(zza r1, int r2) throws GeneralSecurityException {
        if (r2 < 8) goto L9;
        if (r2 > 12) goto L9;
        return new zzft(r1, r2);
    L9:
        throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzft) == true) goto L5;
        return false;
    L5:
        zzft r42 = (zzft) r4;
        if (r42.zza == this.zza) goto L8;
    L11:
        return false;
    L8:
        if (r42.zzb != this.zzb) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzft.class, this.zza, Integer.valueOf(this.zzb)});
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + String.valueOf(this.zza) + "salt_size_bytes: " + this.zzb + ")";
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zza zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zza == zza.zzb) goto L6;
        return true;
    L6:
        return false;
    }
}
