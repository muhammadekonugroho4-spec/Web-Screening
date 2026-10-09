package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzqf extends zzqy {
    private final int zza;
    private final int zzb;
    private final zza zzc;

    public static final class zza {
        public static final zza zza = null;
        public static final zza zzb = null;
        public static final zza zzc = null;
        public static final zza zzd = null;
        private final String zze;

        static {
            zza = new zza("TINK");
            zzb = new zza("CRUNCHY");
            zzc = new zza("LEGACY");
            zzd = new zza("NO_PREFIX");
        }

        private zza(String r1) {
            this.zze = r1;
        }

        public final String toString() {
            return this.zze;
        }
    }

    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private zza zzc;

        public /* synthetic */ zzb(zzqi r1) {
            this();
        }

        public final zzb zza(int r3) throws GeneralSecurityException {
            if (r3 != 16) goto L5;
        L9:
            this.zza = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 32) goto L9;
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(r3 << 3)}));
        }

        public final zzb zzb(int r4) throws GeneralSecurityException {
            if (r4 < 10) goto L9;
            if (16 < r4) goto L9;
            this.zzb = Integer.valueOf(r4);
            return this;
        L9:
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + r4);
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zza.zzd;
        }

        public final zzb zza(zza r1) {
            this.zzc = r1;
            return this;
        }

        public final zzqf zza() throws GeneralSecurityException {
            Integer r02 = this.zza;
            if (r02 == null) goto L15;
            if (this.zzb == null) goto L13;
            if (this.zzc == null) goto L11;
            return new zzqf(r02.intValue(), this.zzb.intValue(), this.zzc, null);
        L11:
            throw new GeneralSecurityException("variant not set");
        L13:
            throw new GeneralSecurityException("tag size not set");
        L15:
            throw new GeneralSecurityException("key size not set");
        }
    }

    public /* synthetic */ zzqf(int r1, int r2, zza r3, zzqi r4) {
        this(r1, r2, r3);
    }

    public static zzb zzd() {
        return new zzb(null);
    }

    private final int zzf() {
        zza r02 = this.zzc;
        if (r02 != zza.zzd) goto L7;
        return this.zzb;
    L7:
        if (r02 != zza.zza) goto L12;
        int r03 = this.zzb;
    L10:
        return r03 + 5;
    L12:
        if (r02 != zza.zzb) goto L15;
        r03 = this.zzb;
        goto L10
    L15:
        if (r02 != zza.zzc) goto L18;
        r03 = this.zzb;
        goto L10
    L18:
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzqf) == true) goto L5;
        return false;
    L5:
        zzqf r42 = (zzqf) r4;
        if (r42.zza == this.zza) goto L8;
    L13:
        return false;
    L8:
        if (r42.zzf() != zzf()) goto L13;
        if (r42.zzc != this.zzc) goto L13;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzqf.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zzc == zza.zzd) goto L6;
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

    public final zza zze() {
        return this.zzc;
    }

    private zzqf(int r1, int r2, zza r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }
}
