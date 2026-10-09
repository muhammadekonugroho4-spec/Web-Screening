package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzfy extends zzcr {
    private final zza zza;

    public static final class zza {
        public static final zza zza = null;
        public static final zza zzb = null;
        public static final zza zzc = null;
        private final String zzd;

        static {
            zza = new zza("TINK");
            zzb = new zza("CRUNCHY");
            zzc = new zza("NO_PREFIX");
        }

        private zza(String r1) {
            this.zzd = r1;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzfy(zza r1) {
        this.zza = r1;
    }

    public static zzfy zza(zza r1) {
        return new zzfy(r1);
    }

    public static zzfy zzc() {
        return new zzfy(zza.zzc);
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof zzfy) == true) goto L6;
        return false;
    L6:
        if (((zzfy) r3).zza != this.zza) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzfy.class, this.zza});
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + String.valueOf(this.zza) + ")";
    }

    public final zza zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zza == zza.zzc) goto L6;
        return true;
    L6:
        return false;
    }
}
