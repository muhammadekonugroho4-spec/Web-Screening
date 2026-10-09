package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzep extends zzcr {
    private final String zza;
    private final zza zzb;

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

    private zzep(String r1, zza r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public static zzep zza(String r1, zza r2) {
        return new zzep(r1, r2);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzep) == true) goto L5;
        return false;
    L5:
        zzep r42 = (zzep) r4;
        if (r42.zza.equals(this.zza) == true) goto L8;
    L11:
        return false;
    L8:
        if (r42.zzb.equals(this.zzb) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzep.class, this.zza, this.zzb});
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + String.valueOf(this.zzb) + ")";
    }

    public final zza zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zzb == zza.zzb) goto L6;
        return true;
    L6:
        return false;
    }
}
