package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzdr extends zzcr {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zza zzd;

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
        private Integer zzb;
        private Integer zzc;
        private zza zzd;

        public /* synthetic */ zzb(zzdu r1) {
            this();
        }

        public final zzb zza(int r1) throws GeneralSecurityException {
            this.zzb = 12;
            return this;
        }

        public final zzb zzb(int r3) throws GeneralSecurityException {
            if (r3 != 16) goto L5;
        L11:
            this.zza = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 24) goto L11;
            if (r3 == 32) goto L11;
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(r3)}));
        }

        public final zzb zzc(int r1) throws GeneralSecurityException {
            this.zzc = 16;
            return this;
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zza.zzc;
        }

        public final zzb zza(zza r1) {
            this.zzd = r1;
            return this;
        }

        public final zzdr zza() throws GeneralSecurityException {
            Integer r02 = this.zza;
            if (r02 == null) goto L19;
            if (this.zzd == null) goto L17;
            if (this.zzb == null) goto L15;
            if (this.zzc == null) goto L13;
            return new zzdr(r02.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd, null);
        L13:
            throw new GeneralSecurityException("Tag size is not set");
        L15:
            throw new GeneralSecurityException("IV size is not set");
        L17:
            throw new GeneralSecurityException("Variant is not set");
        L19:
            throw new GeneralSecurityException("Key size is not set");
        }
    }

    public /* synthetic */ zzdr(int r1, int r2, int r3, zza r4, zzdu r5) {
        this(r1, r2, r3, r4);
    }

    public static zzb zze() {
        return new zzb(null);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzdr) == true) goto L5;
        return false;
    L5:
        zzdr r42 = (zzdr) r4;
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
        return Objects.hash(new Object[]{zzdr.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, " + this.zzc + "-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zzd == zza.zzc) goto L6;
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

    public final zza zzf() {
        return this.zzd;
    }

    private zzdr(int r1, int r2, int r3, zza r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
    }
}
