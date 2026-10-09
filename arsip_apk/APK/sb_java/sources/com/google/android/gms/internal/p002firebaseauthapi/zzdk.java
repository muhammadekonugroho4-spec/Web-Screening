package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzdk extends zzcr {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzb zzd;

    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private zzb zzd;

        public /* synthetic */ zza(zzdl r1) {
            this();
        }

        public final zza zza(int r3) throws GeneralSecurityException {
            if (r3 != 12) goto L5;
        L9:
            this.zzb = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 16) goto L9;
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(r3)}));
        }

        public final zza zzb(int r3) throws GeneralSecurityException {
            if (r3 != 16) goto L5;
        L11:
            this.zza = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 24) goto L11;
            if (r3 == 32) goto L11;
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(r3)}));
        }

        public final zza zzc(int r1) throws GeneralSecurityException {
            this.zzc = 16;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzb.zzc;
        }

        public final zza zza(zzb r1) {
            this.zzd = r1;
            return this;
        }

        public final zzdk zza() throws GeneralSecurityException {
            Integer r02 = this.zza;
            if (r02 == null) goto L19;
            if (this.zzb == null) goto L17;
            if (this.zzd == null) goto L15;
            if (this.zzc == null) goto L13;
            return new zzdk(r02.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd, null);
        L13:
            throw new GeneralSecurityException("Tag size is not set");
        L15:
            throw new GeneralSecurityException("Variant is not set");
        L17:
            throw new GeneralSecurityException("IV size is not set");
        L19:
            throw new GeneralSecurityException("Key size is not set");
        }
    }

    public static final class zzb {
        public static final zzb zza = null;
        public static final zzb zzb = null;
        public static final zzb zzc = null;
        private final String zzd;

        static {
            zza = new zzb("TINK");
            zzb = new zzb("CRUNCHY");
            zzc = new zzb("NO_PREFIX");
        }

        private zzb(String r1) {
            this.zzd = r1;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public /* synthetic */ zzdk(int r1, int r2, int r3, zzb r4, zzdl r5) {
        this(r1, r2, r3, r4);
    }

    public static zza zze() {
        return new zza(null);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzdk) == true) goto L5;
        return false;
    L5:
        zzdk r42 = (zzdk) r4;
        if (r42.zza == this.zza) goto L8;
    L15:
        return false;
    L8:
        if (r42.zzb != this.zzb) goto L15;
        if (r42.zzc != this.zzc) goto L15;
        if (r42.zzd != this.zzd) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzdk.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd});
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, " + this.zzc + "-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zzd == zzb.zzc) goto L6;
        return true;
    L6:
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final zzb zzf() {
        return this.zzd;
    }

    private zzdk(int r1, int r2, int r3, zzb r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
    }
}
