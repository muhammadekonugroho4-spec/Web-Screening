package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzit extends zzix {
    private final int zza;
    private final zza zzb;

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

    public static final class zzb {
        private Integer zza;
        private zza zzb;

        public /* synthetic */ zzb(zziw r1) {
            this();
        }

        public final zzb zza(int r3) throws GeneralSecurityException {
            if (r3 != 32) goto L5;
        L11:
            this.zza = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 48) goto L11;
            if (r3 == 64) goto L11;
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", new Object[]{Integer.valueOf(r3)}));
        }

        private zzb() {
            this.zza = null;
            this.zzb = zza.zzc;
        }

        public final zzb zza(zza r1) {
            this.zzb = r1;
            return this;
        }

        public final zzit zza() throws GeneralSecurityException {
            Integer r02 = this.zza;
            if (r02 == null) goto L11;
            if (this.zzb == null) goto L9;
            return new zzit(r02.intValue(), this.zzb, null);
        L9:
            throw new GeneralSecurityException("Variant is not set");
        L11:
            throw new GeneralSecurityException("Key size is not set");
        }
    }

    public /* synthetic */ zzit(int r1, zza r2, zziw r3) {
        this(r1, r2);
    }

    public static zzb zzc() {
        return new zzb(null);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzit) == true) goto L5;
        return false;
    L5:
        zzit r42 = (zzit) r4;
        if (r42.zza == this.zza) goto L8;
    L11:
        return false;
    L8:
        if (r42.zzb != this.zzb) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzit.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zzb == zza.zzc) goto L6;
        return true;
    L6:
        return false;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zza zzd() {
        return this.zzb;
    }

    private zzit(int r1, zza r2) {
        this.zza = r1;
        this.zzb = r2;
    }
}
