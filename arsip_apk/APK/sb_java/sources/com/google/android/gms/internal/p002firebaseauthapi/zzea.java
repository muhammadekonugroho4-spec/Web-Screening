package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzea extends zzcr {
    private final int zza;
    private final zzb zzb;

    public static final class zza {
        private Integer zza;
        private zzb zzb;

        public /* synthetic */ zza(zzeb r1) {
            this();
        }

        public final zza zza(int r3) throws GeneralSecurityException {
            if (r3 != 16) goto L5;
        L9:
            this.zza = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 32) goto L9;
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(r3)}));
        }

        private zza() {
            this.zza = null;
            this.zzb = zzb.zzc;
        }

        public final zza zza(zzb r1) {
            this.zzb = r1;
            return this;
        }

        public final zzea zza() throws GeneralSecurityException {
            Integer r02 = this.zza;
            if (r02 == null) goto L11;
            if (this.zzb == null) goto L9;
            return new zzea(r02.intValue(), this.zzb, null);
        L9:
            throw new GeneralSecurityException("Variant is not set");
        L11:
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

    public /* synthetic */ zzea(int r1, zzb r2, zzeb r3) {
        this(r1, r2);
    }

    public static zza zzc() {
        return new zza(null);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzea) == true) goto L5;
        return false;
    L5:
        zzea r42 = (zzea) r4;
        if (r42.zza == this.zza) goto L8;
    L11:
        return false;
    L8:
        if (r42.zzb != this.zzb) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzea.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zzb == zzb.zzc) goto L6;
        return true;
    L6:
        return false;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzb zzd() {
        return this.zzb;
    }

    private zzea(int r1, zzb r2) {
        this.zza = r1;
        this.zzb = r2;
    }
}
